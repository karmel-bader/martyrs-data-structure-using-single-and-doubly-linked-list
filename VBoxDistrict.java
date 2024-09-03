package phase1;

import java.time.LocalDate;
import application.Phase1Fx;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class VBoxDistrict {
	private static VBox vDistrict = new VBox(15);
	private static Label lblRes;
	private static Label lblResU;
	private static Label lblResD;
	private static Label lblResDa;
	private static TextField tfDelete;
	private static TextField tfInsert;
	private static TextField tfUpdate;
	private static TextField tfNew;
	private static DatePicker datePicker ;

	public VBoxDistrict() {
		StackPane insert = new StackPane();
		insert.setAlignment(Pos.CENTER);
		Rectangle recInsert = new Rectangle(300, 150);
		recInsert.setArcWidth(50);
		recInsert.setArcHeight(50);
		recInsert.setStyle("-fx-stroke-width: 3px;-fx-fill:#990000;");
		HBox hInsert = new HBox(5);
		hInsert.setAlignment(Pos.CENTER);
		tfInsert = new TextField();
		tfInsert.setPrefColumnCount(10);
		Button bInsert = new Button("Insert");
		bInsert.setStyle(
				" -fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 12px;-fx-background-color:white;");
		hInsert.getChildren().addAll(tfInsert, bInsert);
		VBox vInsert = new VBox(10);
		vInsert.setAlignment(Pos.CENTER);
		lblRes = new Label("");
		lblRes.setStyle(
				"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15;-fx-font-family: 'Times New Roman';-fx-text-fill:#FFEECC;");
		Label lbl = new Label("To insert a new District Enter it's name");
		lbl.setStyle(
				"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15;-fx-font-family: 'Times New Roman';-fx-text-fill: white;");
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
				" -fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 12px; -fx-background-color:white;");
		hDelete.getChildren().addAll(tfDelete, bDelete);
		VBox vDelete = new VBox(8);
		vDelete.setAlignment(Pos.CENTER);
		lblResD = new Label("");
		lblResD.setStyle(
				"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15; -fx-font-family: 'Times New Roman';-fx-text-fill:#FFEECC;");
		Label lblD = new Label("To delete a District Enter it's name");
		lblD.setStyle(
				"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15; -fx-font-family: 'Times New Roman';-fx-text-fill: white;");
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
				" -fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 12px;-fx-background-color:white;");
		hUpdate.getChildren().addAll(vTf, bUpdate);
		VBox vUpdate = new VBox(8);
		vUpdate.setAlignment(Pos.CENTER);
		lblResU = new Label("");
		lblResU.setStyle(
				"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15; -fx-font-family: 'Times New Roman';-fx-text-fill:#FFEECC;");
		Label lblU = new Label(
				"To Update a District First Enter the old District,\n              Then enter the new District");
		lblU.setStyle(
				"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15; -fx-font-family: 'Times New Roman'; -fx-text-fill: white;");
		vUpdate.getChildren().addAll(lblU, hUpdate, lblResU);
		update.getChildren().addAll(recUpdate, vUpdate);

		StackPane date = new StackPane();
		date.setAlignment(Pos.CENTER);
		Rectangle recDate = new Rectangle(300, 150);
		recDate.setArcWidth(50);
		recDate.setArcHeight(50);
		recDate.setStyle("-fx-stroke-width: 3px;-fx-fill:#990000;");
		HBox hDate = new HBox(5);
		hDate.setAlignment(Pos.CENTER);
		datePicker = new DatePicker();
		datePicker.getEditor().setDisable(true);
		Button bDate = new Button("Count");
		bDate.setStyle(
				" -fx-font-weight: bold;-fx-font-size: 12px; -fx-font-family: 'Times New Roman'; -fx-background-color:white;");
		hDate.getChildren().addAll(datePicker, bDate);
		VBox vDate = new VBox(8);
		vDate.setAlignment(Pos.CENTER);
		lblResDa = new Label("");
		lblResDa.setStyle(
				"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15; -fx-font-family: 'Times New Roman';-fx-text-fill:#FFEECC;");
		Label lblDa = new Label("To Count The Total Number For A\n      Given Date, Choose A Date");
		lblDa.setStyle(
				"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15; -fx-font-family: 'Times New Roman';-fx-text-fill: white;");
		vDate.getChildren().addAll(lblDa, hDate, lblResDa);
		date.getChildren().addAll(recDate, vDate);

		HBox hLocation = new HBox(10);
		hLocation.setAlignment(Pos.CENTER);
		hLocation.getChildren().addAll(insert, delete);

		vDistrict.getChildren().addAll(hLocation, update, date);
		vDistrict.setAlignment(Pos.CENTER);

		bInsert.setOnAction(e -> {
			if (tfInsert.getText().isBlank() == true) {
				lblRes.setText("The Box is Empty!");
				lblRes.setTextFill(Color.BLACK);
				return;
			}
			District newDistrict = new District(tfInsert.getText());
			if (Phase1Fx.getDistrictLinkedList().insert(newDistrict) == false) {
				lblRes.setText("The District Exist Before");
				lblRes.setTextFill(Color.BLACK);
			} else {
				Phase1Fx.getDistrictLinkedList().insert(newDistrict);
				lblRes.setText("Added Successfully");
				lblRes.setStyle(
						"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15;-fx-font-family: 'Times New Roman';-fx-text-fill:#FFEECC;");
				if (BorderPaneDistrict.getNode().getNext() == null)
					VBoxButtons.getNext().setDisable(true);
				else
					VBoxButtons.getNext().setDisable(false);
				if (BorderPaneDistrict.getNode().getPrev() == null)
					VBoxButtons.getPrev().setDisable(true);
				else
					VBoxButtons.getPrev().setDisable(false);
			}
		});
		bUpdate.setOnAction(e -> {
			if (tfUpdate.getText().isBlank() == true || tfNew.getText().isBlank() == true) {
				lblResU.setText("One Of The Boxes Is Empty");
				lblResU.setTextFill(Color.BLACK);
				return;
			} else {
				District oldDistrict = new District(tfUpdate.getText());
				District newDistrict = new District(tfNew.getText());
				if(Phase1Fx.getDistrictLinkedList().findDistrict(oldDistrict)==null) {
					lblResU.setText("The District Dose Not Exist, Try Again");
					lblResU.setTextFill(Color.BLACK);
				}
				else if (Phase1Fx.getDistrictLinkedList().findDistrict(newDistrict)!=null) {
					lblResU.setText("The new name is exist before, try another name");
					lblResU.setTextFill(Color.BLACK);
				} else {
					DNode<District> node = Phase1Fx.getDistrictLinkedList().findDistrict(oldDistrict);
					if (node.getNext() != null && node == BorderPaneDistrict.getNode()) {
						BorderPaneDistrict.setNode(node.getNext());
						BorderPaneDistrict.getLblDistrict().setText(BorderPaneDistrict.getNode() + " ");
						BorderPaneDistrict.getTotalMartyrs().setText("The Total Number Of Martyrs is " + Phase1Fx
								.getDistrictLinkedList().totalNumberOfMartyrs(BorderPaneDistrict.getNode().getData()));
						BorderPaneDistrict.getTotalMales().setText("The Total Number Of Males is " + Phase1Fx
								.getDistrictLinkedList().totalNumberOfMales(BorderPaneDistrict.getNode().getData()));
						BorderPaneDistrict.getTotalFemales().setText("The Total Number Of Females is " + Phase1Fx
								.getDistrictLinkedList().totalNumberOfFemale(BorderPaneDistrict.getNode().getData()));
						BorderPaneDistrict.getAvgAge().setText("The Average Martyrs Age is " + Phase1Fx
								.getDistrictLinkedList().averageMartyrsAge(BorderPaneDistrict.getNode().getData()));
						BorderPaneDistrict.getMaxDate().setText("The Date That Has The Maximum number Of Martyrs is "
								+ Phase1Fx.getDistrictLinkedList().maxDate(BorderPaneDistrict.getNode().getData()));
					} else if (node.getPrev() != null && node == BorderPaneDistrict.getNode()) {
						BorderPaneDistrict.setNode(node.getPrev());
						BorderPaneDistrict.getLblDistrict().setText(BorderPaneDistrict.getNode().getData().getDistrict());
						BorderPaneDistrict.getLblDistrict().setText(BorderPaneDistrict.getNode() + " ");
						BorderPaneDistrict.getTotalMartyrs().setText("The Total Number Of Martyrs is " + Phase1Fx
								.getDistrictLinkedList().totalNumberOfMartyrs(BorderPaneDistrict.getNode().getData()));
						BorderPaneDistrict.getTotalMales().setText("The Total Number Of Males is " + Phase1Fx
								.getDistrictLinkedList().totalNumberOfMales(BorderPaneDistrict.getNode().getData()));
						BorderPaneDistrict.getTotalFemales().setText("The Total Number Of Females is " + Phase1Fx
								.getDistrictLinkedList().totalNumberOfFemale(BorderPaneDistrict.getNode().getData()));
						BorderPaneDistrict.getAvgAge().setText("The Average Martyrs Age is " + Phase1Fx
								.getDistrictLinkedList().averageMartyrsAge(BorderPaneDistrict.getNode().getData()));
						BorderPaneDistrict.getMaxDate().setText("The Date That Has The Maximum number Of Martyrs is "
								+ Phase1Fx.getDistrictLinkedList().maxDate(BorderPaneDistrict.getNode().getData()));
					}
					BorderPaneLocation.getLblLocation()
					.setText(BorderPaneDistrict.getNode().getData().getLocation().getHead().getNext() + "");
			BorderPaneLocation.setNode(BorderPaneDistrict.getNode().getData().getLocation().getHead().getNext());
			BorderPaneLocation.getTotalMartyrs()
					.setText("The Total Number Of Martyrs is " + ((District) Phase1Fx.getDistrictLinkedList()
							.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
							.totalNumberOfMartyrs(BorderPaneLocation.getNode().getData()));
			BorderPaneLocation.getTotalMales()
					.setText("The Total Number Of Males is " + ((District) Phase1Fx.getDistrictLinkedList()
							.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
							.totalNumberOfMales(BorderPaneLocation.getNode().getData()));
			BorderPaneLocation.getTotalFemales()
					.setText("The Total Number Of Females is " + ((District) Phase1Fx.getDistrictLinkedList()
							.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
							.totalNumberOfFemale(BorderPaneLocation.getNode().getData()));
			BorderPaneLocation.getAvgAge()
					.setText("The Average Martyrs Age is " + ((District) Phase1Fx.getDistrictLinkedList()
							.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
							.averageMartyrsAge(BorderPaneLocation.getNode().getData()));
			BorderPaneLocation.getYoungest()
					.setText("             The Youngest Martyr is:  \n" + ((District) Phase1Fx
							.getDistrictLinkedList().findDistrict(BorderPaneDistrict.getNode().getData()).getData())
							.getLocation().youngestAge(BorderPaneLocation.getNode().getData()));
			BorderPaneLocation.getOldest()
					.setText("               The Oldest Martyr is:  \n" + ((District) Phase1Fx
							.getDistrictLinkedList().findDistrict(BorderPaneDistrict.getNode().getData()).getData())
							.getLocation().oldestAge(BorderPaneLocation.getNode().getData()));
					
					Phase1Fx.getDistrictLinkedList().update(Phase1Fx.getDistrictLinkedList().findDistrict(oldDistrict).getData(), newDistrict);
					lblResU.setText("Updated Successfully");
					lblResU.setStyle(
							"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15;-fx-font-family: 'Times New Roman';-fx-text-fill:#FFEECC;");
					Phase1Fx.getDistrictLinkedList().print();

				}

			}
		});
		bDelete.setOnAction(e -> {
			if (tfDelete.getText().isBlank() == true) {
				lblResD.setText("The Box Is Empty");
				lblResD.setTextFill(Color.BLACK);
				return;
			}
			District deleteDistrict = new District(tfDelete.getText());
			if (Phase1Fx.getDistrictLinkedList().findDistrict(deleteDistrict) == null) {
				lblResD.setText("The District Dose Not Exist");
				lblResD.setTextFill(Color.BLACK);
			} else {
				DNode<District> node = Phase1Fx.getDistrictLinkedList().findDistrict(deleteDistrict);
				if (node.getNext() != null && node == BorderPaneDistrict.getNode()) {
					BorderPaneDistrict.setNode(node.getNext());
					BorderPaneDistrict.getLblDistrict().setText(BorderPaneDistrict.getNode() + " ");
					BorderPaneDistrict.getTotalMartyrs().setText("The Total Number Of Martyrs is " + Phase1Fx
							.getDistrictLinkedList().totalNumberOfMartyrs(BorderPaneDistrict.getNode().getData()));
					BorderPaneDistrict.getTotalMales().setText("The Total Number Of Males is " + Phase1Fx
							.getDistrictLinkedList().totalNumberOfMales(BorderPaneDistrict.getNode().getData()));
					BorderPaneDistrict.getTotalFemales().setText("The Total Number Of Females is " + Phase1Fx
							.getDistrictLinkedList().totalNumberOfFemale(BorderPaneDistrict.getNode().getData()));
					BorderPaneDistrict.getAvgAge().setText("The Average Martyrs Age is " + Phase1Fx
							.getDistrictLinkedList().averageMartyrsAge(BorderPaneDistrict.getNode().getData()));
					BorderPaneDistrict.getMaxDate().setText("The Date That Has The Maximum number Of Martyrs is "
							+ Phase1Fx.getDistrictLinkedList().maxDate(BorderPaneDistrict.getNode().getData()));
				} else if (node.getPrev() != null && node == BorderPaneDistrict.getNode()) {
					BorderPaneDistrict.setNode(node.getPrev());
					BorderPaneDistrict.getLblDistrict().setText(BorderPaneDistrict.getNode().getData().getDistrict());
					BorderPaneDistrict.getLblDistrict().setText(BorderPaneDistrict.getNode() + " ");
					BorderPaneDistrict.getTotalMartyrs().setText("The Total Number Of Martyrs is " + Phase1Fx
							.getDistrictLinkedList().totalNumberOfMartyrs(BorderPaneDistrict.getNode().getData()));
					BorderPaneDistrict.getTotalMales().setText("The Total Number Of Males is " + Phase1Fx
							.getDistrictLinkedList().totalNumberOfMales(BorderPaneDistrict.getNode().getData()));
					BorderPaneDistrict.getTotalFemales().setText("The Total Number Of Females is " + Phase1Fx
							.getDistrictLinkedList().totalNumberOfFemale(BorderPaneDistrict.getNode().getData()));
					BorderPaneDistrict.getAvgAge().setText("The Average Martyrs Age is " + Phase1Fx
							.getDistrictLinkedList().averageMartyrsAge(BorderPaneDistrict.getNode().getData()));
					BorderPaneDistrict.getMaxDate().setText("The Date That Has The Maximum number Of Martyrs is "
							+ Phase1Fx.getDistrictLinkedList().maxDate(BorderPaneDistrict.getNode().getData()));
				}
				BorderPaneLocation.getLblLocation()
				.setText(BorderPaneDistrict.getNode().getData().getLocation().getHead().getNext() + "");
		BorderPaneLocation.setNode(BorderPaneDistrict.getNode().getData().getLocation().getHead().getNext());
		BorderPaneLocation.getTotalMartyrs()
				.setText("The Total Number Of Martyrs is " + ((District) Phase1Fx.getDistrictLinkedList()
						.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
						.totalNumberOfMartyrs(BorderPaneLocation.getNode().getData()));
		BorderPaneLocation.getTotalMales()
				.setText("The Total Number Of Males is " + ((District) Phase1Fx.getDistrictLinkedList()
						.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
						.totalNumberOfMales(BorderPaneLocation.getNode().getData()));
		BorderPaneLocation.getTotalFemales()
				.setText("The Total Number Of Females is " + ((District) Phase1Fx.getDistrictLinkedList()
						.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
						.totalNumberOfFemale(BorderPaneLocation.getNode().getData()));
		BorderPaneLocation.getAvgAge()
				.setText("The Average Martyrs Age is " + ((District) Phase1Fx.getDistrictLinkedList()
						.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
						.averageMartyrsAge(BorderPaneLocation.getNode().getData()));
		BorderPaneLocation.getYoungest()
				.setText("             The Youngest Martyr is:  \n" + ((District) Phase1Fx
						.getDistrictLinkedList().findDistrict(BorderPaneDistrict.getNode().getData()).getData())
						.getLocation().youngestAge(BorderPaneLocation.getNode().getData()));
		BorderPaneLocation.getOldest()
				.setText("               The Oldest Martyr is:  \n" + ((District) Phase1Fx
						.getDistrictLinkedList().findDistrict(BorderPaneDistrict.getNode().getData()).getData())
						.getLocation().oldestAge(BorderPaneLocation.getNode().getData()));
				
				Phase1Fx.getDistrictLinkedList().delete(node.getData());
				lblResD.setText("Deleted Successfully");
				lblResD.setStyle(
						"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15;-fx-font-family: 'Times New Roman';-fx-text-fill:#FFEECC;");
				Phase1Fx.getDistrictLinkedList().print();

			}
		});

		bDate.setOnAction(e -> {
			if (datePicker.getValue() == null) {
				lblResDa.setText("Choose a Date Please");
				lblResDa.setTextFill(Color.BLACK);
				return;
			}
			if (datePicker.getValue() != null && !datePicker.getValue().isAfter(LocalDate.now())) {
				String[] dateSplit = datePicker.getValue().toString().split("-");
				String newDate = Integer.parseInt(dateSplit[1]) + "/" + Integer.parseInt(dateSplit[2]) + "/"
						+ Integer.parseInt(dateSplit[0]);
				int martyrsByDate = Phase1Fx.getDistrictLinkedList().numberOfMartyrsByDate(newDate);
				lblResDa.setText("The Number OF Martyrs is " + martyrsByDate);
				lblResDa.setStyle(
						"-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 15;-fx-font-family: 'Times New Roman';-fx-text-fill:#FFEECC;");

			} else {
				lblResDa.setText("Threre is something wrong, Try Again");
				lblResDa.setTextFill(Color.BLACK);
			}
		});
	}

	public static VBox getvDistrict() {
		return vDistrict;
	}

	public static void setvDistrict(VBox vDistrict) {
		VBoxDistrict.vDistrict = vDistrict;
	}

	public static Label getLblRes() {
		return lblRes;
	}

	public static void setLblRes(Label lblRes) {
		VBoxDistrict.lblRes = lblRes;
	}

	public static Label getLblResU() {
		return lblResU;
	}

	public static void setLblResU(Label lblResU) {
		VBoxDistrict.lblResU = lblResU;
	}

	public static Label getLblResD() {
		return lblResD;
	}

	public static void setLblResD(Label lblResD) {
		VBoxDistrict.lblResD = lblResD;
	}

	public static Label getLblResDa() {
		return lblResDa;
	}

	public static void setLblResDa(Label lblResDa) {
		VBoxDistrict.lblResDa = lblResDa;
	}

	public static TextField getTfDelete() {
		return tfDelete;
	}

	public static void setTfDelete(TextField tfDelete) {
		VBoxDistrict.tfDelete = tfDelete;
	}

	public static TextField getTfInsert() {
		return tfInsert;
	}

	public static void setTfInsert(TextField tfInsert) {
		VBoxDistrict.tfInsert = tfInsert;
	}

	public static TextField getTfUpdate() {
		return tfUpdate;
	}

	public static void setTfUpdate(TextField tfUpdate) {
		VBoxDistrict.tfUpdate = tfUpdate;
	}

	public static TextField getTfNew() {
		return tfNew;
	}

	public static void setTfNew(TextField tfNew) {
		VBoxDistrict.tfNew = tfNew;
	}

	public static DatePicker getDatePicker() {
		return datePicker;
	}

	public static void setDatePicker(DatePicker datePicker) {
		VBoxDistrict.datePicker = datePicker;
	}
	
	

}
