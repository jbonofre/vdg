package com.vdg.camel;

import org.apache.camel.builder.RouteBuilder;

public class SecondRoute extends RouteBuilder {

    @Override
    public void configure() {
        from("direct:a")
                .to("log:vdg")
                .to("direct:b");
    }

}
