package pucrs.myflight.modelo;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorVoos {

    private ArrayList<Voo> voos;

    public GerenciadorVoos() {
        voos = new ArrayList<>();
    }

    public void adicionar(Rota rota, LocalDateTime datahora, Duration duracao) {
        voos.add(new Voo(rota, datahora, duracao));
    }

    public Voo buscarPorRota(Rota Umrota) {
        for (Voo a : voos) {
            if (a.getRota() == Umrota) {
                return a;
            }
        }
        return null;
    }

    public Voo buscaPorDataHora(LocalDateTime UmDataHora) {
        for (Voo a : voos) {
            if (a.getDatahora() == UmDataHora) {
                return a;
            }
        }
        return null;
    }

    public Voo buscaPorDuracao(Duration UmDuracao) {
        for (Voo a : voos) {
            if (a.getDuracao() == UmDuracao) {
                return a;
            }
        }
        return null;
    }

    public String listarTodas(){
        String aux = "\nROTAS CADASTRADAS\n-----------------------------\n" ;
        for (Voo d: voos ) {
            aux = aux + d.toString() + "\n";
        }
        return aux;
    }
}




