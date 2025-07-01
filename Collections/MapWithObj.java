import java.util.HashMap;
import java.util.HashSet;

public class MapWithObj {
    HashMap<Integer, Customer> customer=new HashMap<>();
    void add_customer(int num, Customer c){
        customer.put(num, c);
    }
    void remove_customer(int num){
        customer.remove(num);
    }
    void allCustomers(){
        for(int ele: customer.keySet()){
            System.out.println(ele+"-->");
            customer.get(ele).showDetails();
        }
    }
    public static void main(String[] args) {
        MapWithObj c=new MapWithObj();
        c.add_customer(101,new Customer("shivu",10000,"savings"));
        c.add_customer(102,new Customer("kiran",18000,"current"));
        c.add_customer(103,new Customer("unknown",0000,"savings"));
        c.remove_customer(103);
        c.allCustomers();

    }
}
class Customer{
    private String name;
    private double balance;
    private String acctype;
    Customer(String name, double balance, String acctype){
        this.name=name;
        this.balance=balance;
        this.acctype=acctype;
    }
    void showDetails(){
        System.out.println("Customer: "+name+"\nacctype: "+acctype+"\nbalance: "+balance);
    }
}
