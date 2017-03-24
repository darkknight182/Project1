package FirstProject;


public class ExampleString {
    public static void main(String[] args){
        String x = "James Dean";
        System.out.println("Hello " + x);
        System.out.println(x.toUpperCase());
        System.out.println(x.toLowerCase());
        System.out.println(x.substring(2));
        System.out.println(x.substring(2,7));
        System.out.println(x.charAt(3));

        String age = "37";
        String salary = "78965.83";
        //turn string to int
        int a = Integer.parseInt(age) + 2;//numbers
        System.out.println(a);
        double s = Double.parseDouble(salary) *.15;//decimal values
        System.out.println(s);



    }
}
