    import java.util.Scanner;

    public class Temperatura {
        public static void executar()  {

            int jan = 24, fev = 24, mar = 24, abr = 22, maio = 19, jun = 18, jul = 18, ago = 19, set = 20, out = 22;
            int nov = 23, dez = 24;
            int soma, media;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Temperatura média por mês em SJC:");
            System.out.println("=================================");

            if (jan >= 18) {
                System.out.println("Janeiro: Temperatura Média de: "+jan+"°. Temperatura agradável.");
            }
            else {
                System.out.println("Janeiro: Temperatura Média de: "+jan+"°. Frio"); }


            if (fev >= 18) {
                System.out.println("Fevereiro: Temperatura Média de: "+fev+"°. Temperatura agradável."); }
            else {
                System.out.println("Fevereiro: Temperatura Média de: "+fev+"°. Frio"); }

            if (mar >= 18) {
                System.out.println("Março: Temperatura Média de: "+mar+"°. Temperatura agradável."); }
            else {
                System.out.println("Março: Temperatura Média de: "+mar+"°. Frio"); }

            if (abr >= 18) {
                System.out.println("Abril: Temperatura Média de: "+abr+"°. Temperatura agradável."); }
            else {
                System.out.println("Abril: Temperatura Média de: "+abr+"°. Frio"); }

            if (maio >= 18) {
                System.out.println("Maio: Temperatura Média de: "+maio+"°. Temperatura agradável."); }
            else {
                System.out.println("Maio: Temperatura Média de: "+maio+"°. Frio"); }

            if (jun >= 18) {
                System.out.println("Junho: Temperatura Média de: "+jun+"°. Temperatura agradável."); }
            else {
                System.out.println("Junho: Temperatura Média de: "+jun+"°. Frio"); }

            if (jul >= 18) {
                System.out.println("Julho: Temperatura Média de: "+jul+"°. Temperatura agradável."); }
            else {
                System.out.println("Julho: Temperatura Média de: "+jul+"°. Frio"); }

            if (ago >= 18) {
                System.out.println("Agosto: Temperatura Média de: "+ago+"°. Temperatura agradável."); }
            else {
                System.out.println("Agosto: Temperatura Média de: "+ago+"°. Frio"); }

            if (set >= 18) {
                System.out.println("Setembro: Temperatura Média de: "+set+"°. Temperatura agradável."); }
            else {
                System.out.println("Setembro: Temperatura Média de: "+set+"°. Frio"); }

            if (out >= 18) {
                System.out.println("Outubro: Temperatura Média de: "+out+"°. Temperatura agradável."); }
            else {
                System.out.println("Outubro: Temperatura Média de: "+out+"°. Frio"); }

            if (nov >= 18) {
                System.out.println("Novembro: Temperatura Média de: "+nov+"°. Temperatura agradável."); }
            else {
                System.out.println("Novembro: Temperatura Média de: "+nov+"°. Frio"); }

            if (dez >= 18) {
                System.out.println("Dezembro: Temperatura Média de: "+dez+"°. Temperatura agradável."); }
            else {
                System.out.println("Dezembro: Temperatura Média de: "+dez+"°. Frio"); }

            soma = jan + fev + mar + abr + maio + jun + jul + ago + set + out + nov + dez;
            media = soma / 12;

            System.out.println("================================================================");

            if (media >= 18) {
                System.out.println("Media Anual: Temperatura Média de: "+media+"°. Temperatura agradável."); }
            else {
                System.out.println("Media Anual: Temperatura Média de: "+media+"°. Frio"); }





        }}

