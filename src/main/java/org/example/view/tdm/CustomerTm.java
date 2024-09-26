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
public class CustomerTm {
    @Id
    private String id;
    private String name;
    private String address;
    private int tel;
    private String email;
}
