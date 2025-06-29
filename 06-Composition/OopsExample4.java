public class OopsExample4 {
    public static void main(String[] args) {
        Phone p1=new Phone();
        p1.turnOff();
        p1.turnOn();

    }
}

class Battery{
    void drain(){
        System.out.println("Battery drained");
    }
    void charge(){
        System.out.println("Battery charged");
    }
}
class Phone{
    private Battery battery;
    Phone(){
        this.battery=new Battery();
    }
    void turnOn(){
        battery.charge();
        System.out.println("phone turned on");
    }
    void turnOff(){
        battery.drain();
        System.out.println("phone turned off");
    }
}