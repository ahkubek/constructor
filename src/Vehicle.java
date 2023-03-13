public class Vehicle {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    Vehicle(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers=passengers;
        this.maxspeed=maxspeed;
        this.wheels=wheels;
        this.burnup=burnup;

     /*   passengers=p;
        wheels=w;
        maxspeed=ms;
        burnup=bu;*/
      //  Vehicle(int,int,int,int)

    }
    double distance ( double interval) {
        double value = this.maxspeed*interval;
        return  value;
    }

}
