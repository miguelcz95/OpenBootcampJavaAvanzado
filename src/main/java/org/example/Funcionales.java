package org.example;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

public class Funcionales {
    Function<String, String> toMayus = String::toUpperCase;
    IntFunction<Integer> suma = (x) -> Integer.sum(x, x);
    Runnable fizzBuzz = () -> IntStream.rangeClosed(1, 100).forEach(i -> System.out.println((i % 3 == 0 && i % 5 == 0) ? "fizzBuzz" : i % 5 == 0 ? "buzz" : i % 3 == 0 ? "fizz" : i));
}
