public class Square extends TwoDimensionalShape {
	//Квадрат дүрсийн байгуулагч 
	public Square(double x, double y, double len){
		//Эх классруугаа нэр, координат, урт, ирмэгийн тоог дамжуулна.
		super("Square", x, y, len, 4);
	}
	//Квадратын хүрээний урт олох функц
	public double findPerimeter(){
		return this.length*4;
	}
	//Квадратын талбай олох функц 
	@Override
	public double findArea(){
		return this.length * this.length;
	}
}
