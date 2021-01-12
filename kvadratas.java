package masyvai2;

public class Masyvai2 {

    public static void main(String[] args) {
        int[][] kvadratas = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i = 0; i < kvadratas.length; i++) {
            int[] eilute = kvadratas[i];
            for (int j = 0; j < eilute.length; j++){
                int elementas = eilute[j];
                System.out.print(elementas + " ");
            }
            System.out.println();
        }
    }
    
}
