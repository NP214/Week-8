package carpetcostcalculator;

public class Calculator {
    Floor floor;
Carpet carpet;

// constructor with param
    Calculator(Floor floor ,Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }
    // instance method
    public double getTotalCost(){
        double total = floor.getArea() * carpet.getCost();
      return total;
    }
}
