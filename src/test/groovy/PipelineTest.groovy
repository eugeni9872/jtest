import com.lesfurets.jenkins.unit.BasePipelineTest
import spock.lang.Specification

class JenkinsfileTest extends Specification {

    def setup() {
        // Setup your pipeline test
        scriptRoot = new File("jenkins/lib")
        super.setUp()
    }

    def "test pipeline stages"() {
        when:
        def script = loadScript('utils.jenkins')
        script.run()

        then:
        // Check that the pipeline stages were executed
        assertJobStatusSuccess()
        assertStageWasExecuted('Build')
    }
}