public class Triangle extends TwoDimensionalShape {
	//Гурвалжин дүрсийн байгуулагч 
	public Triangle(double x, double y, double len){
		//Эх классруугаа нэр, координат, урт, ирмэгийн тоог дамжуулна.
		super("Triangle", x, y, len, 3);
	}
	//Гурвалжны хүрээний урт олох функц 
	public double findPerimeter(){
		return this.length*3;
	}
	//Гурвалжны талбай олох функц
	@Override
	public double findArea(){
		return this.length*this.length*0.6;
	}
}
