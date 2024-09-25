package org.example.entity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode

public class Order {
    private String orderId;
    private String description;
    private String customerId;



}
