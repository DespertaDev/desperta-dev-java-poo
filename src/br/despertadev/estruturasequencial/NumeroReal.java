/* Trilha de Estudos para Acompanhamento Personalizado
 * em Java com Orientação a Objetos e Padrão de Projeto
 * Autor: DESPERTA DEV
 * Data: 01/01/2026
 * Exercicio 3 -  Faça um programa em Linguagem Java, para ler um número real e mostrar ele na tela.
 * */

package br.despertadev.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class NumeroReal {
    /*OBS: Bastante atenção com valores reais (double) em Java, pois a depender da localidade do
    Sistema Operacional(no caso do Brasil) o separador  de casas decimais é a virgula (,), para
    manter o separador ponto (.) é necessártio setar a localidade US.
    * */
    static void main() {
        Locale.setDefault(Locale.US); //Serve para setar a Localização como EUA.
        Scanner sc = new Scanner(System.in); //Cria um objeto sc da classe Scanner para fazer a leitura de dados do Teclado
        System.out.println("Entre com um número Real");
        double real = sc.nextDouble(); //Em Java os números reais ou fracionarios são anotados como double
        System.out.println("O número digitado foi: " + real);
        sc.close(); // Encerra o Objeto sc da classe Scanner
    }
}
