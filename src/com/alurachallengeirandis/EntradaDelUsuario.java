package com.alurachallengeirandis;

public class EntradaDelUsuario implements ConvertirMonedaOTemperatura {
	private double recibidoInput = 0;

	// set user input here
	public EntradaDelUsuario(double recibidoInput) {
		this.recibidoInput = recibidoInput;
	}

	@Override
	public double convertirMoneda(String convertirDe, String convertirA) {
		double total = 0;
		if (convertirDe == "RD") {
			// Valor en RD de 1 de las siguientes monedas
			double dolar = 0.018;// dominican pesos
			double mexico = 0.33;// dominican pesos
			double korea = 23.45;// dominican pesos
			if (convertirA == "US") {
				total = recibidoInput * dolar;
				System.out.println(total + " De RD a US");
			}
			if (convertirA == "MX") {
				total = recibidoInput * mexico;
				System.out.println(total + " De RD a Peso Mexicano");
			}
			if (convertirA == "KRW") {
				total = recibidoInput * korea;
				System.out.println(total + " De RD a Won Koreano");
			}
		}
		if (convertirDe == "US") {
			// Valor de 1 US en las siguientes monedas
			double dominicano = 55.56;// dominican peso
			double mexico = 17.98;// mexican peso
			double korea = 1295.78;// won coreano
			if (convertirA == "RD") {
				total = recibidoInput * dominicano;
				System.out.println(total + " De US a RD");
			}
			if (convertirA == "MX") {
				total = recibidoInput * mexico;
				System.out.println(total + " De US a Peso Mexicano");
			}
			if (convertirA == "KRW") {
				total = recibidoInput * korea;
				System.out.println(total + " De US a Won Koreano");
			}
		}
		if (convertirDe == "MX") {
			// Valor de 1 MX en las siguientes monedas
			double dominicano = 3.09;// dominican pesos
			double dolar = 0.056;// american dolars
			double korea = 72.06;// won coreano
			if (convertirA == "US") {
				total = recibidoInput * dolar;
				System.out.println(total + " De MX a US");
			}
			if (convertirA == "RD") {
				total = recibidoInput * dominicano;
				System.out.println(total + " De MX a Dominicano");
			}
			if (convertirA == "KRW") {
				total = recibidoInput * korea;
				System.out.println(total + " De MX a Won Koreano");
			}
		}
		if (convertirDe == "KRW") {
			double dominicano = 0.043;
			double dolar = 0.00077;
			double mexico = 0.014;// mexican pesos
			if (convertirA == "US") {
				total = recibidoInput * dolar;
				System.out.println(total + " De KRW a US");
			}
			if (convertirA == "MX") {
				total = recibidoInput * mexico;
				System.out.println(total + " De KRW a Peso Mexicano");
			}
			if (convertirA == "RD") {
				total = recibidoInput * dominicano;
				System.out.println(total + " De KRW a Dominicano");
			}
		}
		return total;
	}

	@Override
	public double convertirTemperatura(String convertirDe, String convertirA) {
		double total = 0;
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