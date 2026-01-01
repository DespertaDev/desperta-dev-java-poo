/* Trilha de Estudos para Acompanhamento Personalizado
 * em Java com Orientação a Objetos e Padrão de Projeto
 * Autor: DESPERTA DEV
 * Data: 01/01/2026
 * Exercicio 2 -  Faça um programa em Linguagem Java, para ler um número inteiro e mostrar ele na tela.
 * */

package br.despertadev.estruturasequencial;

import java.util.Scanner;

public class NumeroInteiro {

    static void main() {
        //Cria um objeto sc da classe Scanner para fazer a leitura de dados do Teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um número inteiro");
        int inteiro = sc.nextInt();
        System.out.println("O número digitado foi: " + inteiro);
        sc.close(); // Encerra o Objeto sc da classe Scanner
    }
}
