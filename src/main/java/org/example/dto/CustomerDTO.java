package org.example.dto;

import jakarta.persistence.Id;

public class CustomerDTO {
    @Id
    private String id;
    private String name;
    private String address;
    private int tel;
    private String email;

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", tel=" + tel +
                ", email='" + email + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CustomerDTO(String id, String name, String address, int tel, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.email = email;
    }

    public CustomerDTO(String text) {
    }
}
