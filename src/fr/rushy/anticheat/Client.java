package fr.rushy.anticheat;

public class Client {

	private String name;
	private String uuid;
	
	public Client(String name, String uuid) {
		this.name = name;
		this.uuid = uuid;
	}
	
	public String getName() {
		return name;
	}
	
	public String getUUID() {
		return uuid;
	}
}
