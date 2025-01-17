package com.easystaycalc.app.util;

import javafx.fxml.FXMLLoader;

public class AppRouter {

    public enum Routes {
        MAIN
    }

    public static FXMLLoader getFXMLLoader(Routes route) {
        return switch (route) {
            case Routes.MAIN -> new FXMLLoader(AppRouter.class.getResource("/scene/MainScene.fxml"));
            default -> null;
        };
    }
}
