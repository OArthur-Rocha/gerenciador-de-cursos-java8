package br.com.alura;

import java.util.ArrayList;

public class TestandoListas {

	public static void main(String[] args) {
		
		int a = 6;

		String aula1 = "Conhecendo mais listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		
		
		for (String aula : aulas) {
			System.out.println(aula);
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println(primeiraAula);
		
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula " + (i+1) + " - " + aulas.get(i));
		}
		
		aulas.forEach(aula -> {
			System.out.println("percerrendo: ");
			System.out.println("aula " + aula);
		});
		
		
	}

}
