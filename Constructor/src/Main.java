public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");
        Const c = new Const(5);
        System.out.println("Parent var:" + c.constVariable);
        Const1 c1 = new Const1(10,15);
        System.out.println("Parent var:" + c1.constVariable);
        System.out.println("Child var:" + c1.Const1variable);
        Const1 c2 = new Const1(20,25);
        System.out.println("Parent var:" + c2.constVariable);
        System.out.println("Child var:" + c2.Const1variable);
    }
}