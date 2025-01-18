package com.easystaycalc.app.util;

import javafx.fxml.FXMLLoader;

import java.io.InputStream;

public class AppRouter {

    public enum Routes {
        MAIN
    }

    public enum Fonts {
        ROBOTO_REGULAR, ROBOTO_BOLD
    }

    public static FXMLLoader getFXMLLoader(Routes route) {
        return switch (route) {
            case Routes.MAIN -> new FXMLLoader(AppRouter.class.getResource("/scene/MainScene.fxml"));

        };

    }

    public static InputStream getFontInputStream(Fonts font) {
        return switch (font) {
            case ROBOTO_REGULAR -> AppRouter.class.getResourceAsStream("/fonts/Roboto-Regular.ttf");
            case ROBOTO_BOLD -> AppRouter.class.getResourceAsStream("/fonts/Roboto-Bold.ttf");
        };
    }

}