package Classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Celular", 4356.89);
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome + " " + p1.precoDesconto());
		System.out.println(p2.nome + " " + p2.precoDesconto());
		
		
		double precoFinal = p1.precoDesconto(); 
		double precoFinal2 = p2.precoDesconto();
		double mediaCarrinho = (precoFinal + precoFinal2) / 2;
		
		System.out.printf("o valor do celular e tv e: R$%.2f. ", + mediaCarrinho );
		
		
	}
	
}
