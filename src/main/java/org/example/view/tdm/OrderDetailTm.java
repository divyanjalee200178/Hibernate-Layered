package org.example.view.tdm;

import org.example.dto.OrderDTO;
import org.example.entity.Order;

import java.util.List;

public class OrderDetailTm {
    private String orderId;
    private String code;
    private int qty;
    private double unitPrice;

    private Order order;
    private List<OrderDetailTm> oderList;

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderId='" + orderId + '\'' +
                ", code='" + code + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public OrderDetailTm(String orderId, String code, int qty, double unitPrice) {
        this.orderId = orderId;
        this.code = code;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public OrderDetailTm(OrderDTO order, List<OrderDetailTm> odList) {
    }


    public List<OrderDetailTm> getOderList() {
        return oderList;
    }

    public void setOderList(List<OrderDetailTm> oderList) {
        this.oderList = oderList;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}

