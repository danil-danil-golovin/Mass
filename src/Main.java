public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.print(weight[i] + ",");
        }


        System.out.println();
        double[] Weight = {1.57, 7.654, 9.986};
        for (int i = 0; i < Weight.length; i++) {
            System.out.print(Weight[i]);
            if (i != Weight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        int[] arr = {1, 2, 3};
        for (int q = arr.length - 1; q >= 0; q--) {
            System.out.print(arr[q] + ", ");
        }
        System.out.println();
        double[] arr1 = {1.57, 7.654, 9.986};
        for (int w = arr1.length - 1; w >= 0; w--) {
            System.out.print(arr1[w] + ", ");
        }
        System.out.println();


        int[] i = {1, 2, 3};
        for (int s = 0; s<i.length; s++){
            if (i[s] %2 != 0){
                i[s]++;
            }
            if(s!=0){
                System.out.print(i[s] + ", ");
            }
        }
      }
    }






