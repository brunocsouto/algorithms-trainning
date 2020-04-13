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

	public static void main(String[] args){
		Robot r1 = new Robot("Tom", "gray", 50);
		Robot r2 = new Robot("Jerry", "brown", 10);

		r1.introduceSelf();
		r2.introduceSelf();
	}
}
