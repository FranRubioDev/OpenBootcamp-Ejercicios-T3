/* Primera parte:

Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores.

*/

public class Primeraparte {
    public static void main(String[] args) {
        suma(1, 2, 3);
    }

    public static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        System.out.println("El resultado de la sumatoria de uno mas dos mas tres es: " + resultado);
    }

}

