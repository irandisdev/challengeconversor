package com.alurachallengeirandis;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//Test your code here
		Moneda inputUsuarioMoneda = new Moneda(10.0);
		inputUsuarioMoneda.convertirMoneda("US", "RD");
		
		Temp inputUsuarioTemp = new Temp(45);
		inputUsuarioTemp.convertirTemperatura("Celcius", "Farenheit");
	
	}

}