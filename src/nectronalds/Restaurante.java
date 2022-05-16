package nectronalds;

public class Restaurante {

    private String nome;
    private Cardapio cardapio;
    private String endereco;

    public Restaurante(String nome,
            Cardapio cardapio,
            String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.cardapio = cardapio;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public Cardapio getCardapio() {
        return cardapio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
