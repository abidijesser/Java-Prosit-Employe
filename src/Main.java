import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int count[] = {40, 20, 30, 10, 50, 90, 80, 77, 61, 22, 100};
        Set<Integer> myHashSet = new HashSet<>();

        for (int i = 0; i < 11; i++) {
            myHashSet.add(count[i]);
        }

        // Utilisation de l'itérateur
        System.out.println(myHashSet);
        Iterator<Integer> iterator = myHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
