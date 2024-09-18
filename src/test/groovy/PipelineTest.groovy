/*
 * Copyright (C) by Courtanet, All Rights Reserved.
 */
package com.lesfurets.jenkins;

import static com.lesfurets.jenkins.unit.MethodSignature.method;
import static java.util.Arrays.stream;
import static java.util.stream.Stream.concat;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.function.Consumer;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

import com.lesfurets.jenkins.unit.BasePipelineTest;
package com.lesfurets.jenkins.unit.declarative
import groovy.lang.Script;

public class PipelineTest extends DeclarativePipelineTest  {

    @Before
    @Override
    void setUp() throws Exception {
        scriptRoots += 'src/test/jenkins/lib/'
        scriptExtension = ''
        super.setUp()
    }

 @Test void agent_with_param_label() throws Exception {
        runScript('utils.jenkins')
        printCallStack()
        assertCallStack().contains('aSlave')
        assertJobStatusSuccess()
    }
}