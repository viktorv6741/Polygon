package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML private TextField x1;
    @FXML private TextField x2;
    @FXML private TextField x3;
    @FXML private TextField x4;

    @FXML private TextField y1;
    @FXML private TextField y2;
    @FXML private TextField y3;
    @FXML private TextField y4;

    @FXML private TextField shapeArea;
    @FXML private TextField rectangleArea;



////////////////////////////////////////////////////////////////////////////////



    @FXML
    private void result(ActionEvent event){

        int x1Value = Integer.parseInt(x1.getText());
        int x2Value = Integer.parseInt(x2.getText());
        int x3Value = Integer.parseInt(x3.getText());
        int x4Value = Integer.parseInt(x4.getText());

        int y1Value = Integer.parseInt(y1.getText());
        int y2Value = Integer.parseInt(y2.getText());
        int y3Value = Integer.parseInt(y3.getText());
        int y4Value = Integer.parseInt(y4.getText());


        int[] x = {x1Value, x2Value, x3Value, x4Value};
        int[] y = {y1Value, y2Value, y3Value, y4Value};

        Model model = new Model(x, y);

        String areaShape = Double.toString(model.rectangleArea());
        rectangleArea.setText(areaShape);

        String shapePoints = Double.toString(model.pointsInShape());
        shapeArea.setText(shapePoints);

    }


////////////////////////////////////////////////////////////////////////////////


    @FXML
    private void clear(ActionEvent event){
        x1.clear();
        x2.clear();
        x3.clear();
        x4.clear();

        y1.clear();
        y2.clear();
        y3.clear();
        y4.clear();

        shapeArea.clear();
        rectangleArea.clear();
    }
}
