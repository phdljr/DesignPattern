package test;

public class Dog extends Canine implements Sayable{
    private void bark(){
        System.out.println("멍멍");
    }

    @Override
    public void say() {
        bark();
    }
}
