package com.cc.java;
import java.time.LocalDate;
import java.util.Timer;
import java.util.TimerTask;

public class Order {
    
private int orderID;
private String orderType;

private LocalDate orderDate;
private boolean isFinished;

private Timer timer;

public Order(int orderID, String orderType) {

    this.orderID = orderID;
    this.orderType = orderType;

    this.orderDate = LocalDate.now();
}


public int getOrderID() {
    return orderID;
}

public String getOrderType() {
    return orderType;
}

public LocalDate getOrderDate() {
    return orderDate;
}

public boolean isFinished() {
    return isFinished;
}

public void setFinished(boolean isFinished) {
    this.isFinished = isFinished;
}


public void startTimer(){

    // TimerTask --> finishOrder() + Timer stoppen
   
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            finishOrder();
            timer.cancel();
        }
    };

    // neuen Timer anlegen / Timer starten mit Parametern
    timer = new Timer();
    timer.schedule(task, 2*1000);
}

public void finishOrder(){
    isFinished = true;
    Helper.ausgabe("Order: Auftrag erledigt!");
}













}
