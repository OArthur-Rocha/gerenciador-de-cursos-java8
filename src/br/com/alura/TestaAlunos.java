package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		//List<String> alunos = new ArrayList<>();
		 Set<String> alunos = new HashSet<>();
		alunos.add("Rogrido Turini");
		alunos.add("Alberto Souza ");
		alunos.add("Nico Steppat ");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		
		System.out.println(alunos);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println(alunos.size());
		
		boolean pauloEstaMatriculado = alunos.contains("Renan Saggio");
		System.out.println(pauloEstaMatriculado);
		
		List<String> alunosLista = new ArrayList<>(alunos);
		
		Collections.sort(alunosLista);
		System.out.println(alunosLista);
		
	}

}
