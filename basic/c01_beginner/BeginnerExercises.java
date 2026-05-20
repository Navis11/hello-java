package basic.c01_beginner;

/*
Clase 17 - Ejercicios: Variables y constantes
Vídeo: https://youtu.be/JOAqpdM36wI?t=6732
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Mariana";
        System.out.println(name);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 34;
        System.out.println(age);

        // 3. Crea una variable double con tu altura en metros.
        var height = 1.60;
        System.out.println(height);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        var likesToProgram = true;
        System.out.println(likesToProgram);

        // 5. Declara una constante con tu email.
        final String EMAIL = "chongmelendezmariana@gmail.com";
        System.out.println(EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char inicial = 'M';
        System.out.println(inicial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String localidad = "Los Atlantes";
        System.out.println(localidad);
        localidad = "El Tablón";
        System.out.println(localidad);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 5;
        int b = 6;
        System.out.println(a+b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        //Ver el tipo de un objeto con getClass()
        System.out.println(name.getClass().getSimpleName());
        //Ver el tipo de dato de un dato primitivo
        System.out.println(((Object)age).getClass().getSimpleName());
        //Utilizando instanceof, funciona solo con clases
        System.out.println(name instanceof String);
        int edad = 15;
        //Object objeto = edad;
        //Integer objeto = Integer.valueOf(edad);
        Object objeto = Integer.valueOf(edad);
        System.out.println(objeto instanceof Integer);
        //Ver el tipo de dato inferido con var
        System.out.println(((Object)height).getClass().getSimpleName());
        System.out.println(((Object)likesToProgram).getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        char respuesta;
        respuesta='C';
        System.out.println(respuesta);

    }
}
