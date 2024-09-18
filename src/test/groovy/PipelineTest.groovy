import com.lesfurets.jenkins.unit.BasePipelineTest
import spock.lang.Specification

class JenkinsfileTest extends Specification {

    def setup() {
        // Configura el entorno de prueba
        super.setUp()
    }

    def "should execute all pipeline stages successfully"() {
        when:
        def script = loadScript('MyTest')
        script.run()

        then:
        // Verifica que cada etapa fue ejecutada
        assertJobStatusSuccess()
        assertStageWasExecuted('Build')
        assertStageWasExecuted('Test')
        assertStageWasExecuted('Deploy')
    }

    def "should execute the Build stage with expected steps"() {
        when:
        def script = loadScript('Jenkinsfile')
        script.run()

        then:
        assertStageContainsStep('Build', 'echo Build Step')
    }

    def "should execute the Test stage with expected steps"() {
        when:
        def script = loadScript('Jenkinsfile')
        script.run()

        then:
        assertStageContainsStep('Test', 'echo Test Step')
    }

    def "should execute the Deploy stage with expected steps"() {
        when:
        def script = loadScript('Jenkinsfile')
        script.run()

        then:
        assertStageContainsStep('Deploy', 'echo Deploy Step')
    }
}