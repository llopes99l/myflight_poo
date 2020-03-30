package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;

    public GerenciadorRotas() {
        rotas = new ArrayList<>();
    }
    public void adicionar(CiaAerea cia, Aeroporto origem, Aeroporto destino, GerenciadorCias.Aeronave aeronave) {
        rotas.add(new Rota(cia, origem, destino, aeronave) );
    }

    public Rota buscarPorOrigem(Aeroporto origem) {
        for (Rota a : rotas) {
            if (a.getOrigem() == origem) {
                return a;
            }
        }
        return null;
    }
            public Rota buscarPorDestino(Aeroporto destino){
                for (Rota h: rotas) {
                    if (h.getDestino() == destino){
                        return h;
                    }

                }
        return null;
    }
    public Rota buscarPorCia(CiaAerea cia) {
        for (Rota r: rotas) {
            if (r.getCia() == cia) {
                return r;
            }
        }
        return null;
    }
    public Rota buscarPorAeronave(GerenciadorCias.Aeronave aeronave {
        for (Rota y: rotas) {
            if (y.getAeronave() == aeronave) {
                return y;
            }
        }
        return null;
    }


    public String listarTodas(){
        String aux = "\nROTAS CADASTRADAS\n-----------------------------\n" ;
        for (Rota c: rotas ) {
            aux = aux + c.toString() + "\n";
        }
        return aux;
    }
}

