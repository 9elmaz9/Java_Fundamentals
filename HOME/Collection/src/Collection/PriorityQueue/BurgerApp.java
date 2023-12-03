package PriorityQueue;

import java.util.LinkedList;
import java.util.Queue;

public class BurgerApp {
    public static void main(String[] args) {


        Queue<BurgerOrder> orders = new LinkedList<>(); // 3 2 4 1
        // Queue<BurgerOrder> orders = new PriorityQueue<>();  // 1 2 3 4

        orders.offer(new BurgerOrder("Cheeseburger", 3));
        orders.offer(new BurgerOrder("Spicy Buffalo", 2));
        orders.offer(new BurgerOrder("Beef Burger", 4));
        orders.offer(new BurgerOrder("BBQ Burger", 1));

        BurgerOrder order = orders.peek();

        while (order != null) {
            System.out.println("About to prepare " + order);
            order = orders.poll();
            System.out.println("Preparing " + order);
            order = orders.peek();

        }

    }
}

