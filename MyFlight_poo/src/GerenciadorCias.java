import java.util.ArrayList;

public class GerenciadorCias {
    private ArrayList<CiaAerea> empresas;

    public GerenciadorCias(){
        empresas = new ArrayList<>();
    }

    public void adicionar(String codigo, String nome) {
        empresas.add(new CiaAerea(codigo, nome) );
    }

    public CiaAerea buscarPorCodigo(String codigo){
        for (CiaAerea c: empresas) {
            if (c.getCodigo() == codigo){
                return c;
            }
        }
        return null;
    }

    public CiaAerea buscarPorNome(String nome){
        for (CiaAerea n: empresas) {
            if (n.getNome() == nome){
                return n;
            }
        }
        return null;
    }

    public String listarTodas(){
        String aux = "\nCIAS AÉREAS CADASTRADAS\n-----------------------------\n" ;
        for (CiaAerea c: empresas ) {
            aux = aux + c.toString() + "\n";
        }
        return aux;
    }
}