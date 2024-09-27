package org.example.entity;

import java.util.List;


public class PlaceOrder {
    private Order order;
    private List<OrderDetail> orderList;

    @Override
    public String toString() {
        return "PlaceOrder{" +
                "order=" + order +
                ", orderList=" + orderList +
                '}';
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<OrderDetail> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderDetail> orderList) {
        this.orderList = orderList;
    }

    public PlaceOrder(Order order, List<OrderDetail> orderList) {
        this.order = order;
        this.orderList = orderList;
    }

    public PlaceOrder() {
    }
}