import java.util.ArrayList;
public class Bank1_list {
    ArrayList<String> Account=new ArrayList<>();
        void addAccountHolder(String name){
            Account.add(name);
        }
        void removeAccountHolder(String name){
            Account.remove(name);
        }
        void printAllAccounts(){
            System.out.println(Account);
            for(String holders: Account){
                System.out.println(holders);
            }
        }

    public static void main(String[] args) {
        Bank1_list bank=new Bank1_list();
        bank.addAccountHolder("shivakumar");
        bank.addAccountHolder("Nagareddy");
        bank.addAccountHolder("unknown");
        bank.removeAccountHolder("unknown");
        bank.printAllAccounts();
    }
}
