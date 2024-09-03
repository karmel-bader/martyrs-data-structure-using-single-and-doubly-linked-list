package phase1;

import application.Phase1Fx;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class VBoxLocation {
	private VBox vLocation = new VBox(5);
	private Label lblRes;
	private Label lblResD;
	private Label lblResU;
	private Label lblResS;
	private TextField tfInsert;
	private TextField tfDelete;
	private TextField tfSearch;
	private TextField tfUpdate;
	private TextField tfNew;

	public VBox getvLocation() {
		return vLocation;
	}

	public void setvLocation(VBox vLocation) {
		this.vLocation = vLocation;
	}

	public Label getLblRes() {
		return lblRes;
	}

	public void setLblRes(Label lblRes) {
		this.lblRes = lblRes;
	}

	public Label getLblResD() {
		return lblResD;
	}

	public void setLblResD(Label lblResD) {
		this.lblResD = lblResD;
	}

	public Label getLblResU() {
		return lblResU;
	}

	public void setLblResU(Label lblResU) {
		this.lblResU = lblResU;
	}

	public Label getLblResS() {
		return lblResS;
	}

	public void setLblResS(Label lblResS) {
		this.lblResS = lblResS;
	}

	public TextField getTfInsert() {
		return tfInsert;
	}

	public void setTfInsert(TextField tfInsert) {
		this.tfInsert = tfInsert;
	}

	public TextField getTfDelete() {
		return tfDelete;
	}

	public void setTfDelete(TextField tfDelete) {
		this.tfDelete = tfDelete;
	}

	public TextField getTfSearch() {
		return tfSearch;
	}

	public void setTfSearch(TextField tfSearch) {
		this.tfSearch = tfSearch;
	}

	public TextField getTfUpdate() {
		return tfUpdate;
	}

	public void setTfUpdate(TextField tfUpdate) {
		this.tfUpdate = tfUpdate;
	}

	public TextField getTfNew() {
		return tfNew;
	}

	public void setTfNew(TextField tfNew) {
		this.tfNew = tfNew;
	}

	public VBoxLocation() {
		HBoxMartyr hMartyr = new HBoxMartyr();
		Scene scene = new Scene(hMartyr.gethMartyr(), 800, 500);
		Stage stage = new Stage();
		stage.setTitle("Martyr Operations");

		StackPane insert = new StackPane();
		insert.setAlignment(Pos.CENTER);
		Rectangle recInsert = new Rectangle(300, 150);
		recInsert.setStyle("-fx-stroke-width: 3px;-fx-fill:#990000;");
		recInsert.setArcWidth(50);
		recInsert.setArcHeight(50);
		HBox hInsert = new HBox(5);
		hInsert.setAlignment(Pos.CENTER);
		tfInsert = new TextField();
		tfInsert.setPrefColumnCount(10);
		Button bInsert = new Button("Insert");
		bInsert.setStyle(
				"-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 12px;-fx-background-color: white;");
		hInsert.getChildren().addAll(tfInsert, bInsert);
		VBox vInsert = new VBox(10);
		vInsert.setAlignment(Pos.CENTER);
		lblRes = new Label("");
		lblRes.setStyle(
				"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15;-fx-font-family: 'Times New Roman';-fx-text-fill:#FFEECC;");
		Label lbl = new Label("To insert a new Loaction Enter it's name");
		lbl.setTextFill(Color.WHITE);
		lbl.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;");
		vInsert.getChildren().addAll(lbl, hInsert, lblRes);
		insert.getChildren().addAll(recInsert, vInsert);

		StackPane delete = new StackPane();
		delete.setAlignment(Pos.CENTER);
		Rectangle recDelete = new Rectangle(300, 150);
		recDelete.setArcWidth(50);
		recDelete.setArcHeight(50);
		recDelete.setStyle("-fx-stroke-width: 3px;-fx-fill:#990000;");
		HBox hDelete = new HBox(5);
		hDelete.setAlignment(Pos.CENTER);
		tfDelete = new TextField();
		tfDelete.setPrefColumnCount(10);
		Button bDelete = new Button("Delete");
		bDelete.setStyle(
				"-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 12px;-fx-background-color: white;");
		hDelete.getChildren().addAll(tfDelete, bDelete);
		VBox vDelete = new VBox(8);
		vDelete.setAlignment(Pos.CENTER);
		lblResD = new Label("");
		lblResD.setStyle(
				"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15;-fx-font-family: 'Times New Roman';-fx-text-fill:#FFEECC;");
		Label lblD = new Label("To delete a Location Enter it's name");
		lblD.setTextFill(Color.WHITE);
		lblD.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;");
		vDelete.getChildren().addAll(lblD, hDelete, lblResD);
		delete.getChildren().addAll(recDelete, vDelete);

		StackPane update = new StackPane();
		update.setAlignment(Pos.CENTER);
		Rectangle recUpdate = new Rectangle(450, 150);
		recUpdate.setArcWidth(50);
		recUpdate.setArcHeight(50);
		recUpdate.setStyle("-fx-stroke-width: 3px;-fx-fill:#990000;");
		HBox hUpdate = new HBox(8);
		hUpdate.setAlignment(Pos.CENTER);
		VBox vTf = new VBox(5);
		vTf.setAlignment(Pos.CENTER);
		tfUpdate = new TextField();
		tfUpdate.setPrefColumnCount(10);
		tfNew = new TextField();
		tfNew.setPrefColumnCount(10);
		vTf.getChildren().addAll(tfUpdate, tfNew);
		Button bUpdate = new Button("Update");
		bUpdate.setStyle(
				"-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 12px;-fx-background-color: white;");
		hUpdate.getChildren().addAll(vTf, bUpdate);
		VBox vUpdate = new VBox(8);
		vUpdate.setAlignment(Pos.CENTER);
		lblResU = new Label("");
		lblResU.setStyle(
				"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15;-fx-font-family: 'Times New Roman';-fx-text-fill:#FFEECC;");
		Label lblU = new Label(
				"To Update a Location First Enter the old Location,\n               Then enter the new Location");
		lblU.setTextFill(Color.WHITE);
		lblU.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold; -fx-font-size: 15px;-fx-font-family: 'Times New Roman'");
		vUpdate.getChildren().addAll(lblU, hUpdate, lblResU);
		update.getChildren().addAll(recUpdate, vUpdate);

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
				"-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 12px;-fx-background-color: white;");
		hSearch.getChildren().addAll(tfSearch, bSearch);
		VBox vSearch = new VBox(10);
		vSearch.setAlignment(Pos.CENTER);
		lblResS = new Label("");
		lblResS.setStyle(
				"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15;-fx-font-family: 'Times New Roman';-fx-text-fill:#FFEECC;");
		Label lblSearch = new Label("To Search For a Loaction Enter it's name");
		lblSearch.setTextFill(Color.WHITE);
		lblSearch.setStyle(
				"-fx-font-style: italic;-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 15px;");
		vSearch.getChildren().addAll(lblSearch, hSearch, lblResS);
		search.getChildren().addAll(recSearch, vSearch);

		VBox searchVBox = new VBox(10);
		searchVBox.setAlignment(Pos.CENTER);
		Label firstLbl = new Label("This is The Information About The Location You Entered");
		firstLbl.setStyle(
				"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15;-fx-font-family: 'Times New Roman';-fx-text-fill:#990000;");
		Label martyrs = new Label();
		martyrs.setStyle(
				"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15;-fx-font-family: 'Times New Roman';");
		Label males = new Label();
		males.setStyle(
				"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15;-fx-font-family: 'Times New Roman';");
		Label females = new Label();
		females.setStyle(
				"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15;-fx-font-family: 'Times New Roman';");
		Label youngest = new Label();
		youngest.setStyle(
				"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15;-fx-font-family: 'Times New Roman';");
		Label oldest = new Label();
		oldest.setStyle(
				"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15;-fx-font-family: 'Times New Roman';");
		Label avgAge = new Label();
		avgAge.setStyle(
				"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15;-fx-font-family: 'Times New Roman';");
		searchVBox.getChildren().addAll(firstLbl, martyrs, males, females, avgAge, youngest, oldest);
		searchVBox.setStyle("-fx-background-color: white;");
		Stage searchStage = new Stage();
		searchStage.setTitle("Informatio About The Location");
		Scene searchScene = new Scene(searchVBox, 700, 300);
		searchStage.setScene(searchScene);

		StackPane sButton = new StackPane();
		Button martyr = new Button();
		martyr.setStyle("-fx-background-color: white; -fx-stroke-color: red;");
		Image image = new Image(
				"https://scontent.fjrs25-1.fna.fbcdn.net/v/t1.15752-9/434373847_446103431201067_4416719034738146133_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=5f2048&_nc_ohc=obdlNbTAHn4Ab6-dLrG&_nc_ht=scontent.fjrs25-1.fna&oh=03_AdVcGiw9KgYwtyIhQ2UyGYnE92hSFR602uRu4XGpNTcs-A&oe=663D32FC");
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(120);
		imageView.setFitWidth(150);
		martyr.setGraphic(imageView);
		sButton.getChildren().add(martyr);

		HBox hLocation = new HBox(10);
		hLocation.setAlignment(Pos.CENTER);
		hLocation.getChildren().addAll(insert, delete);

		vLocation.getChildren().addAll(hLocation, update, search, sButton);
		vLocation.setAlignment(Pos.CENTER);

		bInsert.setOnAction(e -> {
			if (tfInsert.getText().isBlank() == true) {
				lblRes.setText("The Box Is Empty!");
				lblRes.setTextFill(Color.BLACK);
				return;
			}
			Location location = new Location(tfInsert.getText());
			if (((District) Phase1Fx.getDistrictLinkedList().findDistrict(BorderPaneDistrict.getNode().getData())
					.getData()).getLocation().insert(location) == false) {
				lblRes.setText("The Location Exist Before");
				lblRes.setTextFill(Color.BLACK);
			} else {
				lblRes.setText("Added Successfully");
				lblRes.setStyle(
						"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15;-fx-font-family: 'Times New Roman';-fx-text-fill:#FFEECC;");
			}
		});

		bDelete.setOnAction(e -> {
			if (tfDelete.getText().isBlank() == true) {
				lblResD.setText("The Box is Empty!");
				lblResD.setTextFill(Color.BLACK);
				return;
			}
			Location location = new Location(tfDelete.getText());
			SingleNode<Location> oldLocation = BorderPaneDistrict.getNode().getData().getLocation().findNode(location);
			if (((District) Phase1Fx.getDistrictLinkedList().findDistrict(BorderPaneDistrict.getNode().getData())
					.getData()).getLocation().delete(location) == false) {
				lblResD.setText("The Martyr Does Not Exist");
				lblResD.setTextFill(Color.BLACK);
			} else {
				if (oldLocation == BorderPaneLocation.getNode()) {
					BorderPaneLocation
							.setNode(BorderPaneDistrict.getNode().getData().getLocation().getHead().getNext());
					BorderPaneLocation.getLblLocation().setText(BorderPaneDistrict.getNode().getData().getLocation()
							.getHead().getNext().getData().getLocation() + "");
				}
				lblResD.setText("Deleted Successfully");
				Phase1Fx.getDistrictLinkedList().print();
				lblResD.setStyle(
						"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15;-fx-font-family: 'Times New Roman';-fx-text-fill:#FFEECC;");
			}
		});

		bUpdate.setOnAction(e -> {
			if (tfUpdate.getText().isBlank() == true || tfNew.getText().isBlank() == true) {
				lblResU.setText("There is something wrong, Try Again");
				lblResU.setTextFill(Color.BLACK);
				return;
			} else {
				Location oldLocation = new Location(tfUpdate.getText());
				Location newLocation = new Location(tfNew.getText());
				if(((District) BorderPaneDistrict.getNode().getData()).getLocation().findNode(oldLocation)==null) {
					lblResU.setText("The Location Does Not Exist,Try Again");
					lblResU.setTextFill(Color.BLACK);
				}
				else if (((District) BorderPaneDistrict.getNode().getData()).getLocation()
						.update(((District) BorderPaneDistrict.getNode().getData()).getLocation().findNode(oldLocation)
								.getData(), newLocation) == false) {
					lblResU.setText("The New Location Exist Before,Try Again");
					lblResU.setTextFill(Color.BLACK);
				} else {
					lblResU.setText("Updated Successfully");
					Phase1Fx.getDistrictLinkedList().print();
					lblResU.setStyle(
							"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15;-fx-font-family: 'Times New Roman';-fx-text-fill:#FFEECC;");
				}
			}
		});
		martyr.setOnAction(e -> {
			stage.setScene(scene);
			stage.show();
		});

		bSearch.setOnAction(e -> {
			if (tfSearch.getText().isBlank() == true) {
				lblResS.setText("The Box is Empty");
				lblResS.setTextFill(Color.BLACK);
				return;
			} else {
				Location locationS = new Location(tfSearch.getText());
				SingleNode<Location> node = BorderPaneDistrict.getNode().getData().getLocation().findNode(locationS);
				if (node != null) {
					searchStage.show();
					martyrs.setText("The Total Number Of Martyrs is " + ((District) Phase1Fx.getDistrictLinkedList()
							.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
							.totalNumberOfMartyrs(node.getData()));
					males.setText("The Total Number Of Males is " + ((District) Phase1Fx.getDistrictLinkedList()
							.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
							.totalNumberOfMales(node.getData()));
					females.setText("The Total Number Of Females is " + ((District) Phase1Fx.getDistrictLinkedList()
							.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
							.totalNumberOfFemale(node.getData()));
					avgAge.setText("The Average Martyrs Age is " + ((District) Phase1Fx.getDistrictLinkedList()
							.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
							.averageMartyrsAge(node.getData()));
					youngest.setText("The Youngest Martyr is  " + ((District) Phase1Fx.getDistrictLinkedList()
							.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
							.youngestAge(node.getData()));
					oldest.setText("The Oldest Martyr is  " + ((District) Phase1Fx.getDistrictLinkedList()
							.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
							.oldestAge(node.getData()));
					lblResS.setText("");
				} else {
					lblResS.setText("The Location Dose Not Exist");
					lblResS.setTextFill(Color.BLACK);
				}
			}
		});

	}

}
