import java.io.Serializable;
import java.util.Objects;

public class Escola implements Serializable {
    private String nomeEscola;
    private String endereco;
    private double valorMatricula;
    private double valorMensalidade;
    private double dimensoesColegio;
    private String escolaridadeQueOColegioAbrange;

    public Escola(String nomeEscola, String endereco, double valorMatricula, double valorMensalidade, double dimensoesColegio, String escolaridadeQueOColegioAbrange) {
        this.nomeEscola = nomeEscola;
        this.endereco = endereco;
        this.valorMatricula = valorMatricula;
        this.valorMensalidade = valorMensalidade;
        this.dimensoesColegio = dimensoesColegio;
        this.escolaridadeQueOColegioAbrange = escolaridadeQueOColegioAbrange;
}
    
    public String getNomeEscola() {
        return this.nomeEscola;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public double getValorMatricula() {
        return this.valorMatricula;
    }

    public double getValorMensalidade() {
        return this.valorMensalidade;
    }

    public double getDimensoesColegio() {
        return this.dimensoesColegio;
    }

    public String getEscolaridadeQueOColegioAbrange() {
        return this.escolaridadeQueOColegioAbrange;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setValorMatricula(double valorMatricula) {
        this.valorMatricula = valorMatricula;
    }

    public void setValorMensalidade(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public void setDimensoesColegio(double dimensoesColegio) {
        this.dimensoesColegio = dimensoesColegio;
    }

    public void setEscolaridadeQueOColegioAbrange(String escolaridade_que_o_colegio_abrange) {
        this.escolaridadeQueOColegioAbrange = escolaridade_que_o_colegio_abrange;
    }

    @Override
    public String toString() {
        return "Escola{" +
                "nome=" + this.nomeEscola +
                ", endereço='" + this.endereco + '\'' +
                ", Valor da matricula='" + this.valorMatricula+ '\'' +
                ", valor da mensalidade='" + this.valorMensalidade + '\'' +
                ", dimensões do escola=" + this.dimensoesColegio +
                ", preço=" + this.escolaridadeQueOColegioAbrange + '\''+
                '}';
    }
      
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Escola escola = (Escola) o;
        return nomeEscola == escola.nomeEscola && Object.equals(endereco, escola.endereco) && Double.compare(getValorMatricula(), escola.valorMatricula) == 0 && Double.compare(getValorMensalidade(), escola.valorMensalidade) == 0 && Double.compare(getDimensoesColegio(), escola.getDimensoesColegio()) == 0 && Object.equals(getEscolaridadeQueOColegioAbrange(), escola.escolaridadeQueOColegioAbrange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeEscola, endereco, valorMatricula, valorMensalidade,dimensoesColegio,escolaridadeQueOColegioAbrange);
    }
}
