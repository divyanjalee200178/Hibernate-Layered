package org.example.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import org.example.bo.custom.CustomerBO;
import org.example.bo.custom.ItemBO;
import org.example.bo.custom.impl.CustomerBOImpl;
import org.example.bo.custom.impl.ItemBOImpl;
import org.example.dto.CustomerDTO;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.bo.custom.CustomerBO;
import org.example.bo.custom.impl.CustomerBOImpl;
import org.example.dto.CustomerDTO;
import org.example.dto.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;


    public class ItemFormController {
        public TextField txtCode;
        public TextField txtName;
        public TextField txtQty;
        public TextField txtUnitPrice;

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
        ItemBO itemBO = new ItemBOImpl();
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



        public void txtNameOnAction(ActionEvent actionEvent) {

        }



        public void btnSaveOnAction(ActionEvent actionEvent) {
            boolean isSaved = itemBO.save(new ItemDTO(txtCode.getText(), txtName.getText(), Integer.parseInt(txtQty.getText()), Double.parseDouble(txtUnitPrice.getText())));
            if (isSaved) {
                new Alert(Alert.AlertType.CONFIRMATION, "Customer save successfully").show();
            } else {
                new Alert(Alert.AlertType.ERROR, "Customer save unsuccessfully").show();
            }
        }

        public void btnUpdateOnAction(ActionEvent actionEvent) {
            boolean isUpdated = itemBO.update(new ItemDTO(txtCode.getText(), txtName.getText(), Integer.parseInt(txtQty.getText()), Double.parseDouble(txtUnitPrice.getText())));
            if (isUpdated) {
                new Alert(Alert.AlertType.CONFIRMATION, "Item update successfully").show();
            } else {
                new Alert(Alert.AlertType.ERROR, "Item update  unsuccessfully").show();
            }
        }

        public void btnDeleteOnAction(ActionEvent actionEvent) {
            boolean isDeleted = itemBO.delete(new ItemDTO(txtCode.getText(), txtName.getText(), Integer.parseInt(txtQty.getText()), Double.parseDouble(txtUnitPrice.getText())));
            if (isDeleted) {
                new Alert(Alert.AlertType.CONFIRMATION, "Customer delete successfully").show();
            } else {
                new Alert(Alert.AlertType.ERROR, "Customer delete unsuccessfully").show();
            }
        }


        public void btnSearchOnAction(ActionEvent actionEvent) {
//            boolean isSearched= customerBO.search(new CustomerDTO(txtId.getText()));
//            if (isSearched) {
//                new Alert(Alert.AlertType.CONFIRMATION, "Customer delete successfully").show();
//            } else {
//                new Alert(Alert.AlertType.ERROR, "Customer delete unsuccessfully").show();
//            }
        }

        public void txtCodeOnAction(ActionEvent actionEvent) {
        }

        public void txtUnitPriceOnAction(ActionEvent actionEvent) {
        }

        public void txtQtyOnAction(ActionEvent actionEvent) {
        }
    }

