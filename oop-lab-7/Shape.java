public class shape {
   //
   protected float x = new float[];
   protected float y = new float[];
   protected String name;
   protected int n;
   protected float a;

   public shape(){
       setX(0, 0);
       setY(0, 0);
       setName("");
       setA(0);
   }
   public shape(float newx, float newy, float newa, String newName){
       setX(newx, 0);
       setY(newy, 0);
       setA(newa);
       setName(newName);
   }
   public float getX(int i){ return x[i]; }
   public float getY(int i){ return y[i]; }
   public float getA(){ return this.a}
   public String getName(){ return name; }

   public void setX(float x, int i){ this.x[i] = x;}
   public void setY(float y, int i){ this.y[i] = y;}
   public void setA(float newa){ this.a = newa;}
   public void setName(String name){ this.name = name;}
}
