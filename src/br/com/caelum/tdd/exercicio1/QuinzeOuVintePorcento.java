package br.com.caelum.tdd.exercicio1;

public class QuinzeOuVintePorcento implements CalculoDeImposto {

	@Override
	public double calcula(Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 5000.0) {
			return funcionario.getSalarioBase() * 0.80;
		}
		else {
			return funcionario.getSalarioBase() * 0.85;
		}
	}

}
