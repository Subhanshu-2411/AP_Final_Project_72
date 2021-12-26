package com.example.ap_final_project_72;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class NavigationDrawerContentController {

    private Parent root;
    private Stage stage;
    private Scene scene;
    private ActionEvent event;

    @FXML
    private ImageView helpButton, quitButton, restartButton, resumeButton;

    @FXML
    private AnchorPane navigationContent;

}
