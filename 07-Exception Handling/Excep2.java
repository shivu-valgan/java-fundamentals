
public class Excep2 {
    public static void main(String[] args) {
        Atm a = new Atm();

        try {
            a.checkPin(1234);
            a.deposit(500);
            a.withdraw(300);
            a.withdraw(500);
        } catch (InvalidPinException e) {
            System.out.println("PIN Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Input Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete");
        }

    }
}
class Atm{
    private int pin=1234;
    private double balance;
    void checkPin(int pin) throws InvalidPinException {
        if (pin != this.pin)
            throw new InvalidPinException("invalid pin");
    }
    void deposit(double amt){
        if(amt<0)
            throw new IllegalArgumentException("Amount must be positive");
        balance+=amt;
    }
    void withdraw(double amt) throws InsufficientFundsException {
        if(amt>balance)
            throw new InsufficientFundsException("Insufficient Funds");
        balance-=amt;
    }
    void checkBalance() {
        System.out.println("transaction complete");
    }

    }
class InvalidPinException extends Exception{
    InvalidPinException(String msg){
        super(msg);
    }
}
class InsufficientFundsException extends Exception{
    InsufficientFundsException(String msg){
        super(msg);
    }
}