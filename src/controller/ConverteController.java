package controller;
import model.PilhaInt;
public class ConverteController {

	public ConverteController() {
		super();
	}
	
	public void dectobin(int decimal) {
		PilhaInt P = new PilhaInt();
		while ( decimal > 0) {		 
			P.Push(decimal % 2);
		  decimal = decimal/2;
		} 
		int tamanho = P.size();
		try {
		while (!P.isEmpty()) {
			String s = "";
			for(int i = 0; i < tamanho; i++) {
				s = s + Integer.toString(P.pop());
			}
			System.out.println(s);
		}
		P.pop();
		}
		catch(Exception e) {
		}
	}
}
