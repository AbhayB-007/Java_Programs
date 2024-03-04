package Alpha_Batch_4_0;

public class Practice {
    public static void main(String[] args) {
        System.out.println("1, 2, 3, 4, 5");
        //Print Star Pattern
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        byte b = 4;
        char c = 'a';
        short s = 512;
        int i1 = 1000;
        float f = 3.14f;
        double d = 99.9954;

        var result = (f * b) + (i1 % c) - (d * s);
        System.out.println("(f * b) : " + (f * b));
        System.out.println("(i % c) : " + (i1 % 97));
        System.out.println("(d * s) : " + (d * s));
        System.out.println("result : " + result);

        int $ = 25;
        System.out.println($);

        int count = 0;
        String[] arr = new String[]{"50", "40", "30", "20", "10"};
        System.out.println(String.join(", ", arr));
        for (int i = 0; i < arr.length - 1; i++) {
            if (Integer.parseInt(arr[i]) > Integer.parseInt(arr[i + 1])) {
                String temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1;
            }
            count++;
        }
        System.out.println(String.join(", ", arr));
        System.out.println("Total no of times loop is executed : " + count);
    }
}
