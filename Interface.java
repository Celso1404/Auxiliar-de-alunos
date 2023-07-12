package Graduação_Ciencia_da_Computacao;

import java.math.*;
import java.util.Scanner;
import java.util.*;


public class Interface {

	public static void main(String[] args) {
		
		Scanner auxiliar = new Scanner(System.in);
        
      //Matérias dos semestres

		Disciplina d1 = new Disciplina();
		d1.nomeDisciplina = "Computação:Conceitos e Tendências da Profissão";
		d1.numeroDoSemestre = "Primeiro semestre";
		Disciplina d2 = new Disciplina();
		d2.nomeDisciplina = "\nRaciocínio Logíco";
		d2.numeroDoSemestre = "Primeiro semestre";
		Disciplina d3 = new Disciplina();
		d3.nomeDisciplina = "\nAlgoritmos e Programação: Fundamentos";
		d3.numeroDoSemestre = "Primeiro semestre";
		Disciplina d4 = new Disciplina();
		d4.nomeDisciplina = "\nFundamentos da Álgebra linear";
		d4.numeroDoSemestre = "Primeiro semestre";
		Disciplina d5 = new Disciplina();
		d5.nomeDisciplina = "\nPensamento Computacional";
		d5.numeroDoSemestre = "Primeiro semestre";
		Disciplina d6 = new Disciplina();
		d6.nomeDisciplina = "\nDPP: Colaboração";
		d6.numeroDoSemestre = "Primeiro semestre";
		Disciplina d7 = new Disciplina();
		d7.nomeDisciplina = "Projeto de Sistemas Digitais";
		d7.numeroDoSemestre = "Segundo semestre";
		Disciplina d8 = new Disciplina();
		d8.nomeDisciplina = "\nProbabilidade e Inferência Estatística";
		d8.numeroDoSemestre = "Segundo semestre";
		Disciplina d9 = new Disciplina();
		d9.nomeDisciplina = "\nAlgoritmos Programação:Estruturas Lineares";
		d9.numeroDoSemestre = "Segundo semestre";
		Disciplina d10 = new Disciplina();
		d10.nomeDisciplina = "\nMatemática para Computação";
		d10.numeroDoSemestre = "Segundo semestre";
		Disciplina d11 = new Disciplina();
		d11.nomeDisciplina = "\nComunicação da Ciência";
		d11.numeroDoSemestre = "Segundo semestre";
		Disciplina d12 = new Disciplina();
		d12.nomeDisciplina = "DPP: Liderança";
		d12.numeroDoSemestre = "Terceiro semestre";
		Disciplina d13 = new Disciplina();
		d13.nomeDisciplina = "\nOptativa de Propósito Pessoal e Profissional";
		d13.numeroDoSemestre = "Terceiro semestre";
		Disciplina d14 = new Disciplina();
		d14.nomeDisciplina = "\nAnalise e Projeto de Algoritmos";
		d14.numeroDoSemestre = "Terceiro semestre";
		Disciplina d15 = new Disciplina();
		d15.nomeDisciplina = "\nFundamentos de Sistemas Operacionais";
		d15.numeroDoSemestre = "Terceiro semestre";
		Disciplina d16 = new Disciplina();
		d16.nomeDisciplina = "\nAlgoritmos e Programação: Árvores e Ordenação";
		d16.numeroDoSemestre = "Terceiro semestre";
		Disciplina d17 = new Disciplina();
		d17.nomeDisciplina = "\nCálculo Diferencial";
		d17.numeroDoSemestre = "Terceiro semestre";
		Disciplina d18 = new Disciplina();
		d18.nomeDisciplina = "\nEngenharia de Software: Requisitos";
		d18.numeroDoSemestre = "Terceiro semestre";
		Disciplina d19 = new Disciplina();
		d19.nomeDisciplina = "\nEmpreendedorismo e Solução de Problemas";
		d19.numeroDoSemestre = "Terceiro semestre";
		Disciplina d20 = new Disciplina();
		d20.nomeDisciplina = "\nDesenvolvimento Pessoal e Profissional: Protagonismo";
		d20.numeroDoSemestre = "Terceiro semestre";
		Disciplina d21 = new Disciplina();
		d21.nomeDisciplina = "Algoritmos e Programação: Grafos, Hashing e Heaps";
		d21.numeroDoSemestre = "Quarto semestre";
		Disciplina d22 = new Disciplina();
		d22.nomeDisciplina = "\nRedes de Computadores: Aplicação e Transporte";
		d22.numeroDoSemestre = "Quarto semestre";
		Disciplina d23 = new Disciplina();
		d23.nomeDisciplina = "\nFundamentos de Banco de Dados";
		d23.numeroDoSemestre = "Quarto semestre";
		Disciplina d24 = new Disciplina();
		d24.nomeDisciplina = "\nAnálise e Aplicação de Sistemas Operacionais";
		d24.numeroDoSemestre = "Quarto semestre";
		Disciplina d25 = new Disciplina();
		d25.nomeDisciplina = "\nEngenharia de Software: Análise";
		d25.numeroDoSemestre = "Quarto semestre";
		Disciplina d26 = new Disciplina();
		d26.nomeDisciplina = "\nAnálise de dados para tomada de decisão";
		d26.numeroDoSemestre = "Quarto semestre";
		Disciplina d27 = new Disciplina();
		d27.nomeDisciplina = "\nDesenvolvimento Pessoal e Profissional: Interfaces";
		d27.numeroDoSemestre = "Quarto semestre";
		Disciplina d28 = new Disciplina();
		d28.nomeDisciplina = "Linguagens Formais e Autômatos";
		d28.numeroDoSemestre = "Quinto semestre";
		Disciplina d29 = new Disciplina();
		d29.nomeDisciplina = "\nParadigmas de Programação";
		d29.numeroDoSemestre = "Quinto semestre";
		Disciplina d30 = new Disciplina();
		d30.nomeDisciplina = "\nProcessamento Gráfico";
		d30.numeroDoSemestre = "Quinto semestre";
		Disciplina d31 = new Disciplina();
		d31.nomeDisciplina = "\nInteligência Artificial e Aprendizado de Máquina";
		d31.numeroDoSemestre = "Quinto semestre";
		Disciplina d32 = new Disciplina();
		d32.nomeDisciplina = "\nEngenharia de Software: Projeto";
		d32.numeroDoSemestre = "Quinto semestre";
		Disciplina d33 = new Disciplina();
		d33.nomeDisciplina = "\nCálculo Integral";
		d33.numeroDoSemestre = "Quinto semestre";
		Disciplina d34 = new Disciplina();
		d34.nomeDisciplina = "\nDesenvolvimento Pessoal e Profissional: Conexões";
		d34.numeroDoSemestre = "Quinto semestre";
		Disciplina d35 = new Disciplina();
		d35.nomeDisciplina = "Teoria da Computação";
		d35.numeroDoSemestre = "Sexto semestre";
		Disciplina d36 = new Disciplina();
		d36.nomeDisciplina = "\nRedes de Computadores: Internetworking, Roteamento e Transmissão";
		d36.numeroDoSemestre = "Sexto semestre";
		Disciplina d37 = new Disciplina();
		d37.nomeDisciplina = "\nSistemas de Gerência de Banco de Dados";
		d37.numeroDoSemestre = "Sexto semestre";
		Disciplina d38 = new Disciplina();
		d38.nomeDisciplina = "\nArquitetura de Sistemas Digitais";
		d38.numeroDoSemestre = "Sexto semestre";
		Disciplina d39 = new Disciplina();
		d39.nomeDisciplina = "\nTeoria da Informação: Compressão e Criptografia";
		d39.numeroDoSemestre = "Sexto semestre";
		Disciplina d41 = new Disciplina();
		d41.nomeDisciplina = "\nEngenharia de Software: Implementação e Teste";
		d41.numeroDoSemestre = "Sexto semestre";
		Disciplina d40 = new Disciplina();
		d40.nomeDisciplina = "\nElaboração de Projetos";
		d40.numeroDoSemestre = "Sexto semestre";
		Disciplina d42 = new Disciplina();
		d42.nomeDisciplina = "Comunicação da Ciência";
		d42.numeroDoSemestre = "Sétimo semestre";
		Disciplina d43 = new Disciplina();
		d43.nomeDisciplina = "\nTradutores";
		d43.numeroDoSemestre = "Sétimo semestre";
		Disciplina d44 = new Disciplina();
		d44.nomeDisciplina = "\nSistemas Distribuídos";
		d44.numeroDoSemestre = "Sétimo semestre";
		Disciplina d45 = new Disciplina();
		d45.nomeDisciplina = "\nDesign de Interação Humano-Computador";
		d45.numeroDoSemestre = "Sétimo semestre";
		Disciplina d46 = new Disciplina();
		d46.nomeDisciplina = "\nComputação de Alto Desempenho";
		d46.numeroDoSemestre = "Sétimo semestre";
		Disciplina d47 = new Disciplina();
		d47.nomeDisciplina = "\nComputação Gráfica";
		d47.numeroDoSemestre = "Sétimo semestre";
		Disciplina d48 = new Disciplina();
		d48.nomeDisciplina = "\nProjeto Aplicado I (Trilha)";
		d48.numeroDoSemestre = "Sétimo semestre";
		Disciplina d49 = new Disciplina();
		d49.nomeDisciplina = "\nOptativa (Trilha)";
		d49.numeroDoSemestre = "Sétimo semestre";
		Disciplina d50 = new Disciplina();
		d50.nomeDisciplina = "Internet das Coisas: Sensores, Protocolos e Aplicações";
		d50.numeroDoSemestre = "Oitavo semestre";
		Disciplina d51 = new Disciplina();
		d51.nomeDisciplina = "\nCiência de Dados e Big Data";
		d51.numeroDoSemestre = "Oitavo semestre";
		Disciplina d52 = new Disciplina();
		d52.nomeDisciplina = "\nSimulação e Modelagem de Sistemas";
		d52.numeroDoSemestre = "Oitavo semestre";
		Disciplina d53 = new Disciplina();
		d53.nomeDisciplina = "\nProjeto Aplicado II (Trilha)";
		d53.numeroDoSemestre = "Oitavo semestre";
		Disciplina d54 = new Disciplina();
		d54.nomeDisciplina = "\nOptativa (Trilha)";
		d54.numeroDoSemestre = "Oitavo semestre";	
		
//Registro do aluno e o semestre que ele se encontra:		
		
		System.out.print("Olá! Hoje vou te ajudar a analisar sua atual situação academica no curso de Ciência da Computação!. \n");
        System.out.print("Para começar, qual o seu nome?");
		    String username = auxiliar.nextLine();
	        
		    System.out.print("\nSeja bem vindo " + username + "! \n" + "\nAgora, me diga em qual semestre você está: ");
		    int dados = auxiliar.nextInt();
			  
 // Switch para relacionar as matérias feitas com as ainda não feitas:		
			
			switch (dados) {
			
			case 1:
				System.out.print("\nCerto " + username + "! As matérias do primeiro semestre são: \n" +  d1.getNomeDisciplina() + d2.getNomeDisciplina() + d3.getNomeDisciplina() + d4.getNomeDisciplina() + d5.getNomeDisciplina() + d6.getNomeDisciplina());
				    System.out.print("\nMatérias realizadas: Por enquanto você não terminou nenhuma disciplina!");
					break;
			case 2:
				System.out.print("\nAs matérias do segundo semestre são: \n" + d7.getNomeDisciplina() + d8.getNomeDisciplina() + d9.getNomeDisciplina() + d10.getNomeDisciplina() + d11.getNomeDisciplina() + "\n");
					System.out.print("\nCerto" + username + "! As matérias realizadas até o momento foram: \n" + d1.getNomeDisciplina() + d2.getNomeDisciplina() + d3.getNomeDisciplina() + d4.getNomeDisciplina() + d5.getNomeDisciplina() + d6.getNomeDisciplina() + "\n");
					 System.out.print("\nAs disciplinas restantes para a conclusão do curso são: \n" + d12.getNomeDisciplina() + d13.getNomeDisciplina() + d14.getNomeDisciplina() + d15.getNomeDisciplina() + d16.getNomeDisciplina() + d17.getNomeDisciplina() + d18.getNomeDisciplina() + d19.getNomeDisciplina() + d20.getNomeDisciplina() + d21.getNomeDisciplina() + d22.getNomeDisciplina() + d23.getNomeDisciplina() + d24.getNomeDisciplina() + d25.getNomeDisciplina() + d26.getNomeDisciplina() + d27.getNomeDisciplina() + d28.getNomeDisciplina() + d29.getNomeDisciplina() + d30.getNomeDisciplina() + d31.getNomeDisciplina() + d32.getNomeDisciplina() + d33.getNomeDisciplina() + d34.getNomeDisciplina() + d35.getNomeDisciplina() + d36.getNomeDisciplina() + d37.getNomeDisciplina() + d38.getNomeDisciplina() + d39.getNomeDisciplina() + d40.getNomeDisciplina() + d41.getNomeDisciplina() + d42.getNomeDisciplina() + d43.getNomeDisciplina() + d44.getNomeDisciplina() + d45.getNomeDisciplina() + d46.getNomeDisciplina() + d47.getNomeDisciplina() + d48.getNomeDisciplina() + d49.getNomeDisciplina() + d50.getNomeDisciplina() + d51.getNomeDisciplina() + d52.getNomeDisciplina() + d53.getNomeDisciplina() + d54.getNomeDisciplina() + "\n");
					break;
			case 3:
				System.out.print("\nAs matérias do terceiro semestre são: \n" + d12.getNomeDisciplina() + d13.getNomeDisciplina() + d14.getNomeDisciplina() + d15.getNomeDisciplina() + d16.getNomeDisciplina() + d17.getNomeDisciplina() + d18.getNomeDisciplina() + d19.getNomeDisciplina() + d20.getNomeDisciplina() + "\n");
					System.out.print("\nCerto " + username + "! As matérias realizadas até o momento foram: \n" + d1.getNomeDisciplina() + d2.getNomeDisciplina() + d3.getNomeDisciplina() + d4.getNomeDisciplina() + d5.getNomeDisciplina() + d6.getNomeDisciplina() + d7.getNomeDisciplina() + d8.getNomeDisciplina() + d9.getNomeDisciplina() + d10.getNomeDisciplina() + d11.getNomeDisciplina() + "\n");
					  System.out.print("\nAs disciplinas restantes para a conclusão do curso são: \n" + d21.getNomeDisciplina() + d22.getNomeDisciplina() + d23.getNomeDisciplina() + d24.getNomeDisciplina() + d25.getNomeDisciplina() + d26.getNomeDisciplina() + d27.getNomeDisciplina() + d28.getNomeDisciplina() + d29.getNomeDisciplina() + d30.getNomeDisciplina() + d31.getNomeDisciplina() + d32.getNomeDisciplina() + d33.getNomeDisciplina() + d34.getNomeDisciplina() + d35.getNomeDisciplina() + d36.getNomeDisciplina() + d37.getNomeDisciplina() + d38.getNomeDisciplina() + d39.getNomeDisciplina() + d40.getNomeDisciplina() + d41.getNomeDisciplina() + d42.getNomeDisciplina() + d43.getNomeDisciplina() + d44.getNomeDisciplina() + d45.getNomeDisciplina() + d46.getNomeDisciplina() + d47.getNomeDisciplina() + d48.getNomeDisciplina() + d49.getNomeDisciplina() + d50.getNomeDisciplina() + d51.getNomeDisciplina() + d52.getNomeDisciplina() + d53.getNomeDisciplina() + d54.getNomeDisciplina());
					break;
			case 4:
				System.out.print("\nAs matérias do quarto semestre são: \n" + d21.getNomeDisciplina() + d22.getNomeDisciplina() + d23.getNomeDisciplina() + d24.getNomeDisciplina() + d25.getNomeDisciplina() + d26.getNomeDisciplina() + d27.getNomeDisciplina() + "\n");
					System.out.print("\nCerto " + username + "! As matérias realizadas até o momento foram: \n" + d1.getNomeDisciplina() + d2.getNomeDisciplina() + d3.getNomeDisciplina() + d4.getNomeDisciplina() + d5.getNomeDisciplina() + d6.getNomeDisciplina() + d7.getNomeDisciplina() + d8.getNomeDisciplina() + d9.getNomeDisciplina() + d10.getNomeDisciplina() + d11.getNomeDisciplina() + d12.getNomeDisciplina() + d13.getNomeDisciplina() + d14.getNomeDisciplina() + d15.getNomeDisciplina() + d16.getNomeDisciplina() + d17.getNomeDisciplina() + d18.getNomeDisciplina() + d19.getNomeDisciplina() + d20.getNomeDisciplina() + "\n");
					 System.out.print("\nAs disciplinas restantes para a conclusão do curso são: \n" + d28.getNomeDisciplina() + d29.getNomeDisciplina() + d30.getNomeDisciplina() + d31.getNomeDisciplina() + d32.getNomeDisciplina() + d33.getNomeDisciplina() + d34.getNomeDisciplina() + d35.getNomeDisciplina() + d36.getNomeDisciplina() + d37.getNomeDisciplina() + d38.getNomeDisciplina() + d39.getNomeDisciplina() + d40.getNomeDisciplina() + d41.getNomeDisciplina() + d42.getNomeDisciplina() + d43.getNomeDisciplina() + d44.getNomeDisciplina() + d45.getNomeDisciplina() + d46.getNomeDisciplina() + d47.getNomeDisciplina() + d48.getNomeDisciplina() + d49.getNomeDisciplina() + d50.getNomeDisciplina() + d51.getNomeDisciplina() + d52.getNomeDisciplina() + d53.getNomeDisciplina() + d54.getNomeDisciplina());
					break;
			case 5:
				System.out.print("\nAs matérias do quinto semestre são: \n" + d28.getNomeDisciplina() + d29.getNomeDisciplina() + d30.getNomeDisciplina() + d31.getNomeDisciplina() + d32.getNomeDisciplina() + d33.getNomeDisciplina() + d34.getNomeDisciplina() + "\n");
					System.out.print("\nCerto" + username + "! As matérias realizadas até o momento foram: \n" + d1.getNomeDisciplina() + d2.getNomeDisciplina() + d3.getNomeDisciplina() + d4.getNomeDisciplina() + d5.getNomeDisciplina() + d6.getNomeDisciplina() + d7.getNomeDisciplina() + d8.getNomeDisciplina() + d9.getNomeDisciplina() + d10.getNomeDisciplina() + d11.getNomeDisciplina() + d12.getNomeDisciplina() + d13.getNomeDisciplina() + d14.getNomeDisciplina() + d15.getNomeDisciplina() + d16.getNomeDisciplina() + d17.getNomeDisciplina() + d18.getNomeDisciplina() + d19.getNomeDisciplina() + d20.getNomeDisciplina() + "\n");
					 System.out.print("\nAs disciplinas restantes para a conclusão do curso são: \n" + d35.getNomeDisciplina() + d36.getNomeDisciplina() + d37.getNomeDisciplina() + d38.getNomeDisciplina() + d39.getNomeDisciplina() + d40.getNomeDisciplina() + d41.getNomeDisciplina() + d42.getNomeDisciplina() + d43.getNomeDisciplina() + d44.getNomeDisciplina() + d45.getNomeDisciplina() + d46.getNomeDisciplina() + d47.getNomeDisciplina() + d48.getNomeDisciplina() + d49.getNomeDisciplina() + d50.getNomeDisciplina() + d51.getNomeDisciplina() + d52.getNomeDisciplina() + d53.getNomeDisciplina() + d54.getNomeDisciplina());
					break;
			case 6:
				System.out.print("\nAs matérias do sexto semestre são: \n" + d35.getNomeDisciplina() + d36.getNomeDisciplina() + d37.getNomeDisciplina() + d38.getNomeDisciplina() + d39.getNomeDisciplina() + d40.getNomeDisciplina() + d41.getNomeDisciplina() + "\n");
					System.out.print("\nCerto " + username + "! As matérias realizadas até o momento foram: \n" + d1.getNomeDisciplina() + d2.getNomeDisciplina() + d3.getNomeDisciplina() + d4.getNomeDisciplina() + d5.getNomeDisciplina() + d6.getNomeDisciplina() + d7.getNomeDisciplina() + d8.getNomeDisciplina() + d9.getNomeDisciplina() + d10.getNomeDisciplina() + d11.getNomeDisciplina() + d12.getNomeDisciplina() + d13.getNomeDisciplina() + d14.getNomeDisciplina() + d15.getNomeDisciplina() + d16.getNomeDisciplina() + d17.getNomeDisciplina() + d18.getNomeDisciplina() + d19.getNomeDisciplina() + d20.getNomeDisciplina() + d21.getNomeDisciplina() + d22.getNomeDisciplina() + d23.getNomeDisciplina() + d24.getNomeDisciplina() + d25.getNomeDisciplina() + d26.getNomeDisciplina() + d27.getNomeDisciplina() + d28.getNomeDisciplina() + d29.getNomeDisciplina() + d30.getNomeDisciplina() + d31.getNomeDisciplina() + d32.getNomeDisciplina() + d33.getNomeDisciplina() + d34.getNomeDisciplina() + "\n");
					 System.out.print("\nAs disciplinas restantes para a conclusão do curso são: \n" + d42.getNomeDisciplina() + d43.getNomeDisciplina() + d44.getNomeDisciplina() + d45.getNomeDisciplina() + d46.getNomeDisciplina() + d47.getNomeDisciplina() + d48.getNomeDisciplina() + d49.getNomeDisciplina() + d50.getNomeDisciplina() + d51.getNomeDisciplina() + d52.getNomeDisciplina() + d53.getNomeDisciplina() + d54.getNomeDisciplina());
					break;
			case 7:
				System.out.print("\nAs matérias do sétimo semestre são: \n" + d42.getNomeDisciplina() + d43.getNomeDisciplina() + d44.getNomeDisciplina() + d45.getNomeDisciplina() + d46.getNomeDisciplina() + d47.getNomeDisciplina() + d48.getNomeDisciplina() + d49.getNomeDisciplina());
					 System.out.print("\nCerto " + username + "! As matérias realizadas até o momento foram: \n" + d1.getNomeDisciplina() + d2.getNomeDisciplina() + d3.getNomeDisciplina() + d4.getNomeDisciplina() + d5.getNomeDisciplina() + d6.getNomeDisciplina() + d7.getNomeDisciplina() + d8.getNomeDisciplina() + d9.getNomeDisciplina() + d10.getNomeDisciplina() + d11.getNomeDisciplina() + d12.getNomeDisciplina() + d13.getNomeDisciplina() + d14.getNomeDisciplina() + d15.getNomeDisciplina() + d16.getNomeDisciplina() + d17.getNomeDisciplina() + d18.getNomeDisciplina() + d19.getNomeDisciplina() + d20.getNomeDisciplina() + d21.getNomeDisciplina() + d22.getNomeDisciplina() + d23.getNomeDisciplina() + d24.getNomeDisciplina() + d25.getNomeDisciplina() + d26.getNomeDisciplina() + d27.getNomeDisciplina() + d28.getNomeDisciplina() + d29.getNomeDisciplina() + d30.getNomeDisciplina() + d31.getNomeDisciplina() + d32.getNomeDisciplina() + d33.getNomeDisciplina() + d34.getNomeDisciplina() + d35.getNomeDisciplina() + d36.getNomeDisciplina() + d37.getNomeDisciplina() + d38.getNomeDisciplina() + d39.getNomeDisciplina() + d40.getNomeDisciplina() + d41.getNomeDisciplina() + "\n");
					  System.out.print("\nAS disciplinas restantes para a conclusão do curso são: \n" + d49.getNomeDisciplina() + d50.getNomeDisciplina() + d51.getNomeDisciplina() + d52.getNomeDisciplina() + d53.getNomeDisciplina() + d54.getNomeDisciplina());
					 break;
			case 8:
				System.out.print("\nAs matérias do oitavo e último semestre são: \n" + d50.getNomeDisciplina() + d51.getNomeDisciplina() + d52.getNomeDisciplina() + d53.getNomeDisciplina() + d54.getNomeDisciplina());
				  break;
				  
		    default:
		    	System.out.print("Infelizmente a opção selecionada não é válida!");
		    	 break;
		}			
	}
}