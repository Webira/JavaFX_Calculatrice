package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;

public class AppController  {
	
	@FXML Label calculLabel;
	
	@FXML Button touchC;
	
	private float number1;
	private float number2;
	private String operation = "";
	
	//private int... touchNumbre;
		
	protected float resultat = 0;
	
	@FXML public void handLeOnNumClick(ActionEvent event) {			//fonction for numbers
		
		String current = ((Button) event.getSource()).getText();
			 calculLabel.setText(calculLabel.getText() + current);
	}

	@FXML public void handLeOnOperatorClick(ActionEvent event) {		//fonction for operateurs
		String touchSymbol = ((Button) event.getSource()).getText();
		
		if(!touchSymbol.equals("=")) {
			if(!operation.equals("")) {
				return;
			}
				operation = touchSymbol;
				number1 = Float.parseFloat(calculLabel.getText());  //transform le type String en float num1
				calculLabel.setText("");
		}else { 
			if(!operation.equals("")) {								//operation!=0
				number2 = Float.parseFloat(calculLabel.getText());
				calculLabel.setText(""); 
			 // il faut faire le calcul et afficher le resultat dans calculLabel
			 
				calculate(number1, number2, operation);
				operation = "";
				
			}
		}
		if(touchSymbol.equals("C")) {			//"annulation"  caclculLabel 
			calculLabel.setText("");
	    }
		
	}
		
	public void calculate(float n1, float n2, String op) {
		
		switch(op){
		case "+": 
			resultat = n1 + n2; 		
		// calculLabel.setText(String.valueOf(n1 + n2));			//transform direct le resultat en String
		break;
		case "-": 
			resultat = n1 - n2; 
		break;
		case "*": 
			resultat = n1 * n2;
		break;
		/*case "%":
			(n1 * n2 / 100);
		break;	*/
		
		}
		calculLabel.setText(String.valueOf(resultat));
		number1 = resultat;
		
	}
	
	

}
