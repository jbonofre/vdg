package com.vdg.camel;

import org.apache.camel.builder.RouteBuilder;

public class FirstRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:vdg?period=2000")
                .routeId("vdg-route")
                .setBody(constant("Hello VdG"))
                .to("log:vdg")
                .to("stream:out");
    }

}
