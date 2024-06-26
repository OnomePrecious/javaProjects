package chapter17.streams;

import chapter16.Transaction;

import java.math.BigDecimal;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<Transaction> numbers =
                List.of(new Transaction("#2000", "12345"),
                        new Transaction("#1000", "987645"),
                        new Transaction("#100", "24659"));


        numbers.stream()
                .filter((transaction) -> new BigDecimal(transaction.getAmount()
                        .substring(1))
                        .compareTo(new BigDecimal(100)) <= 0)
                        .forEach(System.out::println);
    }
}
