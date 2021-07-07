package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import org.openqa.selenium.WebDriver;
import paginas.PaginaResultado;
import utils.GlobalDriver;

public class ResultadosSteps extends GlobalDriver {
    public WebDriver navegador = getNavegador();
    private PaginaResultado paginaResultado = new PaginaResultado(navegador);

    public ResultadosSteps() {
    }

    @Dado("que estou na pagina de resultados")
    public void que_estou_na_pagina_de_resultados() {
        paginaResultado.verificarWidget();
    }
    @Entao("verificar {string} presente na tela")
    public void verificar_presente_na_tela(String titulo) {
        paginaResultado.verificarTitulo(titulo);
    }
    @Entao("clicar na seta para voltar para página inicial")
    public void clicar_na_seta_para_voltar_para_página_inicial() throws InterruptedException {
        paginaResultado.clicarSetaVoltar();
    }

    @Então("fechar navegador")
    public void fecharNavegador() {
        paginaResultado.fechar();
    }
}
