import exercice1.Exercice1;
import exercice2.Exercice2;
import exercice3.Exercice3;
import exercice4.Exercice4;

public class Main {
    public static void main(String[] args) {

        System.out.println("========Exercice 1=====================");

        String[] tabString = {"Coulibaly", "Mouhamed", "Nabocho"};
        Integer[] dataInt = {1, 2, 3, 4, 5};
        Exercice1.printArray(tabString);
        Exercice1.printArray(dataInt);

         System.out.println("========Exercice 2=====================");
        Integer[] dataInt2 = {5, 1, 8, 26, 35, 87, 45, 50, 0};
        Exercice2.selectionSort(dataInt2);

        System.out.println("========Exercice 3=====================");
        String word = "HIPPOPOTAMUS";
        Exercice3.reverse(word);

        System.out.println("========Exercice 4=====================");
        Exercice4 pi = () -> Math.PI;
        System.out.println("Valeur de PI " + pi.findPi());
    }
}