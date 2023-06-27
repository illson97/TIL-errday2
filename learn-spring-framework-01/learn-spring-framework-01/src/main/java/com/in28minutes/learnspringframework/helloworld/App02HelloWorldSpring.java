package com.in28minutes.learnspringframework.helloworld;

import com.in28minutes.learnspringframework.helloworld.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[ ] args) {
        // 1: Launch a Spring Context
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));
            System.out.println(context.getBean("address2"));
            System.out.println(context.getBean(Person.class));
        }
        ;
        // 2: Configure the things that we want Spring to manage

//        System.out.println(context.getBean(Address.class));
//        Arrays.stream(context.getBeanDefinitionNames())
//                .forEach(System.out::println);

    }
}
