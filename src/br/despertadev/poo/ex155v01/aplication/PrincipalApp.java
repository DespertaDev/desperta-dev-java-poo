package br.despertadev.poo.ex155v01.aplication;
import br.despertadev.poo.ex155v01.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalApp {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        Produto produto = new Produto();
        //Entrada de dados
        IO.println("Entre Com o nome do Produto:");
        produto.nome = teclado.nextLine();
        IO.println("Entre Com o Preço do Produto:");
        produto.preco = teclado.nextDouble();
        IO.println("Entre Com a Quantidade do Produto:");
        produto.quantidade = teclado.nextInt();

        //Saida de dados
        //System.out.println(produto);
        System.out.println("Nome do Produto:" + produto.nome);
        System.out.println("Preço do Produto:" + produto.preco);
        System.out.println("Quantidade do Produto:" + produto.quantidade);

        teclado.close();

    }

}
