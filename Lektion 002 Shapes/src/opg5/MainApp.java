package opg5;

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

		int row1 = 100;
		int row2 = 180;
		int strokewidth = 2;

		Circle bluering = new Circle(130, row1, 65);
		pane.getChildren().add(bluering);
		bluering.setFill(Color.TRANSPARENT);
		bluering.setStroke(Color.BLUE);
		bluering.setStrokeWidth(strokewidth);

		Circle yellowring = new Circle(180, row2, 65);
		pane.getChildren().add(yellowring);
		yellowring.setFill(Color.TRANSPARENT);
		yellowring.setStroke(Color.YELLOW);
		yellowring.setStrokeWidth(strokewidth);

		Circle blackring = new Circle(230, row1, 65);
		pane.getChildren().add(blackring);
		blackring.setFill(Color.TRANSPARENT);
		blackring.setStroke(Color.BLACK);
		blackring.setStrokeWidth(strokewidth);

		Circle greenring = new Circle(280, row2, 65);
		pane.getChildren().add(greenring);
		greenring.setFill(Color.TRANSPARENT);
		greenring.setStroke(Color.GREEN);
		greenring.setStrokeWidth(strokewidth);

		Circle redring = new Circle(330, row1, 65);
		pane.getChildren().add(redring);
		redring.setFill(Color.TRANSPARENT);
		redring.setStroke(Color.DARKRED);
		redring.setStrokeWidth(strokewidth);

//		Line mouth = new Line(150, 100, 100, 100);
//		pane.getChildren().add(mouth);
//		mouth.setFill(Color.WHITE);
//		mouth.setStroke(Color.TRANSPARENT);

//		Rectangle rektangel = new Rectangle(100, 160, 250, 80);
//		pane.getChildren().add(rektangel);
//		rektangel.setFill(Color.DARKRED);
//		rektangel.setStroke(Color.TRANSPARENT);

//		Text text = new Text(200, 200, "Christian");
//		pane.getChildren().add(text);
//		text.setFill(Color.ANTIQUEWHITE);
//		text.setStroke(Color.TRANSPARENT);

//		Line line = new Line(300, 300, 200, 200);
//		pane.getChildren().add(line);
//		line.setFill(Color.INDIANRED);
//		line.setStroke(Color.DARKGREEN);

	}

}
