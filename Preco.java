import java.util.Scanner;

public class Preco {
    public static void main(String[] args) {

    double arroz, feijao, oleo, acucar, cafe, macarrao, farinha, fuba, molho, sal;
    double soma, desconto;
    Scanner scanner = new Scanner(System.in);

    System.out.println("======================== ");
    System.out.println("Insira o preço do arroz: ");
    System.out.println("======================== ");

    arroz = scanner.nextDouble();

    System.out.println("======================== ");
    System.out.println("Insira o preço do feijao: ");
    System.out.println("======================== ");

    feijao = scanner.nextDouble();
    soma = arroz + feijao;
    
    System.out.println("======================== ");
    System.out.println("Insira o preço do oleo: ");
    System.out.println("======================== ");

    oleo = scanner.nextDouble();
    soma = soma + oleo;

    System.out.println("======================== ");
    System.out.println("Insira o preço do acucar: ");
    System.out.println("======================== ");

    acucar = scanner.nextDouble();
    soma = soma + acucar;

    System.out.println("======================== ");
    System.out.println("Insira o preço do cafe: ");
    System.out.println("======================== ");

    cafe = scanner.nextDouble();
    soma = soma + cafe;

    System.out.println("======================== ");
    System.out.println("Insira o preço do macarrao: ");
    System.out.println("======================== ");
            
    macarrao = scanner.nextDouble();
    soma = soma + macarrao;

    System.out.println("======================== ");
    System.out.println("Insira o preço do farinha: ");
    System.out.println("======================== ");

    farinha = scanner.nextDouble();
    soma = soma + farinha;

    System.out.println("======================== ");
    System.out.println("Insira o preço do fuba: ");
    System.out.println("======================== ");

    fuba = scanner.nextDouble();
    soma = soma + fuba;

    System.out.println("======================== ");
    System.out.println("Insira o preço do molho: ");
    System.out.println("======================== ");

    molho = scanner.nextDouble();
    soma = soma + molho;

    System.out.println("======================== ");
    System.out.println("Insira o preço do sal: ");
    System.out.println("======================== ");

    sal = scanner.nextDouble();
    soma = soma + sal;

    if (soma >= 100) {

        desconto = soma * 0.9;

        System.out.println("======================== ");
        System.out.println("Desconto aplicado! Valor saiu de "+soma+" por "+desconto);
        System.out.println("======================== ");

    }

        else {

        System.out.println("======================== ");
        System.out.println("Desconto não aplicado. Total por: "+soma);
        System.out.println("======================== ");


    }}}