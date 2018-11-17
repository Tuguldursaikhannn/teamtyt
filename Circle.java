public class Circle extends TwoDimensionalShape {
	//Тойрог дүрсийн байгуулагч 
	public Circle(double x, double y, double len){
		//Эх классруугаа нэр, координат, урт, ирмэгийн тоог дамжуулна.
		super("Circle", x, y, len, 1);
	}
	//Тойргийн хүрээний урт олох функц
	public double findPerimeter(){
		//Хүрээний урт = 2*PI*r
		return 2 * Math.PI * this.length;
	}
	//Тойргийн талбай олох функц
	@Override
	public double findArea(){
		//Талбай = PI*r^2
		return Math.PI * this.length * this.length;
	}
}