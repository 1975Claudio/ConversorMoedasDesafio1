package br.com.alura.conversor_moedas_desafio.menu;

import br.com.alura.conversor_moedas_desafio.Gson;
import br.com.alura.conversor_moedas_desafio.conversor.Conversao;
import br.com.alura.conversor_moedas_desafio.conversor.Requests;
import java.util.Scanner;
import java.io.IOException;

public class RealEuro {
    public void menuRealEuro() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===============================================");
            System.out.println("Conversão de Real para Euro");
            System.out.println("1 - Inserir valor em Reais");
            System.out.println("0 - Sair");
            System.out.println("===============================================\n");
            System.out.print("Opção: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Digite o valor inteiro em Real que deseja converter: ");
                scanner.next();
            }

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Valor em Real = R$");
                    String valor;
                    do {
                        valor = scanner.next();
                        if (!valor.matches("[0-9.,]+")) {
                            System.out.println("Favor insira um valor válido.");
                            System.out.println("Valor em Reais = R$");
                        }
                    } while (!valor.matches("[0-9.,]"));
                {
                    valor.replace(',', '.');
                    String busca = "https://v6.exchangerate-api.com/v6/" +
                            "39a1cd26a7634b561b876279/pair/BRL/" +
                            "EUR/" + valor;

                    Requests novaBusca = new Requests(busca);
                    String buscaNova = null;
                    try {
                        buscaNova = novaBusca.consulta();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Gson gson = new Gson();
                    Conversao conversao = gson.fromJson(buscaNova, Conversao.class);
                    System.out.println(conversao.toString());

                    break;
//                    case 2:
//                        return 0;
//                    case 0:
//                        System.out.println("Saindo");
//                        System.exit(0);
//                    default:
//                        System.out.println("Opção inválida. Favor digitar novamente:");
//                        break;
                }
            }

        }while (true);
    }
}