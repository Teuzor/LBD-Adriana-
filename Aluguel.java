import java.util.Scanner;

public class Aluguel {
    public static void main(String[] args) throws Exception {

    int dias;
    double quilometragem, limite, diaria, valor, taxa;
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("===============================");
    System.out.println("Qual valor da diária?");
    System.out.println("===============================");

    diaria = scanner.nextDouble();
    
    System.out.println("===============================");
    System.out.println("Quantos dias você alugou o veículo?");
    System.out.println("===============================");

    dias = scanner.nextInt();

    System.out.println("===============================");
    System.out.println("Quantos km você percorreu?");
    System.out.println("===============================");

    quilometragem = scanner.nextDouble();

    valor = diaria * dias;
    taxa = 560;

        if (quilometragem >= 300) {

        valor = valor + taxa;  
        System.out.println("===============================");
        System.out.println("Taxa aplicada. O valor total ficou: "+valor);
        System.out.println("===============================");}

            else {

                System.out.println("===============================");
                System.out.println("O valor total ficou: "+valor);
                System.out.println("===============================");} 

}}

