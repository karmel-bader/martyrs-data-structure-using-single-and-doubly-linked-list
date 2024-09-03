package phase1;

import application.Phase1Fx;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class VBoxButtons {
	private VBox vButtons = new VBox(10);
	private static Button next;
	private static Button prev;

	public VBoxButtons() {
		vButtons.setAlignment(Pos.CENTER);
		HBox hButtons = new HBox(10);
		Label lbl = new Label("");
		lbl.setStyle(
				"-fx-font-style: italic; -fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 12px;");
		hButtons.setAlignment(Pos.CENTER);
		next = new Button("Next");
		next.setStyle(
				" -fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 12px;-fx-background-color:#990000; -fx-text-fill:white;");
		prev = new Button("Previous");
		prev.setStyle(
				" -fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 12px;-fx-background-color:#990000; -fx-text-fill:white;");
		prev.setDisable(true);
		Button load = new Button("Load");
		load.setStyle(
				" -fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 12px;-fx-background-color:#990000; -fx-text-fill:white;");
		hButtons.getChildren().addAll(prev, next, load);
		vButtons.getChildren().addAll(hButtons, lbl);

		next.setOnAction(e -> {
			BorderPaneDistrict.setNode(BorderPaneDistrict.getNode().getNext());
			VBoxDistrict.getLblRes().setText("");
			VBoxDistrict.getLblResD().setText("");
			VBoxDistrict.getLblResDa().setText("");
			VBoxDistrict.getLblResU().setText("");
			VBoxDistrict.getDatePicker().setValue(null);
			VBoxDistrict.getTfDelete().setText("");
			VBoxDistrict.getTfInsert().setText("");
			VBoxDistrict.getTfNew().setText("");
			VBoxDistrict.getTfUpdate().setText("");
			lbl.setText("");
			BorderPaneDistrict.getLblDistrict().setText(BorderPaneDistrict.getNode() + " ");
			BorderPaneDistrict.getTotalMartyrs().setText("The Total Number Of Martyrs is "
					+ Phase1Fx.getDistrictLinkedList().totalNumberOfMartyrs(BorderPaneDistrict.getNode().getData()));
			BorderPaneDistrict.getTotalMales().setText("The Total Number Of Males is "
					+ Phase1Fx.getDistrictLinkedList().totalNumberOfMales(BorderPaneDistrict.getNode().getData()));
			BorderPaneDistrict.getTotalFemales().setText("The Total Number Of Females is "
					+ Phase1Fx.getDistrictLinkedList().totalNumberOfFemale(BorderPaneDistrict.getNode().getData()));
			BorderPaneDistrict.getAvgAge().setText("The Average Martyrs Age is "
					+ Phase1Fx.getDistrictLinkedList().averageMartyrsAge(BorderPaneDistrict.getNode().getData()));
			BorderPaneDistrict.getMaxDate().setText("The Date That Has The Maximum number Of Martyrs is "
					+ Phase1Fx.getDistrictLinkedList().maxDate(BorderPaneDistrict.getNode().getData()));
			if (BorderPaneDistrict.getNode().getNext() == null)
				next.setDisable(true);
			else
				next.setDisable(false);
			if (BorderPaneDistrict.getNode().getPrev() == null)
				prev.setDisable(true);
			else
				prev.setDisable(false);

		});

		prev.setOnAction(e -> {
			BorderPaneDistrict.setNode(BorderPaneDistrict.getNode().getPrev());
			VBoxDistrict.getLblRes().setText("");
			VBoxDistrict.getLblResD().setText("");
			VBoxDistrict.getLblResDa().setText("");
			VBoxDistrict.getLblResU().setText("");
			VBoxDistrict.getDatePicker().setValue(null);
			VBoxDistrict.getTfDelete().setText("");
			VBoxDistrict.getTfInsert().setText("");
			VBoxDistrict.getTfNew().setText("");
			VBoxDistrict.getTfUpdate().setText("");
			lbl.setText("");
			BorderPaneDistrict.getLblDistrict().setText(BorderPaneDistrict.getNode() + " ");
			BorderPaneDistrict.getTotalMartyrs().setText("The Total Number Of Martyrs is "
					+ Phase1Fx.getDistrictLinkedList().totalNumberOfMartyrs(BorderPaneDistrict.getNode().getData()));
			BorderPaneDistrict.getTotalMales().setText("The Total Number Of Males is "
					+ Phase1Fx.getDistrictLinkedList().totalNumberOfMales(BorderPaneDistrict.getNode().getData()));
			BorderPaneDistrict.getTotalFemales().setText("The Total Number Of Females is "
					+ Phase1Fx.getDistrictLinkedList().totalNumberOfFemale(BorderPaneDistrict.getNode().getData()));
			BorderPaneDistrict.getAvgAge().setText("The Average Martyrs Age is "
					+ Phase1Fx.getDistrictLinkedList().averageMartyrsAge(BorderPaneDistrict.getNode().getData()));
			BorderPaneDistrict.getMaxDate().setText("The Date That Has The Maximum number Of Martyrs is "
					+ Phase1Fx.getDistrictLinkedList().maxDate(BorderPaneDistrict.getNode().getData()));

			if (BorderPaneDistrict.getNode().getNext() == null)
				next.setDisable(true);
			else
				next.setDisable(false);
			if (BorderPaneDistrict.getNode().getPrev() == null)
				prev.setDisable(true);
			else
				prev.setDisable(false);
		});

		load.setOnAction(e -> {
			if (BorderPaneDistrict.getNode().getData().getLocation().getHead().getNext() == null) {
				lbl.setText("This District dose Not Has Locations");
				lbl.setTextFill(Color.RED);
				return;
			}
			if (BorderPaneDistrict.getNode().getData() != null) {
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
				lbl.setText("Loaded Successfully");
				lbl.setTextFill(Color.GREEN);
			}
		});
	}

	public VBox getvButtons() {
		return vButtons;
	}

	public void setvButtons(VBox vButtons) {
		this.vButtons = vButtons;
	}

	public static Button getNext() {
		return next;
	}

	public static void setNext(Button next) {
		VBoxButtons.next = next;
	}

	public static Button getPrev() {
		return prev;
	}

	public static void setPrev(Button prev) {
		VBoxButtons.prev = prev;
	}

}
