package br.estacio.progII.ex01;

public class Ex01Class {
	
	public String Calcular(int numero, int inicio, int fim) {
		String retorno = "";
		int quantidade = fim - inicio + 1;
		
		String[] valores;
		valores = new String[quantidade];
		int calcular = inicio;
		
		for(int x = 0; x < quantidade; x++)
		{
			valores[x] = Integer.toString(numero) + " x " + Integer.toString(calcular) + " = " + Integer.toString(numero * calcular) + " \\ ";
			calcular++;
			retorno += valores[x];
		}
		
		return retorno;
	}
	
	

}
