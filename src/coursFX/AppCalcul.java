package coursFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppCalcul extends Application {
		public static void main(String[] args) {
			launch(args);
		}

		@Override
		public void start(Stage firstPage) throws Exception {
			Parent root = FXMLLoader.load(getClass().getResource("/resources/fxml/Main.fxml"));
			
			firstPage.setTitle("Calculatrice");
			
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/resource/css/app.css").toString());
			
			firstPage.setResizable(false);    // gestion du taille d'applic
			firstPage.setScene(scene);
			firstPage.show();
			
		}
		
		

}
