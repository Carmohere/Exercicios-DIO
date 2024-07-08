import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.print("Digite a opção desejada: \n1. Depositar\n" + "2. sacar\n" + "3. Consultar Saldo\n" + "4. Encerrar \n");
            int opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    saldo += scanner.nextDouble();

                    System.out.print("Saldo atual: " + saldo +"\n");
                    break;

                case 2:
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();

                    if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorSaque;
                        System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
                    }
                    break;
                case 3:
                    System.out.print("Saldo atual: " + saldo +"\n");
                    break;

                case 4:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}