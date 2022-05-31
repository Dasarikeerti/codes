package p2;

import java.util.Objects;

public class Emp {
	int id;
	String name;
	String designation;
	public Emp() { }         //default constructor
	
	public Emp(int id, String name,String designation) {
		this.id=id;
		this.name=name;
		this.designation=designation;
	}
	

	public static void main(String[] args) {
		

	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(designation, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return Objects.equals(designation, other.designation) && id == other.id && Objects.equals(name, other.name);
	}

}
