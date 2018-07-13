package stringsandarrays;

public class StringFunctions {

    public static void main(String[] args) {
        String name1 = "Pallavi";
        String name2 = "Pallavi";
        String test = "This is Test String.";
        if (name1.compareTo(name2) > 0) {
            System.out.println("Name 1 is Bigger");
        } else if (name1.compareTo(name2) < 0) {
            System.out.println("Name 2 is Bigger");
        } else {
            System.out.println("Name 1 is Same as Name 2.");
        }
        System.out.println("Length of test is " + test.length());
        System.out.println(test.indexOf("r"));
        
    }
}
