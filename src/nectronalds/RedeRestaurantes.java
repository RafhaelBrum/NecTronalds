package nectronalds;

import java.util.ArrayList;

public class RedeRestaurantes {

    private String nome;
    private ArrayList<Restaurante> restaurantes;
    private ArrayList<Cardapio> cardapios;

    public RedeRestaurantes(String nome) {
        this.nome = nome;
        this.restaurantes = new ArrayList<>();
        this.cardapios = new ArrayList<>();
    }

    public void AdicionarRestaurante(Restaurante r) {
        this.restaurantes.add(r);
    }

    public void RemoverRestaurante(Restaurante r) {
        this.restaurantes.remove(r);
    }

    public void AdicionarCardapio(Cardapio c) {
        this.cardapios.add(c);
    }

    public void RemoverCardapio(Cardapio c) {
        this.cardapios.remove(c);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public ArrayList<Cardapio> getCardapiosPais() {
        return cardapios;
    }
}
