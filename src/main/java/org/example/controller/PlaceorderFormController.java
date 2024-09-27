package org.example.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.example.bo.BOFactory;
import org.example.bo.custom.CustomerBO;
import org.example.view.tdm.CartTm;

import java.io.IOException;

public class PlaceorderFormController {

    @FXML
    private Button btnAddToCart;

    @FXML
    private Button btnPlaceOrder;

    @FXML
    private Button btnBack;


    @FXML
    private Button btnPrint;

    @FXML
    private ComboBox<?> cmbCustomer;

    @FXML
    private ComboBox<?> cmbItemCode;

    @FXML
    private TableColumn<?, ?> colAction;

    @FXML
    private TableColumn<CartTm, String> colCode;

    @FXML
    private TableColumn<CartTm, String> colDescription;

    @FXML
    private TableColumn<CartTm, Integer> colQty;

    @FXML
    private TableColumn<?, ?> colTotal;

    @FXML
    private TableColumn<CartTm, Double> colUnitPrice;

    @FXML
    private Label lblCustomerName;

    @FXML
    private Label lblDescription;

    @FXML
    private Label lblNetTotal;

    @FXML
    private Label lblOrderDate;

    @FXML
    private Label lblOrderId;

    @FXML
    private Label lblQtyOnHand;

    @FXML
    private Label lblUnitPrice;

    @FXML
    private AnchorPane rootNode;

    @FXML
    private TableView<CartTm> tblOrderCart;

    @FXML
    private TextField txtQty;

    private ObservableList<CartTm> obList= FXCollections.observableArrayList();
//    CustomerBO customerBO= BOFactory.getBoFactory().getBO()
    @FXML
    void btnAddToCartOnAction(ActionEvent event) {

    }

    @FXML
    void btnPlaceOrderOnAction(ActionEvent event) {

    }

    @FXML
    void btnPrintOnAction(ActionEvent event) {

    }

    @FXML
    void cmbCustomerOnAction(ActionEvent event) {
        //String id=cmbCustomer.getValue();

    }

    @FXML
    void cmbItemCodeOnAction(ActionEvent event) {

    }

    @FXML
    void txtQtyOnAction(ActionEvent event) {
        btnAddToCartOnAction(event);
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

}
