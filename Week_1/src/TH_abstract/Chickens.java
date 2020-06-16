package TH_abstract;

public class Chickens extends Animals implements Edible {
    @Override
    public String makeSound() {
        return "i am Chicken";
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }
}
