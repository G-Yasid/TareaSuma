import java.until.Scanner;
import java.util.regex.MatchResult;

//Silvio Yasid Gaitan Arguello. 2024-1375U

public class ThreeNumbers {
    public static void main(String[] args) {

        //Ingresar 3 numeros diferentes y mostrar la suma de los 2 mas pequeños, la diferencia entre los 2 mas grandes y cual de los 3 numeros es mayor.
        Scanner scanner = new Scanner(System.in); 

        System.out.print(s:"Ingrese su primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print(s:"Ingrese su segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.print(s:"Ingrese su tercer numero: ");
        int num3 = scanner.nextInt();

        //Encontrar los numeros mas pequeños 
        int small1 = Math.min(num1, Math.min(num2, num3));
        int small2 = Math.max(Math.min(num1, num2), Math.min(num2, num3));

        //Encontrar los numeros mas grandes
        int large1 = Math.max(num1, Math.max(num2, num3));
        int large2 = Math.min(Math.max(num1, num2), Math.max(num2, num3));

        //Calcular la suma de los 2 numeros mas pequeños 
        int sumSmall = small1 + small2;

        //Calcular la resta de los numeros mas grandes 
        int diffLarge = large1 - large2;

        //Mostrar los resultados 
        System.out.println("la suma de los 2 numeros mas pequeños es: " + sumSmall);
        System.out.println("la diferencia de los 2 numeros mas grandes es: " + diffLarge);

        //Mostrar el numero mayor 
        if (num1 == small1 && num1 == small2 && num1 == small2) {
            System.out.println("Los 3 numeros son iguales");
        } else {

            if (num2 == small1) {
                System.out.println("El numero mas grande es " + Math.max(num2, num3));
            } else if (num2 == small1) {
                System.out.println("El numero mas grande es " + Math.max(num1, num3));
            } else if (num3 == small1) {
                System.out.println("El numero mas grande es " + Math.max( num1, large2));
            } else if (num1 == small2) {
                System.out.println("El numero mas grande es " + Math.max(num3, large1)); 
            } else if (num2 == small2) {
                System.out.println("El numero mas grande es " + Math.max(num1, large1)); 
            } else {
                System.out.println("El numero mas grande " + Math.max(num1, num2));
            }
        }
    }
}
