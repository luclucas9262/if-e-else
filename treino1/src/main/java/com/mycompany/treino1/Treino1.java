package com.mycompany.treino1;

import java.util.Locale;
import java.util.Scanner;

public class Treino1 {

    public static void main(String[] args) {

        double a, b;
        int hora;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a hora atual");
        hora = entrada.nextInt();

        if (hora <12) {
            System.out.println("Bom Dia");

        }
        if (hora <= 18) {
            System.out.println("Boa Tarde");
        } else {
            System.out.println("Boa noite");
        }
        entrada.close();

    }
}
