package systems.cauldron.utility.asn1;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        HBox hbox = new HBox();
        hbox.setSpacing(20);
        hbox.setPadding(new Insets(20, 20, 20, 20));
        hbox.getChildren().addAll(createTreeView(), createTextArea());
        StackPane root = new StackPane();
        root.getChildren().add(hbox);
        Scene scene = new Scene(root);
        stage.setTitle("ASN.1 Utility");
        stage.setScene(scene);
        stage.show();
    }

    private Parent createTreeView() {
        TreeItem<String> rootItem = new TreeItem<>("Object");
        rootItem.setExpanded(true);
        for (int i = 1; i < 6; i++) {
            TreeItem<String> item = new TreeItem<>("Item" + i);
            rootItem.getChildren().add(item);
        }
        return new TreeView<>(rootItem);
    }

    private Parent createTextArea() {
        TextArea area = new TextArea();
        area.setText("Enter your ASN.1 here");
        area.setPrefColumnCount(15);
        area.setPrefHeight(120);
        area.setPrefWidth(300);
        return area;
    }
}