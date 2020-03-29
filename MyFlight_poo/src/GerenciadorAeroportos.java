import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> lista;

    public GerenciadorAeroportos(){
        lista = new ArrayList<>();
    }

    public void adicionar(String codigo, String nome, Geo geo) {
        lista.add(new Aeroporto(codigo, nome, geo) );
    }

    public Aeroporto buscarPorCodigo(String codigo){
        for (Aeroporto a: lista) {
            if (a.getCodigo() == codigo){
                return a;
            }
        }
        return null;
    }

    public String listarTodos(){
        String aux = "\nAEROPORTOS CADASTRADOS\n-----------------------------\n" ;
        for (Aeroporto a: lista ) {
            aux = aux + a.toString() + "\n";
        }
        return aux;
    }
}
