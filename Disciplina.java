package Graduação_Ciencia_da_Computacao;

public class Disciplina {

//Classe para registrar as disciplinas utilizadas na Classe Interface:
	
	public String nomeDisciplina;
	public String numeroDoSemestre;
	
public void Disciplina() {
	this.nomeDisciplina = nomeDisciplina;
	this.numeroDoSemestre = numeroDoSemestre;
}

public void disciplina(String nomeDisciplina, String numeroDoSemestre) {
	this.nomeDisciplina = nomeDisciplina;
	this.numeroDoSemestre = numeroDoSemestre;
}

public String getNomeDisciplina() {
	return nomeDisciplina;
}

public void setNomeDisciplina(String nomeDisciplina) {
	this.nomeDisciplina = nomeDisciplina;
}

public String getNumeroDoSemestre() {
	return numeroDoSemestre;
}

public void setNumeroDoSemestre(String numeroDoSemestre) {
	this.numeroDoSemestre = numeroDoSemestre;
}

public String toString() {
	return "Disciplina [nomeDisciplina=" + nomeDisciplina + ", numeroDoSemestre=" + numeroDoSemestre + "]";
}


}
