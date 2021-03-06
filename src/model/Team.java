package model;

public class Team {
	private long id;
	private String name;
	private String coach;
	private City city;
	private long captain;

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Team(String name, String coach, long captain, City city) {
		super();
		this.name = name;
		this.coach = coach;
		this.city = city;
		this.captain = captain;
	}

	public long getCaptain() {
		return captain;
	}

	public void setCaptain(long captain) {
		this.captain = captain;
	}
}