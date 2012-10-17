package com.selenium.telas.google;

/**
 *
 * @author Rodolfo
 */

import org.openqa.selenium.WebDriver;

import com.selenium.SeleniumWebDriver;

public class TelaResultadosBusca {

	private SeleniumWebDriver selenium;

	public TelaResultadosBusca(WebDriver driver) {
		this.selenium = new SeleniumWebDriver(driver);
	}

	public String entrarResultados() {
		selenium.click(localizarResultadoN(1));
		return selenium.getTitle();
	}

	public String localizarResultadoN(int n) {
		return "li:nth-of-type(" + n + ").g a";
	}

}
