package hf.dp.templatemethod;

public abstract class CaffeinBeverage {
    final void prepareRecipe(){
        boilwater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    abstract public void brew();
    abstract public void addCondiments();

    public  boolean customerWantsCondiments() {
        return true;
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void boilwater() {
        System.out.println("Boiling water");
    }
}
