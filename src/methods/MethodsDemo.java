package methods;

import com.sun.security.jgss.GSSUtil;

public class MethodsDemo {
    public static void main(String[] args) {
        MethodsDemo.nNumbers(10);
        MethodsDemo.addArrayElements();
        String concetedString = MethodsDemo.concetString("yeshwant");
        String string = concetedString + "vishla";

        // array operation
        String[] names = {"vishal","yeshwnat","vamsi"};
        String[] namesCapital = MethodsDemo.names(names);
        for (String name : namesCapital){
            System.out.println(name);
        }

        // non-static methods
        MethodsDemo generalObject = new MethodsDemo();
        boolean eligible = generalObject.isEligibleForVote(10);
        System.out.println(eligible);
        int[] arr = {12,5,4,8,5,6,5,4,550};
        int[] ans = generalObject.multiply(arr,5);
        for (int num : ans){
            System.out.print(num+" ");
        }

    }

    // static method with argument
    public static void nNumbers(long n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    // static method without arguments
    public static void addArrayElements() {
        System.out.println("add Array Elements method");
        int[] array = {1, 3, 3, 4, 4, 5, 5, 6, 6};
        int sum = 0;
        // advance for loop
        for (int arr : array) {
            sum += arr;
        }
        System.out.println(sum);
    }

    // static method with arguments and with return type
    public static int addA(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }
    // static method with return type
    public static String concetString(String a) {
        System.out.println("concet string method");
        String b = "";
        char[] chars = a.toCharArray();
        int n = 0;
        while (n != a.length()) {
            b += chars[n];
            n++;
        }
        return b;
    }
    String str ="hai";
    String[] a = new String[20];

    // static method with return type is array;
    public static String[] names(String[] str){
        int n = str.length;
        for (int i=0;i<n;i++){
            str[i]= str[i].toUpperCase();
        }
        return str;
    }

    // Non-static method
    // you have to create objects

    public boolean isEligibleForVote(int age){
        if (age>20){
            return true;
        }else {
            return false;
        }
    }
    public int[] multiply(int[] arr,int num){
        System.out.println("Multiply array element method");
        int n = arr.length;
        for (int i=0;i<n;i++){
            arr[i] = arr[i]*num;
        }
        return arr;
    }
}
