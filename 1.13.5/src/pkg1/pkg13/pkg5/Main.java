/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.pkg13.pkg5;

import java.util.Scanner;

/*
 En este trabajo, también utilizamos la clase Scanner para obtener el valor de n desde la entrada del usuario. 
 Luego, creamos un vector llamado numeros de tamaño n y asignamos los números del 1 hasta n a cada elemento del vector.

Después, utilizamos un bucle for para verificar si cada número en el vector es primo o no. 
Para eso, hemos creado un método esPrimo() que toma un número y verifica si es divisible por algún número desde 2 hasta su raíz cuadrada. 
Si el número es divisible por algún número dentro de ese rango, no es primo. De lo contrario, es primo.

Finalmente, imprimimos los números primos encontrados en el vector.

Al ejecutar este programa, te pedirá ingresar el valor de n. 
Después de ingresar el valor, mostrará los números primos del 1 hasta n almacenados en el vector. 
Por ejemplo, si ingresas 20, mostrará los números primos: 2, 3, 5, 7, 11, 13, 17, 19.
 
 * @author ASUS
 */
public class Main {

    /**
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

        System.out.println("Números primos:");
        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                System.out.println(numeros[i]);
            }
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    


    }
    
}
