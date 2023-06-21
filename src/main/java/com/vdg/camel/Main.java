package com.vdg.camel;

import org.apache.camel.impl.DefaultCamelContext;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        org.apache.camel.main.Main launcher = new org.apache.camel.main.Main();
        launcher.configure().addRoutesBuilder(new FirstRoute());
        launcher.configure().addRoutesBuilder(new SecondRoute());
        launcher.run();
        /*
        DefaultCamelContext camelContext = new DefaultCamelContext();
        camelContext.setName("vdg-context");
        camelContext.start();
        camelContext.addRoutes(new FirstRoute());

         */
    }

}
