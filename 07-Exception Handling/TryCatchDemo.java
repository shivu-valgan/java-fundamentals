public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero: " + e);
        } finally {
            System.out.println("Finally block executed");
        }

        try {
            throw new CustomException("Custom exception triggered");
        } catch (CustomException ce) {
            System.out.println(ce.getMessage());
        }
    }
}

class CustomException extends Exception {
    CustomException(String msg) {
        super(msg);
    }
}
