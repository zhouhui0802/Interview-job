package com.zh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Hello world!
 *
 */
@SpringBootApplication
public class ServiceCoreApp
{
    public static void main( String[] args )
    {
        try {
            SpringApplication.run(ServiceCoreApp.class, args);
            System.out.println( "Hello World!" );
        } catch (Exception e) {
            System.err.println("SpringBoot Application Startup Failed: " + e.getMessage());
            e.printStackTrace(); // 打印堆栈信息
            // 可以在这里进行更详细的日志记录或资源释放
        }

    }
}
