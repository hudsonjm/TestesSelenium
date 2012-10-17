package com.selenium.telas.brasileirao;

/**
 *
 * @author Rodolfo
 */

import java.util.ArrayList;

import org.apache.bcel.generic.RETURN;

import com.selenium.SeleniumWebDriver;

public class TelaTabelaBrasileirao {

	private SeleniumWebDriver selenium;
	private static final String URL = "http://esporte.uol.com.br/futebol/campeonatos/brasileiro/2012/serie-a/classificacao/classificacao.htm";

	public TelaTabelaBrasileirao(SeleniumWebDriver selenium) {
		this.selenium = selenium;
	}

	public void abrir() {
		selenium.driver.get(URL);
		selenium.assertTitle("Classificação do Campeonato Brasileiro 2012 de Futebol - UOL Esporte");
	}

	public ArrayList<DesempenhoTime> getEstatisticasTimeLibertadores() {
		ArrayList<DesempenhoTime> times = new ArrayList<>();
		DesempenhoTime t;
		for (int i = 1; i <= 20; i++) {
			t = new DesempenhoTime();
			t.setTime(selenium.getTextTableCell("classificationTable", i, 1));
			t.setPontos(selenium.getTextTableCell("classificationTable", i, 2));
			t.setJ(selenium.getTextTableCell("classificationTable", i, 3));
			t.setVitorias(selenium.getTextTableCell("classificationTable", i, 4));
			t.setEmpates(selenium.getTextTableCell("classificationTable", i, 5));
			t.setDerrotas(selenium.getTextTableCell("classificationTable", i, 6));
			t.setGolsPro(selenium.getTextTableCell("classificationTable", i, 7));
			t.setGc(selenium.getTextTableCell("classificationTable", i, 8));
			t.setTotalGols(selenium.getTextTableCell("classificationTable", i, 9));
			t.setAproveitamento(selenium.getTextTableCell(
					"classificationTable", i, 10));
			times.add(t);
		}
		return times;
	}

}
