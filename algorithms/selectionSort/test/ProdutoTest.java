package algorithms.selectionSort.test;

import algorithms.selectionSort.Produto;

public class ProdutoTest {
	public static void main(String[] args) {
		
		Produto produtos[] = {
				new Produto("Lamborghini", 1000000),
				new Produto("Jipe", 46000),
				new Produto("Fusca", 17000),
				new Produto("Smart", 46000),
				new Produto("Brasilia", 16000),
		};
		
		ordena(produtos, produtos.length);
		
		for(Produto produto : produtos) {
			System.out.println(produto.getNome() + " custa " + String.format("%.2f", produto.getPreco()));
		}

	}
	
	private static int buscaMenor(Produto[] produtos,int inicio, int termino) {
		int maisBarato = inicio;
		for(int atual = inicio; atual <= termino; atual++) {
			if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato = atual;
			}
		}
		return maisBarato;
	}
	
	private static void ordena(Produto[] produtos, int quantidadeElementos) {
		for(int atual = 0; atual < quantidadeElementos- 1; atual++) {
			
			int menor = buscaMenor(produtos, atual, quantidadeElementos - 1);
		
			Produto produtoAtual = produtos[atual];
			Produto produtoMenor = produtos[menor];
			produtos[atual] = produtoMenor;
			produtos[menor] = produtoAtual;
		}
		
	}
}
