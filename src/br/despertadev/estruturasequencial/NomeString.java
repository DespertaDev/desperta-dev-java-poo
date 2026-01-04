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
        Scanner sc = new Scanner(System.in); //Cria um objeto sc da classe Scanner para fazer a leitura de dados do Teclado
        System.out.println("Entre com um nome:");
        String nome = sc.nextLine(); //nextLine() lê o texto até a quebra de linha, já a funcao next() lê até o espaço
        System.out.println("O nome digitado foi: " + nome);
        sc.close(); // Encerra o Objeto sc da classe Scanner
    }
}