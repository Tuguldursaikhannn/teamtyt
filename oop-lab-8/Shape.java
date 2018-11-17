public abstract class Shape {
	//Дүрсийн нэр 
	protected String name;
	//Дүрсийн х координат 
	protected double x;
	//Дүрсийн y координат 
	protected double y;

	//Дүрс классын классын байгуулагч 
	public Shape(String name, double x, double y){
		System.out.println("Constructing a Shape");
		//Дүрсийн нэрэнд утга олгох 
		setName(name);
		//Дүрсийн координатад утга олгох
		setCoordinates(x, y);
	}
	//Дүрсийн нэрэнд утга олгох функц 
	public void setName(String name){
		this.name  = name;
	}
	//Дүрсийн координатад утга олгох функц
	public void setCoordinates(double x, double y){
		this.x = x;
		this.y = y;
	}
	//Дүрсийн нэрийг буцаах функц 
	public String getName(){
		return name;
	}
	//Дүрсийн координатыг хэвлэх функц
	public void getCoordinates(){
		System.out.println("X: " + this.x + " Y: " + this.y);
	}
	//Приметр олох хийсвэр функц
	public abstract double findPerimeter();
}
