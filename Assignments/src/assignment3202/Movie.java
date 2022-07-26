package assignment3202;

public class Movie {
	private String name;
	private String directorName;
	private int duration;
	private int releasedYear;
	
	public Movie() {
		super();
		
	}

	public Movie(String name, String directorName, int duration, int releasedYear) {
		super();
		this.name = name;
		this.directorName = directorName;
		this.duration = duration;
		this.releasedYear = releasedYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getReleasedYear() {
		return releasedYear;
	}

	public void setReleasedYear(int releasedYear) {
		this.releasedYear = releasedYear;
	}
	
	
	
	

}
