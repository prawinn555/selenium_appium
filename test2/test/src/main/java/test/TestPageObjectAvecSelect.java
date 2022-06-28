package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestPageObjectAvecSelect {
	@Test
	public void test() {
// instanciation du driver
		System.setProperty("webdriver.gecko.driver",  "C:\\Users\\Formation\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
// accès à l'url de l'application
	    driver.get("https://petstore.octoperf.com/actions/Catalog.action");
// instanciation de la pageIndex
		PageIndex page_index = PageFactory.initElements(driver, PageIndex.class);
// appel de la méthode "clicSignInButton" --> instanciation de la page de connexion
		PageLogin page_login = page_index.clicSignInButton(driver);
// appel de la méthode "logIn" --> instanciation de la page d'accueil
		PageAccueil page_accueil = page_login.logIn(driver, "j2ee", "j2ee");

		
		page_accueil.goToAccount(driver);
		page_accueil.showInput(driver);
	}
}