package paginas;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaPrincipal {
    public WebDriver navegador;

    public PaginaPrincipal(WebDriver navegador) {
        this.navegador = navegador;
        PageFactory.initElements(navegador, this);
    }

    private static String url = "https://cavernadodragaoquiz-otaviopinheiro.vercel.app/";
//    private static String xpathTitulo = "//h1[contains(text(), 'Quiz da Caverna do Dragão')]";
    @FindBy(xpath = "//h1[contains(text(), 'Quiz da Caverna do Dragão')]")
    @CacheLookup
    WebElement xpathTitulo;

    @FindBy(xpath = "//input[contains(@placeholder, 'Informe seu nome')]")
    @CacheLookup
    WebElement xpathCampoNome;
//    private static String xpathCampoNome = "//input[contains(@placeholder, 'Informe seu nome')]";

    @FindBy(xpath = "//button[contains(text(), 'Bora Jogar')]")
    @CacheLookup
    WebElement xpathBotaoJogar;

    public void acessar() throws InterruptedException {
        navegador.get(url);
        Thread.sleep(1000);
    }

    public void verificarTitulo(String titulo) throws InterruptedException {
//        boolean estaNaTela = navegador.findElement(By.xpath(xpathTitulo)).isDisplayed();
        String estaNaTela = xpathTitulo.getText();
        Assert.assertEquals(titulo, estaNaTela);
        Thread.sleep(1000);
    }

    public void completarCampo(String nome) throws InterruptedException {
//        navegador.findElements(By.xpath(xpathCampoNome));
        xpathCampoNome.sendKeys(nome);
        Thread.sleep(1000);
    }

    public void clicarNoBotaoJogar() throws InterruptedException {
        xpathBotaoJogar.click();
        Thread.sleep(3000);
    }
}
