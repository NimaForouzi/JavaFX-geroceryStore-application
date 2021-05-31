/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contorollers;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.*;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author N C S
 */
public class WatingController implements Initializable {

    @FXML
    ImageView berger;
    @FXML
    ImageView honey;
    @FXML
    ImageView youghort;
    @FXML
    ImageView cocounot;
    @FXML
    ImageView donat;
    @FXML
    ImageView egg;
    @FXML
    ImageView brocly;
    @FXML
    ImageView iceCream;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        TranslateTransition myTransition = new TranslateTransition(javafx.util.Duration.seconds(7));
        myTransition.setToX(230);
        myTransition.setToY(110);
        myTransition.setToZ(210);
        myTransition.setNode(berger);
        myTransition.play();
        RotateTransition myRotateberger = new RotateTransition(javafx.util.Duration.seconds(2));
        myRotateberger.setAutoReverse(true);
        myRotateberger.setCycleCount(RotateTransition.INDEFINITE);
        myRotateberger.setByAngle(360);
        myRotateberger.setNode(berger);
        myRotateberger.play();
        

        TranslateTransition myTransition0 = new TranslateTransition(javafx.util.Duration.seconds(7));
        myTransition0.setToX(-150);
        myTransition0.setToY(70);
        myTransition0.setToZ(160);
        myTransition0.setNode(honey);
        myTransition0.play();

        TranslateTransition myTransition1 = new TranslateTransition(javafx.util.Duration.seconds(7));
        myTransition1.setToX(190);
        myTransition1.setToY(15);
        myTransition1.setToZ(188);
        myTransition1.setNode(youghort);
        myTransition1.play();

        TranslateTransition myTransition2 = new TranslateTransition(javafx.util.Duration.seconds(7));
        myTransition2.setToX(-233);
        myTransition2.setToY(110);
        myTransition2.setToZ(255);
        myTransition2.setNode(cocounot);
        myTransition2.play();
        RotateTransition myRotate = new RotateTransition(javafx.util.Duration.seconds(2));
        myRotate.setByAngle(360);
        myRotate.setAutoReverse(true);
        myRotate.setCycleCount(RotateTransition.INDEFINITE);
        myRotate.setNode(cocounot);
        myRotate.play();
        
        TranslateTransition myTransition3 = new TranslateTransition(javafx.util.Duration.seconds(7));
        myTransition3.setToX(253);
        myTransition3.setToY(134);
        myTransition3.setToZ(142);
        myTransition3.setNode(donat);
        myTransition3.play();
        RotateTransition myRotate1 = new RotateTransition(javafx.util.Duration.seconds(1.3));
        myRotate1.setByAngle(360);
        myRotate1.setAutoReverse(true);
        myRotate1.setCycleCount(RotateTransition.INDEFINITE);
        myRotate1.setNode(donat);
        myRotate1.play();
        
        TranslateTransition myTransition4 = new TranslateTransition(javafx.util.Duration.seconds(7));
        myTransition4.setToX(134);
        myTransition4.setToY(-132);
        myTransition4.setToZ(254);
        myTransition4.setNode(brocly);
        myTransition4.play();

        TranslateTransition myTransition5 = new TranslateTransition(javafx.util.Duration.seconds(7));
        myTransition5.setToX(150);
        myTransition5.setToY(90);
        myTransition5.setToZ(90);
        myTransition5.setNode(egg);
        myTransition5.play();
        RotateTransition myRotate2 = new RotateTransition(javafx.util.Duration.seconds(2));
        myRotate2.setByAngle(360);
        myRotate2.setAutoReverse(true);
        myRotate2.setCycleCount(RotateTransition.INDEFINITE);
        myRotate2.setNode(egg);
        myRotate2.play();

        TranslateTransition myTransition6 = new TranslateTransition(javafx.util.Duration.seconds(7));
        myTransition6.setToX(-400);
        myTransition6.setToY(110);
        myTransition6.setToZ(160);
        myTransition6.setNode(iceCream);
        myTransition6.play();

    }

}
