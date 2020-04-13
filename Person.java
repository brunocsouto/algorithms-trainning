public class Person{
	String name;
	String personality;
	boolean isSitting;
	Robot robotOwned;

	Person(String name, String personality, boolean isSitting){
		this.name = name;
		this.personality = personality;
		this.isSitting = isSitting;
	}

	
	void sitDown(){
		this.isSitting = true;
	}

	void standUp(){
		this.isSitting = false;
	}
}
