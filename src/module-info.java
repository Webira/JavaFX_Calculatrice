module coursFX {
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	opens coursFX to javafx.fxml;
	opens controller to javafx.fxml;
	exports coursFX to javafx.graphics;
	exports controller to javafx.fxml;
}