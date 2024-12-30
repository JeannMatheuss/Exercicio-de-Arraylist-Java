package br.com.exercicio.modelos1;

public class ProdutoPerecivel extends Produtos {
    private String dataValidade;
    
    public ProdutoPerecivel (String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }
}
