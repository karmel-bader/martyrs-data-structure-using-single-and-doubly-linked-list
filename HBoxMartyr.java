package phase1;

import java.time.LocalDate;

import application.Phase1Fx;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.time.LocalDate;

import application.Phase1Fx;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class HBoxMartyr {
	private HBox hMartyr = new HBox(20);
	private static TextField tfSearch;
	private static TextField tfUpdate;
	private SingleNode<Location> nodeU;

	public HBoxMartyr() {
		hMartyr.setAlignment(Pos.CENTER);
		hMartyr.setStyle("-fx-background-color: white;");

		StackPane insert = new StackPane();
		Rectangle recInsert = new Rectangle(400, 400);
		recInsert.setStyle("-fx-stroke-width: 3px;-fx-fill:#990000;");
		recInsert.setArcWidth(50);
		recInsert.setArcHeight(50);
		insert.setAlignment(Pos.CENTER);
		VBox vInsert = new VBox(10);
		vInsert.setAlignment(Pos.CENTER);
		Label lblInsert = new Label("Enter The Required Data To Insert New Martyr");
		lblInsert.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:white;");
		lblInsert.setAlignment(Pos.CENTER);
		GridPane gpInsert = new GridPane();
		gpInsert.setAlignment(Pos.CENTER);
		gpInsert.setHgap(8);
		gpInsert.setVgap(8);
		Label name = new Label("Enter The Name");
		name.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:white;");
		gpInsert.add(name, 0, 0);
		TextField tfName = new TextField();
		tfName.setPrefColumnCount(10);
		gpInsert.add(tfName, 1, 0);

		Label age = new Label("Enter The Age");
		age.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:white;");
		gpInsert.add(age, 0, 1);
		TextField tfAge = new TextField();
		tfAge.setPrefColumnCount(10);
		gpInsert.add(tfAge, 1, 1);

		Label date = new Label("Enter The Date");
		date.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:white;");
		gpInsert.add(date, 0, 2);
		DatePicker Ddate = new DatePicker();
		Ddate.getEditor().setDisable(true);
		gpInsert.add(Ddate, 1, 2);

		Label location = new Label("Enter The Location");
		location.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:white;");
		gpInsert.add(location, 0, 3);
		TextField tfLocation = new TextField();
		tfLocation.setPrefColumnCount(10);
		gpInsert.add(tfLocation, 1, 3);

		Label district = new Label("Enter The District");
		district.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:white;");
		gpInsert.add(district, 0, 4);
		TextField tfDistrict = new TextField();
		tfDistrict.setPrefColumnCount(10);
		gpInsert.add(tfDistrict, 1, 4);

		HBox hbox = new HBox(5);
		hbox.setAlignment(Pos.CENTER);
		Label gender = new Label("Choose The Gender");
		gender.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:white;");
		gpInsert.add(gender, 0, 5);
		ComboBox<String> CB = new ComboBox<String>();
		CB.getItems().addAll("M", "F");
		Button bInsert = new Button("Insert");
		bInsert.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-background-color:white;");
		Label insertRes = new Label();
		insertRes.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:#FFEECC;");
		hbox.getChildren().addAll(CB, bInsert);
		gpInsert.add(hbox, 1, 5);

		vInsert.getChildren().addAll(lblInsert, gpInsert, insertRes);
		insert.getChildren().addAll(recInsert, vInsert);

		VBox operators = new VBox(5);
		operators.setAlignment(Pos.CENTER);

		StackPane delete = new StackPane();
		delete.setAlignment(Pos.CENTER);
		Rectangle recDelete = new Rectangle(300, 150);
		recDelete.setStyle("-fx-stroke-width: 3px;-fx-fill:#990000;");
		recDelete.setArcWidth(50);
		recDelete.setArcHeight(50);
		HBox hDelete = new HBox(5);
		hDelete.setAlignment(Pos.CENTER);
		TextField tfDelete = new TextField();
		tfDelete.setPrefColumnCount(10);
		Button bDelete = new Button("Delete");
		bDelete.setStyle(
				"-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-background-color:white;");
		hDelete.getChildren().addAll(tfDelete, bDelete);
		VBox vDelete = new VBox(8);
		vDelete.setAlignment(Pos.CENTER);
		Label lblResD = new Label("");
		lblResD.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:#FFEECC;");
		Label lblD = new Label("To delete a Martyr Enter His name");
		lblD.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:white;");
		vDelete.getChildren().addAll(lblD, hDelete, lblResD);
		delete.getChildren().addAll(recDelete, vDelete);

		StackPane update = new StackPane();
		update.setAlignment(Pos.CENTER);
		Rectangle recUpdate = new Rectangle(300, 150);
		recUpdate.setStyle("-fx-stroke-width: 3px;-fx-fill:#990000;");
		recUpdate.setArcWidth(50);
		recUpdate.setArcHeight(50);
		VBox vUpdate = new VBox(10);
		vUpdate.setAlignment(Pos.CENTER);
		HBox hUpdate = new HBox(8);
		hUpdate.setAlignment(Pos.CENTER);
		Label lblUpdate = new Label("Enter The Name Of The Martyr Whose\n          data You Want To Modify");
		lblUpdate.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:white;");
		tfUpdate = new TextField();
		tfUpdate.setPrefColumnCount(10);
		Button bLoad = new Button("Load");
		bLoad.setStyle(
				"-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-background-color:white;");
		Label lblResU = new Label();
		lblResU.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:#FFEECC;");
		hUpdate.getChildren().addAll(tfUpdate, bLoad);
		vUpdate.getChildren().addAll(lblUpdate, hUpdate, lblResU);
		update.getChildren().addAll(recUpdate, vUpdate);

		GridPane gpUpdate = new GridPane();
		gpUpdate.setAlignment(Pos.CENTER);
		gpUpdate.setHgap(10);
		gpUpdate.setVgap(10);
		VBox vUp = new VBox(5);
		vUp.setAlignment(Pos.CENTER);
		Label lblU = new Label(
				"This is The Data Of The Martyr Whose Name\n You Enterd. Update The Data You Want And Enter\n The Same Old Information For The Data You Don't\n                          Want To Update");
		lblU.setAlignment(Pos.CENTER);
		lblU.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;");
		Label lblResFirst = new Label();
		lblResFirst.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:#990000;");
		Label nameU = new Label("Enter The Name");
		nameU.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;");
		gpUpdate.add(nameU, 0, 0);
		TextField tfNameU = new TextField();
		tfNameU.setPrefColumnCount(10);
		gpUpdate.add(tfNameU, 1, 0);

		Label ageU = new Label("Enter The Age");
		ageU.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;");
		gpUpdate.add(ageU, 0, 1);
		TextField tfAgeU = new TextField();
		tfAgeU.setPrefColumnCount(10);
		gpUpdate.add(tfAgeU, 1, 1);

		Label dateU = new Label("Enter The Date");
		dateU.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;");
		gpUpdate.add(dateU, 0, 2);
		DatePicker DdateU = new DatePicker();
		DdateU.getEditor().setDisable(true);
		gpUpdate.add(DdateU, 1, 2);

		HBox hboxU = new HBox(5);
		hboxU.setAlignment(Pos.CENTER);
		Label genderU = new Label("Choose The Gender");
		genderU.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;");
		gpUpdate.add(genderU, 0, 3);
		ComboBox<String> CBU = new ComboBox<String>();
		CBU.getItems().addAll("M", "F");
		Button bUpdate = new Button("Update");
		bUpdate.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-background-color:#990000;-fx-text-fill:white;");
		Label updateRes = new Label();
		updateRes.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:#990000;");
		hboxU.getChildren().addAll(CBU, bUpdate);
		gpUpdate.add(hboxU, 1, 3);

		vUp.getChildren().addAll(lblU, lblResFirst, gpUpdate, updateRes);
		vUp.setStyle("-fx-background-color: white;");

		Stage stage = new Stage();
		stage.setTitle("Update Martyr Information");
		Scene scene = new Scene(vUp, 400, 400);
		stage.setScene(scene);

		StackPane search = new StackPane();
		search.setAlignment(Pos.CENTER);
		Rectangle recSearch = new Rectangle(300, 150);
		recSearch.setStyle("-fx-stroke-width: 3px;-fx-fill:#990000;");
		recSearch.setArcWidth(50);
		recSearch.setArcHeight(50);
		HBox hSearch = new HBox(5);
		hSearch.setAlignment(Pos.CENTER);
		tfSearch = new TextField();
		tfSearch.setPrefColumnCount(10);
		Button bSearch = new Button("Search");
		bSearch.setStyle(
				"-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-background-color:white;");
		hSearch.getChildren().addAll(tfSearch, bSearch);
		VBox vSearch = new VBox(10);
		vSearch.setAlignment(Pos.CENTER);
		Label lblRes = new Label("");
		lblRes.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:#FFEECC;");
		Label lbl = new Label("To Search For a Martyr Enter His name");
		lbl.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:white;");
		vSearch.getChildren().addAll(lbl, hSearch, lblRes);
		search.getChildren().addAll(recSearch, vSearch);

		operators.getChildren().addAll(delete, search, update);
		hMartyr.getChildren().addAll(insert, operators);

		bLoad.setOnAction(e -> {
			nodeU = BorderPaneLocation.getNode();
			if (tfUpdate.getText().isBlank() == true) {
				lblResU.setText("The Box is Empty");
				lblResU.setTextFill(Color.BLACK);
			} else {
				SingleNode<Martyr> martyrNode = BorderPaneLocation.getNode().getData().getMartyr()
						.findNode(new Martyr(tfUpdate.getText()));
				if (martyrNode == null) {
					lblResU.setText("The Martyr Dose Not Exist");
					lblResU.setTextFill(Color.BLACK);
				} else {
					tfNameU.setText("");
					tfAgeU.setText("");
					CBU.setValue(null);
					DdateU.setValue(null);
					updateRes.setText("");
					lblResFirst.setText(martyrNode.getData().toString());
					stage.show();
				}
			}
		});

		bInsert.setOnAction(e -> {
			if (tfName.getText().isBlank() == true || tfAge.getText().isBlank() || tfLocation.getText().isBlank()
					|| tfDistrict.getText().isBlank() || Ddate.getValue() == null || CB.getValue() == null) {
				insertRes.setText("Please Fill All The Required Data Fields!");
				insertRes.setTextFill(Color.BLACK);
			} else if (Ddate.getValue().isAfter(LocalDate.now())) {
				insertRes.setText("Choose a Correct Date Please");
				insertRes.setTextFill(Color.BLACK);
				return;
			} else {
				if (tfAge.getText().isEmpty() == false) {
					try {
						if (Integer.parseInt(tfAge.getText()) > 120 || Integer.parseInt(tfAge.getText()) < 0) {
							insertRes.setText("Sorry, The Age must be between 1 and 120");
							insertRes.setTextFill(Color.BLACK);
							return;
						}
						String[] dateSplit = Ddate.getValue().toString().split("-");
						String newDate = Integer.parseInt(dateSplit[1]) + "/" + Integer.parseInt(dateSplit[2]) + "/"
								+ Integer.parseInt(dateSplit[0]);
						Martyr martyr = new Martyr(tfName.getText(), newDate, Integer.parseInt(tfAge.getText()),
								tfLocation.getText(), tfDistrict.getText(), CB.getValue());
						Location findlocation = new Location(tfLocation.getText());
						District findDistrict = new District(tfDistrict.getText());
						if (Phase1Fx.getDistrictLinkedList().findDistrict(findDistrict) == null) {
							insertRes.setText("The District Dose Not Exist");
							insertRes.setTextFill(Color.BLACK);
							return;
						} else if (((District) Phase1Fx.getDistrictLinkedList().findDistrict(findDistrict).getData())
								.getLocation().findNode(findlocation) == null) {
							insertRes.setText("The Location Dose Not Exist");
							insertRes.setTextFill(Color.BLACK);
							return;
						} else if (((District) Phase1Fx.getDistrictLinkedList().findDistrict(findDistrict).getData())
								.getLocation().findNode(findlocation).getData().addMartyr(martyr) == false) {
							insertRes.setText("The Martyr Exist Before");
							insertRes.setTextFill(Color.BLACK);
							return;
						} else {
							Phase1Fx.getDistrictLinkedList().print();
							insertRes.setText("Added Successfully");
							insertRes.setStyle(
									"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:#FFEECC;");
						}
					} catch (NumberFormatException ex) {
						insertRes.setText("Sorry, The Age must be a number between 1 and 120");
						insertRes.setTextFill(Color.BLACK);
						return;
					}
				}

			}
		});
		bDelete.setOnAction(e -> {
			if (tfDelete.getText().isBlank() == true) {
				lblResD.setText("The Box is Empty");
				lblResD.setTextFill(Color.BLACK);
				return;
			}
			Martyr martyr = new Martyr(tfDelete.getText());
			Location martyrLocation = new Location(BorderPaneLocation.getLblLocation().getText().trim());
			District martyrDistrict = new District(BorderPaneDistrict.getLblDistrict().getText().trim());
			if (Phase1Fx.getDistrictLinkedList().findDistrict(martyrDistrict).getData().getLocation()
					.findNode(martyrLocation).getData().getMartyr().findNode(martyr) != null) {
				Phase1Fx.getDistrictLinkedList().findDistrict(martyrDistrict).getData().getLocation()
						.findNode(martyrLocation).getData().getMartyr()
						.delete(Phase1Fx.getDistrictLinkedList().findDistrict(martyrDistrict).getData().getLocation()
								.findNode(martyrLocation).getData().getMartyr().findNode(martyr).getData());
				Phase1Fx.getDistrictLinkedList().print();
				lblResD.setText("Deleted Successfully");
				lblResD.setStyle(
						"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px; -fx-text-fill:#FFEECC;");

			} else {
				lblResD.setText("The Martyr Dose Not Exist");
				lblResD.setTextFill(Color.BLACK);
			}
		});

		bSearch.setOnAction(e -> {
			SingleNode<Location> node = BorderPaneDistrict.getNode().getData().getLocation()
					.findMartyrByPartOfName(BorderPaneLocation.getNode().getData());
			if (tfSearch.getText().isBlank() == true) {
				lblRes.setText("The Box is Empty");
				lblRes.setTextFill(Color.BLACK);
				return;
			} else {
				if (node == null) {
					lblRes.setText("The Martyr Dose Not Exist");
					lblRes.setTextFill(Color.BLACK);
				} else {
					lblRes.setText(node + " ");
					lblRes.setStyle(
							"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:#FFEECC;");
				}
			}
		});

		bUpdate.setOnAction(e -> {
			if (tfNameU.getText().isBlank() == true || tfAgeU.getText().isBlank() || DdateU.getValue() == null
					|| CBU.getValue() == null) {
				updateRes.setText("Please Fill All The Required Data Fields!");
				updateRes.setStyle(
						"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:#990000;");
				return;
			}
			if (DdateU.getValue().isAfter(LocalDate.now()) == true) {
				updateRes.setText("Choose a Correct Date Please");
				updateRes.setStyle(
						"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:#990000;");
				return;
			} else {
				if (tfAgeU.getText().isBlank() == false) {
					try {
						if (Integer.parseInt(tfAgeU.getText()) > 120 || Integer.parseInt(tfAgeU.getText()) < 0) {
							updateRes.setText("Sorry, The Age must be between 1 and 120");
							updateRes.setStyle(
									"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:#990000;");
							return;
						}
						String[] dateSplit = DdateU.getValue().toString().split("-");
						String newDate = Integer.parseInt(dateSplit[1]) + "/" + Integer.parseInt(dateSplit[2]) + "/"
								+ Integer.parseInt(dateSplit[0]);
						Martyr oldMartyr = ((Location) nodeU.getData()).getMartyr()
								.findNode(new Martyr(tfUpdate.getText())).getData();
						Martyr martyrNew = new Martyr(tfNameU.getText(), newDate, Integer.parseInt(tfAgeU.getText()),
								BorderPaneLocation.getNode().getData() + "",
								BorderPaneDistrict.getNode().getData() + "", CBU.getValue());
						if (BorderPaneLocation.getNode().getData().getMartyr().update(oldMartyr, martyrNew) == false) {
							updateRes.setText("There is something wrong, Try again");
							updateRes.setTextFill(Color.BLACK);
						} else {
							updateRes.setText("Updated Successfully");
							updateRes.setStyle(
									"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:green;");
							Phase1Fx.getDistrictLinkedList().print();
						}

					} catch (NumberFormatException ex) {
						updateRes.setText("Sorry, The Age must be a number between 1 and 120");
						updateRes.setStyle(
								"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;-fx-text-fill:#990000;");
						return;
					}
				}

			}

		});
	}

	public HBox gethMartyr() {
		return hMartyr;
	}

	public void sethMartyr(HBox hMartyr) {
		this.hMartyr = hMartyr;
	}

	public static TextField getTfSearch() {
		return tfSearch;
	}

	public static void setTfSearch(TextField tfSearch) {
		HBoxMartyr.tfSearch = tfSearch;
	}

	public static TextField getTfUpdate() {
		return tfUpdate;
	}

	public static void setTfUpdate(TextField tfUpdate) {
		HBoxMartyr.tfUpdate = tfUpdate;
	}

}
