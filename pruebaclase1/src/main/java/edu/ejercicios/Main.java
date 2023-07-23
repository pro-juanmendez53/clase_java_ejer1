package edu.ejercicios;

import edu.ejercicios.ejemplos.clsEjemplo1;
import edu.ejercicios.ejercicios.clsEjercicio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Mayús+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }


        /*clsEjemplo1 ej = new clsEjemplo1();

        String varA,varB = "";

        try {
            BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Ingrese A");
            varA = lector.readLine();
            System.out.print("Ingrese B");
            varB = lector.readLine();
            System.out.println("valor A= " + varA + "valor B= " + varB);

        } catch (Exception ex)
        {
            System.out.println("Ingreso mal el dato");
        }

        ej.calculo(varA,varB);*/

        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        double radio = 0.00;
        try
        {
            System.out.println("Ingresa el radio del circulo");
            radio = Double.parseDouble(lector.readLine());



        } catch (Exception ex)
        {
            System.out.println("Ingresaste mal el dato");
        }




        clsEjercicio calculos = new clsEjercicio();
        calculos.areaCirculo(radio);

    }


}