package org.example;

public class App {
    public static void main(String[] args) {
        Funcionales f = new Funcionales();
        System.out.println(f.toMayus.apply("Hola"));
        System.out.println(f.suma.apply(5));
        f.fizzBuzz.run();
    }
}
