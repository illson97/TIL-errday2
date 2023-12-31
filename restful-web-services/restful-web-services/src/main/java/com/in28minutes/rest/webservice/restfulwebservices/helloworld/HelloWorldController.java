package com.in28minutes.rest.webservice.restfulwebservices.helloworld;


import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloWorldController {

    private MessageSource messageSource;

    public HelloWorldController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    // hello-world

    @GetMapping(path = "/hello-world")
    public String hellowWorld() {
        return "Hello World";
    }


    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean hellowWorldBean() {

        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean hellowWorldpathVariable(@PathVariable String name) {
        return new HelloWorldBean(
                String.format("Hello World, %s", name));

    }

    @GetMapping(path = "/hello-world-internationalized")
    public String helloWorldInternationalized() {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "Default Message", locale );

        //return "Hello World V2";

        //1:
        //2:
//		- Example: `en` - English (Good Morning)
//		- Example: `nl` - Dutch (Goedemorgen)
//		- Example: `fr` - French (Bonjour)
//		- Example: `de` - Deutsch (Guten Morgen)

    }

}
