package boletin7_1;

import java.util.Scanner;

/**
 *
 * @author jmartinezpineiro
 */
public class ContadorNumeros {

    public void grupoNumeros() {
        double num;
        int contCeros = 0;
        int contPositivos = 0;
        int contNegativos = 0;
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduzca un numero");
            num = scanner.nextDouble();
            if (num > 0) {
                contPositivos++;

            } else if (num < 0) {
                contNegativos++;
            } else {
                contCeros++;

            }
           

        }
         System.out.println("Existen " + contPositivos + " numeros positivos" + "\nExisten " + contNegativos + " numeros negativos" + "\nExisten " + contCeros + " cero o ceros");
    }
}
