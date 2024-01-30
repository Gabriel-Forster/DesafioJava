import com.sun.source.tree.WhileLoopTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ContaCorrente {
    public static void main (String[] args) {
        System.out.println ("Dados do Cliente: ");
        String nome = "Carlos Guilherme de Campos Bottene";
        String tipoDeConta = "Conta corrente";
        double saldo = 3800.00;
        int opcao = 0;

        System.out.println ("******************");
        System.out.println ("\nNome: " + nome);
        System.out.println ("Tipo de conta: " + tipoDeConta);
        System.out.println ("Saldo: " + saldo);
        System.out.println ("\n******************");

        String menu = """
                                
                Digite a opção desejada:
                1: Consultar Saldo 
                2: Transferir
                3: Depósito
                4: Sair  
                                
                """;
        Scanner leitura = new Scanner (System.in);
        while (opcao != 4) {
            System.out.println (menu);
            opcao = leitura.nextInt ();

            if (opcao == 1) {
                System.out.println ("Seu saldo é: " + saldo);
            } else if (opcao == 2) {
                System.out.println ("Qual valor deseja transferir?");
                double valor = leitura.nextDouble ();
                if (valor > saldo) {
                    System.out.println ("Saldo insuficiente");
                } else {
                    saldo -= valor;
                    System.out.println ("Saldo atual: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println ("Valor do depósito: ");
                double valor = leitura.nextDouble ();
                saldo += valor;
                System.out.println ("Saldo atual: " + saldo);
            } else if (opcao != 4) {
                System.out.println ("Opção invalida");
            } else if (opcao == 4) {
                System.out.println ("Operações encerradas! ");
            }

        }

    }

}
