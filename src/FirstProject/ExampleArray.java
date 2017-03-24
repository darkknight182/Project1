package FirstProject;

public class ExampleArray {
    public static void main(String[] args){
        int[] a = {10,20,30,40,50};
        //print just certain numbers
        System.out.println(a[2] + " " + a[4]);
        //print all numbers
        for(int variable : a){
            System.out.println(variable);
        }
        System.out.println("---------");
        int[]x = new int[5];
        x[3] = 35;
        x[0] = 12;
        for(int variable2: x){
            System.out.println(variable2);
        }
        System.out.println("---------");
        String[]st = {"one","two","three"};
        for(String variable3: st){
            System.out.println(variable3);
        }
    }

}
