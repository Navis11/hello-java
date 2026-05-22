package basic.c04_conditionals;

/*
Clase 38 - Ejercicios: Condicionales
Vídeo: https://youtu.be/JOAqpdM36wI?t=11021
*/

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int edad = 16;

        if(edad >= 18){
            System.out.println("El usuario es mayor de edad, por lo tanto, puede votar");
        } else {
            System.out.println("El usuario es menor de edad, por lo tanto, no puede votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int num1 = 99;
        int num2 = 99;

        if(num1 > num2){
            System.out.println(String.format("El número %d es mayor que %d",num1, num2));
        }else if(num1 < num2){
            System.out.println(String.format("El número %d es mayor que %d",num2, num1));
        }else{
            System.out.println("Ambos números son iguales");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int num3 = -99;

        if(num3 > 0){
            System.out.println("El número es positivo");
        }else if(num3 < 0){
            System.out.println("El número es negativo");
        }else{
            System.out.println("El número es cero");
        }

        // 4. Crea un programa que diga si un número es par o impar.
        var num4 = 22;

        if(num4 %2 == 0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.

        var num5 = 101;
        if(num5 >= 1 && num5 <= 100){
            System.out.println("El se encuentra dentro del rango de 1 a 100");
        }else {
            System.out.println("El número no se encuentra dentro del rango esperado");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        var day = 6;

        switch (day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        double nota = 85.56;

        if(nota < 70){
            System.out.println("Suspenso");
        }else if(nota >= 70 && nota <= 97){
            System.out.println("Aprobado");
        }else{
            System.out.println("Sobresaliente");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        var edadCine = 10;
        if(edadCine >= 15){
            System.out.println("El cliente puede ingresar a la función");
        }else{
            System.out.println("El cliente puede ingresar a la función solo si está acompañado");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char letra = 'z';

        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("La letra es una vocal");
        } else{
            System.out.println("La letra es una consonante");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        var a = 10;
        var b = 4;
        var c = 88;

        if(a > b && a > c){
            System.out.println(String.format("%d es mayor que %d y %d",a,b,c));
        }else if (b > a && b > c){
            System.out.println(String.format("%d es mayor que %d y %d",b,a,c));
        }else{
            System.out.println(String.format("%d es mayor que %d y %d",c,a,b));
        }
    }
}
