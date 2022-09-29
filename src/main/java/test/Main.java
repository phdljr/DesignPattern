package test;

public class Main {
    public static void main(String[] args) {
        Dog baduki = new Dog();
        Cat nabi = new Cat();
        Robot robo = new Robot();

        Animal aref = null;
        Sayable sref = null;
        Canine cref = null;

        aref = baduki; aref.say();
        aref = nabi; aref.say();
//        aref = robo; aref.say();

        sref = baduki; sref.say();
        sref = nabi; sref.say();
        sref = robo; sref.say();

        cref = baduki; cref.say();
//        cref = nabi; cref.say();
//        cref = robo; cref.say();

    }
}
