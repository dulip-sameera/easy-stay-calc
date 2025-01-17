package com.easystaycalc.app;

import com.easystaycalc.app.util.AppRouter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            primaryStage.setScene(new Scene(AppRouter.getFXMLLoader(AppRouter.Routes.MAIN).load()));
            primaryStage.setTitle("EasyStayCalc");
            primaryStage.setResizable(false);
            primaryStage.show();
            primaryStage.centerOnScreen();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
