package com.uv.practice_java.multithreading;

import java.util.List;

public class ThreadCommunication {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Thread customerThread = new Thread(() -> {
            restaurant.placeOrder("Pizza");
            restaurant.placeOrder("Burger");
            restaurant.placeOrder("Pasta");
        });
        Thread chefThread = new Thread(() -> {
            try {
                restaurant.serveOrder();
                restaurant.serveOrder();
                restaurant.serveOrder();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        customerThread.start();
        chefThread.start();
    }
}
class Restaurant {
    private List<String> orders;
    private int capacity=2;
    Restaurant(){
        orders = new java.util.LinkedList<>();
    }
    public synchronized void placeOrder(String order){
        while (orders.size()==capacity)
        {
            try {
                System.out.println("Restaurant is full, waiting for orders to be processed...");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Placing order: " + order);
        orders.add(order);
        notifyAll();
    }
    public synchronized void serveOrder() throws InterruptedException {
        while (orders.isEmpty()){
            System.out.println("No food to serve, waiting for orders...");
            wait();
        }
        String order = orders.remove(0);
        System.out.println("Serving order: " + order);
        notifyAll();
    }
}
