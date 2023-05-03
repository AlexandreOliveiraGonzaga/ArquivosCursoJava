package Classe;

public class Produto {
	//CLIA AS VARIAVEIS
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(){
		
	}
	
	Produto ( String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;		
	}
	
	double precoDesconto() {
		return preco * (1 - desconto);
	}
	
	
}
