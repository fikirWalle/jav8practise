package java8Excersise;

public class Pesrson {
	
	private String firstName;
	private String lastNmae;
	private int age;
	
	public Pesrson(String firstName, String lastNmae, int age) {
		
		this.firstName = firstName;
		this.lastNmae = lastNmae;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastNmae() {
		return lastNmae;
	}

	public void setLastNmae(String lastNmae) {
		this.lastNmae = lastNmae;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Pesrson [firstName=" + firstName + ", lastNmae=" + lastNmae + ", age=" + age + "]";
	}
	
	
	
	

	

}
