package opg2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainApp extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {
		Pane root = this.initContent();
		Scene scene = new Scene(root);

		stage.setTitle("Shapes");
		stage.setScene(scene);
		stage.show();
	}

	private Pane initContent() {
		Pane pane = new Pane();
		pane.setPrefSize(400, 400);
		this.drawShapes(pane);
		return pane;
	}

	// ------------------------------------------------------------------------

	private void drawShapes(Pane pane) {
//		Circle circle = new Circle(30, 80, 50);
//		pane.getChildren().add(circle);
//		circle.setFill(Color.CORNFLOWERBLUE);
//		circle.setStroke(Color.BLACK);

		Rectangle rektangel = new Rectangle(100, 160, 250, 80);
		pane.getChildren().add(rektangel);
		rektangel.setFill(Color.DARKRED);
		rektangel.setStroke(Color.BLACK);

		Text text = new Text(200, 200, "Christian");
		pane.getChildren().add(text);
		text.setFill(Color.ANTIQUEWHITE);
//		text.setStroke(Color.BLACK);

//		Line line = new Line(300, 300, 200, 200);
//		pane.getChildren().add(line);
//		line.setFill(Color.INDIANRED);
//		line.setStroke(Color.DARKGREEN);

	}

}
