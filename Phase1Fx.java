package application;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import phase1.*;

public class Phase1Fx extends Application {
	static File file;
	static DistrictDoublyLinkedList<District> districtLinkedList = new DistrictDoublyLinkedList<District>();

	@Override
	public void start(Stage stage) throws Exception {
		TabPane tabpane = new TabPane();
		FileChooser fileChooser = new FileChooser();
		Tab district = new Tab();
		Tab location = new Tab();
		StackPane pane = new StackPane();
		VBox vMain = new VBox(10);
		vMain.setAlignment(Pos.CENTER);
		Label lbl = new Label();
		lbl.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;-fx-font-family: 'Times New Roman';");
		Button choose = new Button("Choose A File To Start");
		choose.setStyle(
				"-fx-background-color: white; -fx-text-fill: black; -fx-font-size: 16px; -fx-font-weight: bold;-fx-font-family: 'Times New Roman';");
		vMain.getChildren().addAll(choose, lbl);
		choose.setOnAction(e -> {
			try {
				File selectedFile = fileChooser.showOpenDialog(stage);
				file = selectedFile;
				this.readFromFile();
				district.setDisable(false);
				location.setDisable(false);
				BorderPaneDistrict BPDistrict = new BorderPaneDistrict();
				district.setContent(BPDistrict.getMainPane());
				BorderPaneLocation BPLocation = new BorderPaneLocation();
				location.setContent(BPLocation.getBPLocation());
				lbl.setText("File selected Successfully");
				lbl.setTextFill(Color.GREEN);
			} catch (Exception ex) {
				lbl.setText("Choose File Please");
				lbl.setTextFill(Color.RED);
			}

		});
		Image image = new Image(
				"https://scontent.fjrs25-1.fna.fbcdn.net/v/t1.15752-9/434837322_1089792465411196_1225885032354750250_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=5f2048&_nc_ohc=-e18c9zxefAAb7ZQbkh&_nc_ht=scontent.fjrs25-1.fna&oh=03_AdWoS31CMG05QdwQEgiQSZeR4zlGmkO5ggVY_kfXxkaofw&oe=663C94F9");
		ImageView imageView = new ImageView(image);
		imageView.fitWidthProperty().bind(stage.widthProperty());
		imageView.fitHeightProperty().bind(stage.heightProperty());
		imageView.setOpacity(0.5);
		pane.getChildren().addAll(imageView, vMain);
		Tab main = new Tab();
		main.setText("Choose File");
		main.setContent(pane);

		district.setText("District");
		district.setDisable(true);

		location.setText("Location");
		location.setDisable(true);

		tabpane.getTabs().addAll(main, district, location);
		Scene scene = new Scene(tabpane, 400, 400);
		stage.setMaximized(true);
		stage.setScene(scene);
		stage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

	public void readFromFile() {
		try {
			Scanner scan = new Scanner(file);
			scan.nextLine();
			while (scan.hasNext()) {
				String Line = scan.nextLine();
				String[] data = Line.split(",");
				if (data.length == 6 && !data[2].equals("")) {
					String name = data[0];
					String date = data[1];
					int age = Integer.parseInt(data[2]);
					String Location = data[3];
					String district = data[4];
					String gender = data[5];
					District districtObj = new District(district);
					districtLinkedList.insert(districtObj);
					Location location = new Location(Location);
					((District) districtLinkedList.findDistrict(districtObj).getData()).getLocation().insert(location);
					Martyr martyr = new Martyr(name, date, age, Location, district, gender);
					((District) districtLinkedList.findDistrict(districtObj).getData()).getLocation().findNode(location)
							.getData().addMartyr(martyr);
				}

			}
		} catch (IOException ex) {
		}
	}


	public static DistrictDoublyLinkedList<District> getDistrictLinkedList() {
		return districtLinkedList;
	}

	public static void setDistrictLinkedList(DistrictDoublyLinkedList<District> districtLinkedList) {
		Phase1Fx.districtLinkedList = districtLinkedList;
	}

	public static File getFile() {
		return file;
	}

	public static void setFile(File file) {
		Phase1Fx.file = file;
	}
	
	

}
