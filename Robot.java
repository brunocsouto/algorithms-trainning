public class Robot{
	String name;
	String color;
	int weight;

	Robot(String name, String color, int weight){
		this.name = name;
		this.color = color;
		this.weight = weight;
	}

	void introduceSelf(){
		System.out.println("Hi, my name is " + this.name);
	}
}
