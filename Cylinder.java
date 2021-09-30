public class Cylinder 
{
	 double height,radius;	   
	  Cylinder(double a,double b)
	{
	  height = a;
	  radius = b;
	}
	void printVolume()
	{
	 System.out.println("Volume of Cylider is "+3.14*radius*radius*height);
	}
	void printArea()
	{
	 System.out.println("Surface area of Cylinder is "+2*3.14*radius*(radius+height));
	}
	public static void main(String args[])
	{
	Cylinder a = new Cylinder(10.68,7.23);
	a.printVolume();
	a.printArea();
	Cube b = new Cube(5.00);
	b.printVolume();
	b.printArea();
	}
	}

	class Cube
	{
	 double side;	   
	  Cube(double a)
	{
	  side = a;
	}
	void printVolume()
	{
	 System.out.println("Volume of Cube is "+side*side*side);
	}
	void printArea()
	{
	 System.out.println("Surface area of Cube is "+6*side*side);
	}
	}



