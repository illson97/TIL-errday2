package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Ranga";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person() {
        var person = new Person("Ravi", 20, new Address("Main Street", "Utrecht"));
        return person;
    }
    @Bean
    @Qualifier("person2qualifier")
    public Person person2MethodCall() {

        return new Person(name(), age(), address());
    }

    @Bean
    @Primary
    public Person person3Parameters(String name, int age, Address address2) {

        return new Person(name(), age(), address2);
    }

    @Bean(name="address2")
    @Primary
    public Address address() {
        return new Address("Seosin Cheonbyeon", "Jeonju");
    }

}
