package lesson8;

public class Main {
    static int j = 22;
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        Operationable operationable = Integer::sum;

        System.out.println(operationable.calculate(5,6));
        Printable<Integer,String> printable = (x1,x2)-> System.out.println(x1+x2+" " );
        printable.print(10,"FS");
        Operationable operationable1 = (x1,x2)->{
            j = 100;
          if(x1<x2){
              return x1+x2+j;
          } else
              return x1*x2+j;

        };
        System.out.println(operationable1.calculate(x,y));
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(sumOdd(nums, n-> n % 2!=0));
    }
    public static int sumOdd(int[] x, Odd odd){
        int result = 0;
        for (int i:x) {
            if(odd.isOdd(i)){
                result+=i;
            }
        }
        return result;
    }
}
