package basic.c02_operators;

/*
Clase 23 - Ejercicios: Operadores
Vídeo: https://youtu.be/JOAqpdM36wI?t=8085
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        var a = 5;
        var b = 2;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // 2. Crea una variable para cada tipo de operación de asignación.
        a = 10;
        System.out.println(a += 2);
        System.out.println(a -= 2);
        System.out.println(a *= 2);
        System.out.println(a /= 2);
        System.out.println(a %= 2);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(b > a);
        System.out.println(3 == 3);
        System.out.println(!true == false);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(10 >= 15);
        System.out.println(0 >= 0.01);
        System.out.println(false != !true);

        // 5. Utiliza el operador lógico and.
        System.out.println(5 > 5 && 5 < 15);
        System.out.println(5 <= 6 && 6 >= 5);
        System.out.println(true && !false);

        // 6. Utiliza el operador lógico or.
        System.out.println(5 > 5 || 5 < 15);
        System.out.println(5 <= 6 || 6 == 5);
        System.out.println(true || !false);

        // 7. Combina ambos operadores lógicos.
        int edad = 20;
        boolean tieneIdentificacion = true;
        boolean esEstudiante = false;

        boolean puedeEntrar = (edad >= 18 && tieneIdentificacion) || esEstudiante;

        System.out.println(puedeEntrar);

        // 8. Añade alguna negación.
        System.out.println(!false);

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        var c = 10;
        System.out.println(++c);
        var d = 25;
        System.out.println(d++);
        System.out.println(d);
        System.out.println(--d);
        System.out.println(d--);
        System.out.println(d);

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        int age = 22;
        int puntos = 75;
        int bonos = 5;

        boolean resultado = ((puntos + bonos * 2) > 80 && age >= 18) || (puntos % 5 == 0);

        System.out.println(resultado);
    }
}
