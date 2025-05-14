import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* 2- WHILE:

        Una asociación benéfica te envía a pedir caridad. 
        Preguntas "una ayudita?", y si te dicen que sí, preguntas cuánto quieren poner. 
        Si te dicen que no, te deprimes y te vas para tu casa.

        Al final, tienes que decir cuánta gente te ha ayudado y cuánto 
        dinero has recaudado. */

        Scanner scanner = new Scanner(System.in);

        boolean leave = false;
        
        int people = 0;
        int bank = 0;

        while (!leave){
            System.out.println("Una ayudita ? Yes/No");
            String firstAnswer = scanner.nextLine();

            if(firstAnswer.equalsIgnoreCase("yes")){
                
                System.out.println("Con cuanto vas a ayudar ?");
                int moneyIn = scanner.nextInt();
                scanner.nextLine();

                people += 1;
                bank += moneyIn;

            } else {
                leave = true;
                System.out.printf("El numero de personas que ayudaron fueron %d con un total de %d",people,bank);
                
            }
        
            scanner.close();
        } 
        



    }
}
