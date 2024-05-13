package br.com.alura.conversor_moedas_desafio.menu;

import java.io.IOException;
import java.util.Scanner;

public class MenuPrincipal {
    public static void menuPrincipal() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        MenuSecundario menu = new MenuSecundario();

        int opcao;
        do {
            MenuSecundario.exibirMenu();
            while (!scanner.hasNextInt()){
                System.out.println("Favor inserir número inteiro válido.");
                scanner.next();
            }
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    RealDolar realDolar = new RealDolar();
                    realDolar.menuRealDolar();
                    break;
                case 2:
                    DolarReal dolarReal = new DolarReal();
                    dolarReal.menuDolarReal();
                    break;
                case 3:
                    RealEuro realEuro = new RealEuro();
                    realEuro.menuRealEuro();
                    break;
                case 4:
                    EuroReal euroReal = new EuroReal();
                    euroReal.menuEuroReal();
                    break;
                case 5:
                    RealLibra realLibra = new RealLibra();
                    realLibra.menuRealLibra();
                    break;
                case 6:
                    LibraReal libraReal = new LibraReal();
                    libraReal.menuLibraReal();
                    break;
                case 7:
                    RealPeso realPeso = new RealPeso();
                    realPeso.menuRealPeso ();
                    break;
                case 8:
                    PesoReal pesoReal = new PesoReal();
                    pesoReal.menuPesoReal();
                    break;
                case 0:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida, digite corretamente.");
                    break;
            }
        } while (true);
    }
}