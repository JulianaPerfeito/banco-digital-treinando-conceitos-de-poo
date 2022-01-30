package bancodigital.clientes;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@Builder
@NoArgsConstructor
public class Cliente {
    private String nome;
    private TipoPessoa tipoPessoa;

    public Cliente(String nome, TipoPessoa tipoPessoa) {
        this.nome = nome;
        this.tipoPessoa = tipoPessoa;
    }

    public String getNome() {
        return nome;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }
}
