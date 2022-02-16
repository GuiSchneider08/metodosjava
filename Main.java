package calculadora;

public class Main {
	
	public static void main(String[] args) {
		
		// Calculadora2
		System.out.println("Exercicio calculadora");
		Calculadora2.soma(3, 6);
		Calculadora2.subtracao(9, 1.8);
		Calculadora2.multiplicacao(7, 8);
		Calculadora2.divisao(5, 2.5);
		
		
		// Mensagem
		System.out.println("Exercicio Mensagem");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(15);
		Mensagem.obterMensagem(24);
		
			
		//Empréstimo
		System.out.println("Exercicio emprestimo");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);
	}

}
