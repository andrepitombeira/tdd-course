package br.com.caelum.tdd.exercicio4;

public class FormatadorPadrao implements Formatador {

	@Override
	public String formata(Numero solucao) {
		String resposta = "";
		while(solucao != null) {
			resposta = solucao.getValor() + " " + resposta;
			solucao = solucao.getPai();
		}
		return resposta;
	}
	
}
