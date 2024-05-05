import jdk.incubator.vector.DoubleVector;
import javax.swing.*;
import java.util.Objects;
import static java.lang.Double.parseDouble;
import java.util.List;

public class Main {
    public static void main(String[] args) throws EscolaNaoEncontrada {

        EscolaListas  listaescola  = new EscolaListas();


        String opcoes = """
                1.Cadastrar uma escola
                2.Remover uma escola
                3.Pesquisar uma escola
                4.Sair
                """;

        String opcao = JOptionPane.showInputDialog(opcoes);

        switch (opcao) {
            case "1":
                String nome = JOptionPane.showInputDialog("Informe o nome da escola");
                String endereco = JOptionPane.showInputDialog("Informe o Enderço da escola");
                Double matricula = Double.parseDouble(JOptionPane.showInputDialog("Informe o  valor da matricula escolar"));
                Double mensalidade = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da mensalidade escolar"));
                Double tamanho = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho da escola"));
                String escolaridade = JOptionPane.showInputDialog("Informe ate que ano o colegio abrange");
                String continuar = JOptionPane.showInputDialog("Essa é sua escola? (S/N)");
                if(continuar == "S" ){
                    listaescola.cadastrarUmaEscola(nome, endereco, matricula, mensalidade, tamanho, escolaridade);
                    JOptionPane.showMessageDialog(null, "Escola cadastrada!");
                }
            case "2":
                String apagador = JOptionPane.showInputDialog("Você deseja apagar uma escola?(S/N)");
                if(apagador == "S"){
                    String Apagar = JOptionPane.showInputDialog("Informe o nome da escola que deseja apagar de nosso banco de dados:");
                    listaescola.ApagarUmaEscola(Apagar);
                }
                break;
            case "3":
                String opcoes2 = """
                    1.Pesquisar por nome
                    2.Pesquisar por enderço
                    3.Pesquisar por valor da matricula
                    4.Pesquisar por valor da mensalidade
                    5.Pesquisar por tamanho da escola
                    6.Pesquisar pela serie que ensina
                    7.sair.
                    """;

                String opcao2 = JOptionPane.showInputDialog(opcoes2) ;

                switch (opcao2){
                    case "1" :
                        String pesquisaNome = JOptionPane.showInputDialog("Digite o nome da escola que deseja encontrar");
                        Escola Encontrounome = listaescola.procurarUmaEscolaPeloNome(pesquisaNome);
                        JOptionPane.showMessageDialog(null, "Nome da escola:" + Encontrounome.toString());
                    case "2" :
                        String pesquisaEndereco = JOptionPane.showInputDialog("Pesquisar por enderço");
                        Escola Encontrouendereço = listaescola.procurarUmaEscolaPeloendereco(pesquisaEndereco);
                    case "3" :
                        String pesquisaMatricula = JOptionPane.showInputDialog("Pesquisar por valor da matricula");
                        Double pesquisaMartriculaDouble = Double.parseDouble(pesquisaMatricula);
                        Escola EncontrouUmaMatricula = listaescola.procurarUmaEscolaPeloValorDaMatricula(pesquisaMartriculaDouble);
                    case "4" :
                        String pesquisaMensalidade = JOptionPane.showInputDialog("Pesquisar por valor da mensalidade");
                        Double pesquisaMensalidadeDouble = Double.parseDouble(pesquisaMensalidade);
                        Escola EncontrouUmaMensalidade = listaescola.procurarUmaEscolaPeloValorDaMensalidade(pesquisaMensalidadeDouble);
                    case "5" :
                        String pesquisaDimensoes = JOptionPane.showInputDialog("Pesquisar por tamanho da escola");
                        Double pesquisaDimensoesDouble = Double.parseDouble(pesquisaDimensoes);
                        Escola EncontrouUmTamanho = listaescola.procurarUmaEscolaPelasDimensões(pesquisaDimensoesDouble);
                    case "6" :
                        String pesquisaEscolaridade = JOptionPane.showInputDialog("Pesquisar pela serie que ensina");
                        Escola EncontrouUmaEscolaridade = listaescola.procurarUmaEscolaPelaEscolaridadeAbrangente(pesquisaEscolaridade);
                    case "7" :
                        String goout = JOptionPane.showInputDialog("deseja sair?(S/N)");
                        if(goout == "S"){
                            break;
                        }
                }
            case "4":
                String finalizar = JOptionPane.showInputDialog("Deseja sair?(S/N)");
                if(finalizar == "S"){
                    break;
                }

        }
    }
}
