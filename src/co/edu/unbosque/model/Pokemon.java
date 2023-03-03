package co.edu.unbosque.model;

class Pokemon {
	private int id;
	private String name;
	private String type1;
	private String type2;
	private int hp;
	private int attack;
	private int defense;
	private int spAttack;
	private int spDefense;
	private int speed;
	private String eggGroup;
	private String evolutionChain;

	public Pokemon(int id, String name, String type1, String type2, int hp, int attack, int defense, int spAttack,
			int spDefense, int speed, String eggGroup, String evolutionChain) {
		this.id = id;
		this.name = name;
		this.type1 = type1;
		this.type2 = type2;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.spAttack = spAttack;
		this.spDefense = spDefense;
		this.speed = speed;
		this.eggGroup = eggGroup;
		this.evolutionChain = evolutionChain;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getSpAttack() {
		return spAttack;
	}

	public void setSpAttack(int spAttack) {
		this.spAttack = spAttack;
	}

	public int getSpDefense() {
		return spDefense;
	}

	public void setSpDefense(int spDefense) {
		this.spDefense = spDefense;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getEggGroup() {
		return eggGroup;
	}

	public void setEggGroup(String eggGroup) {
		this.eggGroup = eggGroup;
	}

	public String getEvolutionChain() {
		return evolutionChain;
	}

	public void setEvolutionChain(String evolutionChain) {
		this.evolutionChain = evolutionChain;
	}

	public String toString() {
		return "ID: " + id + "\n" + "Name: " + name + "\n" + "Type 1: " + type1 + "\n" + "Type 2: " + type2 + "\n"
				+ "HP: " + hp + "\n" + "Attack: " + attack + "\n" + "Defense: " + defense + "\n" + "Special Attack: "
				+ spAttack + "\n" + "Special Defense: " + spDefense + "\n" + "Speed: " + speed + "\n" + "Egg Group: "
				+ eggGroup + "\n" + "Evolution Chain: " + evolutionChain + "\n";
	}
}
