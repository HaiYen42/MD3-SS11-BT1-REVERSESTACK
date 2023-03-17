import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
   static Scanner input = new Scanner(System.in);
    public static void revereStack(){
        Stack<Integer> stack= new Stack<>();
        Stack<Integer> reverseStack= new Stack<>();
        int n=5;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ"+ (i+1));
            int a= input.nextInt();
            stack.push(a);

        }
        System.out.println(stack);
//        for (int i =n-1; i>=0 ; i--) {
//            System.out.println(stack.get(i));
//        }
        for (int i = 0; i < n; i++) {
            int b= stack.pop();
            reverseStack.push(b);
        }
        System.out.println(reverseStack);

    }

    public static void reverseString(){
        Stack<String> strStack= new Stack<>();

        System.out.println("Nhập vào 1 chuỗi");
        String string= input.nextLine();
        String arr []= string.split("");
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            strStack.push(arr[i]);
        }
        System.out.println(strStack);
        String reversString="";
        for (int i = 0; i < arr.length; i++) {
            String c=strStack.pop();
            reversString+=c;
        }
        System.out.println(reversString.toLowerCase());

    }

}
