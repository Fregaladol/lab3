import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* 1- SWITCH: Preguntas estación del año. Mediante un switch, 
        respondes una cosa u otra. Ejemplo "primavera". 
        Respuesta: "la primavera me alteraaa". */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qué estación del año te gusta ?");
        String season = scanner.nextLine().toLowerCase();
        
                
        switch (season) {
            case "primavera":
                System.out.println("La primavera me alteraaaaaaaa!");
                break;
            case "verano":
                System.out.println("Al chiringuito en la playa");
                break;
            case "otoño":
                System.out.println("Cafeeeee");
            case "invierno":
                System.out.println("Winter is coming! brrrr");
                break;
            default:
                System.out.println("Dije estación del año, Primeravera, Verano, Otoño, Invierno");
        }
        
        scanner.close();
    }
}
