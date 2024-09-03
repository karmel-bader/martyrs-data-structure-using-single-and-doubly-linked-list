package phase1;

import application.Phase1Fx;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class BorderPaneLocation {
	private static BorderPane BPLocation = new BorderPane();
	private static SingleNode<Location> node = ((District) Phase1Fx.getDistrictLinkedList()
			.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation().getHead().getNext();
	private static Label totalMartyrs = new Label("");
	private static Label totalMales = new Label("");
	private static Label totalFemales = new Label("");
	private static Label AvgAge = new Label("");
	private static Label youngest = new Label("");
	private static Label oldest = new Label("");
	private static Label lblLocation;

	public static BorderPane getBPLocation() {
		return BPLocation;
	}

	public static void setBPLocation(BorderPane bPLocation) {
		BPLocation = bPLocation;
	}

	public BorderPaneLocation() {
		BPLocation.setStyle("-fx-background-color: white;");
		lblLocation = new Label("");
		lblLocation.setStyle("-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 35px;");
		lblLocation.setText(node + " ");
		BPLocation.setTop(lblLocation);
		BPLocation.setAlignment(lblLocation, Pos.CENTER);
		BPLocation.setMargin(lblLocation, new Insets(50, 0, 0, 0));

		VBoxLocation vLocation = new VBoxLocation();
		BPLocation.setLeft(vLocation.getvLocation());
		BPLocation.setMargin(vLocation.getvLocation(), new Insets(0, 0, 0, 100));

		Button next = new Button("Next");
		next.setStyle(
				"-fx-font-weight: bold;-fx-font-family: 'Times New Roman'; -fx-font-size: 17px; -fx-text-fill: White; -fx-background-color: #990000;");
		BPLocation.setBottom(next);
		BPLocation.setMargin(next, new Insets(0, 0, 40, 0));
		BPLocation.setAlignment(next, Pos.CENTER);

		totalMartyrs.setStyle(
				"-fx-font-family: 'Times New Roman';-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 20;");
		totalMales.setStyle(
				"-fx-font-family: 'Times New Roman';-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 20;");
		totalFemales.setStyle(
				"-fx-font-family: 'Times New Roman';-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size:20;");
		AvgAge.setStyle(
				"-fx-font-family: 'Times New Roman';-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 20;");
		youngest.setStyle(
				"-fx-font-family: 'Times New Roman';-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 20;");
		oldest.setStyle(
				"-fx-font-family: 'Times New Roman';-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 20;");

		StackPane sPane = new StackPane();
		Image imageData = new Image(
				"https://scontent.fjrs25-1.fna.fbcdn.net/v/t1.15752-9/370099455_931682898520873_1480713249280401791_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=5f2048&_nc_ohc=UNOK0QNv4hEAb6DORkP&_nc_ht=scontent.fjrs25-1.fna&oh=03_AdXgKc-IXrm_ZUjirY1vliv91t2Pxsdo-ACjJS07T2Ey3A&oe=6640653E");
		ImageView imageViewData = new ImageView(imageData);
		imageViewData.setOpacity(0.2);
		imageViewData.setFitHeight(500);
		imageViewData.setFitWidth(600);
		Rectangle recData = new Rectangle(600, 500);
		recData.setStyle("-fx-fill: white; -fx-stroke:black; -fx-stroke-width: 3;");

		VBox vData = new VBox(30);
		vData.setAlignment(Pos.CENTER);
		totalMartyrs.setText("The Total Number Of Martyrs is "
				+ ((District) Phase1Fx.getDistrictLinkedList().findDistrict(BorderPaneDistrict.getNode().getData())
						.getData()).getLocation().totalNumberOfMartyrs(node.getData()));
		totalMales.setText("The Total Number Of Males is "
				+ ((District) Phase1Fx.getDistrictLinkedList().findDistrict(BorderPaneDistrict.getNode().getData())
						.getData()).getLocation().totalNumberOfMales(node.getData()));
		totalFemales.setText("The Total Number Of Females is "
				+ ((District) Phase1Fx.getDistrictLinkedList().findDistrict(BorderPaneDistrict.getNode().getData())
						.getData()).getLocation().totalNumberOfFemale(node.getData()));
		AvgAge.setText("The Average Martyrs Age is "
				+ ((District) Phase1Fx.getDistrictLinkedList().findDistrict(BorderPaneDistrict.getNode().getData())
						.getData()).getLocation().averageMartyrsAge(node.getData()));
		youngest.setText("             The Youngest Martyr is:  \n"
				+ ((District) Phase1Fx.getDistrictLinkedList().findDistrict(BorderPaneDistrict.getNode().getData())
						.getData()).getLocation().youngestAge(node.getData()));
		oldest.setText("               The Oldest Martyr is:  \n"
				+ ((District) Phase1Fx.getDistrictLinkedList().findDistrict(BorderPaneDistrict.getNode().getData())
						.getData()).getLocation().oldestAge(node.getData()));
		vData.getChildren().addAll(totalMartyrs, totalMales, totalFemales, AvgAge, youngest, oldest);
		sPane.getChildren().addAll(recData, imageViewData, vData);
		BPLocation.setRight(sPane);
		BPLocation.setMargin(sPane, new Insets(0, 100, 0, 0));

		next.setOnAction(e -> {
			vLocation.getLblRes().setText("");
			vLocation.getLblResD().setText("");
			vLocation.getLblResU().setText("");
			vLocation.getLblResS().setText("");
			vLocation.getTfDelete().setText("");
			vLocation.getTfInsert().setText("");
			vLocation.getTfNew().setText("");
			vLocation.getTfUpdate().setText("");
			vLocation.getTfSearch().setText("");
			if (node.getNext() != null) {
				node = node.getNext();
				lblLocation.setText(node + " ");
				totalMartyrs.setText("The Total Number Of Martyrs is " + ((District) Phase1Fx.getDistrictLinkedList()
						.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
						.totalNumberOfMartyrs(node.getData()));
				totalMales.setText("The Total Number Of Males is " + ((District) Phase1Fx.getDistrictLinkedList()
						.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
						.totalNumberOfMales(node.getData()));
				totalFemales.setText("The Total Number Of Females is " + ((District) Phase1Fx.getDistrictLinkedList()
						.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
						.totalNumberOfFemale(node.getData()));
				AvgAge.setText("The Average Martyrs Age is " + ((District) Phase1Fx.getDistrictLinkedList()
						.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
						.averageMartyrsAge(node.getData()));
				youngest.setText("The Youngest Martyr is  " + ((District) Phase1Fx.getDistrictLinkedList()
						.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
						.youngestAge(node.getData()));
				oldest.setText("The Oldest Martyr is  " + ((District) Phase1Fx.getDistrictLinkedList()
						.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
						.oldestAge(node.getData()));
			} else {
				node = ((District) Phase1Fx.getDistrictLinkedList().findDistrict(BorderPaneDistrict.getNode().getData())
						.getData()).getLocation().getHead().getNext();
				lblLocation.setText(node + " ");
				totalMartyrs.setText("The Total Number Of Martyrs is " + ((District) Phase1Fx.getDistrictLinkedList()
						.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
						.totalNumberOfMartyrs(node.getData()));
				totalMales.setText("The Total Number Of Males is " + ((District) Phase1Fx.getDistrictLinkedList()
						.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
						.totalNumberOfMales(node.getData()));
				totalFemales.setText("The Total Number Of Females is " + ((District) Phase1Fx.getDistrictLinkedList()
						.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
						.totalNumberOfFemale(node.getData()));
				AvgAge.setText("The Average Martyrs Age is " + ((District) Phase1Fx.getDistrictLinkedList()
						.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
						.averageMartyrsAge(node.getData()));
				youngest.setText("The Youngest Martyr is  " + ((District) Phase1Fx.getDistrictLinkedList()
						.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
						.youngestAge(node.getData()));
				oldest.setText("The Oldest Martyr is  " + ((District) Phase1Fx.getDistrictLinkedList()
						.findDistrict(BorderPaneDistrict.getNode().getData()).getData()).getLocation()
						.oldestAge(node.getData()));
			}
		});

	}

	public static SingleNode<Location> getNode() {
		return node;
	}

	public static void setNode(SingleNode<Location> node) {
		BorderPaneLocation.node = node;
	}

	public static Label getLblLocation() {
		return lblLocation;
	}

	public static void setLblLocation(Label lblLocation) {
		BorderPaneLocation.lblLocation = lblLocation;
	}

	public static Label getTotalMartyrs() {
		return totalMartyrs;
	}

	public static void setTotalMartyrs(Label totalMartyrs) {
		BorderPaneLocation.totalMartyrs = totalMartyrs;
	}

	public static Label getTotalMales() {
		return totalMales;
	}

	public static void setTotalMales(Label totalMales) {
		BorderPaneLocation.totalMales = totalMales;
	}

	public static Label getTotalFemales() {
		return totalFemales;
	}

	public static void setTotalFemales(Label totalFemales) {
		BorderPaneLocation.totalFemales = totalFemales;
	}

	public static Label getAvgAge() {
		return AvgAge;
	}

	public static void setAvgAge(Label avgAge) {
		AvgAge = avgAge;
	}

	public static Label getYoungest() {
		return youngest;
	}

	public static void setYoungest(Label youngest) {
		BorderPaneLocation.youngest = youngest;
	}

	public static Label getOldest() {
		return oldest;
	}

	public static void setOldest(Label oldest) {
		BorderPaneLocation.oldest = oldest;
	}

}
