public class OopsExample3 {
    public static void main(String[] args) {

        Appliance a1=new SmartFan("cgi");
        Appliance a2=new SmartTv("cgi");
        SmartDevice s1=new SmartFan("cgi");
        SmartDevice s2=new SmartTv("cgi");

        a1.turnOn();
        a1.turnOff();
        s1.connectToWiFi();

        a2.turnOn();
        a2.turnOff();
        s1.connectToWiFi();
    }
}
abstract class Appliance{
    String brand;
    Appliance(String brand){
        this.brand=brand;
    }
    void displaybrand(){
        System.out.println(brand);
    }
    abstract void turnOn();
    abstract void turnOff();
}
interface SmartDevice{
    void connectToWiFi();
    void updateFirmware();
}
class SmartFan extends Appliance implements SmartDevice{
    SmartFan(String brand){
        super(brand);
    }
    @Override
    void turnOn(){
        System.out.println("turning on fan");
    }
    @Override
    void turnOff(){
        System.out.println("turning off fan");
    }
    @Override
    public void connectToWiFi(){
        System.out.println("connected to Wifi");
    }
    @Override
    public void updateFirmware(){
        System.out.println("updated firm ware");
    }
}
class SmartTv extends Appliance implements SmartDevice {
    SmartTv(String brand){
        super(brand);
    }
    @Override
    void turnOn(){
        System.out.println("turning on TV");
    }
    @Override
    void turnOff(){
        System.out.println("turning off TV");
    }
    @Override
    public void connectToWiFi(){
        System.out.println("connected to wifi");
    }
    @Override
    public void updateFirmware(){
        System.out.println("updated firm ware");
    }
}
