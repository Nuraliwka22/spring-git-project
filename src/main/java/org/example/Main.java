package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = context.getBean(Person.class);
        person.sayHello();

        Parrot parrot = context.getBean(Parrot.class);
        parrot.speak();

        Person personIntro = context.getBean(Person.class);
        person.introduce();

    }

}
