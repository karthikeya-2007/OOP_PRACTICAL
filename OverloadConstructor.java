class Box7 { 
  double width;
  double height; 
  double depth;
Box7(double w, double h, double d)  {
	width = w;
	height = h; 
	depth = d;
    } 
Box7() {
   width = -1;   
   height = -1;  
   depth = -1; 
} 
Box7(double len) {
 width = height = depth = len;
} 
double volume() {
 	return width * height * depth;
  }
}
public class OverloadConstructor {
	public static void main(String args[]) {
	   Box7 mybox1 = new Box7(10, 20, 15); 
	   Box7 mybox2 = new Box7(); 
	   Box7 mycube = new Box7(7); 
	   double vol;
	   vol = mybox1.volume();
	   System.out.println("Volume of mybox1 is " + vol);
	   vol = mybox2.volume(); 
	   System.out.println("Volume of mybox2 is " + vol);
	   vol = mycube.volume();
	   System.out.println("Volume of mycube is " + vol); 
	}
}