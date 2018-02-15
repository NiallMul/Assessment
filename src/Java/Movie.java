package Java;

public class Movie {
	private String name, genre;
	private int runtime, ageRating;
	
	public Movie(String name, String genre, int runtime, int ageRating) {
		super();
		this.name = name;
		this.genre = genre;
		this.runtime = runtime;
		this.ageRating = ageRating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public int getAgeRating() {
		return ageRating;
	}

	public void setAgeRating(int ageRating) {
		this.ageRating = ageRating;
	}
	
}
