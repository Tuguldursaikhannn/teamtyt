public class MainShapeTest {
	public static void main(String[] args){
		//9 ширхэг дүрсийн хаягийг Shape төрлөөр үүсгэж байна.
		Shape[] testShapes = new TwoDimensionalShape[9];
		//Дүрсүүдийг эрэмлэх үед түр зуурын хаягийг хадгалах
		Shape[] tempObject = new TwoDimensionalShape[];
		//Доор нийт 9 ширхэг обьект үүсгэж байна.
		testShapes[0] = new Triangle(1, 1, 1);
		testShapes[1] = new Triangle(4, 3, 4);
		testShapes[2] = new Triangle(6, 2, 3);
		testShapes[3] = new Square(6, 1, 3);
		testShapes[4] = new Square(2, 6, 7);
		testShapes[5] = new Square(1, 5, 3);
		testShapes[6] = new Circle(8, 2, 3);
		testShapes[7] = new Circle(2, 3, 5);
		testShapes[8] = new Circle(9, 2, 6);
		//Дүрсүүдийн талбайг хүснэгтэнд хуулж авч байна.
		double[] tempArray = new double[9];
		for(int i = 0; i < 9; i++)
			tempArray[i] = testShapes[i].findArea();
		//Хуулж авсан хүснэгтээ эрэмбэлж байна.
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				if(tempArray[j] > tempArray[j + 1]){
					//Обьектын хаягуудыг солих үйлдэл
					tempObject[] = testShapes[j+1];
					testShapes[j+1] = testShapes[j];
					testShapes[j] = tempObject[];
				}
			}
		}
	}
}
