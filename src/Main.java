import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = getFruitBox();
        printBox(fruitBox);
    }
    static Box<Fruit> getFruitBox() {
        Box<Fruit> fruitBox = new Box<>();
        fruitBox.put(new Apple());
        fruitBox.put(new Orange());
        return fruitBox;
    }

    static void printBox(Box<? extends Fruit> box) {
//        List<? extends Fruit> items = box.getItems();
        System.out.println("Содержимое коробки: ");
        for (Fruit fruit : getFruitBox().getItems()) {
            System.out.println(fruit.toString());
        }
    }


}