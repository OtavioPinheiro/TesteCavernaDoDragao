package paginas;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaQuiz {
    public WebDriver navegador;

    public PaginaQuiz(WebDriver navegador) {
        this.navegador = navegador;
        PageFactory.initElements(navegador, this);
    }

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 1 de 15')]")
    @CacheLookup
    WebElement xpathPergunta1;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 2 de 15')]")
    @CacheLookup
    WebElement xpathPergunta2;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 3 de 15')]")
    @CacheLookup
    WebElement xpathPergunta3;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 4 de 15')]")
    @CacheLookup
    WebElement xpathPergunta4;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 5 de 15')]")
    @CacheLookup
    WebElement xpathPergunta5;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 6 de 15')]")
    @CacheLookup
    WebElement xpathPergunta6;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 7 de 15')]")
    @CacheLookup
    WebElement xpathPergunta7;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 8 de 15')]")
    @CacheLookup
    WebElement xpathPergunta8;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 9 de 15')]")
    @CacheLookup
    WebElement xpathPergunta9;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 10 de 15')]")
    @CacheLookup
    WebElement xpathPergunta10;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 11 de 15')]")
    @CacheLookup
    WebElement xpathPergunta11;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 12 de 15')]")
    @CacheLookup
    WebElement xpathPergunta12;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 13 de 15')]")
    @CacheLookup
    WebElement xpathPergunta13;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 14 de 15')]")
    @CacheLookup
    WebElement xpathPergunta14;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 15 de 15')]")
    @CacheLookup
    WebElement xpathPergunta15;

    @FindBy(xpath = "//label[contains(text(), 'um jogo de RPG chamado Dungeons and Dragons')]")
    @CacheLookup
    WebElement xpathResposta1;

    @FindBy(xpath = "//label[contains(text(), 'Hank, Bobby, Eric, Presto, Sheila e Diana')]")
    @CacheLookup
    WebElement xpathResposta2;

    @FindBy(xpath = "//label[contains(text(), 'Hank')]")
    @CacheLookup
    WebElement xpathResposta3;

    @FindBy(xpath = "//label[contains(text(), 'Era a unicórnio que sempre andava ao lado de Bobby')]")
    @CacheLookup
    WebElement xpathResposta4;

    @FindBy(xpath = "//label[contains(text(), 'Era o principal antagonista da série. " +
            "Era um feiticeiro maléfico com grandes habilidades místicas.')]")
    @CacheLookup
    WebElement xpathResposta5;

    @FindBy(xpath = "//label[contains(text(), 'Nenhum dos protagonistas principais empunhava uma espada')]")
    @CacheLookup
    WebElement xpathResposta6;

    @FindBy(xpath = "//label[contains(text(), 'Era a acrobata e possuia um bastão mágico como arma')]")
    @CacheLookup
    WebElement xpathResposta7;

    @FindBy(xpath = "//label[contains(text(), 'Era uma das antagonistas da série. " +
            "Era uma Deusa Dragoa de cinco cabeças e guardiã do cemitério dos dragões')]")
    @CacheLookup
    WebElement xpathResposta8;

    @FindBy(xpath = "//label[contains(text(), 'Era a irmã mais velha do Bobby e usava uma capa da invisibilidade')]")
    @CacheLookup
    WebElement xpathResposta9;

    @FindBy(xpath = "//label[contains(text(), 'Era um poderoso mago e guia para os protagonistas, " +
            "lhes dando armas no início da aventura e tentando ajudá-los a voltar para casa')]")
    @CacheLookup
    WebElement xpathResposta10;

    @FindBy(xpath = "//label[contains(text(), 'Eric, Diana, Bobby e Presto')]")
    @CacheLookup
    WebElement xpathResposta11;

    @FindBy(xpath = "//label[contains(text(), '27 episódios e 3 temporadas')]")
    @CacheLookup
    WebElement xpathResposta12;

    @FindBy(xpath = "//label[contains(text(), 'Entraram em um portal que apareceu durante o passeio na montanha russa')]")
    @CacheLookup
    WebElement xpathResposta13;

    @FindBy(xpath = "//label[contains(text(), 'Em 1986')]")
    @CacheLookup
    WebElement xpathResposta14;

    @FindBy(xpath = "//label[contains(text(), 'Vingador')]")
    @CacheLookup
    WebElement xpathResposta15;

    //form[contains(@class, 'AlternativesForm')]
    //button[contains(@type, 'submit')]
    @FindBy(xpath = "//button[contains(text(), 'Confirmar')]")
    @CacheLookup
    WebElement xpathBotaoConfirmar;

    @FindBy(xpath = "//form[contains(@class, 'AlternativesForm')]")
    @CacheLookup
    WebElement xpathForms;

    public void verificarTitulo(String titulo) throws InterruptedException {
        switch (titulo) {
            case "Pergunta 1 de 15":
                Assert.assertEquals(titulo, xpathPergunta1.getText());
                Thread.sleep(1000);
                break;
            case "Pergunta 2 de 15":
                Assert.assertEquals(titulo, xpathPergunta2.getText());
                Thread.sleep(1000);
                break;
            case "Pergunta 3 de 15":
                Assert.assertEquals(titulo, xpathPergunta3.getText());
                Thread.sleep(1000);
                break;
            case "Pergunta 4 de 15":
                Assert.assertEquals(titulo, xpathPergunta4.getText());
                Thread.sleep(1000);
                break;
            case "Pergunta 5 de 15":
                Assert.assertEquals(titulo, xpathPergunta5.getText());
                Thread.sleep(1000);
                break;
            case "Pergunta 6 de 15":
                Assert.assertEquals(titulo, xpathPergunta6.getText());
                Thread.sleep(1000);
                break;
            case "Pergunta 7 de 15":
                Assert.assertEquals(titulo, xpathPergunta7.getText());
                Thread.sleep(1000);
                break;
            case "Pergunta 8 de 15":
                Assert.assertEquals(titulo, xpathPergunta8.getText());
                Thread.sleep(1000);
                break;
            case "Pergunta 9 de 15":
                Assert.assertEquals(titulo, xpathPergunta9.getText());
                Thread.sleep(1000);
                break;
            case "Pergunta 10 de 15":
                Assert.assertEquals(titulo, xpathPergunta10.getText());
                Thread.sleep(1000);
                break;
            case "Pergunta 11 de 15":
                Assert.assertEquals(titulo, xpathPergunta11.getText());
                Thread.sleep(1000);
                break;
            case "Pergunta 12 de 15":
                Assert.assertEquals(titulo, xpathPergunta12.getText());
                Thread.sleep(1000);
                break;
            case "Pergunta 13 de 15":
                Assert.assertEquals(titulo, xpathPergunta13.getText());
                Thread.sleep(1000);
                break;
            case "Pergunta 14 de 15":
                Assert.assertEquals(titulo, xpathPergunta14.getText());
                Thread.sleep(1000);
                break;
            case "Pergunta 15 de 15":
                Assert.assertEquals(titulo, xpathPergunta15.getText());
                Thread.sleep(1000);
                break;
            default:
                break;
        }
    }

    public void clicarResposta(String resposta) throws InterruptedException {
        switch (resposta) {
            case "um jogo de RPG chamado Dungeons and Dragons":
                xpathResposta1.click();
                Thread.sleep(2000);
                break;
            case "Hank, Bobby, Eric, Presto, Sheila e Diana":
                xpathResposta2.click();
                Thread.sleep(2000);
                break;
            case "Hank":
                xpathResposta3.click();
                Thread.sleep(2000);
                break;
            case "Era a unicórnio que sempre andava ao lado de Bobby":
                xpathResposta4.click();
                Thread.sleep(2000);
                break;
            case "Era o principal antagonista da série. Era um feiticeiro maléfico com grandes habilidades místicas.":
                xpathResposta5.click();
                Thread.sleep(2000);
                break;
            case "Nenhum dos protagonistas principais empunhava uma espada":
                xpathResposta6.click();
                Thread.sleep(2000);
                break;
            case "Era a acrobata e possuia um bastão mágico como arma":
                xpathResposta7.click();
                Thread.sleep(2000);
                break;
            case "Era uma das antagonistas da série. " +
                    "Era uma Deusa Dragoa de cinco cabeças e guardiã do cemitério dos dragões":
                xpathResposta8.click();
                Thread.sleep(2000);
                break;
            case "Era a irmã mais velha do Bobby e usava uma capa da invisibilidade":
                xpathResposta9.click();
                Thread.sleep(2000);
                break;
            case "Era um poderoso mago e guia para os protagonistas, " +
                    "lhes dando armas no início da aventura e tentando ajudá-los a voltar para casa":
                xpathResposta10.click();
                Thread.sleep(2000);
                break;
            case "Eric, Diana, Bobby e Presto":
                xpathForms.click();
                xpathResposta11.click();
                Thread.sleep(2000);
                break;
            case "27 episódios e 3 temporadas":
                xpathResposta12.click();
                Thread.sleep(2000);
                break;
            case "Entraram em um portal que apareceu durante o passeio na montanha russa":
                xpathResposta13.click();
                Thread.sleep(2000);
                break;
            case "Em 1986":
                xpathResposta14.click();
                Thread.sleep(2000);
                break;
            case "Vingador":
                xpathResposta15.click();
                Thread.sleep(2000);
                break;
            default:
                break;
        }
    }

    public void clicarConfirmar(String confirmar) throws InterruptedException {
        xpathBotaoConfirmar.click();
        Thread.sleep(6000);
    }
}
