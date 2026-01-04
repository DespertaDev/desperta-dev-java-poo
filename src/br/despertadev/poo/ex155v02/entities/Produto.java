package br.despertadev.poo.ex155v02.entities;

public class Produto {

    public String nome;
    public Double preco;
    public Integer quantidade;

    public Produto(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double totalValorEstoque(){
        return preco * quantidade;
    }

    public void addProdutos(Integer quantidade){
        this.quantidade += quantidade;
    }

    public void removeProdutos(Integer quantidade){
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return "Produto { " +
                "Nome='" + nome + '\'' +
                ", Preço=" + preco +
                ", Quantidade=" + quantidade +
                '}';
    }

}
