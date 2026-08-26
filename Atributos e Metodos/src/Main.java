public class Main {
    public static void main(String[] args) {

        Loja lojaDorinhos = new Loja("Dorinho's", "São José dos Campos");
        lojaDorinhos.abrir();
        lojaDorinhos.exibirStatus();

        Terno ternoSlim = new Terno("Azul Marinho", "M", 650.00);
        ternoSlim.aplicarDesconto(15);
        ternoSlim.exibirInfo();

        Manequim manequimEntrada = new Manequim("Fachada", "Terno Completo");
        manequimEntrada.alternarDestaque();
        System.out.println("Manequim em destaque: " + manequimEntrada.isEmDestaque());

        System.out.println("------------------------------------");

        Ciclista ciclistaUm = new Ciclista("Carlos", 30);
        ciclistaUm.pedalar();

        Bicicleta bikeTrilha = new Bicicleta("Caloi Mountain Bike", 3, 15.0);
        bikeTrilha.acelerar(5.5);
        bikeTrilha.mudarMarcha(4);
        System.out.println("Velocidade da Bike: " + bikeTrilha.getVelocidade() + " km/h");

        Trilha trilhaMata = new Trilha("Terra batida com cascalho", 18.0, "Moderada");
        trilhaMata.iniciarPercurso();
        System.out.println("Tempo estimado de viagem: " + trilhaMata.calcularTempoEstimado() + " horas.");

        System.out.println("------------------------------------");

        Mascara mascaraEtnica = new Mascara("Madeira Entalhada", "Tribal Africana");
        mascaraEtnica.expor();
        mascaraEtnica.restaurar();

        Escultura totem = new Escultura("Escultura em Relevo", 45.0, 4.2);
        totem.mover("Setor Norte do Museu");
        System.out.println("Valor estimado do totem: R$ " + totem.avaliarValor());

        Painel painelPalha = new Painel("Trança de Bambu");
        painelPalha.adicionarItem();
        painelPalha.adicionarItem();
        System.out.println("Total de itens fixados no painel: " + painelPalha.getQuantidadeItens());

        System.out.println("------------------------------------");

        Traco tracoNanquim = new Traco(0.3, "Preto Nanquim", false);
        tracoNanquim.engrossar(0.2);
        tracoNanquim.suavizar();
        System.out.println("Espessura final do traço: " + tracoNanquim.getEspessuraMm() + "mm");

        ModeloCabelo cabeloSpiky = new ModeloCabelo("Anime Spiky", "Curto", false);
        cabeloSpiky.pentear();
        cabeloSpiky.tingir("Preto");

        Referencia refDesenho = new Referencia("Pinterest - Prancha de Cabelos Manga", "Anatomia / Cabelos", true);
        refDesenho.carregar();
        refDesenho.aplicarFiltro("Escala de Cinza");
        refDesenho.exibirDetalhes();
    }
}