/*
 * Soy un comentario multilinea
 */

 // Soy un comentario de una sola línea
import java.util.Scanner;

public class Clase2 {

    public enum Semana {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }

// Estructura básica para que se pueda ejecutar
    public static void main(String[] args) {
        


        /* Declaración de una variable en Java 
        * tipo nombre = valor
        */

        int Numero=1;

        //Existen diferes tipos de datos


        // Datos primitivos

        // Numericos

        byte numeroByte = 127; //Números enteros 8 bits valor máximo 127 y mínimo -128
        short numeroShort = 32000; // Números enteros de 16 bits máximo 32767 y mínimo -32678 
        int numeroEntero = 1; //Números enteros 32 bits 
        long numeroLong = 1; // Números enteros 64 bits
        float numeroFloat = 1.0f; // Número de coma flotante de 32 bits 
        double numeroDouble = 1.0; // Números de coma flotante de 64 bits


        // Texto

        char texto = 'a';
        String cadenaTexto = "Hola mundo!";

        // Booleano

        boolean verdadareFalso = true;

        final int numConstante = 1; //Esto es una constante, se crean con final

        // Expresiones

        /* 
         * \' comillas simples
         * \" comillas dobles
         * \\ contra barra
         * \b backspace 
         * \n cambio de linea
         * \r retorno de carro
         * \t tabulador
         * \f salto de página
        */

        String textoExpresiones = "Hola \t \'soy comillas simples\' \b";

        System.out.println(textoExpresiones);

        //Operadores

        int suma = 53 + 2;
        int resta = 57 - 2;
        int multiplicacion = 5 * 11;
        int divisor = 110 / 2;
        int resto = 10 % 2;

        System.out.println("suma " +suma + " resta " + resta);

        suma++; //incremento
        --resta; //decremento

        System.out.println("suma " +suma + " resta " + resta);

        boolean test1 = suma > resta && multiplicacion < divisor;

        suma *= 2;


        // Esto es un input


        int numUser;
        Scanner lector = new Scanner(System.in);
        System.out.print("Escribe un número: ");

        numUser = lector.nextInt();

        System.out.println("este es tu número " + numUser);

        System.out.println(Semana.LUNES);

    }

}