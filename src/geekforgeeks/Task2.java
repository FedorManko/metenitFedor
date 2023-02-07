package geekforgeeks;

public class Task2 {
    public static void main(String[] args) {
        int [] v2 = {3, 2, 2, 7,4,5,5};
        System.out.println(average(v2, v2.length));
    }
    public static String average(int A[], int N){
        int sum = 0;
        for (int elem: A) {
            sum+=elem;
        }
        return String.format("%.2f",(double)sum/N);
    }
}
