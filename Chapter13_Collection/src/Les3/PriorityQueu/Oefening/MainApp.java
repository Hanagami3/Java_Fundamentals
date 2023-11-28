package Les3.PriorityQueu.Oefening;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainApp {

    public static void main(String[] args) {

       Queue<BurgerOrder> orders = new LinkedList<>();

        orders.add(new BurgerOrder("BigMacMenu", 4));
        orders.add(new BurgerOrder("ChickMenu", 1));
        orders.add(new BurgerOrder("VegiMenu", 3));
        orders.add(new BurgerOrder("KidsMenu", 2));

        BurgerOrder order = orders.peek();

        while (order != null){
            System.out.println("About to prepare " + order);
            order = orders.poll();
            System.out.println("Preparing " +order);
            order = orders.peek();
        }



    }
}
