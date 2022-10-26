package com.lu2code.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


// Java Config class
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.lu2code.aopdemo")
public class DemoConfig {

}
