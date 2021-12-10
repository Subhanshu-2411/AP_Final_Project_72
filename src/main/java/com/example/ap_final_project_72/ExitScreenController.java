package com.example.ap_final_project_72;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class ExitScreenController implements Initializable {

    private Parent root;
    private Stage stage;
    private Scene scene;
    private ActionEvent event;

    @FXML
    private ImageView HeroImage, OrcImage1, OrcImage2, OrcImage3;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TranslateTransition translateHero = new TranslateTransition();
        translateHero.setNode(HeroImage);
        translateHero.setDuration(Duration.millis(500));
        translateHero.setCycleCount(TranslateTransition.INDEFINITE);
        translateHero.setByY(-105);
        translateHero.setAutoReverse(true);
        translateHero.play();

        TranslateTransition translateOrc1 = new TranslateTransition();
        translateOrc1.setNode(OrcImage1);
        translateOrc1.setDelay(Duration.millis(200));
        translateOrc1.setDuration(Duration.millis(500));
        translateOrc1.setCycleCount(TranslateTransition.INDEFINITE);
        translateOrc1.setByY(-100);
        translateOrc1.setAutoReverse(true);
        translateOrc1.play();

        TranslateTransition translateOrc2 = new TranslateTransition();
        translateOrc2.setNode(OrcImage2);
        translateOrc2.setDelay(Duration.millis(400));
        translateOrc2.setDuration(Duration.millis(500));
        translateOrc2.setCycleCount(TranslateTransition.INDEFINITE);
        translateOrc2.setByY(-100);
        translateOrc2.setAutoReverse(true);
        translateOrc2.play();

        TranslateTransition translateOrc3 = new TranslateTransition();
        translateOrc3.setNode(OrcImage3);
        translateOrc3.setDelay(Duration.millis(600));
        translateOrc3.setDuration(Duration.millis(500));
        translateOrc3.setCycleCount(TranslateTransition.INDEFINITE);
        translateOrc3.setByY(-100);
        translateOrc3.setAutoReverse(true);
        translateOrc3.play();

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit Game");
        alert.setHeaderText("You are about to Exit the Game");

        if(alert.showAndWait().get() == ButtonType.OK){
            stage.close();
        }
        else{
            try {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MainMenu.fxml")));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
            catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
