

public class SuperBeautifulNumber {

    // de la clase BeautifulNumber A =================================================
    public static int minimumNumberA(int n) {
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

    // de la clase BeautifulNumber B ===============================================
    public static int minimumNumberB(int n) {
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

    // de la clase BeautifulNumber C ===========================================
    public static int minimumNumberC(int n) {
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

    // de la clase BeautifulNumber D ===============================================
    public static int minimumNumberD(int n) {
        //declaracion variables
        int x;
        int resultado = 0;
        //ingreso y proceso x=ab /x>=n entonces
        if (n >= 10 && n <= 99) {
            x = n;
            if (isValidPotencialtwoNumber(x) >= n) {//potencia(a,b)>=n
                x = n;
            } else {
                x = 0;
            }
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

    private static double isValidPotencialtwoNumber(int x) {
        double resultado;
        int a = x / 10;
        int b = x % 10;
        resultado = Math.pow(a, b);

        return resultado;

    }

    // de la clase BeautifulNumber E ========================================
    public static int minimumNumberE(int n) {
        //declaracion variables
        int x;
        int resultado;
        //ingreso y proceso x=abc /x>=n entonces
        if (n >= 100 && n <= 999) {
            x = n;
            if (isValidPotencialthreeNumber(x) >= n) {//potencia(a,b,c)>=n
                x = n;
            }
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

    private static double isValidPotencialthreeNumber(int x) {
        double resultado;
        //(0<=a,b,c<=9)
        int a = x / 100; // obteniendo digito de las centenas
        int b = (x % 100) / 10; //obteniendo digito de las decenas
        int c = (x % 100) % 10; //obteniendo digito de las unidades
        resultado = Math.pow(a, Math.pow(b, c));// a elevado a la potencia de b elevado a la potencia de

        return resultado;

    }

}
