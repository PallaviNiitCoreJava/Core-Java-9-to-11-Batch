package stringsandarrays;

import java.util.Scanner;

public class StringsAndArrays {

    public static void main(String[] args) {

//        int a=10;
//        Integer b=new Integer(5);
//        a=b;
//        System.out.println("a= "+a);
//        System.out.println("b= "+b);
        Scanner sc = new Scanner(System.in);
        int id[] = new int[5];
        int tot=0;
        //Integer roll[]=new Integer[5];
        //Double d[]=new Double[2];
        for (int i = 0; i < id.length; i++) {
            System.out.println("Enter a Number : ");
            id[i] = sc.nextInt();
            tot=tot+id[i];
            
        }
        for (int i = 0; i < id.length; i++) {
            System.out.println("id = " + id[i]);
        }
        System.out.println("Total is "+tot);
    }
}
