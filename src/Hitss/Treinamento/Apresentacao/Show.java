package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Show {
	public static void main(String[] args) {
		try {
		System.out.println("");
		System.out.println("        Hitss Treinamento");
		System.out.println("");
		System.out.println("Inicializando a sequência dos valores:");
		int num;
		for(num = 0; num < 10; num++) {		
		System.out.println("");
		switch (num) {
		case 0:
			System.out.println("A sua vistoria anual é para Janeiro de 2021.");
			break;
		case 1:
			System.out.println("A sua vistoria anual é para Fevereiro de 2021.");
			break;
		case 2:
			System.out.println("A sua vistoria anual é para Março de 2021.");
			break;
		case 3:
			System.out.println("A sua vistoria anual é para Abril de 2021.");
			break;
		case 4:
			System.out.println("A sua vistoria anual é para Maio de 2021.");
			break;
		case 5:
			System.out.println("A sua vistoria anual é para Junho de 2021.");
			break;
		case 6:
			System.out.println("A sua vistoria anual é para Setembro de 2021.");
			break;
		case 7:
			System.out.println("A sua vistoria anual é para Outubro de 2021.");
			break;
		case 8:
			System.out.println("A sua vistoria anual é para Novembro de 2021.");
			break;
		case 9:
			System.out.println("A sua vistoria anual é para Dezembro de 2020, agora.");
			break;
		default:
			System.out.println("Dígito Inválido.");
			break;
		}
		}
		} catch (Exception e) {
			System.out.println("Erro de Processamento: " + e.getMessage());
		}
	}
}
