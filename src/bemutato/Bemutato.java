
package bemutato;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Bemutato extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        Image image = new Image("http://www.lanpartyguide.com/images/cod4_banner.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setRotate(15);
        pane.getChildren().add(imageView);
        pane.setAlignment(imageView, Pos.TOP_LEFT);
        imageView.fitWidthProperty().bind(pane.widthProperty());
        
        Scene scene1 = new Scene(pane, 800, 600);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Programunk");
        primaryStage.show();
             
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
