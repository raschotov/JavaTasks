package houses;

public class House {

	private Residents[] residents;
	private Fundament fundament;

	public House(Fundament fundament){
		this.fundament = fundament;
	}

	public void addResidents(Residents residents[]){
		this.residents = residents;
	}
}
