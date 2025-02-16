package org.example;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Kesha";

    public String getName() {
        return name;
    }
    public void speak() {
        System.out.println("Parrot says: Chirp!");
    }

}
