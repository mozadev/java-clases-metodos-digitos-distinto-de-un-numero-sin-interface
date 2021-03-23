

import java.util.Scanner;

public class BeautifulNumberA {

    public static void main(String[] args) {
        //declaracion de variables
        int n;
        int resultado;

        // ingreso de variables
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el n: ");
        n = entrada.nextInt();
        //proceso
        resultado = minimumNumber(n);

        //resultado
        System.out.println("minimo numero: " + resultado);

    }

    public static int minimumNumber(int n) {
        //declaracion variables
        int x;
        int resultado = 0;
        //ingreso y proceso
        if (n >= 1000 && n <= 9000) {
            x = n;
        } else {
            x = 0;
        }

        boolean tieneNumdif;
        int contadorCoincidencias = 0;
        String numeroCadena = Integer.toString(n);
        for (int i = 0; i < numeroCadena.length() - 1; i++) {
            for (int j = 1; j < numeroCadena.length() - i; j++) {
                if (numeroCadena.charAt(i) == numeroCadena.charAt(j + i)) {
                    contadorCoincidencias = contadorCoincidencias + 1;
                }

            }
        }
        if (contadorCoincidencias > 0) {
            tieneNumdif = false;
        } else {
            tieneNumdif = true;
        }

        if (tieneNumdif == true) {
            resultado = x;
        } else {
            resultado = 0;
        }
        //salida
        return resultado;

    }

}
