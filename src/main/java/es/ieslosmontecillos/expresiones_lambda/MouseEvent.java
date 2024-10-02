package es.ieslosmontecillos.expresiones_lambda;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEvent extends Application {

    @Override
    public void start(Stage primaryStage) {
        //El texto que puede mover
        Text text = new Text(200, 200, "Programming is fun");
        //para que pueda mover con el raton
        text.setOnMouseDragged((javafx.scene.input.MouseEvent event) -> {
            //actualizar la posición del texto con las coordenadas del ratón
            text.setX(event.getX());
            text.setY(event.getY());
        });
        //crear un contenedor para añadir el texto
        Pane root = new Pane();
        root.getChildren().add(text);

        //crear la escena y añadirla al escenario
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Mover Texto");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}