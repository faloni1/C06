package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite a quantidade de ingressos inteiros: ");
        int qtdIngressosInteiros = teclado.nextInt();

        System.out.printf("\nDigite o valor do ingresso inteiro: ");
        double valorIngressoInteiro = Double.parseDouble(teclado.next().replace(",", "."));

        System.out.printf("\nDigite a quantidade de ingressos meia-entrada: ");
        int qtdIngressosMeia = teclado.nextInt();

        System.out.printf("\nDigite o valor do ingresso meia-entrada: ");
        double valorIngressoMeia = Double.parseDouble(teclado.next().replace(",", "."));

        double totalInteiro = qtdIngressosInteiros * valorIngressoInteiro;
        double totalMeia = qtdIngressosMeia * valorIngressoMeia;
        double totalSessao = totalInteiro + totalMeia;
        double media = totalSessao / (qtdIngressosInteiros + qtdIngressosMeia);

        System.out.printf("\nTotal arrecadado com ingressos inteiros: %.2f", totalInteiro);
        System.out.printf("\nTotal arrecadado com meia-entrada: %.2f", totalMeia);
        System.out.printf("\nValor total arrecadado na sessão: %.2f", totalSessao);
        System.out.printf("\nValor médio pago por ingresso: %.2f", media);

    }
}
