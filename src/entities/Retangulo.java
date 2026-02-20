package entities;

public class Retangulo {
    public double width = 0;
    public double height = 0;
    public double area(){
        return width*height;
    }
    public double perimeter(){
        return 2*width+2*height;
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(height,2)+Math.pow(width,2));
    }
    public String toString(){
        return "AREA: " + area() + "\nPERIMETER: " +perimeter()+"\nDIAGONAL: " + diagonal();
    }

}
