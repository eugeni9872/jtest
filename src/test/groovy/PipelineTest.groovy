import com.lesfurets.jenkins.unit.BasePipelineTest
import org.junit.Before
import org.junit.Test

package com.lesfurets.jenkins;

import static com.lesfurets.jenkins.unit.MethodSignature.method;
import static java.util.Arrays.stream;
import static java.util.stream.Stream.concat;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.function.Consumer;
import java.util.stream.Stream;




import groovy.lang.Script;

class PipelineTest extends BasePipelineTest {

    @Before
    void setUp() {
        // this.setScriptRoots(concat(stream(getScriptRoots()), Stream.of("/home/jenkins/agent/workspace/test_job")).toArray(String[]::new));
        super.setUp()
    }

    @Test
    void testBuildAndTestStage() {
        def script = runScript('MyTest')
        // script.run()
        assertJobStatusSuccess()
        assertStageContainsStep('Build and Test', 'sh')
    }
}