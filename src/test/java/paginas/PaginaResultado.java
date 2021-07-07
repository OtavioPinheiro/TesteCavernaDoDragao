package paginas;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaResultado {
    public WebDriver navegador;

    public PaginaResultado(WebDriver navegador) {
        this.navegador = navegador;
        PageFactory.initElements(navegador, this);
    }

    @FindBy(xpath = "//div[contains(@class, 'Widget__Content')]")
    @CacheLookup
    WebElement xpathWidgetContent;

    @FindBy(xpath = "//h3[contains(text(), 'Tela de Resultado:')]")
    @CacheLookup
    WebElement xpathTituloResultado;

    @FindBy(xpath = "//a[contains(@class, 'BackLinkArrow')]")
    @CacheLookup
    WebElement xpathVoltar;

    public void verificarWidget() {
        xpathWidgetContent.isDisplayed();
    }

    public void verificarTitulo(String titulo) {
        xpathTituloResultado.isDisplayed();
        Assert.assertEquals(titulo, xpathTituloResultado.getText());
    }

    public void clicarSetaVoltar() throws InterruptedException {
        xpathVoltar.click();
        Thread.sleep(4000);
    }

    public void fechar() {
        navegador.close();
    }
}
