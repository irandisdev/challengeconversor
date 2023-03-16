package com.alurachallengeirandis;

public class EntradaDelUsuario implements ConvertirMonedaOTemperatura {
	private double recibidoInput;
	String total;
	double total1;

	// set user input here
	public EntradaDelUsuario(double recibidoInput) {
		this.recibidoInput = recibidoInput;
	}

	@Override
	public String convertirMoneda(String convertirDe, String convertirA) {
		if (convertirDe == "RD") {
			// Valor en RD de 1 de las siguientes monedas
			double dolar = 0.018;// dominican pesos
			double mexico = 0.33;// dominican pesos
			double korea = 24.03;// dominican pesos
			double rd = 1.0;
			if (convertirA == "US") {
				total1 = recibidoInput * dolar;
				total = total1 + " Dolares Americanos";
				System.out.println(total);
			}
			if (convertirA == "MX") {
				total1 = recibidoInput * mexico;
				total = total1 + " Pesos Mexicanos";
				System.out.println(total);
			}
			if (convertirA == "KRW") {
				total1 = recibidoInput * korea;
				total = total1 + " Won Koreano";
				System.out.println(total);
			}
			if (convertirA == "RD") {
				total1 = recibidoInput * rd;
				total = total1 + " Pesos Dominicanos";
				System.out.println(total);
			}
		}
		if (convertirDe == "US") {
			// Valor de 1 US en las siguientes monedas
			double dominicano = 55.10;// dominican peso
			double mexico = 18.09;// mexican peso
			double korea = 1324.51;// won coreano
			double us = 1.0;
			if (convertirA == "RD") {
				total1 = recibidoInput * dominicano;
				total = total1 + " Pesos Dominicanos";
				System.out.println(total);
			}
			if (convertirA == "MX") {
				total1 = recibidoInput * mexico;
				total = total1 + " Pesos Mexicanos";
				System.out.println(total);
			}
			if (convertirA == "KRW") {
				total1 = recibidoInput * korea;
				total = total1 + " Won Koreano";
				System.out.println(total);
			}
			if (convertirA == "US") {
				total1 = recibidoInput * us;
				total = total1 + " Dolares Americanos";
				System.out.println(total);
			}
		}
		if (convertirDe == "MX") {
			// Valor de 1 MX en las siguientes monedas
			double dominicano = 3.05;// dominican pesos
			double dolar = 0.055;// american dolars
			double korea = 73.23;// won coreano
			double mx = 1.0;
			if (convertirA == "US") {
				total1 = recibidoInput * dolar;
				total = total1 + " Dolares Americanos";
				System.out.println(total);
			}
			if (convertirA == "RD") {
				total1 = recibidoInput * dominicano;
				total = total1 + " Pesos Dominicanos";
				System.out.println(total);
			}
			if (convertirA == "KRW") {
				total1 = recibidoInput * korea;
				total = total1 + " Won Koreano";
				System.out.println(total);
			}
			if (convertirA == "MX") {
				total1 = recibidoInput * mx;
				total = total1 + " Pesos Mexicano";
				System.out.println(total);
			}
		}
		if (convertirDe == "KRW") {
			double dominicano = 0.042;
			double dolar = 0.00076;
			double mexico = 0.014;// mexican pesos
			double krw = 1.0;
			if (convertirA == "US") {
				total1 = recibidoInput * dolar;
				total = total1 + " Dolares Americanos";
				System.out.println(total);
			}
			if (convertirA == "MX") {
				total1 = recibidoInput * mexico;
				total = total1 + " Pesos Mexicano";
				System.out.println(total);
			}
			if (convertirA == "RD") {
				total1 = recibidoInput * dominicano;
				total = total1 + " Pesos Dominicanos";
				System.out.println(total);
			}
			if (convertirA == "KRW") {
				total1 = recibidoInput * krw;
				total = total1 + " Won Koreano";
				System.out.println(total);
			}
		}
		return total;
	}

	@Override
	public String convertirTemperatura(String convertirDe, String convertirA) {
		double celciusToFan = (1.8 * recibidoInput) + 32;
		double farenheitToCel = (recibidoInput - 32) * 0.5556;
		if (convertirDe == "Farenheit") {
			if (convertirA == "Celcius") {
				total1 = farenheitToCel;
				total = total1 + " De Farenheit a Celcius";
				System.out.println(total);
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
				total1 = celciusToFan;
				total = total1 + " De Celcius a Farenheit";
				System.out.println(total);
			}
		}
		return total;
	}
}