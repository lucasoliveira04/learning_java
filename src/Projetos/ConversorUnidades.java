package Projetos;

import java.util.Scanner;

public class ConversorUnidades {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Selecione a unidade de medida:");
        System.out.println("1. Quilômetros (km)");
        System.out.println("2. Metros (m)");
        System.out.println("3. Centímetros (cm)");
        System.out.println("4. Litros (L)");
        System.out.println("5. Mililitros (mL)");

        int escolha = scanner.nextInt();

        scanner.nextLine();

        switch (escolha){
            default:
                System.out.println("Opção invalida");
                break;
            case 1:
                conversorKm();
                break;
            case 2:
                conversorMetros();
                break;
            case 3:
                conversorCentimetro();
                break;
            case 4:
                conversorL();
                break;
            case 5:
                conversorCentimetro();
                break;

        }
    }

    private static String conversorKm(){
        System.out.println("Valor: ");
        float valor = Float.parseFloat(scanner.nextLine());
        float result = valor / 1000;
        System.out.println("Conversão: " + result);
        return String.valueOf(result);
    }

    private static String conversorMetros(){
        System.out.println("Valor: ");
        float valor = Float.parseFloat(scanner.nextLine());
        float result = valor * 1000;
        System.out.println("Conversão: ");
        return String.valueOf(result);
    }

    private static String conversorCentimetro(){
        System.out.println("Valor: ");
        float valor = Float.parseFloat(scanner.nextLine());
        float result = valor / 1000;
        System.out.println("Conversão: " + result);
        return String.valueOf(result);
    }

    private static String conversorL(){
        System.out.println("Valor: ");
        float valor = Float.parseFloat(scanner.nextLine());
        float result = valor / 1000;
        System.out.println("Conversão: " + result);
        return String.valueOf(result);
    }

    private static String conversorMililitros(){
        System.out.println("Valor: ");
        float valor = Float.parseFloat(scanner.nextLine());
        float result = valor * 1000;
        System.out.println("Conversão: " + result);
        return String.valueOf(result);
    }
}
