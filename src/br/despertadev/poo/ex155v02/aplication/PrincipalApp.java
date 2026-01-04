package br.despertadev.poo.ex155v02.aplication;
import br.despertadev.poo.ex155v02.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalApp {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        Produto produto = new Produto(0);
        //Entrada de dados
        IO.println("Entre Com o nome do Produto:");
        produto.setNome(teclado.nextLine());
        IO.println("Entre Com o Preço do Produto:");
        produto.setPreco(teclado.nextDouble());
        IO.println("Entre Com a Quantidade do Produto:");
        produto.addProdutos(teclado.nextInt());

        //Saida de dados
        System.out.println(produto);
        teclado.close();

    }

}
