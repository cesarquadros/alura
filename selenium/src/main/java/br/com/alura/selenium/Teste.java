package br.com.alura.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste {

	public static void main(String[] args) {

	    // abre firefox
	    WebDriver driver = new ChromeDriver();

	    // acessa o site do google
	    driver.get("http://localhost:9000/listaconvidados");

	    // digita no campo com nome "q" do google
	    WebElement campoDeTexto = driver.findElement(By.name("nome"));
	    WebElement campoDeTexto1 = driver.findElement(By.name("email"));
	    WebElement campoDeTexto2 = driver.findElement(By.name("telefone"));
	    campoDeTexto.sendKeys("Corinthians");
	    campoDeTexto1.sendKeys("Corinthians@email");
	    campoDeTexto2.sendKeys("111111111111");
	    // submete o form
	    campoDeTexto.submit();
	}
}
