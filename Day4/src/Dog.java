public class Dog extends Animal {
    int legs;
    int age;
    public Dog(int legs, int age){
        this.age = age;
        this.legs = legs;
    }
    public Dog(int age){
        this.legs = legs;
        this.age = 6;
    }
    public Dog(){        //default state

    }

}
