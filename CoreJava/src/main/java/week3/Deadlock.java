package week3;
public class Deadlock{
    public static void main(String args[]) {

        //Define resources shared by multiple threads
        final String Res1 = "str1";
        final String Res2 = "str2";

        Thread thread1 = new Thread() {
            public void run() {
                System.out.println("Starting Res1: "+Res1);

                synchronized(Res1) {
                    System.out.println("1st thread - locked 1st string");
                    try {
                        //"Sleep" is used to create deadlock.
                        //The delay ensures that the other thread acquires the lock on RB.
                        Thread.sleep(100);

                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    synchronized(Res2) {
                        System.out.println("1st thread - locked 2nd string ");
                    }
                }

                // If we reach here then there is no deadlock.
                System.out.println("no deadlock");
            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                System.out.println("Starting Res2: "+Res2);

                synchronized(Res2) {
                    System.out.println("2nd thread - locked 2nd string ");
                    try {
                        Thread.sleep(100);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    synchronized(Res1) {
                        System.out.println("2nd thread - locked 1st string ");
                    }
                }

                // If we reach here then there is no deadlock.
                System.out.println("no deadlock");
            }
        };
        thread1.start();
        thread2.start();
    }
}