package Graduação_Ciencia_da_Computacao;

import java.util.Scanner;

public class Aluno {

//Classe para registrar o aluno:	
	
	private String Nome;
	private Semestre semestre;
	private int numero_de_registro;
	
	void pergunta_registro() {
		
		System.out.print("Digite aqui seu número de registro: " + this.numero_de_registro);
	}

	void pergunta_semestre() {
		System.out.print("Digite aqui o semestre em que você está: " + this.semestre);
	}

	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Semestre getSemestre() {
		return semestre;
	}
	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}
	public int getNumero_de_registro() {
		return numero_de_registro;
	}
	public void setNumero_de_registro(int numero_de_registro) {
		this.numero_de_registro = numero_de_registro;
	}
}