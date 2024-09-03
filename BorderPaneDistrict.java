package phase1;

import java.io.File;
import application.Phase1Fx;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;


public class BorderPaneDistrict {
	private static BorderPane mainPane = new BorderPane();
	private static Label lblDistrict = new Label("");
	private static DNode<District> node = Phase1Fx.getDistrictLinkedList().getHead().getNext();
	private static Label totalMartyrs = new Label("");
	private static Label totalMales = new Label("");
	private static Label totalFemales = new Label("");
	private static Label AvgAge = new Label("");
	private static Label maxDate = new Label("");

	public BorderPaneDistrict() {
		mainPane.setStyle("-fx-background-color: white;");
		totalMartyrs.setStyle(
				"-fx-font-style: italic;-fx-font-family: 'Times New Roman'; -fx-font-weight: bold; -fx-font-size: 20;");
		totalMales.setStyle(
				"-fx-font-family: 'Times New Roman'; -fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 20;");
		totalFemales.setStyle(
				"-fx-font-family: 'Times New Roman';-fx-font-style: italic; -fx-font-weight: bold; -fx-font-size: 20;");
		AvgAge.setStyle(
				"-fx-font-style: italic;-fx-font-family: 'Times New Roman'; -fx-font-weight: bold; -fx-font-size: 20;");
		maxDate.setStyle(
				"-fx-font-style: italic;-fx-font-family: 'Times New Roman'; -fx-font-weight: bold; -fx-font-size: 20;");

		lblDistrict.setStyle("-fx-font-weight: bold; -fx-font-size: 40; -fx-font-family: 'Times New Roman';");
		lblDistrict.setText(node + " ");
		VBoxDistrict vDistrict = new VBoxDistrict();
		VBoxButtons vButtons = new VBoxButtons();
		mainPane.setLeft(vDistrict.getvDistrict());
		mainPane.setBottom(vButtons.getvButtons());
		mainPane.setMargin(vDistrict.getvDistrict(), new javafx.geometry.Insets(0, 0, 0, 100));
		mainPane.setMargin(vButtons.getvButtons(), new javafx.geometry.Insets(0, 0, 40, 0));
		mainPane.setTop(lblDistrict);
		mainPane.setAlignment(lblDistrict, Pos.CENTER);
		mainPane.setMargin(lblDistrict, new javafx.geometry.Insets(20, 0, 0, 0));

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
				+ Phase1Fx.getDistrictLinkedList().totalNumberOfMartyrs(node.getData()));
		totalMales.setText(
				"The Total Number Of Males is " + Phase1Fx.getDistrictLinkedList().totalNumberOfMales(node.getData()));
		totalFemales.setText("The Total Number Of Females is "
				+ Phase1Fx.getDistrictLinkedList().totalNumberOfFemale(node.getData()));
		AvgAge.setText(
				"The Average Martyrs Age is " + Phase1Fx.getDistrictLinkedList().averageMartyrsAge(node.getData()));
		maxDate.setText("The Date That Has The Maximum number Of Martyrs is "
				+ Phase1Fx.getDistrictLinkedList().maxDate(node.getData()));
		vData.getChildren().addAll(totalMartyrs, totalMales, totalFemales, AvgAge, maxDate);
		mainPane.setRight(sPane);
		sPane.getChildren().addAll(recData, imageViewData, vData);
		mainPane.setMargin(sPane, new javafx.geometry.Insets(0, 150, 0, 0));
	}

	public BorderPane getMainPane() {
		return mainPane;
	}

	public static void setMainPane(BorderPane mainPane) {
		BorderPaneDistrict.mainPane = mainPane;
	}

	public static Label getLblDistrict() {
		return lblDistrict;
	}

	public static void setLblDistrict(Label lblDistrict) {
		BorderPaneDistrict.lblDistrict = lblDistrict;
	}

	public static DNode<District> getNode() {
		return node;
	}

	public static void setNode(DNode<District> node) {
		BorderPaneDistrict.node = node;
	}

	public static Label getTotalMartyrs() {
		return totalMartyrs;
	}

	public static void setTotalMartyrs(Label totalMartyrs) {
		BorderPaneDistrict.totalMartyrs = totalMartyrs;
	}

	public static Label getTotalMales() {
		return totalMales;
	}

	public static void setTotalMales(Label totalMales) {
		BorderPaneDistrict.totalMales = totalMales;
	}

	public static Label getTotalFemales() {
		return totalFemales;
	}

	public static void setTotalFemales(Label totalFemales) {
		BorderPaneDistrict.totalFemales = totalFemales;
	}

	public static Label getAvgAge() {
		return AvgAge;
	}

	public static void setAvgAge(Label avgAge) {
		AvgAge = avgAge;
	}

	public static Label getMaxDate() {
		return maxDate;
	}

	public static void setMaxDate(Label maxDate) {
		BorderPaneDistrict.maxDate = maxDate;
	}

}
