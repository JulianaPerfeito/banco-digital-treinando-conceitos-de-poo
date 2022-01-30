package bancodigital.clientes;

public enum TipoPessoa {

    FISICA("Pessoa Física"),
    JURIDICA("Pessoa Jurídica");

    TipoPessoa(String tipo) {
        this.tipo = tipo;
    }

    private final String tipo;
}
