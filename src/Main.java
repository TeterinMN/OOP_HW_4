import java.util.List;

public class Main {
    public static Box<Fruit> getFruitBox() {
        Box<Fruit> fruitBox = new Box<>();
        fruitBox.put(new Apple());
        fruitBox.put(new Orange());
        return fruitBox;
    }

    public static void printBox(Box<? extends Fruit> box) {
        List<? extends Fruit> items = box.getItems();
        for (Fruit fruit : items) {
            System.out.println(fruit.toString());
        }
    }

    public static void main(String[] args) {
        Box<Fruit> fruitBox = getFruitBox();
        printBox(fruitBox);
    }
}