/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package king.calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author kingRayhan
 */
public class kingFXMLController implements Initializable {

    @FXML
    private Label calculatorDisplay;
    
    double number;
    private String opratorSign;
    private Double result;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void digits(ActionEvent event) {
        String digits = ( (Button) event.getSource() ).getText();
        String oldDigit = calculatorDisplay.getText();
        String newDigit = oldDigit+digits;
        calculatorDisplay.setText(newDigit); 
    }

    @FXML
    private void AC(ActionEvent event) {
        calculatorDisplay.setText("");
    }

    @FXML
    private void Delete_Action(ActionEvent event) {
        String oldDigits = calculatorDisplay.getText();
        String newDigits = oldDigits.substring(0,oldDigits.length()-1);
        calculatorDisplay.setText(newDigits);
    }

    @FXML
    private void Equals(ActionEvent event) {
        double screenValue = Double.parseDouble(calculatorDisplay.getText());
        switch(opratorSign){
            case "+":
                result = screenValue + number;
            break;
            case "-":
                result = number - screenValue;
            break;
            case "*":
                result = screenValue * number;
            break;
            case "/":
                result = number / screenValue;
            break;
                
        }
        calculatorDisplay.setText(""+result);
    }

    @FXML
    private void Operators(ActionEvent event) {
        number = Double.parseDouble(calculatorDisplay.getText());
        opratorSign = ((Button) event.getSource()).getText();
        
        calculatorDisplay.setText("");
        
    }

    @FXML
    private void zero(ActionEvent event) {
        String oldDigit = calculatorDisplay.getText();
        calculatorDisplay.setText(oldDigit+"0");
    }

    @FXML
    private void root(ActionEvent event) {
        double val = Double.parseDouble(calculatorDisplay.getText());
        calculatorDisplay.setText(""+Math.pow(val, .5));
        
    }

    @FXML
    private void dotPoint(ActionEvent event) {
       String scVal = calculatorDisplay.getText();
       boolean hasDot = false;
       char charArray [] = scVal.toCharArray();
       for(int i = 0 ; i < scVal.length() ; i++){
            if(charArray[i] == '.'){
                hasDot = true;
            }
       }
       
       if(hasDot != true){
           calculatorDisplay.setText(scVal+'.');
       }
    }
}
