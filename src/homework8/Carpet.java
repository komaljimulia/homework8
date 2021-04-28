package homework8;

public class Carpet {
    double cost;//variable
    public Carpet (double cost){
        if(cost<0){
            this.cost=0;//bcoz we have to intialize that is why this.cost
        }
        else
            this.cost=cost;
    }
    //instance variable
    public double getCost(){
        return this.cost;
    }
}
