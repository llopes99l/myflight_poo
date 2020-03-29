import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> lista;

    //Construtor inicializa a lista de aeronaves
    public GerenciadorAeronaves(){
        lista = new ArrayList<>();
    }

    public void adicionar(String codigo, String descricao) {
        lista.add(new Aeronave(codigo, descricao) );
    }

    public Aeronave buscarPorCodigo(String codigo){
        for (Aeronave a: lista) {
            if (a.getCodigo() == codigo){
                return a;
            }
        }
        return null;
    }

    public String listarTodas(){
        String aux = "\nAERONAVES CADASTRADAS\n-----------------------------\n";
        for (Aeronave a: lista ) {
            aux = aux + a.toString();
        }
        return aux;
    }

}
