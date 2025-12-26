package com.zh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class ServiceOSSApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ServiceOSSApp.class, args);
        System.out.println( "Hello World!" );
    }
}
