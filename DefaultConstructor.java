class Box5 
{  
double width;   
double height;  
double depth; 
Box5()  {
System.out.println("Constructing Box"); 
width = 10;
height = 10; 
depth = 10;
}
double volume() {
return width * height * depth;
}
}
class DefaultConstructor { 
public static void main(String args[]) { 
Box5 mybox1 =   new Box5();
Box5 mybox2 = new Box5(); 
double vol;
vol = mybox1.volume();
System.out.println("Volume is " + vol); 
vol = mybox2.volume(); 
System.out.println("Volume is " + vol); 
}
}