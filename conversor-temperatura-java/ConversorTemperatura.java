import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n=== Conversor de Temperatura ===");
            System.out.println("1. Celsius para Fahrenheit");
            System.out.println("2. Fahrenheit para Celsius");
            System.out.println("3. Celsius para Kelvin");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite a temperatura em Celsius: ");
                    double c = sc.nextDouble();
                    double f = (c * 9 / 5) + 32;
                    System.out.println("Resultado: " + f + " °F");
                    break;
                case 2:
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    f = sc.nextDouble();
                    c = (f - 32) * 5 / 9;
                    System.out.println("Resultado: " + c + " °C");
                    break;
                case 3:
                    System.out.print("Digite a temperatura em Celsius: ");
                    c = sc.nextDouble();
                    double k = c + 273.15;
                    System.out.println("Resultado: " + k + " K");
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        
        sc.close();
    }
}

