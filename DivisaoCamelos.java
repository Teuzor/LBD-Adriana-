import java.util.Scanner;

public class DivisaoCamelos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de camelos da herança: ");
        
        int camelosHeranca = scanner.nextInt();
        int cameloBeremiz = 1;

        int totalCamelos = camelosHeranca + cameloBeremiz;

        int irmao1 = totalCamelos / 2;
        int irmao2 = totalCamelos / 3;
        int irmao3 = totalCamelos / 9;

        int totalDistribuido = irmao1 + irmao2 + irmao3;
        int sobras = totalCamelos - totalDistribuido;

        System.out.println("Resultado:");
        System.out.println("Camelos iniciais: " + camelosHeranca);
        System.out.println("Total com o camelo de Beremiz: " + totalCamelos);
        System.out.println("=====================================");
        System.out.println("Irmão 1: " + irmao1 + " camelos");
        System.out.println("Irmão 2: " + irmao2 + " camelos");
        System.out.println("Irmão 3: " + irmao3 + " camelos");
        System.out.println("Total distribuído: " + totalDistribuido + " camelos");
        System.out.println("Sobraram: " + sobras + " camelos.");
       
    }
}
