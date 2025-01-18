package com.easystaycalc.app;

import com.easystaycalc.app.util.AppRouter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    @Override
    public void init() throws Exception {
        Font.loadFont(AppRouter.getFontInputStream(AppRouter.Fonts.ROBOTO_REGULAR), 10);
        Font.loadFont(AppRouter.getFontInputStream(AppRouter.Fonts.ROBOTO_BOLD), 10);
        super.init();
    }

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
