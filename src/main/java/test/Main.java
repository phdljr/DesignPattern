package test;

public class Main {

    public String path(){
        return getClass().getResource("/README.md").getPath();
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.path());
    }
}
