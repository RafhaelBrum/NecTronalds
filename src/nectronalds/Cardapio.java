package nectronalds;

import java.util.ArrayList;

public class Cardapio {

    private String nomePais;
    private ArrayList<Lanche> lanches;

    public Cardapio(String nomePais) {
        this.nomePais = nomePais;
        this.lanches = new ArrayList<>();
    }

    public void AdicionarLanche(Lanche l) {
        this.lanches.add(l);
    }

    public void AdicionarLanche(String nome,
            String descricao,
            float preco) {
        Lanche l = new Lanche(nome, descricao, preco);
        AdicionarLanche(l);
    }

    public void RemoverLanche(Lanche l) {
        this.lanches.remove(l);
    }

    public String getNomePais() {
        return nomePais;
    }

    public ArrayList<Lanche> getLanches() {
        return lanches;
    }
}
