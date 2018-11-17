public abstract class TwoDimensionalShape extends Shape {
	//Дүрсийн талын урт
	protected double length;
	//Дүрсийн ирмэгийн тоо 
	protected int edges;
	//Дүрсийн бусад координатууд
	protected double sX[];
	protected double sY[];
	protected double tX[];
	protected double tY[];
	//Хоёр хэмжээст классын байгуулагч функц
	public TwoDimensionalShape(String name, double x, double y, double len, int edges){
		//Эх классынхаа байгуулагчид нэр, координатаа дамжуулах
		super(name, x, y);
		//Координатуудад утга олгох 
		setCoordinates(x, y, len, edges);
	}
	//Координатуудад утга олгох функц (гурвалжин, тойрог, квадрат)
	setCoordinates(double x, double y, double len, int edges){
		//Хэрэв ирмэг нь 4 бол энэ дүрс Квадрат
		if(edges == 4){
			//Доорход квадратын 4 оройн координатад утга олгож байна.
			this.sX = new double[4];
			this.xY = new double[4];

			this.sX[0] = x;
			this.sX[1] = x + len;
			this.sX[2] = x;
			this.sX[3] = x + len;

			this.sY[0] = y;
			this.sY[1] = y;
			this.sY[2] = y - len;
			this.sY[3] = y - len;

		}//Хэрэв ирмэг нь 3 бол энэ дүрс Гурвалжин
		else if(edges == 3){
			//Доорход гурвалжны 3 оройн координатад утга олгож байна.
			this.tX = new double[3];
			this.tY = new double[3];

			// sqrt(3)/2 = 1.2  | h = a*(1.2)
			this.tX[0] = x;
			this.tX[1] = x - len/2;
			this.tX[2] = x + len/2;

			this.tY[0] = y;
			this.tY[1] = y - len*1.2;
			this.tY[2] = y - len*1.2;
		}//Бусад тохиолдолд энэ дүрс Тойрог 
		else{
			this.x = x;
			this.y = y;
		}
	}
	//Координатууудыг хэвлэх функц 
	public void getCoordinates(int edges){
		//Ирмэг 4 бол энэ дүрс Квадрат болно 
		if(this.edge == 4){
			for(int i = 0; i < 4; i++)
				System.out.println("X:"+this.sX[i]+"Y:"+this.sY[i]);
		}//Ирмэг 3 бол энэ дүрс гурвалжин болно
		else if(this.edge == 3){
			for(int i = 0; i < 3; i++)
				System.out.println("X:"+this.tX[i]+"Y:"+this.tY[i]);
		}//Бусад үед энэ дүрс Тойрог болно
		else{
				System.out.println("X:"+this.x+"Y:"+this.y);
		}
	}
	//Дүрсийн хүрээний урт олох функц
	public abstract double findPerimeter(){
		double perimeter; //perimeter value
		perimeter = this.edges * this.length;
		return perimeter;
	}
	//Дүрсийн талбай олох хийсвэр функц
	public abstract findArea();
}