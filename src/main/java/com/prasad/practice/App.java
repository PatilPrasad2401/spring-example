package com.prasad.practice;

import com.prasad.practice.model.Address;
import com.prasad.practice.model.City;
import com.prasad.practice.service.HelloWoldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App
{
    public static void main( String[] args )
    {
        HelloWoldService helloWoldService=new HelloWoldService();
        helloWoldService.setName("Prasad");
        City city=new City();
        city.setName("pune");
        Address address=new Address(city);
        helloWoldService.setAddress(address);
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        HelloWoldService helloWoldService = (HelloWoldService) context.getBean("helloWorldService");
//        HelloWoldService helloWoldService = context.getBean("helloService", HelloService.class);

        helloWoldService.sayHello();
    }
}
