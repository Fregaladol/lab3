import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /* 3- SWITCH  - WHILE:

        El archivo sonoro!

        Usando una variable byte, preguntas cuál de los sonidos quieres escuchar. 
        Cuando eligen un número, aparece la onomatopeya de ese sonido. 
        Luego le preguntas: quieres escuchar otro? Y sigue hasta que diga no.

        Ejemplo: elige 1- cohete, y suena ziuuum!, elige 3- moto, y suena brrrmmm!

        Puedes probar la opción do...while para asegurar de que pregunta 
        al menos una vez. */

        byte option;
        boolean answer = false;
        String repeat;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("elige una opcion y escucharas el sonido: \n 1.- pollito \n 2.- perro \n 3.- gato \n 4.- moto \n 5.- cortando cebolla");
            option = scanner.nextByte();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("pio pio ");
                    break;
                case 2:
                    System.out.println("guau guau ");
                    break;
                case 3:
                    System.out.println("miau miau");
                    break;
                case 4:
                    System.out.println("brrrr brrr");
                    break;
                case 5:
                    System.out.println("lloros lloros");
                    break;
                default:
                    System.out.println("No has elegido una opcion valida");
            }

            System.out.println("Quieres escuchar otra opcion? Yes/No");
            repeat = scanner.nextLine();

            if (repeat.equalsIgnoreCase("yes")){
                continue;
            } else {
                answer = true;
            }

        }
        while(!answer);

        
    }
}
