class Box6
{  
  double width;
  double height;
  double depth;
Box6(double w, double h, double d) 
   {   
 width = w; height = h; depth = d;
   }
double volume()
  { 
 return width * height * depth;
   }
}
class ParameterizedConstructor
 {
 public static void main(String args[]) 
  {
 Box6 mybox1 = new Box6(10, 20, 15); 
 Box6 mybox2 = new Box6(3, 6, 9); 
 double vol;
 vol = mybox1.volume(); 
 System.out.println("Volume is " + vol); 
 vol = mybox2.volume(); 
 System.out.println("Volume is " + vol);
 }
 }