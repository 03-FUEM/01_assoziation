package com.cc.java;
import java.time.LocalDate;

public class Order {
    
private int orderID;
private String orderType;

private LocalDate orderDate;
private boolean isFinished;

public Order(int orderID, String orderType) {

    this.orderID = orderID;
    this.orderType = orderType;

    orderDate = LocalDate.now();
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
















}
