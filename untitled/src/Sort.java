public class Sort {
    public static void main(String[] args) {
        int[] a={2,7,9,5,1,6};
        //哈哈11
        sort(a);
        print(a);
    }





    public static void sort(int[] a) {
        for(int i = 1; i < a.length; ++i) {
            for(int j = i; j > 0; --j) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }

    }

    public static void print(int[] a) {
        for(int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }

    }
}
