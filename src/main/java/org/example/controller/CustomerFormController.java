package org.example.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.bo.custom.CustomerBO;
import org.example.bo.custom.impl.CustomerBOImpl;
import org.example.dto.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerFormController {

    public TextField txtId;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtEmail;
    public TextField txtContact;
    public Button btnSave;
    public Button btnUpdate;
    public Button btnDelete;
    public Button btnSearch;
    public TableView<?> tblCustomer;
    public TableColumn<?, ?> clmId;
    public TableColumn<?, ?> clmName;
    public TableColumn<?, ?> clmAddress;
    public TableColumn<?, ?> clmEmail;
    public TableColumn<?, ?> clmContact;
    CustomerBO customerBO = new CustomerBOImpl();
//    public void initialize() throws ClassNotFoundException {
//        setCellValueFactory();
//        loadAllCustomer();
//    }
//    private void setCellValueFactory(){
//        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
//        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
//        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
//        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
//        colTel.setCellValueFactory(new PropertyValueFactory<>("tel"));
//
//    }
//
//    private void loadAllCustomer() throws ClassNotFoundException {
//        tblCustomer.getItems().clear();
//        try {
//            /*Get all customers*/
//            ArrayList<CustomerDTO> allCustomers = customerBO.getAllCustomers();
//
//            for (CustomerDTO c : allCustomers) {
//                tblCustomer.getItems().add(new CustomerDTO(c.getId(), c.getName(), c.getAddress(),c.getTel(),c.getEmail()));
//        } catch (SQLException e) {
//            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
//        } catch (ClassNotFoundException e) {
//            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
//        }
//    }


    public void txtIdOnAction(ActionEvent actionEvent) {
        txtName.requestFocus();
    }

    public void txtNameOnAction(ActionEvent actionEvent) {
        txtAddress.requestFocus();
    }

    public void txtAddressOnAction(ActionEvent actionEvent) {
        txtContact.requestFocus();
    }

    public void txtEmailOnAction(ActionEvent actionEvent) {
    }

    public void txtContactOnAction(ActionEvent actionEvent) {
        txtEmail.requestFocus();
    }

    public void btnSaveOnAction(ActionEvent actionEvent) {
        boolean isSaved = customerBO.save(new CustomerDTO(txtId.getText(), txtName.getText(), txtAddress.getText(), Integer.parseInt(txtContact.getText()), txtEmail.getText()));
        if (isSaved) {
            new Alert(Alert.AlertType.CONFIRMATION, "Customer save successfully").show();
        } else {
            new Alert(Alert.AlertType.ERROR, "Customer save unsuccessfully").show();
        }
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
        boolean isUpdated = customerBO.update(new CustomerDTO(txtId.getText(), txtName.getText(), txtAddress.getText(), Integer.parseInt(txtContact.getText()), txtEmail.getText()));
        if (isUpdated) {
            new Alert(Alert.AlertType.CONFIRMATION, "Customer save successfully").show();
        } else {
            new Alert(Alert.AlertType.ERROR, "Customer save unsuccessfully").show();
        }
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
        boolean isDeleted = customerBO.delete(new CustomerDTO(txtId.getText(), txtName.getText(), txtAddress.getText(), Integer.parseInt(txtContact.getText()), txtEmail.getText()));
        if (isDeleted) {
            new Alert(Alert.AlertType.CONFIRMATION, "Customer delete successfully").show();
        } else {
            new Alert(Alert.AlertType.ERROR, "Customer delete unsuccessfully").show();
        }
    }


    public void btnSearchOnAction(ActionEvent actionEvent) {
        boolean isSearched= customerBO.search(new CustomerDTO(txtId.getText()));
        if (isSearched) {
            new Alert(Alert.AlertType.CONFIRMATION, "Customer delete successfully").show();
        } else {
            new Alert(Alert.AlertType.ERROR, "Customer delete unsuccessfully").show();
        }
    }
}