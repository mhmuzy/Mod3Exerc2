package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Show {
	public static void main(String[] args) {
		try {
		System.out.println("");
		System.out.println("        Hitss Treinamento");
		System.out.println("");
		System.out.println("Inicializando a sequ�ncia dos valores:");
		int num;
		for(num = 0; num < 10; num++) {		
		System.out.println("");
		switch (num) {
		case 0:
			System.out.println("A sua vistoria anual � para Janeiro de 2021.");
			break;
		case 1:
			System.out.println("A sua vistoria anual � para Fevereiro de 2021.");
			break;
		case 2:
			System.out.println("A sua vistoria anual � para Mar�o de 2021.");
			break;
		case 3:
			System.out.println("A sua vistoria anual � para Abril de 2021.");
			break;
		case 4:
			System.out.println("A sua vistoria anual � para Maio de 2021.");
			break;
		case 5:
			System.out.println("A sua vistoria anual � para Junho de 2021.");
			break;
		case 6:
			System.out.println("A sua vistoria anual � para Setembro de 2021.");
			break;
		case 7:
			System.out.println("A sua vistoria anual � para Outubro de 2021.");
			break;
		case 8:
			System.out.println("A sua vistoria anual � para Novembro de 2021.");
			break;
		case 9:
			System.out.println("A sua vistoria anual � para Dezembro de 2020, agora.");
			break;
		default:
			System.out.println("D�gito Inv�lido.");
			break;
		}
		}
		} catch (Exception e) {
			System.out.println("Erro de Processamento: " + e.getMessage());
		}
	}
}
