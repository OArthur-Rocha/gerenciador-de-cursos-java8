package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new LinkedHashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
 	

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas); // nao deixa modificar aulas, que só para leitura.
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public int getTempoTotal() {

//		return this.aulas.stream().mapToInt(Aula::getTempo).sum();  //jeito muito foda de fazer. Lembrar de estudar stream
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ". Tempo total: " + this.getTempoTotal() + " minutos."
				+ " Aulas: " + this.aulas + "]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
		
	}

	public Aluno buscaMatricula(int numero) {
		return matriculaParaAluno.get(numero);
		
	}
}
