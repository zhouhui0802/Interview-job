package com.zh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class ServiceSmsApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ServiceSmsApp.class, args);
        System.out.println( "Hello World!" );
    }
}
