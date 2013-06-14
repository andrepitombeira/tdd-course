package br.com.caelum.tdd.exercicio1;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorcento()), 
	DBA(new QuinzeOuVinteCincoPorcento()), 
	TESTER(new QuinzeOuVinteCincoPorcento()), 
	GERENTE_DE_PROJETOS(new QuinzeOuVintePorcento());
	
	private CalculoDeImposto calculo;
	
	Cargo(CalculoDeImposto calculo) {
		this.calculo = calculo;
	}
	
	public CalculoDeImposto getCalcula() {
		return calculo;
	}
 }
