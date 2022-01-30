package bancodigital.banco;

import bancodigital.contas.Conta;
import lombok.Data;

import java.util.List;

@Data
public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }

    public void exibirContas(List<Conta> contas) {
        System.out.println();
        System.out.println("=== EXIBINDO CONTAS ===");
        for (Conta conta: contas) {
            System.out.println("Cliente: " + conta.toString());
        }
    }
}
