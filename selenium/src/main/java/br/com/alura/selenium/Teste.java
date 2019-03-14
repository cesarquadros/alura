package br.com.alura.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Teste {
	
		
	public static void main(String... args) {
		
		

		// abre firefox
		WebDriver driver = new ChromeDriver();

		// acessa o site do google
		driver.get("https://trabalhador.certponto.com.br");

		// digita no campo com nome "q" do google
		WebElement btnAcessar = driver.findElement(By.className("btn btn-primary button-btn-access"));
//		campoDeTexto.sendKeys("teste-selenium");
		
		btnAcessar.click();
		
		// submete o form
//		campoDeTexto.submit();
		
//		boolean achou = driver.getPageSource().contains("Teste selenium");
//		
//		WebElement textArea = driver.findElement(By.id("text"));
//		
//		System.out.println(textArea.getText());
//		
//		if(achou) {
//			driver.close();
//		}
		
		//verificar se contem na pagina um determinado texto
//		boolean achouNome = driver.getPageSource().contains("Ronaldo Luiz de Albuquerque");

		// selecionar combobox
//	    Select usuario = new Select(driver.findElement(By.name("leilao.usuario.id"))); captura o elemento
//	    usuario.selectByVisibleText("João"); seleciona a opcao do combobox

		// selecionar check box
//	    WebElement usado = driver.findElement(By.name("leilao.usado"));
//	    usado.click();

		//pegar lista de elementos por posicao
//		int posicao = 1; // 1o link
//		List<WebElement> elementos = driver.findElements(By.linkText("exibir"));
//		elementos.get(posicao - 1).click();

	}
}
