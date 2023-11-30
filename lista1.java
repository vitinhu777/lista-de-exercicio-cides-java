// LISTA 1 VITOR GONÇALVES DUARTE VARANDA//
import java.util.Scanner;
import java.time.Year;

public class CalculadoraIdade {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = Year.now().getValue();

        int idade = anoAtual - anoNascimento;

        System.out.println("Sua idade atual é: " + idade + " anos");

        scanner.close();
    }
}
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha a operação desejada:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        System.out.print("Digite o número da operação: ");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Resultado da adição: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Resultado da multiplicação: " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 != 0) {
                    System.out.println("Resultado da divisão: " + (numero1 / numero2));
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma operação válida.");
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class VerificadorAprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();


        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7.0) {
            System.out.println("Média: " + media + ". Aluno aprovado!");
        } else if (media >= 5.0 && media < 7.0) {
            System.out.println("Média: " + media + ". Aluno em recuperação.");
        } else {
            System.out.println("Média: " + media + ". Aluno reprovado.");
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
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

public class ConversorTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double tempCelsius = scanner.nextDouble();

        double tempFahrenheit = (tempCelsius * 9 / 5) + 32;


        System.out.println("A temperatura em Fahrenheit é: " + tempFahrenheit + "°F");

        scanner.close();
    }
}
import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double[] numeros = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }

        double media = soma / 5;

        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);

        scanner.close();
    }
}
import java.util.Scanner;

public class CalculadoraJurosSimples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor principal: ");
        double principal = scanner.nextDouble();


        System.out.print("Digite a taxa de juros anual (em percentual): ");
        double taxaJurosAnual = scanner.nextDouble();

  
        System.out.print("Digite o período de tempo em anos: ");
        int periodoAnos = scanner.nextInt();

        double taxaJurosDecimal = taxaJurosAnual / 100;

        double valorTotal = principal * (1 + taxaJurosDecimal * periodoAnos);

        System.out.println("O valor total após " + periodoAnos + " anos é: " + valorTotal);


        scanner.close();
    }
}
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso em quilogramas: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        scanner.close();
    }
}
