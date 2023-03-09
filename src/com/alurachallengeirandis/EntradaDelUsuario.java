package com.alurachallengeirandis;

public class EntradaDelUsuario implements ConvertirMonedaOTemperatura {
	private double recibidoInput;
	double total;

	// set user input here
	public EntradaDelUsuario(double recibidoInput) {
		this.recibidoInput = recibidoInput;
	}

	@Override
	public double convertirMoneda(String convertirDe, String convertirA) {
		if (convertirDe == "RD") {
			// Valor en RD de 1 de las siguientes monedas
			double dolar = 0.018;// dominican pesos
			double mexico = 0.33;// dominican pesos
			double korea = 24.03;// dominican pesos
			double rd = 1.0;
			if (convertirA == "US") {
				total = recibidoInput * dolar;
				System.out.println(total + " Dolares Americanos");
			}
			if (convertirA == "MX") {
				total = recibidoInput * mexico;
				System.out.println(total + " Pesos Mexicanos");
			}
			if (convertirA == "KRW") {
				total = recibidoInput * korea;
				System.out.println(total + " Won Koreano");
			}if (convertirA == "RD") {
				total = recibidoInput * rd;
				System.out.println(total + " Pesos Dominicanos");
			}
		}
		if (convertirDe == "US") {
			// Valor de 1 US en las siguientes monedas
			double dominicano = 55.10;// dominican peso
			double mexico = 18.09;// mexican peso
			double korea = 1324.51;// won coreano
			double us = 1.0;
			if (convertirA == "RD") {
				total = recibidoInput * dominicano;
				System.out.println(total + " Pesos Dominicanos");
			}
			if (convertirA == "MX") {
				total = recibidoInput * mexico;
				System.out.println(total + " Pesos Mexicanos");
			}
			if (convertirA == "KRW") {
				total = recibidoInput * korea;
				System.out.println(total + " Won Koreano");
			}if (convertirA == "US") {
				total = recibidoInput * us;
				System.out.println(total + " Dolares Americanos");
			}
		}
		if (convertirDe == "MX") {
			// Valor de 1 MX en las siguientes monedas
			double dominicano = 3.05;// dominican pesos
			double dolar = 0.055;// american dolars
			double korea = 73.23;// won coreano
			double mx = 1.0;
			if (convertirA == "US") {
				total = recibidoInput * dolar;
				System.out.println(total + " Dolares Americanos");
			}
			if (convertirA == "RD") {
				total = recibidoInput * dominicano;
				System.out.println(total + " Pesos Dominicanos");
			}
			if (convertirA == "KRW") {
				total = recibidoInput * korea;
				System.out.println(total + " Won Koreano");
			}if (convertirA == "MX") {
				total = recibidoInput * mx;
				System.out.println(total + " Pesos Mexicano");
			}
		}
		if (convertirDe == "KRW") {
			double dominicano = 0.042;
			double dolar = 0.00076;
			double mexico = 0.014;// mexican pesos
			double krw = 1.0;
			if (convertirA == "US") {
				total = recibidoInput * dolar;
				System.out.println(total + " Dolares Americanos");
			}
			if (convertirA == "MX") {
				total = recibidoInput * mexico;
				System.out.println(total + " Pesos Mexicano");
			}
			if (convertirA == "RD") {
				total = recibidoInput * dominicano;
				System.out.println(total + " Pesos Dominicanos");
			}if (convertirA == "KRW") {
				total = recibidoInput * krw;
				System.out.println(total + " Won Koreano");
			}
		}
		return total;
	}

	@Override
	public double convertirTemperatura(String convertirDe, String convertirA) {
		double celciusToFan = (1.8 * recibidoInput) + 32;
		double farenheitToCel = (recibidoInput - 32) * 0.5556;
		if (convertirDe == "Farenheit") {
			if (convertirA == "Celcius") {
				total = farenheitToCel;
				System.out.println(total + " De Farenheit a Celcius");
			}
			if (convertirA == "Farenheit") {
				System.out.println(" De Farenheit a Farenheit NO SE PUEDE");
			}
		}
		if (convertirDe == "Celcius") {
			if (convertirA == "Celcius") {
				System.out.println(" De Celcius a Celcius NO SE PUEDE");
			}
			if (convertirA == "Farenheit") {
				total = celciusToFan;
				System.out.println(total + " De Celcius a Farenheit");
			}
		}
		return total;
	}
}