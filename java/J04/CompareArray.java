import java.util.*;

class Array {
    public static boolean equal(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        Arrays.sort(list1);
        Arrays.sort(list2);
        for (int i=0; i<list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}

public class CompareArray {
    public static void main(String[] args) {
        int list1[] = new int[10];
        int list2[] = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.print("请输入第一个数组的元素个数: ");
        int count1 = input.nextInt();
        System.out.print("请输入第一个数组的元素: ");
        for (int i=0; i<count1; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("请输入第二个数组的元素个数: ");
        int count2 = input.nextInt();
        System.out.print("请输入第二个数组的元素: ");
        for (int i=0; i<count2; i++) {
            list2[i] = input.nextInt();
        }

        if (Array.equal(list1, list2)) {
            System.out.println("Two lists are identical.");
        } else {
            System.out.println("Two lists are not identical.");
        }
    }
}
