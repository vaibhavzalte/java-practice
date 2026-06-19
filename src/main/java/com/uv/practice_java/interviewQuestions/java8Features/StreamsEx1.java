package com.uv.practice_java.interviewQuestions.java8Features;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// using java8 streams - you have a list of transactions objects. each has an amount,date,and a category.
// find the total transaction amount per category but only for transactions that happened in the last 30 days
class Transction{
    int amount;
    LocalDate date;
    String category;
    public Transction(){};

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Transction(int amount, LocalDate date, String category) {
        this.amount = amount;
        this.date = date;
        this.category = category;
    }
}
public class StreamsEx1 {
    public static void main(String[] args) {
        List<Transction> transactions = Arrays.asList(
                new Transction(1000, LocalDate.now().minusDays(5), "Food"),
                new Transction(500, LocalDate.now().minusDays(10), "Food"),
                new Transction(2000, LocalDate.now().minusDays(15), "Travel"),
                new Transction(1500, LocalDate.now().minusDays(20), "Shopping"),
                new Transction(800, LocalDate.now().minusDays(25), "Food"),
                new Transction(3000, LocalDate.now().minusDays(35), "Travel"), // Ignore
                new Transction(1200, LocalDate.now().minusDays(40), "Shopping"), // Ignore
                new Transction(700, LocalDate.now().minusDays(2), "Travel"),
                new Transction(400, LocalDate.now().minusDays(1), "Food"),
                new Transction(1000, LocalDate.now().minusDays(28), "Shopping")
        );
        Map<String, Integer> result = transactions.stream()
                .filter(t -> t.getDate().isAfter(LocalDate.now().minusDays(30)))
                .collect(
                        Collectors.groupingBy(
                                t->t.getCategory(),
                                Collectors.summingInt(t->t.getAmount())
                        )
                );

        System.out.println(result);
    }
}
