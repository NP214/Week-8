package carpetcostcalculator;

public class Carpet {
    double cost;
    Carpet(double cost){
        this.cost = cost;
        if(cost<0){
            this.cost = 0;
        }else{
            this.cost=cost;
        }
    }
    // instance method
    public double getCost() {
        return cost;
    }

}
