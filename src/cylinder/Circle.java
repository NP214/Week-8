package cylinder;

public class Circle {
    double radius;
    // constructor
    Circle(double radius){
    if(radius<0){
        this.radius = 0;
    }else{
        this.radius=radius;
    }
    }
    // method
    public double getRadius(){
        return radius;
    }
    public double  getArea(){
        double area =  (radius * radius * Math.PI);
        return  area;
    }
}
