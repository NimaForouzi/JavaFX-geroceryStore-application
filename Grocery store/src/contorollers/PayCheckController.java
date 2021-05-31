/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contorollers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import projectseventh.foods;

/**
 * FXML Controller class
 *
 * @author N C S
 */
public class PayCheckController implements Initializable {

    int frizeSoled;
    int BreadSoled;
    int IceCreamSoled;
    int YoughartSoled;
    int BergerSoled;
    int CocounatSoled;
    int EggSoled;
    int HoneySoled;
    int DonatSoled;
    int BruclySoled;
    @FXML Label lbl1;
    @FXML
    TableView<foods> myTableView;
    @FXML
    TableColumn<foods, String> column1;
    @FXML
    TableColumn<foods, String> column2;
    @FXML
    TableColumn<foods, String> column3;
    @FXML
    TableColumn<foods, String> column4;
    @FXML
    TableColumn<foods, String> column5;
    @FXML
    TableColumn<foods, String> column6;

    public void getValues(int frizeSoled, int BreadSoled, int IceCreamSoled, int YoughartSoled, int BergerSoled, int CocounatSoled, int EggSoled, int HoneySoled, int DonatSoled, int BruclySoled) {
        this.frizeSoled = frizeSoled;
        this.BreadSoled = BreadSoled;
        this.IceCreamSoled = IceCreamSoled;
        this.YoughartSoled = YoughartSoled;
        this.BergerSoled = BergerSoled;
        this.CocounatSoled = CocounatSoled;
        this.EggSoled = EggSoled;
        this.HoneySoled = HoneySoled;
        this.DonatSoled = DonatSoled;
        this.BruclySoled = BruclySoled;
    }
    
    public void payAndClose(ActionEvent event){
        String text = "Paying is done! do you want to Exite?";
       int choice = JOptionPane.showOptionDialog(null, text , "question", JOptionPane.YES_NO_OPTION, 2,null,null,null);
        if(choice==0){
            Scene endScene = lbl1.getScene();
            Stage endStage = (Stage) endScene.getWindow();
            endStage.close();
        }
        
    }
    


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        column1.setCellValueFactory(new PropertyValueFactory<foods, String>("code"));
        column2.setCellValueFactory(new PropertyValueFactory<foods, String>("name"));
        column3.setCellValueFactory(new PropertyValueFactory<foods, String>("number"));
        column4.setCellValueFactory(new PropertyValueFactory<foods, String>("OneCharge"));
        column5.setCellValueFactory(new PropertyValueFactory<foods, String>("oneDiscount"));
        column6.setCellValueFactory(new PropertyValueFactory<foods, String>("wholeCharge"));
        

    }
    
    public void show(ActionEvent event){
    myTableView.setItems(getItems());

    }
    public ObservableList<foods> getItems(){
        ObservableList<foods> myList = FXCollections.observableArrayList();
        myList.add(new foods("225464", "French fries", String.valueOf(this.frizeSoled) ,  String.valueOf(25000),  String.valueOf(3000), String.valueOf(this.frizeSoled*23000)));
        myList.add(new foods("225465", "Baguette bread", String.valueOf(this.BreadSoled) ,  String.valueOf(3000),  String.valueOf(500), String.valueOf(this.BreadSoled*2500)));
        myList.add(new foods("225466", "ice cream", String.valueOf(this.IceCreamSoled) ,  String.valueOf(15000),  String.valueOf(2000), String.valueOf(this.IceCreamSoled*13000)));
        myList.add(new foods("225467", "yogurt", String.valueOf(this.YoughartSoled) ,  String.valueOf(27000),  String.valueOf(2500), String.valueOf(this.YoughartSoled*24500)));
        myList.add(new foods("225468", "Hamburgers", String.valueOf(this.BergerSoled) ,  String.valueOf(41000),  String.valueOf(5000), String.valueOf(this.BergerSoled*36000)));
        myList.add(new foods("225469", "Coconut", String.valueOf(this.CocounatSoled) ,  String.valueOf(32000),  String.valueOf(4000), String.valueOf(this.CocounatSoled*28000)));
        myList.add(new foods("225470", "egg", String.valueOf(this.EggSoled) ,  String.valueOf(1500),  String.valueOf(200), String.valueOf(this.EggSoled*1300)));
        myList.add(new foods("225471", "honey", String.valueOf(this.HoneySoled) ,  String.valueOf(90000),  String.valueOf(8000), String.valueOf(this.HoneySoled*82000)));
        myList.add(new foods("225472", "Doughnut", String.valueOf(this.DonatSoled) ,  String.valueOf(27000),  String.valueOf(3500), String.valueOf(this.DonatSoled*23500)));
        myList.add(new foods("225472", "broccoli", String.valueOf(this.BruclySoled) ,  String.valueOf(15000),  String.valueOf(1000), String.valueOf(this.BruclySoled*14000)));
        myList.add(new foods("final cost", "-----", String.valueOf(this.frizeSoled+this.BreadSoled+this.IceCreamSoled+this.YoughartSoled+this.BergerSoled+this.CocounatSoled+this.EggSoled+this.HoneySoled+this.DonatSoled+this.BruclySoled)
                ,  "-----",  "-----", String.valueOf(this.frizeSoled*23000+this.BreadSoled*2500+this.IceCreamSoled*13000+this.YoughartSoled*24500+this.BergerSoled*36000+this.CocounatSoled*28000+this.EggSoled*1300+this.HoneySoled*82000+this.DonatSoled*23500+this.BruclySoled*14000)));
return myList;
}

}
