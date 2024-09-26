package org.example.view.tdm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class ItemTm {
    @Id
    private String code;
    private String name;
    private int qty;
    private double unitPrice;


}
