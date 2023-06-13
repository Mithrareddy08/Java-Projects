
    import java.lang.*;
    public class MyException extends Exception {
        public MyException() {

        }
        public MyException(String s) {
            super(s);
        }

        public void Custom(String s) {
            try {
                int i = Integer.parseInt(s);
                System.out.println("Entered input is: "+i);
            } catch (Exception n) {
                System.out.println("Exception: cannot be parsed to Integer");

            }

        }
    }

