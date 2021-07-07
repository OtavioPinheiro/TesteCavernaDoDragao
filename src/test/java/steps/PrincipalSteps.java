package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import paginas.PaginaPrincipal;
import utils.GlobalDriver;

public class PrincipalSteps extends GlobalDriver {
    public WebDriver navegador = iniciarNavegador();
    private PaginaPrincipal paginaPrincipal;

    public PrincipalSteps() {
    }

    @Dado("que o navegador seja aberto")
    public void queONavegadorSejaAberto() {
        paginaPrincipal = new PaginaPrincipal(navegador);
    }

    @Quando("a pagina do quiz for acessada")
    public void a_pagina_do_quiz_for_acessada() throws InterruptedException {
        paginaPrincipal.acessar();
    }
    @Entao("verificar o titulo do primeiro quadro {string} está presente")
    public void verificar_o_titulo_do_primeiro_quadro_está_presente(String titulo) throws InterruptedException {
        paginaPrincipal.verificarTitulo(titulo);
    }
    @Entao("completar o campo Informe seu nome com o nome {string}")
    public void completar_o_campo_informe_seu_nome_com_o_nome(String nome) throws InterruptedException {
        paginaPrincipal.completarCampo(nome);
    }
    @Entao("clicar no botao para jogar")
    public void clicar_no_botao_para_jogar() throws InterruptedException {
        paginaPrincipal.clicarNoBotaoJogar();
    }
}
