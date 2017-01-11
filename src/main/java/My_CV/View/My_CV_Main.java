package main.java.My_CV.View;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Locale;

/**
 * Created by ${BIM} on 18.08.2016.
 */
public class My_CV_Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            Ukrainian_Main um = new Ukrainian_Main();
            um.setUkrStageMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        launch(args);
    }
}
