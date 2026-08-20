import java.util.Scanner;

    public class Multiplo {

        public static void executar() {

            float numero1, numero2;

            Scanner s = new Scanner(System.in);
            System.out.println("Insira o primeiro número: ");
            numero1 = s.nextFloat();

            System.out.println("Insira o segundo número: ");
            numero2 = s.nextFloat();

            if (numero1 % numero2 == 0) {
                System.out.println("O número " + numero1 + " é divisível por " + numero2);
            } else {
                System.out.println("O número " + numero1 + " não é divisível por " + numero2);

            }
        }
    }



