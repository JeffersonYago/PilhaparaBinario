package view;
import javax.swing.JOptionPane;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		ConverteController C = new ConverteController();
		int a = Integer.parseInt(JOptionPane.showInputDialog("insira um valor para conversão!"));
		C.dectobin(a);

	}

}
