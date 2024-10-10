
public class multi_dim_arr {

    public static void main(String[] args) {
        int k = 0;
        int arr[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = k;
                k++;
                System.out.println("The value is: " + arr[i][j]);

            }
        }

    }

}
