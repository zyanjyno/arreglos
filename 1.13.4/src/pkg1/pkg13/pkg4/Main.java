/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.pkg13.pkg4;
  import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * En este trabajo, nuevamente utilizamos la clase Scanner para obtener el valor de n desde la entrada del usuario
     * . Luego, creamos un vector llamado numeros de tamaño n y asignamos los números del 1 hasta n a cada elemento del vector.

A continuación, utilizamos dos bucles for para imprimir los números pares e impares almacenados en el vector.

 En el primer bucle, verificamos si el número en la posición actual es par usando la condición numeros[i] % 2 == 0. Si es par, lo imprimimos.

* En el segundo bucle, verificamos si el número en la posición actual es impar usando la condición numeros[i] % 2 != 0. Si es impar, lo imprimimos.

Al ejecutar este programa, te pedirá ingresar el valor de n. Después de ingresar el valor, mostrará los números pares e impares del 1 hasta n almacenados en el vector. 

Por ejemplo, si ingresas 10, mostrará los números pares del 2 al 10 y los números impares del 1 al 9.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        System.out.println("Números pares:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

        System.out.println("Números impares:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }
    


    }
    
}
