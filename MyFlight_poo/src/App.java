public class App {
    public static void main(String[] args) {

        //Cadastro Aeronaves
        GerenciadorAeronaves cadAeronave = new GerenciadorAeronaves();

        cadAeronave.adicionar("737", "Boeing 737-300");
        cadAeronave.adicionar("73G", "Boeing 737-700");
        cadAeronave.adicionar("380", "Airbus Industrie A380");
        cadAeronave.adicionar("764", "Boeing 767-400");

        System.out.println(cadAeronave.listarTodas());

        /////////////////////////////////////////////////
        //Cadastro Aeroportos
        GerenciadorAeroportos cadAeroporto = new GerenciadorAeroportos();

        cadAeroporto.adicionar("POA", "Salgado Filho International Airport",
                                new Geo(-29.9939,-51.1711));
        cadAeroporto.adicionar("GRU", "São Paulo Guarulhos International Airport",
                                new Geo(-23.4356,-46.4731));
        cadAeroporto.adicionar("LIS", "Lisbon",
                                new Geo(38.7742,-9.1342));
        cadAeroporto.adicionar("MIA", "Miami International Airport",
                                new Geo(25.7933,-80.2906));

        System.out.println(cadAeroporto.listarTodos());

        /////////////////////////////////////////////////
        //Cadastro Aeroportos
        GerenciadorCias cadCias = new GerenciadorCias();

        cadCias.adicionar("JJ", "LATAM Linhas Aéreas\t");
        cadCias.adicionar("G3", "Gol Linhas Aéreas SA");
        cadCias.adicionar("TP", "TAP Portugal");
        cadCias.adicionar("AD", "Azul Linhas Aéreas");

        System.out.println(cadCias.listarTodas());

    }

}
