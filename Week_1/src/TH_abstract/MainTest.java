package TH_abstract;

public class MainTest {
    public static void main(String[] args) {
        Animals[] animals = new Animals[2];
        animals[0] = new Chickens();
        animals[1] = new Tigers();
        for (Animals a : animals) {
            System.out.println(a.makeSound());
            if (a instanceof Chickens) {
                Edible edible = (Chickens) a;
                System.out.println(edible.howtoEat());
            }
        }
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit x:fruit){
            System.out.println(x.howtoEat());
        }
    }
}
