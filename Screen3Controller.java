package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Screen3Controller implements Initializable {
	@FXML Label lblText;
	@FXML Button btnSecond, btnClose;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
	public void btnSecondAction(ActionEvent event) {
		try {
		Parent root = FXMLLoader.load(getClass().getResource("Screen4.fxml"));
		Stage stage = new Stage();
		stage.setTitle("두번째 화면");
		stage.setScene(new Scene(root, 600, 400));
		stage.show();
	} catch(Exception e) {
		e.printStackTrace();
	}
	
}
	public void btnCloseAction(ActionEvent event) {
		Stage stage = (Stage)btnClose.getScene().getWindow();
		stage.close();
	}
}
