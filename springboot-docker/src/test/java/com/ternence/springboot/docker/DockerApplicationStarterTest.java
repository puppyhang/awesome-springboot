package com.ternence.springboot.docker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {DockerApplicationStarter.class})
public class DockerApplicationStarterTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
