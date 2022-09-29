package test;

public class Robot implements Sayable{
    private void printOut(){
        System.out.println("삐리릭");
    }

    @Override
    public void say() {
        printOut();
    }
}
