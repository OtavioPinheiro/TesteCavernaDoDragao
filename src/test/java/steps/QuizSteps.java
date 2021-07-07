package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.WebDriver;
import paginas.PaginaQuiz;
import utils.GlobalDriver;

public class QuizSteps extends GlobalDriver {
    public WebDriver navegador = getNavegador();
    private PaginaQuiz paginaQuiz = new PaginaQuiz(navegador);

    public QuizSteps() {
    }

    @Dado("que o titulo {string} esteja na tela")
    public void que_o_titulo_esta_na_tela(String titulo) throws InterruptedException {
        paginaQuiz.verificarTitulo(titulo);
    }
    @Entao("clicar na alternativa {string}")
    public void clicar_na_alternativa(String resposta) throws InterruptedException {
        paginaQuiz.clicarResposta(resposta);
    }
    @Entao("clicar em {string}")
    public void clicar_em(String confirmar) throws InterruptedException {
        paginaQuiz.clicarConfirmar(confirmar);
    }
}
