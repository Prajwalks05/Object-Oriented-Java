
public class Linear_searchJava {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int key = 5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Key element matches at : " + arr[i]);
                break;
            } else {
                System.out.println("Key element does not match");

            }
        }

    }

}
