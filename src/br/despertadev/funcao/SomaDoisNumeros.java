package br.despertadev.funcao;

import java.util.Scanner;

public class SomaDoisNumeros {

public Double funcaoSomaDoisNumeros(Double n1, Double n2){
    Double soma = n1+n2;
    return soma;
}

    static void main() {

        SomaDoisNumeros somadois = new SomaDoisNumeros();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre Com o Primeiro Número:");
        Double n1 = sc.nextDouble();
        System.out.println("Entre Com o Segundo Número:");
        Double n2 = sc.nextDouble();
        System.out.println("O valor da Soma É: " + somadois.funcaoSomaDoisNumeros(n1,n2));
        sc.close();
    }
}
