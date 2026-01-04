package br.despertadev.poo.ex155v01.entities;

public class Produto {

    public String nome;
    public Double preco;
    public Integer quantidade;

    public Double totalValorEstoque(){
        return preco * quantidade;
    }

    public void addProdutos(Integer quantidade){
        this.quantidade += quantidade;
    }

    public void removeProdutos(Integer quantidade){
        this.quantidade -= quantidade;
    }
/*
    @Override
    public String toString() {
        return "Produto { " +
                "Nome='" + nome + '\'' +
                ", Preço=" + preco +
                ", Quantidade=" + quantidade +
                '}';
    }

 */
}
