package org.example.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.example.bo.custom.ItemBO;
import org.example.bo.custom.impl.ItemBOImpl;
import javafx.scene.layout.AnchorPane;

import javafx.scene.control.cell.PropertyValueFactory;
import org.example.dto.ItemDTO;
import org.example.view.tdm.ItemTm;

import java.io.IOException;
import java.util.List;


public class ItemFormController {
        public TextField txtCode;
        public TextField txtName;
        public TextField txtQty;
        public TextField txtUnitPrice;
        @FXML
        private AnchorPane rootNode;
        public Button btnSave;
        public Button btnUpdate;
        public Button btnDelete;
        @FXML
        private Button btnBack;

        @FXML
        private Button btnClear;

        @FXML
        private TableView<ItemTm> tblItem;

        @FXML
        private TableColumn<?, ?> colId;

        @FXML
        private TableColumn<?, ?> colName;

        @FXML
        private TableColumn<?, ?> colQty;

        @FXML
        private TableColumn<?, ?> colUnitPrice;


    ItemBO itemBO = new ItemBOImpl();
    public void initialize() throws ClassNotFoundException {
        setCellValueFactory();
        loadAllCustomer();
    }
    private void setCellValueFactory(){
        colId.setCellValueFactory(new PropertyValueFactory<>("code"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colQty.setCellValueFactory(new PropertyValueFactory<>("Qty"));
        colUnitPrice.setCellValueFactory(new PropertyValueFactory<>("UnitPrice"));


    }

    private void loadAllCustomer() throws ClassNotFoundException {
        ObservableList<ItemTm> obList= FXCollections.observableArrayList();

        try{
            List<ItemDTO> itemList=itemBO.getAllItems();
            for(ItemDTO itemDTO:itemList){
                ItemTm itemTm=new ItemTm(
                        itemDTO.getCode(),
                        itemDTO.getName(),
                        itemDTO.getQty(),
                        itemDTO.getUnitPrice()
                );
                obList.add(itemTm);
            }
            tblItem.setItems(obList);
        }
        catch (Exception e){
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }

        @FXML
        void btnBackOnAction(ActionEvent event) throws IOException {
            navigateToTheDashboardForm();
        }

    private void navigateToTheDashboardForm() throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/dashboardForm.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Dashboard Form");
    }

        @FXML
        void btnClearOnAction(ActionEvent event) {
            clearFeilds();
        }

    private void clearFeilds() {
        txtCode.setText("");
        txtName.setText("");
        txtQty.setText("");
        txtUnitPrice.setText("");

    }

    public void txtNameOnAction(ActionEvent actionEvent) {
        txtQty.requestFocus();
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

        public void txtCodeOnAction(ActionEvent actionEvent){
            txtName.requestFocus();
        }

        public void txtUnitPriceOnAction(ActionEvent actionEvent) {
        }

        public void txtQtyOnAction(ActionEvent actionEvent) {
            txtUnitPrice.requestFocus();
        }
    }

