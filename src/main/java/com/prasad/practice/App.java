package com.prasad.practice;

import com.prasad.practice.service.HelloWoldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App
{
    public static void main( String[] args )
    {
//        HelloWoldService helloWoldService=new HelloWoldService();
//        helloWoldService.setName("Prasad");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        HelloWoldService helloWoldService = (HelloWoldService) context.getBean("helloWorldService");
//        HelloWoldService helloWoldService = context.getBean("helloService", HelloService.class);

        helloWoldService.sayHello();
    }
}
