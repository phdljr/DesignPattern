package test;

public class Cat extends Animal implements Sayable{
    private void meow(){
        System.out.println("야옹");
    }

    @Override
    public void say() {
        meow();
    }
}
