package bancodigital;

import bancodigital.banco.Banco;
import bancodigital.clientes.Cliente;
import bancodigital.contas.Conta;
import bancodigital.contas.ContaCorrente;
import bancodigital.contas.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

import static bancodigital.clientes.TipoPessoa.FISICA;
import static bancodigital.clientes.TipoPessoa.JURIDICA;

public class Main {

    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        Banco banco = new Banco("Banco Digital X", contas);

        Cliente cliente1 = new Cliente("Maria Fulana", FISICA);
        Cliente cliente2 = new Cliente("Maria SA", JURIDICA);
        Cliente cliente3 = new Cliente("João Fulano", FISICA);
        Cliente cliente4 = new Cliente("João SA", JURIDICA);

        ContaCorrente cc1 = new ContaCorrente(cliente1);
        ContaCorrente cc2 = new ContaCorrente(cliente2);
        ContaPoupanca cp1 = new ContaPoupanca(cliente3);
        ContaPoupanca cp2 = new ContaPoupanca(cliente4);

        contas.add(cc1);
        contas.add(cc2);
        contas.add(cp1);
        contas.add(cp2);

        cc1.depositar(100);
        cc1.transferir(50, cc2);
        cc1.sacar(10);
        cc1.imprimirExtrato();
        cp1.imprimirExtrato();

        banco.exibirContas(contas);
    }
}
