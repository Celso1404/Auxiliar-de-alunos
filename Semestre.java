package Graduação_Ciencia_da_Computacao;

public class Semestre {

//Classe para registrar cada semestre:	
	
	public String Primeirosemestre;
	public String Segundosemestre;
	public String Terceirosemestre;
	public String Quartosemestre;
	public String Quintosemestre; 
	public String Sextosemestre;
	public String Setimosemestre;
	public String Oitavosemestre;
	
   public void TodososSemestres() {
	   this.Primeirosemestre = Primeirosemestre;
	   this.Segundosemestre = Segundosemestre;
	   this.Terceirosemestre = Terceirosemestre;
	   this.Quartosemestre = Quartosemestre;
	   this.Quintosemestre = Quintosemestre;
	   this.Sextosemestre = Sextosemestre;
	   this.Setimosemestre = Setimosemestre;
	   this.Oitavosemestre = Oitavosemestre;
   }
	
	public void todosOsSemestres(String Primeirosemestre, String Segundosemestre, String Terceirosemestre, String Quartosemestre, String Quintosemestre, String Sextosemestre, String Setimosemestre, String Oitavosemestre) {
	   this.Primeirosemestre = Primeirosemestre;
	   this.Segundosemestre = Segundosemestre;
	   this.Terceirosemestre = Terceirosemestre;
	   this.Quartosemestre = Quartosemestre;
	   this.Quintosemestre = Quintosemestre;
	   this.Sextosemestre = Sextosemestre;
	   this.Setimosemestre = Setimosemestre;
	   this.Oitavosemestre = Oitavosemestre;
   }
	
//Métodos para facilitar a implementação das disciplinas:	
	
   public void materiasPrimeirosemestre() {
    	System.out.print("As matérias do primeiro semestre são: " + this.Primeirosemestre);
    	
    	
	}
   public void materiasSegundosemestre() {
    	System.out.print("As matérias do primeiro semestre são: " + this.Segundosemestre);

}
   public void materiasTerceiroemestre() {
    	System.out.print("As matérias do primeiro semestre são: " + this.Terceirosemestre);

} 

   public void materiasQuartosemestre() {
    	System.out.print("As matérias do primeiro semestre são: " + this.Quartosemestre);

    }
   public void materiasQuintosemestre() {
    	System.out.print("As matérias do primeiro semestre são: " + this.Quintosemestre);

	}
   public void materiasSextosemestre() {
    	System.out.print("As matérias do primeiro semestre são: " + this.Sextosemestre);

	}
   public void materiasSetimosemestre() {
    	System.out.print("As matérias do primeiro semestre são: " + this.Setimosemestre);

    }
   public void materiasOitavosemestre() {	
    	System.out.print("As matérias do primeiro semestre são: " + this.Oitavosemestre);

    	
    }
	
    public String getPrimeirosemestre() {
		return Primeirosemestre;
	}
	
	public void setPrimeirosemestre(String primeirosemestre) {
		Primeirosemestre = primeirosemestre;
	}
	
	public String getSegundosemestre() {
		return Segundosemestre;
	}
	
	public void setSegundosemestre(String segundosemestre) {
		Segundosemestre = segundosemestre;
	}
	
	public String getTerceirosemestre() {
		return Terceirosemestre;
	}
	
	public void setTerceirosemestre(String terceirosemestre) {
		Terceirosemestre = terceirosemestre;
	}
	
	public String getQuartosemestre() {
		return Quartosemestre;
	}
	
	public void setQuartosemestre(String quartosemestre) {
		Quartosemestre = quartosemestre;
	}
	
	public String getQuintosemestre() {
		return Quintosemestre;
	}
	
	public void setQuintosemestre(String quintosemestre) {
		Quintosemestre = quintosemestre;
	}
	
	public String getSextosemestre() {
		return Sextosemestre;
	}
	
	public void setSextosemestre(String sextosemestre) {
		Sextosemestre = sextosemestre;
	}
	
	public String getSetimosemestre() {
		return Setimosemestre;
	}
	
	public void setSetimosemestre(String setimosemestre) {
		Setimosemestre = setimosemestre;
	}
	
	public String getOitavosemestre() {
		return Oitavosemestre;
	}
	
	public void setOitavosemestre(String oitavosemestre) {
		Oitavosemestre = oitavosemestre;
	}
	
	@Override
	public String toString() {
	return "Semestre [Primeirosemestre=" + Primeirosemestre + ", Segundosemestre=" + Segundosemestre
			+ ", Terceirosemestre=" + Terceirosemestre + ", Quartosemestre=" + Quartosemestre + ", Quintosemestre="
			+ Quintosemestre + ", Sextosemestre=" + Sextosemestre + ", Setimosemestre=" + Setimosemestre
			+ ", Oitavosemestre=" + Oitavosemestre + "]";
}
	
	}