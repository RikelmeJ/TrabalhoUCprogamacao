
public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        Solicitacao solicitacao = new Solicitacao();

        usuario.nome = "Alan Turing";
        usuario.cfp = "157.470.137-90";
        usuario.telefone = "(31)99887654532";
        solicitacao.nomeSolicitante = "Marcos Felipe";
        solicitacao.cpfSolicitante = "915.904.538-15";
        solicitacao.problemaRelatado = "Falta de água na Rua Bom PAstor";
        solicitacao.solucaoProblema = "Enviar um tecnico da copasa na região pra solucionar o problema";


        usuario.cadastrarUsuario();
        usuario.fazerLogin();
        solicitacao.cadatrarSolitacao();
        solicitacao.alterarSolicitacao();
        solicitacao.buscarSolitacao();

    }
}
