package com.cc.java;

public class App {
    
    public static void main(String[] args) {

      Customer customer = new Customer(1, "Maxine Mütze", "Mützenhausen");  
      customer.initOrder();

      Helper.ausgabe(customer.getOrderDetails("#type"));
      Helper.ausgabe(customer.getOrderDetails("#date"));
      Helper.ausgabe(customer.getOrderDetails("#status"));

      Helper.ausgabe(customer.getOrderDetails("#&%!2x"));
      
   

    }

}
