

import java.util.Scanner;

public class BeautifulNumberC {

    public static void main(String[] args) {
        //declaracion de variables
        int n;
        int[] arreglo = new int[4];
        int resultado;
        int resultado2;
        boolean tieneNumDiff;
        // ingreso de variables
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el n: ");
        n = entrada.nextInt();
        //ingresado el arreglo
        Scanner entradaArr = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("ingrese el elemento [" + i + "]" + "del arreglo:");
            arreglo[i] = entrada.nextInt();
        }
        //proceso
        resultado2 = minimumListNumber(arreglo);
        resultado = minimumNumber(n);
        tieneNumDiff = isAllDifferentNumbers(n);
        //resultado
        System.out.println("minimo numero: " + resultado);
        System.out.println("tiene todos los numeros diferentes: " + tieneNumDiff);
        System.out.println("minimo numero de una lista: " + resultado2);

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
        if (isAllDifferentNumbers(x) == true) {
            resultado = x;
        } else {
            resultado = 0;
        }
        //salida
        return resultado;

    }

    private static boolean isAllDifferentNumbers(int n) {
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
        return tieneNumdif;
    }

    private static int minimumListNumber(int[] arreglo) {
        int resultado;
        int menor = 999999;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] >= 1000 && arreglo[i] <= 9000) {
                if (menor >= arreglo[i]) {
                    menor = arreglo[i];
                }
            }

        }

        resultado = minimumNumber(menor);

        return resultado;

    }

}
