import java.util.HashSet;
public class BankAccounts_set {
    HashSet<Integer> accountnumber=new HashSet<>();
    void addAccount(int num){
        accountnumber.add(num);
    }
    void removeAccount(int num){
        accountnumber.remove(num);
    }
    void allAccounts(){
        System.out.println(accountnumber);
        for(int ele: accountnumber){
            System.out.println(ele);
        }
    }

    public static void main(String[] args) {
        BankAccounts_set b=new BankAccounts_set();
        b.addAccount(12345);
        b.addAccount(12345);
        b.addAccount(14345);
        b.addAccount(874569651);
        b.removeAccount(12345);
        b.allAccounts();
    }
}
