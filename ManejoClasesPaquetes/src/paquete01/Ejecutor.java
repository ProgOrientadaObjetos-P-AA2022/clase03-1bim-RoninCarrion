/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        Hospital h1 = new Hospital();
        
        
        String nombre;
        int valor;
        double  presupuesto;
        System.out.println("Ingrese el nombre del Hospital: ");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el numero de camas del Hospital: ");
        valor = entrada.nextInt();
        
        // System.out.println("Ingrese el Numero de camas del Hospital h2:\n");
        // valor_01 = entrada.nextInt();
        // h2.establecerNumeroCamas(valor_01);
        System.out.println("Ingrese el Presupuesto del Hospital: ");
        presupuesto = entrada.nextDouble();
        
        h1.establecerNombre(nombre);
        h1.establecerNumeroCamas(valor);
        h1.establecerPresupuesto(presupuesto);
                        
        
        Hospital h2 = new Hospital();
        entrada.nextLine();
        System.out.println("Ingrese el nombre del Hospital: ");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el numero de camas del Hospital: ");
        valor = entrada.nextInt();
        
        System.out.println("Ingrese el Presupuesto del Hospital: ");
        presupuesto = entrada.nextDouble();
        h2.establecerNombre(nombre);
        h2.establecerNumeroCamas(valor);
        h2.establecerPresupuesto(presupuesto);
                System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(),
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        System.out.printf("%s - %d - %.2f\n", h2.obtenerNombre(),
                h2.obtenerNumeroCamas(), h2.obtenerPresupuesto());
        
        
    }
}
