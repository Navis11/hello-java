package basic.c03_strings;

/*
Clase 34 - Ejercicios: Strings
Vídeo: https://youtu.be/JOAqpdM36wI?t=9838
*/

public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        var name = "Mariana";
        var surname = "Chong";

        System.out.println(name + " " + surname);

        // 2. Muestra la longitud de una cadena de texto.

        System.out.println(name.length());

        // 3. Muestra el primer y último carácter de un string.
        //Primer caracter
        System.out.println(name.charAt(0));
        //último caracter
        System.out.println(name.charAt(name.length()-1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        //Mayúsculas
        System.out.println(name.toUpperCase());
        //Minúsculas
        System.out.println(name.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(name.toUpperCase().contains("ANA"));

        // 6. Formatea un string con un entero.
        var age = 34;
        System.out.println(String.format("Mi apellido es %s. Tengo %d años de edad",surname,age));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        //Solo elimina los espacios al principio y al final de la string
        System.out.println(" Estoy  aprendiendo Java   ".trim());
        //Elimina todos los espacios den la string
        System.out.println(" Estoy    aprendiendo Java   ".replace(" ",""));

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println("Ejercicios de Java para principiantes".replace(" ","-"));

        // 9. Comprueba si dos strings son iguales.
        var cadena1 = "Fundamentos de programación";
        var cadena2 = "Fundamentos de Programación";

        System.out.println(cadena1.equals(cadena2));
        System.out.println(cadena1.equalsIgnoreCase(cadena2));

        // 10. Comprueba si dos strings tienen la misma longitud.

        var lengthName = name.length();
        var lengthSurname = surname.length();

        System.out.println(lengthName == lengthSurname);

        //Los espacios cuantan como caracter
        var str1 = "Aprendo Java".length();
        var str2 = "mkloikujhyno".length();

        System.out.println(str1 == str2);
    }
}
