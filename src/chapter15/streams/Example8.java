package chapter15.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Example8 {

    public static void main(String[] args) {
        try (InputStreamReader inputStreamReader = new InputStreamReader(in);
             BufferedReader reader = new BufferedReader(inputStreamReader)) {
            System.out.println("Enter your data: ");
            String data = reader.readLine();
            System.out.println("You entered: " + data);

        } catch (IOException exception) {
            System.err.println("Error:" + exception.getMessage());


        }
    }
}