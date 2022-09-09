package ex3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainApp extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {
		stage.setTitle("Excersize 3");
		GridPane pane = new GridPane();
		this.initContent(pane);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
	}

	// -------------------------------------------------------------------------

	private final TextField txfName = new TextField();
	private final TextField txfName1 = new TextField();
	private final TextField txfName2 = new TextField();
	private final TextField txfName3 = new TextField();

	private void initContent(GridPane pane) {
		// show or hide grid lines
		pane.setGridLinesVisible(false);

		// set padding of the pane
		pane.setPadding(new Insets(20));
		// set horizontal gap between components
		pane.setHgap(10);
		// set vertical gap between components
		pane.setVgap(10);

		// add a label to the pane (at col=0, row=0)
		Label lblName = new Label("Investment : ");
		pane.add(lblName, 0, 0);
		Label lblName1 = new Label("Years : ");
		pane.add(lblName1, 0, 1);
		Label lblName2 = new Label("Interest % : ");
		pane.add(lblName2, 0, 2);
		Label lblName3 = new Label("Future Value : ");
		pane.add(lblName3, 0, 5);

		// add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)

		pane.add(txfName, 1, 0, 2, 1);
		pane.add(txfName1, 1, 1, 2, 1);
		pane.add(txfName2, 1, 2, 2, 1);
		pane.add(txfName3, 1, 5, 2, 1);

		// add a button to the pane (at col=1, row=1)
		Button btnUpperCase = new Button("Calculate");
		pane.add(btnUpperCase, 2, 3);
		GridPane.setMargin(btnUpperCase, new Insets(10, 10, 0, 10));

		// connect a method to the button
		btnUpperCase.setOnAction(event -> this.Calculate());

		System.out.println();

	}

	// -------------------------------------------------------------------------

	// Future Amount = invest(math.pow(1+rate/1,years));
	// Compound interest calculation
	private void Calculate() {
		String invest = txfName.getText();
		String years = txfName1.getText();
		String rate = txfName2.getText();
		String future = txfName3.getText();

		// a = rate
		// OBS rate skal skrives som 0.0xx ellers virker det ikke
		double a = Double.parseDouble(rate);
		rate = Double.toString(a);
		// b = years
		double b = Double.parseDouble(years);
		years = Double.toString(b);
		// c = initial investment
		double c = Double.parseDouble(invest);
		invest = Double.toString(c);
		// i = future value
		double i = Double.parseDouble(future);
		i = c * Math.pow(1 + a / 1, 1 * b);
		future = Double.toString(i);

		// future value = compound interest
		txfName3.setText(future);

	}

}
