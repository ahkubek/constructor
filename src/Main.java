public class Main {
    public static void main(String[] args) {
        Vehicle bus= new Vehicle(45,4,120,25);
        Vehicle car =new Vehicle(2,4,130,30);
        double interval = 10;
        double distanceCar= car.distance(interval);
        double distanceBus= bus.distance(interval);

Ten s1 = new Ten();
Ten s2 = new Ten();
Number t1 =  new  Number(9);
Number t2 = new Number(27);

        if (s1.x == s2.x) {
            System.out.println(s1.x+"="+s2.x);
            System.out.println(t1.x+"***"+t2.x);
            System.out.println("автомобиль с"+car.passengers+" пассажирами "+"gпройдет за час"+distanceCar+"км");
            System.out.println("автобус с "+bus.passengers+"пассажирами "+"пройдет за час"+distanceBus+"км");
        }
    }
}