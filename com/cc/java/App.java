package com.cc.java;

public class App {
    
    public static void main(String[] args) {

      Customer customer = new Customer(1, "Maxine Mütze", "Mützenhausen");  
      Helper.ausgabe(customer.getName());
      Helper.ausgabe(customer.getCity());
      
     /* 1. Typkonvertierung */
      // Helper.ausgabe(String.valueOf(customer.getId()));

      /* 2. Aufruf einer überladenen Methode */ 
      Helper.ausgabe(customer.getId());
      Helper.ausgabe("-------------");


      // Test der Klasse
      Order order = new Order(1, "repair");
      Helper.ausgabe(order.getOrderID());
      Helper.ausgabe(order.getOrderType());
      Helper.ausgabe(order.isFinished());
      Helper.ausgabe(order.getOrderDate());

    }

}
