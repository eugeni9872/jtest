import com.lesfurets.jenkins.unit.BasePipelineTest
import org.junit.Before
import org.junit.Test

class PipelineTest extends BasePipelineTest {

    @Before
    void setUp() {
        super.setUp()
    }

    @Test
    void testBuildAndTestStage() {
        def script = loadScript('Jenkinsfile')
        script.run()
        assertJobStatusSuccess()
        assertStageContainsStep('Build and Test', 'sh')
    }
}