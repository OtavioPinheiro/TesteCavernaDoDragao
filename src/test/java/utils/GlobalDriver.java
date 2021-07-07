package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GlobalDriver {
    public static WebDriver navegador;

    public static WebDriver iniciarNavegador() {
        System.setProperty("webdriver.chrome.driver", "D:\\FATEC\\4º semestre\\TDD\\Codigos\\chromedriver.exe");
        navegador = new ChromeDriver();
//        navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return navegador;
    }

    public static WebDriver getNavegador() {
        return navegador;
    }

    public static void setNavegador(WebDriver navegador) {
        GlobalDriver.navegador = navegador;
    }
}
