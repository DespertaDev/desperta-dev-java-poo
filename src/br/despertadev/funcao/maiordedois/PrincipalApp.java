package br.despertadev.funcao.maiordedois;

import java.util.Scanner;

public class PrincipalApp {

    static void main() {
        //cria o objeto
        MaiorDeDois maiordedois = new MaiorDeDois();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre Com o Primeiro Número:");
        Double n1 = sc.nextDouble();
        System.out.println("Entre Com o Segundo Número:");
        Double n2 = sc.nextDouble();
        System.out.println("O Maior Número É: " + maiordedois.funcaoMaiorDeDois(n1,n2));
        sc.close();

    }
}
