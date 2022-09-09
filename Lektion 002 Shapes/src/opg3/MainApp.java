package opg3;

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
		Circle circle = new Circle(125, 80, 50);
		pane.getChildren().add(circle);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);

		Circle circle2 = new Circle(150, 75, 10);
		pane.getChildren().add(circle2);
		circle2.setFill(Color.WHITE);
		circle2.setStroke(Color.BLACK);

		Circle circle3 = new Circle(100, 75, 10);
		pane.getChildren().add(circle3);
		circle3.setFill(Color.WHITE);
		circle3.setStroke(Color.BLACK);

		Line mouth = new Line(150, 100, 100, 100);
		pane.getChildren().add(mouth);
		mouth.setFill(Color.WHITE);
		mouth.setStroke(Color.BLACK);

//		Rectangle rektangel = new Rectangle(100, 160, 250, 80);
//		pane.getChildren().add(rektangel);
//		rektangel.setFill(Color.DARKRED);
//		rektangel.setStroke(Color.BLACK);

//		Text text = new Text(200, 200, "Christian");
//		pane.getChildren().add(text);
//		text.setFill(Color.ANTIQUEWHITE);
//		text.setStroke(Color.BLACK);

//		Line line = new Line(300, 300, 200, 200);
//		pane.getChildren().add(line);
//		line.setFill(Color.INDIANRED);
//		line.setStroke(Color.DARKGREEN);

	}

}
