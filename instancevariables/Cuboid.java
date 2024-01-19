package instancevariables;
public class Cuboid {
	public double length;// non-static member or instance variable
	public double breadth;
	public double height;
	public Cuboid(double length,double breadth,double height){
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	public double volume() {
		return length * breadth * height;
	}
	public String toString() {
		return "Length = "+length+"\nBreadth = "+breadth+"\nHeight = "+height+"\nVolume = "+volume();
	}
}
