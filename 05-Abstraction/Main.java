abstract class Bank {
    abstract int getInterestRate();
}

class SBI extends Bank {
    int getInterestRate() {
        return 7;
    }
}

interface Loan {
    void getLoanType();
}

public class Main implements Loan {
    public void getLoanType() {
        System.out.println("Personal Loan");
    }

    public static void main(String[] args) {
        Bank b = new SBI();
        System.out.println("SBI Rate: " + b.getInterestRate() + "%");

        Main m = new Main();
        m.getLoanType();
    }
}
