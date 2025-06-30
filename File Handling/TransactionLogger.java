import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
public class TransactionLogger {
    void logTransaction(String msg){
        try {
            FileWriter writer=new FileWriter("transaction.txt",true);
            writer.write(msg);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("Error: "+e);
        }
    }

    public static void main(String[] args) {
        TransactionLogger t=new TransactionLogger();
        t.logTransaction("Withdraw 100rs - Success\n");
        t.logTransaction("Deposit 500rs - Success\n");
        try {
            BufferedReader b=new BufferedReader(new FileReader("transaction.txt"));
            String line;
            while ((line=b.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

