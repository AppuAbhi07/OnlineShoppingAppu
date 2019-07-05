package compt;

public class C1 implements Comparable<C1>{
	
	
	private String name;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	private double rating;
	private int year;

	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public C1(String name, double rating, int year) {
		this.name= name;
		this.rating= rating;
		this.year = year;
		
	}

	
	@Override
	public int compareTo(C1 o) {
		// TODO Auto-generated method stub
		//return this.year-o.getYear();
		return this.name.);
	}

}
