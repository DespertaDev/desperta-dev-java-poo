/* Trilha de Estudos para Acompanhamento Personalizado
 * em Java com Orientação a Objetos e Padrão de Projeto
 * Autor: DESPERTA DEV
 * Data: 01/01/2026
 * Exercicio Faça um programa em Linguagem Java, para ler um nome e mostrar ele na tela.
 * */

package br.despertadev.estruturasequencial;

import java.util.Scanner;

public class NomeString {

    static void main() {
        //Cria um objeto sc da classe Scanner para fazer a leitura de dados do Teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um nome:");
        String nome = sc.next();
        System.out.println("O nome digitado foi: " + nome);
        sc.close(); // Encerra o Objeto sc da classe Scanner
    }
}