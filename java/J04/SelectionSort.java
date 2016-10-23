import java.util.*;

class Selection {
    public static void selectionSort(double[] array) {
        for (int i=0; i<array.length-1; i++) {
            double currentMax = array[i];
            int currentMaxIndex = i;

            for (int j=i+1; j<array.length; j++) {
                if (currentMax < array[j]) {
                    currentMax = array[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex != i) {
                array[currentMaxIndex] = array[i];
                array[i] = currentMax;
            }
        }
    }
}

public class SelectionSort {
    public static void main(String[] args) {
        double[] array = new double[10];
        Scanner input = new Scanner(System.in);
        for (int i=0; i<10; i++) {
            array[i] = input.nextDouble();
        }
        Selection.selectionSort(array);
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
