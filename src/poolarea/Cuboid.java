package poolarea;

public class Cuboid extends Rectangle{
    double height;
    Cuboid(double width, double lenth , double height){
        super(5.0 , 10.0);
        if(height<0){
            this.height = 0;
        }else{
            this.height = height;
    }
    }

    public double  getHeight(){
        return height;
    }
    public double  getVolume(){
        double volume = super.getArea() * height;
        return volume;
    }
}
