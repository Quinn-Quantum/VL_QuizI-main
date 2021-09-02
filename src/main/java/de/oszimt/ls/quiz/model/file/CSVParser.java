package de.oszimt.ls.quiz.model.file;

import java.io.*;

import de.oszimt.ls.quiz.model.Model;

public class CSVParser {
	private File datei;

	/**
	 * Erstelle XML Datei
	 *
	 * @param pfad, Pfad zur Datei
	 */
	public CSVParser(String pfad) {
		this.datei = new File(pfad);
	}

	/**
	 * Lädt die XML Datei
	 * 
	 * @return Model der XML-Datei
	 */
	public boolean laden() throws FileNotFoundException {
		Model model = new Model();

		// Datei laden
		throw new RuntimeException("Not implemented");
		String filePath = "/VL_Quizl-main/Klasse.csv";
		FileReader fileReader = new FileReader(filePath);

		BufferedReader reader = new BufferedReader("VL_Quizl-main/Klasse.csv");
		String[] reader1;

		// return model;
	}
}
