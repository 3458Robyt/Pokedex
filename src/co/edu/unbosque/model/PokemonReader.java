package co.edu.unbosque.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PokemonReader {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>();
//		try {
//			File file = new File("pokemon.txt");
//			Scanner scanner = new Scanner(file);
//
//			while (scanner.hasNextLine()) {
//				String line = scanner.nextLine();
//				String[] parts = line.split(", ");
//				int id = Integer.parseInt(parts[1]);
//				String name = parts[0];
//				String type1 = parts[2];
//				String type2 = parts[3];
//				int hp = Integer.parseInt(parts[4]);
//				int attack = Integer.parseInt(parts[5]);
//				int defense = Integer.parseInt(parts[6]);
//				int spAttack = Integer.parseInt(parts[7]);
//				int spDefense = Integer.parseInt(parts[8]);
//				int speed = Integer.parseInt(parts[9]);
//				String eggGroup = parts[10];
//				String evolutionChain = parts[11];
//
//				Pokemon pokemon = new Pokemon(id, name, type1, type2, hp, attack, defense, spAttack, spDefense, speed,
//						eggGroup, evolutionChain);
//				pokemonList.add(pokemon);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("Ha ocurrido un error");
//			e.printStackTrace();
//		}
//
//		for (Pokemon pokemon : pokemonList) {
//			System.out.println(pokemon.toString());
//		}
		ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>();
		try {
//			FileReader reader = new FileReader("pokemon.txt");
//			int data = reader.read();
			File file = new File("pokemon.txt");
			Scanner sc = new Scanner(file);

//			while (data != -1) {
//				System.out.print((char) data);
//				data = reader.read();
//			}
//			reader.close();
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] parts = line.split(", ");
				int id = Integer.parseInt(parts[1]);
				String name = parts[0];
				String type1 = parts[2];
				String type2 = parts[3];
				int hp = Integer.parseInt(parts[4]);
				int attack = Integer.parseInt(parts[5]);
				int defense = Integer.parseInt(parts[6]);
				int spAttack = Integer.parseInt(parts[7]);
				int spDefense = Integer.parseInt(parts[8]);
				int speed = Integer.parseInt(parts[9]);
				String eggGroup = parts[10];
				String evolutionChain = parts[11];

				Pokemon pokemon = new Pokemon(id, name, type1, type2, hp, attack, defense, spAttack, spDefense, speed,
						eggGroup, evolutionChain);
				pokemonList.add(pokemon);
				System.out.println(parts.length);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Ha ocurrido un error");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Pokemon pokemon : pokemonList) {
			System.out.println(pokemon.toString());
		}
		System.out.println();

		System.out.println("index");
		int a = s.nextInt();
		pokemonList.remove(a);

		for (Pokemon pokemon : pokemonList) {
			System.out.println(pokemon.toString());
		}
		System.out.println();

	}

}