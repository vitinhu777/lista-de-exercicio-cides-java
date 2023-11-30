//----- LISTA 2 VITOR GONÇALVES DUARTE VARANDA------//
import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double soma = numero1 + numero2;

        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }
}
import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        scanner.close();
    }
}
import java.util.Scanner;

public class ContadorDeVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");

        String inputString = scanner.nextLine();

        inputString = inputString.toLowerCase();

        int contadorVogais = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char caractere = inputString.charAt(i);

            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contadorVogais++;
            }
        }

        System.out.println("O número de vogais na string é: " + contadorVogais);

        scanner.close();
    }
}
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class ExerciciosLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        exercicio1(scanner);

   
        exercicio2(scanner);

   
        exercicio3(scanner);

     
        exercicio4(scanner);

       
        exercicio5(scanner);

        scanner.close();
    }

  
    public static void exercicio1(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double soma = numero1 + numero2;

        System.out.println("A soma dos números é: " + soma);
    }

    public static void exercicio2(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("A média dos números é: " + media);
    }


    public static void exercicio3(Scanner scanner) {
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
    }

    public static void exercicio4(Scanner scanner) {
        System.out.print("Digite uma string: ");
        String inputString = scanner.nextLine().toLowerCase();

        int contadorVogais = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char caractere = inputString.charAt(i);

            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contadorVogais++;
            }
        }

        System.out.println("O número de vogais na string é: " + contadorVogais);
    }


    public static void exercicio5(Scanner scanner) {
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
