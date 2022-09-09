package ex1;

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
		stage.setTitle("Excersize 1");
		GridPane pane = new GridPane();
		this.initContent(pane);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
	}

	// -------------------------------------------------------------------------

	private final TextField txfName = new TextField();
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
		Label lblName = new Label("Name:");
		pane.add(lblName, 0, 0);
		Label lblName2 = new Label("LastName");
		pane.add(lblName2, 3, 0);
		Label lblName3 = new Label("Combine");
		pane.add(lblName3, 0, 1);
		// add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
		// Deleted here is:

		pane.add(txfName, 1, 0, 2, 1);
		pane.add(txfName2, 4, 0, 2, 1);
		pane.add(txfName3, 1, 1, 3, 1);

		// add a button to the pane (at col=1, row=1)
		Button btnUpperCase = new Button("Combine");
		pane.add(btnUpperCase, 2, 2);
		GridPane.setMargin(btnUpperCase, new Insets(10, 10, 0, 10));

		// connect a method to the button
		btnUpperCase.setOnAction(event -> this.CombineAction());

//        // add a button to the pane (at col=2, row=1)
//        Button btnLowerCase = new Button("Lower Case");
//        pane.add(btnLowerCase, 2, 1);
//        GridPane.setMargin(btnLowerCase, new Insets(10, 10, 0, 10));

		// connect a method to the button
//        btnLowerCase.setOnAction(event -> this.lowerCaseAction());
	}

	// -------------------------------------------------------------------------

	private void CombineAction() {
		String name = txfName.getText();
		String lastName = txfName2.getText();
		txfName3.setText(name + " " + lastName);
	}

//    private void lowerCaseAction() {
//        String name = txfName.getText().trim();
//        txfName.setText(name.toLowerCase());
//    }
}
