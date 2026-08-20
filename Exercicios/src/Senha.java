    import java.util.Scanner;

    public class Senha {
        public static void executar() {

            int senha;
            int senhacorreta = 1234;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Insira sua senha: ");
            senha = scanner.nextInt();

            if (senha == senhacorreta) {
                System.out.println("Acesso concedido!");

            }
            else {
                System.out.println("Acesso negado!");




            }
        }
    }

