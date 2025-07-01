import java.util.HashMap;
public class BankMap {
    HashMap<Integer,String> acc=new HashMap<>();
    void addAccount(int num, String str){
        acc.put(num,str);
    }
    void removeAccount(int num){
        acc.remove(num);
    }
    void allAccounts(){
//        System.out.println(acc);
        for(int i:acc.keySet()){
            System.out.println(i+","+acc.get(i));
        }
    }

    public static void main(String[] args) {
        BankMap b=new BankMap();
        b.addAccount(101,"shivu");
        b.addAccount(102,"ravi");
        b.addAccount(101,"kumar");
        b.addAccount(103,"kiran");
        b.removeAccount(102);
        b.allAccounts();
    }
}
