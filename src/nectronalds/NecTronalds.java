package nectronalds;

public class NecTronalds {

    public static void main(String[] args) {
///////////////////////////////////////////////////////////////        
/////////////////////// CRIANDO LANCHES ///////////////////////
        Lanche necFeijoada = new Lanche("NecFeijoada",
                "Lanche de feijoada", 5f);
        Lanche necBacon = new Lanche("NecBacon",
                "Lanche de Bacon", 7f);
        Lanche necAcaraje = new Lanche("NecAcarajé",
                "Lanche de Acarajé", 6.5f);
        Lanche necPicanha = new Lanche("NecPicanha",
                "Lanche de Picanha", 8f);
        Lanche necChimichurri = new Lanche("NecChimichurri",
                "Lanche de Chimichurri", 7f);
        Lanche necCheddar = new Lanche("NecCheddar",
                "Lanche de Cheddar", 6.5f);
        Lanche necSushi = new Lanche("NecSushi",
                "8un. Sushi", 7f);
///////////////////////////////////////////////////////////////
////////////// ADICIONANDO LANCHES AOS CARDAPIOS //////////////
        Cardapio cp1 = new Cardapio("Brasil");
        cp1.AdicionarLanche(necFeijoada);
        cp1.AdicionarLanche(necBacon);
        cp1.AdicionarLanche(necAcaraje);
        cp1.AdicionarLanche(necPicanha);

        Cardapio cp2 = new Cardapio("Argentina");
        cp2.AdicionarLanche(necPicanha);
        cp2.AdicionarLanche(necChimichurri);

        Cardapio cp3 = new Cardapio("EUA");
        cp3.AdicionarLanche(necBacon);
        cp3.AdicionarLanche(necCheddar);

        Cardapio cp4 = new Cardapio("Japão");
        cp4.AdicionarLanche(necSushi);
        cp4.AdicionarLanche(necCheddar);

///////////////////////////////////////////////////////////////
        Restaurante r1 = new Restaurante(
                "Restaurante BR", cp1,
                "Rua Belem 844 Londrina");
        Restaurante r2 = new Restaurante(
                "Restaurante AR", cp2, "Rua Los Hermanos");
        Restaurante r3 = new Restaurante(
                "Restaurante EUA", cp3, "Av. NY 5");
        Restaurante r4 = new Restaurante(
                "Restaurante Japão", cp3, "Av Godzilla HK");

        RedeRestaurantes rr = new RedeRestaurantes("NecTronalds");
        rr.AdicionarRestaurante(r1);
        rr.AdicionarRestaurante(r2);
        rr.AdicionarRestaurante(r3);
        rr.AdicionarRestaurante(r4);
        rr.AdicionarCardapio(cp1);
        rr.AdicionarCardapio(cp2);
        rr.AdicionarCardapio(cp3);
        rr.AdicionarCardapio(cp4);

        mostrarCardapio(cp1);
        mostrarCardapio(cp2);
        mostrarCardapio(cp3);
        mostrarCardapio(cp4);

        mostrarTodosCardapios(rr);

    }

    public static void mostrarLanche(Lanche l) {
        System.out.println(l.getNome() + " "
                + l.getPreco() + " " + l.getDescricao());
    }

    public static void mostrarCardapio(Cardapio cp) {
        System.out.println(cp.getNomePais());
        for (Lanche l : cp.getLanches()) {
            mostrarLanche(l);
        }
    }

    public static void mostrarCardapio(
            RedeRestaurantes rr,
            String nome) {
        for (Cardapio cp : rr.getCardapiosPais()) {
            if (cp.getNomePais().equals(nome)) {
                mostrarCardapio(cp);
            }
        }
    }

    public static void mostrarTodosCardapios(
            RedeRestaurantes rr) {
        for (Cardapio cp : rr.getCardapiosPais()) {
            mostrarCardapio(cp);
        }
    }
}
