
package bemutato;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Bemutato extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        StackPane pane1 = new StackPane();
        pane1.getChildren().add(new Button("Első Button"));
        Scene scene1 = new Scene(pane1, 300, 50);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Első Stage");
        primaryStage.show();
        
        Stage stage2 = new Stage();
        stage2.setScene(new Scene(new Button("Második Button"), 300, 100));
        stage2.setTitle("Második Stage");
        stage2.show();
        
        Pane pane3 = new Pane();
        Stage stage3 = new Stage();
        Circle circle1 = new Circle();
        circle1.setRadius(50);
//        circle1.setCenterX(70);
//        circle1.setCenterY(70);
        circle1.centerXProperty().bind(pane3.widthProperty().divide(2));
        circle1.centerYProperty().bind(pane3.heightProperty().divide(2));

        circle1.setFill(Color.BISQUE);

        pane3.getChildren().add(circle1);
        stage3.setScene(new Scene(pane3, 300, 300));
        stage3.setTitle("Harmadik Stage");
        stage3.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
