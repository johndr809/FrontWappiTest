package com.wolox.certificacion.questions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public class JavaScriptText implements Question<String>{

	
	private Target target;
	
	public JavaScriptText(Target target) {
	this.target=target;
	}
	

	@Override
	public String answeredBy(Actor actor) {
		WebDriver driver = (WebDriver) BrowseTheWeb.as(actor).getDriver();
		WebElement element = driver.findElement(By.xpath(target.getCssOrXPathSelector()));
		
		JavascriptExecutor js = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
		return (String) js.executeScript("return arguments[0].value", element);
	}

	public static JavaScriptText of(Target target) {
		return new JavaScriptText(target);
	}
	
}