package com.demo.config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class SimpleConfigDemoApp {
    public static void main(String[] str){
        System.out.println("Welcome!!");
        //setting system properties
        System.setProperty("simple-lib.whatever", "This value comes from a system property");
        // Load our own config values from the default location, application.conf
        Config conf = ConfigFactory.load();
        System.out.println("The answer is: " + conf.getString("simple-app.answer"));
        //getting overridden by system properties
        System.out.println(conf.getString("simple-lib.whatever"));
        System.out.println(conf.getString("simple-lib.reference.whatever"));

    }
}
