import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Fruit ananas = new Fruit("Ananas");
        Fruit banana = new Fruit("Banana");

        LinkedList<Fruit> frutta = new LinkedList<>(Arrays.asList(ananas, banana));
        System.out.println(frutta);

        Fruit mela = new Fruit("Mela");
        Fruit pera = new Fruit("pera");
        frutta.addFirst(mela);
        frutta.addLast(pera);

        System.out.println(frutta);
    }

}
