import java.util.ArrayList;
import java.util.List;

public class EscolaListas implements Cadastro {
    private List<Escola> listaescola;

    Gravador gravarEsc = new Gravador();

    public EscolaListas() {
        try {
            this.listaescola = gravarEsc.lerEscolas();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            this.listaescola = new ArrayList<>();

        }

    }

   
    @Override
    public boolean ApagarUmaEscola(Escola escola){
        for (int k = 0; k <= listaescola.size(); k++) {
            if (listaescola == getListaescola()) {
                listaescola.remove(escola);
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean cadastrarUmaEscola(Escola escola) {
        listaescola.add(escola);
        return true;
    }

    public List<Escola> getListaescola() {
        return listaescola;
    }

    public void salvarEscola(List<Escola> escola) {
        try {
            this.gravarEsc.gravarEscolas(escola);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public Escola  procurarUmaEscolaPeloNome(String escolas)
            throws EscolaNaoEncontrada{
        for (Escola k : listaescola){
            if(k.getNomeEscola().equals(escolas)){
                return k;
            }
        }
        throw new EscolaNaoEncontrada("Escola não escontrada");
    }
    @Override
    public Escola  procurarUmaEscolaPeloendereco(String escolas)
            throws EscolaNaoEncontrada{
        for (Escola k : listaescola){
            if(k.getEndereco().equals(escolas)){
                return k;
            }
        }
        throw new EscolaNaoEncontrada("Escola não escontrada");
    }
    @Override
    public Escola  procurarUmaEscolaPeloValorDaMatricula(double escolas)
            throws EscolaNaoEncontrada{
        for (Escola k : listaescola){
            if(k.getValorMatricula() == escolas){
                return k;
            }
        }
        throw new EscolaNaoEncontrada("Escola não escontrada");
    }
    @Override
    public Escola  procurarUmaEscolaPeloValorDaMensalidade(double escolas)
            throws EscolaNaoEncontrada{
        for (Escola k : listaescola){
            if(k.getValorMensalidade() == escolas){
                return k;
            }
        }
        throw new EscolaNaoEncontrada("Escola não escontrada");
    }
    @Override
    public Escola  procurarUmaEscolaPelasDimensões(double escolas)
            throws EscolaNaoEncontrada{
        for (Escola k : listaescola){
            if(k.getDimensoesColegio() == escolas){
                return k;
            }
        }
        throw new EscolaNaoEncontrada("Escola não escontrada");
    }
    @Override
    public Escola  procurarUmaEscolaPelaEscolaridadeAbrangente(String escolas)
            throws EscolaNaoEncontrada{
        for (Escola k : listaescola){
            if(k.getEscolaridadeQueOColegioAbrange().equals(escolas)){
                return k;
            }
        }
        throw new EscolaNaoEncontrada("Escola não escontrada");
}
}
