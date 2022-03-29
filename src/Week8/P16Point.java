package Week8;

public class P16Point {
    public static void main(String[] args) {
        P16Point first = new P16Point(6, 5);
        P16Point second = new P16Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        P16Point point = new P16Point();
        System.out.println("distance()= " + point.distance());
    }
    int x, y;

    // create 1st constructor
    P16Point(){

    }
    // create 2nd constructor
    P16Point(int x, int y){
        // initialize the variable by (this.)
    this.x = x;
    this.y = y;
    }
    public int getX(){
        return this.x;
    }

    public int getY() {
        return this.y;
    }
    public void setX(int x){
this.x=x;
    }
    public void setY(int y){
this.y=y;
    }
    public double distance(){
         return Math.sqrt((0-this.getX())*(0-this.getX())+(0-this.getY())*(0-this.getY()));
    }
    public double distance(int x, int y){
        return Math.sqrt((x-this.getX())*(x-this.getX())+(y-this.getY())*(y-this.getY()));
    }
    public double distance(P16Point second){
        return Math.sqrt((second.getX()-this.getX())*(second.getX()-this.getX())+(second.getY()-this.getY())*(second.getY()-this.getY()));
    }
}
