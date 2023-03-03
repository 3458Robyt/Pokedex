package co.edu.unbosque.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerJson {
	public static void main(String[] args) {

		try {
			File myFile = new File("pokemon.json");
			System.out.println(myFile.getPath() + " xd");
			BufferedReader reader = new BufferedReader(new FileReader(myFile.getPath()));
			String line = reader.readLine();
			StringBuilder stringBuilder = new StringBuilder();
			while (line != null) {
				stringBuilder.append(line);
				line = reader.readLine();
			}
			reader.close();
			String jsonString = stringBuilder.toString();
			System.out.println(jsonString);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
