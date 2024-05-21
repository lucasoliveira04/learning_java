package Projetos;

import java.util.Scanner;

public class CalculadoraBasica {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("[1] - Iniciar | [0] - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    iniciarCalculadora();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void iniciarCalculadora() {
        System.out.println("Calculadora iniciada!");
        System.out.println();

        float resultado = 0;
        boolean sair = false;
        boolean primeiroNumero = true;

        while (!sair) {
            System.out.println("[q] - Resultado");
            System.out.println();

            if (primeiroNumero) {
                System.out.println("Digite um número: ");
            } else {
                System.out.println("Digite um operador (+, -, *, /) ou [q] para obter o resultado: ");
            }
            String entrada = scanner.next();

            switch (entrada) {
                case "q":
                    sair = true;
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    if (!primeiroNumero) {
                        System.out.println("Operador: " + entrada);
                        float operando = scanner.nextFloat();
                        switch (entrada) {
                            case "+":
                                resultado += operando;
                                break;
                            case "-":
                                resultado -= operando;
                                break;
                            case "*":
                                resultado *= operando;
                                break;
                            case "/":
                                if (operando != 0) {
                                    resultado /= operando;
                                } else {
                                    System.out.println("Erro: divisão por zero!");
                                }
                                break;
                        }
                    } else {
                        System.out.println("Operador inválido! Você deve digitar um número primeiro.");
                    }
                    break;
                default:
                    float numero = Float.parseFloat(entrada);
                    if (primeiroNumero) {
                        resultado += numero;
                        primeiroNumero = false;
                    } else {
                        System.out.println("Número inválido! Você deve digitar um operador antes de inserir outro número.");
                    }
                    break;
            }
        }

        System.out.println("Resultado: " + resultado);
    }


}
