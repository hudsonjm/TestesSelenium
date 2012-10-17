package com.selenium.testes.google;

/**
 *
 * @author Rodolfo
 */

import org.junit.Before;
import org.junit.Test;

import com.selenium.SeleniumTeste;
import com.selenium.telas.google.TelaBuscaGoogle;

public class BuscaGoogleTeste extends SeleniumTeste {

	@Before
	public void antesTestes() {

	}

	@Test
	public void testandoBuscaAndreAbeVicente() {
		TelaBuscaGoogle telaGoogle = new TelaBuscaGoogle(driver);
		telaGoogle.abrir();
		String titulo = telaGoogle.buscaGoogle("Andr� Abe Vicente")
				.entrarResultados();
		assertEquals("Andr� Abe Vicente - Brasil | LinkedIn", titulo);
	}

}
