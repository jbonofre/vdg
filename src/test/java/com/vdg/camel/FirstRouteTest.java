package com.vdg.camel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class FirstRouteTest extends CamelTestSupport {

    @Override
    public RouteBuilder createRouteBuilder() {
        return new FirstRoute();
    }

    @Override
    public String isMockEndpointsAndSkip() {
        return ("((stream|timer):.*)");
    }

    @Test
    public void simpleTest() throws Exception {
        MockEndpoint mockEndpoint = getMockEndpoint("mock:stream:out");
        mockEndpoint.expectedMessageCount(1);
        template.sendBody("mock:timer:vdg", "Hello Test");
        assertMockEndpointsSatisfied();
    }

}
