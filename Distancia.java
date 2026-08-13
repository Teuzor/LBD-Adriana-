import java.util.Scanner;
public class Distancia {
    public static void main(String[] args) throws Exception {

    double distancia, gasolina, preco, litros;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("==========================");
    System.out.println("Quantos km você vai rodar?");
    System.out.println("==========================");

    distancia = scanner.nextDouble();

    System.out.println("==========================");
    System.out.println("Qual preço do litro da gasolina?");
    System.out.println("==========================");

    gasolina = scanner.nextDouble();

    litros = distancia / 12;

    preco = gasolina * litros;

    if (distancia >= 500) {
        
        preco = preco - (preco * 0.05);
        System.out.println("Desconto Aplicado! Valor total por: "+preco);}

        else

            System.out.println("Desconto não aplicado. Valor total: "+preco);}}
