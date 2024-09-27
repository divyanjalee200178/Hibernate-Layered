package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.entity.OrderDetail;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PlaceOrderDTO {
    private OrderDTO order;
    private List<OrderDetail> oderList;
}
