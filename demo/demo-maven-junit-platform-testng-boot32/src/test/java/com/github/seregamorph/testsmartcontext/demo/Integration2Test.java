package com.github.seregamorph.testsmartcontext.demo;

import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

@ContextConfiguration(classes = {
    Integration2Test.Configuration.class
})
public class Integration2Test extends AbstractIntegrationTest {

    @Test
    public void test() {
    }

    public static class Configuration {

    }
}
