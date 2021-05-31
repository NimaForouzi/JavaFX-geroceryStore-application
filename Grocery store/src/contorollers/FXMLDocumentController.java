package contorollers;

import java.awt.Button;
import java.awt.Label;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import javafx.stage.Window;
import javax.swing.JOptionPane;
import projectseventh.ProjectSeventh;

public class FXMLDocumentController implements Initializable {

    @FXML
    javafx.scene.control.Label itemCounter;
    @FXML
    Button shopingDone;
    @FXML
    javafx.scene.control.Label addItemLabel;

    Random myRand = new Random();
    int holdingFrizes = myRand.nextInt(6);
    int frizeSoled;
    int holdingBread = myRand.nextInt(6);
    int BreadSoled;
    int holdingIceCream = myRand.nextInt(6);
    int IceCreamSoled;
    int holdingYoughart = myRand.nextInt(6);
    int YoughartSoled;
    int holdingBerger = myRand.nextInt(6);
    int BergerSoled;
    int holdingCocounat = myRand.nextInt(6);
    int CocounatSoled;
    int holdingEgg = myRand.nextInt(6);
    int EggSoled;
    int holdingHoney = myRand.nextInt(6);
    int HoneySoled;
    int holdingDonat = myRand.nextInt(6);
    int DonatSoled;
    int holdingBrucly = myRand.nextInt(6);
    int BruclySoled;

    public void shopingDoneButton(ActionEvent event) throws IOException {
        String s = "Are you sure you want end shopping?";
        int x = JOptionPane.showConfirmDialog(null, s, "Question Box", JOptionPane.YES_NO_OPTION);
        if (x == 0) {
            FXMLLoader payCheckLoader = new FXMLLoader();
            payCheckLoader.setLocation(getClass().getResource("/FXMLfiles/payCheck.fxml"));
            Parent payCheckParent = payCheckLoader.load();
            Scene payCheckScene = new Scene(payCheckParent);
            PayCheckController g = payCheckLoader.getController();
            g.getValues(this.frizeSoled, this.BreadSoled, this.IceCreamSoled, this.YoughartSoled, this.BergerSoled, this.CocounatSoled, this.EggSoled, this.HoneySoled, this.DonatSoled, this.BruclySoled);
            Stage sameStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            sameStage.setScene(payCheckScene);

        }
    }

    public void frize(Event event) throws IOException, Exception {
        if (holdingFrizes <= 0) {
            FXMLLoader watingLoader = new FXMLLoader();
            watingLoader.setLocation(getClass().getResource("/FXMLfiles/wating.fxml"));
            Parent watingParent = watingLoader.load();
            Scene watingScene = new Scene(watingParent);

            Scene currentScene = itemCounter.getScene();
            Stage stage = (Stage) currentScene.getWindow();

            stage.setScene(watingScene);

            PauseTransition myPauseTransition = new PauseTransition(javafx.util.Duration.seconds(7));
            myPauseTransition.setOnFinished(e -> {
                stage.setScene(currentScene);
            });
            myPauseTransition.play();
            ++holdingFrizes;
            itemCounter.setText(String.valueOf(Double.parseDouble(itemCounter.getText()) + 1));
            addItemLabel.setVisible(true);
            --holdingFrizes;
            this.frizeSoled += 1;

        } else {
            itemCounter.setText(String.valueOf(Double.parseDouble(itemCounter.getText()) + 1));
            addItemLabel.setVisible(true);
            --holdingFrizes;
            this.frizeSoled += 1;
        }

    }

    public void bread(Event event) throws IOException {
        if (holdingBread <= 0) {
            FXMLLoader watingLoader = new FXMLLoader();
            watingLoader.setLocation(getClass().getResource("/FXMLfiles/wating.fxml"));
            Parent watingParent = watingLoader.load();
            Scene watingScene = new Scene(watingParent);

            Scene currentScene = itemCounter.getScene();
            Stage stage = (Stage) currentScene.getWindow();

            stage.setScene(watingScene);

            PauseTransition myPauseTransition = new PauseTransition(javafx.util.Duration.seconds(7));
            myPauseTransition.setOnFinished(e -> {
                stage.setScene(currentScene);
            });
            myPauseTransition.play();
            ++holdingBread;
            itemCounter.setText(String.valueOf(Double.parseDouble(itemCounter.getText()) + 1));
            addItemLabel.setVisible(true);
            --holdingBread;
            this.BreadSoled += 1;

        } else {
            itemCounter.setText(String.valueOf(Double.parseDouble(itemCounter.getText()) + 1));
            addItemLabel.setVisible(true);
            --holdingBread;
            this.BreadSoled += 1;

        }

    }

    public void iceCream(Event event) throws IOException {
        if (holdingIceCream <= 0) {
            FXMLLoader watingLoader = new FXMLLoader();
            watingLoader.setLocation(getClass().getResource("/FXMLfiles/wating.fxml"));
            Parent watingParent = watingLoader.load();
            Scene watingScene = new Scene(watingParent);

            Scene currentScene = itemCounter.getScene();
            Stage stage = (Stage) currentScene.getWindow();

            stage.setScene(watingScene);

            PauseTransition myPauseTransition = new PauseTransition(javafx.util.Duration.seconds(7));
            myPauseTransition.setOnFinished(e -> {
                stage.setScene(currentScene);
            });
            myPauseTransition.play();
            ++holdingIceCream;
            itemCounter.setText(String.valueOf(Double.parseDouble(itemCounter.getText()) + 1));
            addItemLabel.setVisible(true);
            --holdingIceCream;
            this.IceCreamSoled += 1;

        } else {
            itemCounter.setText(String.valueOf(Double.parseDouble(itemCounter.getText()) + 1));
            addItemLabel.setVisible(true);
            --holdingIceCream;
            this.IceCreamSoled += 1;

        }

    }

    public void youghort(Event event) throws IOException {
        if (holdingYoughart <= 0) {
            FXMLLoader watingLoader = new FXMLLoader();
            watingLoader.setLocation(getClass().getResource("/FXMLfiles/wating.fxml"));
            Parent watingParent = watingLoader.load();
            Scene watingScene = new Scene(watingParent);

            Scene currentScene = itemCounter.getScene();
            Stage stage = (Stage) currentScene.getWindow();

            stage.setScene(watingScene);

            PauseTransition myPauseTransition = new PauseTransition(javafx.util.Duration.seconds(7));
            myPauseTransition.setOnFinished(e -> {
                stage.setScene(currentScene);
            });
            myPauseTransition.play();
            ++holdingYoughart;
            itemCounter.setText(String.valueOf(Double.parseDouble(itemCounter.getText()) + 1));
            addItemLabel.setVisible(true);
            --holdingYoughart;
            this.YoughartSoled += 1;

        } else {
            itemCounter.setText(String.valueOf(Double.parseDouble(itemCounter.getText()) + 1));
            addItemLabel.setVisible(true);
            --holdingYoughart;
            this.YoughartSoled += 1;

        }

    }

    public void berger(Event event) throws IOException {
        if (holdingBerger <= 0) {
            FXMLLoader watingLoader = new FXMLLoader();
            watingLoader.setLocation(getClass().getResource("/FXMLfiles/wating.fxml"));
            Parent watingParent = watingLoader.load();
            Scene watingScene = new Scene(watingParent);

            Scene currentScene = itemCounter.getScene();
            Stage stage = (Stage) currentScene.getWindow();

            stage.setScene(watingScene);

            PauseTransition myPauseTransition = new PauseTransition(javafx.util.Duration.seconds(7));
            myPauseTransition.setOnFinished(e -> {
                stage.setScene(currentScene);
            });
            myPauseTransition.play();
            ++holdingBerger;
            itemCounter.setText(String.valueOf(Double.parseDouble(itemCounter.getText()) + 1));
            addItemLabel.setVisible(true);
            --holdingBerger;
            this.BergerSoled += 1;
        } else {
            itemCounter.setText(String.valueOf(Double.parseDouble(itemCounter.getText()) + 1));
            addItemLabel.setVisible(true);
            --holdingBerger;
            this.BergerSoled += 1;

        }

    }

    public void coconut(Event event) throws IOException {
        if (holdingCocounat <= 0) {
            FXMLLoader watingLoader = new FXMLLoader();
            watingLoader.setLocation(getClass().getResource("/FXMLfiles/wating.fxml"));
            Parent watingParent = watingLoader.load();
            Scene watingScene = new Scene(watingParent);

            Scene currentScene = itemCounter.getScene();
            Stage stage = (Stage) currentScene.getWindow();

            stage.setScene(watingScene);

            PauseTransition myPauseTransition = new PauseTransition(javafx.util.Duration.seconds(7));
            myPauseTransition.setOnFinished(e -> {
                stage.setScene(currentScene);
            });
            myPauseTransition.play();
            ++holdingCocounat;
            itemCounter.setText(String.valueOf(Double.parseDouble(itemCounter.getText()) + 1));
            addItemLabel.setVisible(true);
            --holdingCocounat;
            this.CocounatSoled += 1;

        } else {
            itemCounter.setText(String.valueOf(Double.parseDouble(itemCounter.getText()) + 1));
            addItemLabel.setVisible(true);
            --holdingCocounat;
            this.CocounatSoled += 1;

        }

    }

    public void egg(Event event) throws IOException {
        if (holdingEgg <= 0) {
            FXMLLoader watingLoader = new FXMLLoader();
            watingLoader.setLocation(getClass().getResource("/FXMLfiles/wating.fxml"));
            Parent watingParent = watingLoader.load();
            Scene watingScene = new Scene(watingParent);

            Scene currentScene = itemCounter.getScene();
            Stage stage = (Stage) currentScene.getWindow();

            stage.setScene(watingScene);

            PauseTransition myPauseTransition = new PauseTransition(javafx.util.Duration.seconds(7));
            myPauseTransition.setOnFinished(e -> {
                stage.setScene(currentScene);
            });
            myPauseTransition.play();
            ++holdingEgg;
            itemCounter.setText(String.valueOf(Double.parseDouble(itemCounter.getText()) + 1));
            addItemLabel.setVisible(true);
            --holdingEgg;
            this.EggSoled += 1;

        } else {
            itemCounter.setText(String.valueOf(Double.parseDouble(itemCounter.getText()) + 1));
            addItemLabel.setVisible(true);
            --holdingEgg;
            this.EggSoled += 1;
        }

    }

    public void honey(Event event) throws IOException {
        if (holdingHoney <= 0) {
            FXMLLoader watingLoader = new FXMLLoader();
            watingLoader.setLocation(getClass().getResource("/FXMLfiles/wating.fxml"));
            Parent watingParent = watingLoader.load();
            Scene watingScene = new Scene(watingParent);

            Scene currentScene = itemCounter.getScene();
            Stage stage = (Stage) currentScene.getWindow();

            stage.setScene(watingScene);

            PauseTransition myPauseTransition = new PauseTransition(javafx.util.Duration.seconds(7));
            myPauseTransition.setOnFinished(e -> {
                stage.setScene(currentScene);
            });
            myPauseTransition.play();
            ++holdingHoney;
            itemCounter.setText(String.valueOf(Double.parseDouble(itemCounter.getText()) + 1));
            addItemLabel.setVisible(true);
            --holdingHoney;
            this.HoneySoled += 1;

        } else {
            itemCounter.setText(String.valueOf(Double.parseDouble(itemCounter.getText()) + 1));
            addItemLabel.setVisible(true);
            --holdingHoney;
            this.HoneySoled += 1;

        }

    }

    public void donate(Event event) throws IOException {
        if (holdingDonat <= 0) {
            FXMLLoader watingLoader = new FXMLLoader();
            watingLoader.setLocation(getClass().getResource("/FXMLfiles/wating.fxml"));
            Parent watingParent = watingLoader.load();
            Scene watingScene = new Scene(watingParent);

            Scene currentScene = itemCounter.getScene();
            Stage stage = (Stage) currentScene.getWindow();

            stage.setScene(watingScene);

            PauseTransition myPauseTransition = new PauseTransition(javafx.util.Duration.seconds(7));
            myPauseTransition.setOnFinished(e -> {
                stage.setScene(currentScene);
            });
            myPauseTransition.play();
            ++holdingDonat;
            itemCounter.setText(String.valueOf(Double.parseDouble(itemCounter.getText()) + 1));
            addItemLabel.setVisible(true);
            --holdingDonat;
            this.DonatSoled += 1;

        } else {
            itemCounter.setText(String.valueOf(Double.parseDouble(itemCounter.getText()) + 1));
            addItemLabel.setVisible(true);
            --holdingDonat;
            this.DonatSoled += 1;

        }

    }

    public void brucly(Event event) throws IOException {
        if (holdingBrucly <= 0) {
            FXMLLoader watingLoader = new FXMLLoader();
            watingLoader.setLocation(getClass().getResource("/FXMLfiles/wating.fxml"));
            Parent watingParent = watingLoader.load();
            Scene watingScene = new Scene(watingParent);

            Scene currentScene = itemCounter.getScene();
            Stage stage = (Stage) currentScene.getWindow();

            stage.setScene(watingScene);

            PauseTransition myPauseTransition = new PauseTransition(javafx.util.Duration.seconds(7));
            myPauseTransition.setOnFinished(e -> {
                stage.setScene(currentScene);
            });
            myPauseTransition.play();
            ++holdingBrucly;
            itemCounter.setText(String.valueOf(Double.parseDouble(itemCounter.getText()) + 1));
            addItemLabel.setVisible(true);
            --holdingBrucly;
            this.BruclySoled += 1;

        } else {
            itemCounter.setText(String.valueOf(Double.parseDouble(itemCounter.getText()) + 1));
            addItemLabel.setVisible(true);
            --holdingBrucly;
            this.BruclySoled += 1;

        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        itemCounter.setText(String.valueOf(0));

    }

}
