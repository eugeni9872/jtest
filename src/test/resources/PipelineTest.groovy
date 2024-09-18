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
        // Load the pipeline script
        def script = loadScript('Jenkinsfile')

        // Run the pipeline
        script.run()

        // Verify that the 'Build and Test' stage was executed
        assertJobStatusSuccess()
        assertStageContainsStep('Build and Test', 'sh')
        printCallStack()  // Optionally print the call stack for debugging purposes
    }
}