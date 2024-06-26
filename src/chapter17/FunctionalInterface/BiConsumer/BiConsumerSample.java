package chapter17.FunctionalInterface.BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        BiConsumer<String , String>biConsumer = (firstname, surname) ->
                printFullName(firstname, surname);
            //biConsumer.accept("Precious", "Onome");
        };
    private static void printFullName(String firstname, String surname){
        System.out.println(firstname+" " +surname);

    }
    }
// if its just one line, you don't need the curly braces, just use the arrow. ->