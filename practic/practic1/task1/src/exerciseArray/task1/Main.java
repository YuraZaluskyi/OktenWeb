package exerciseArray.task1;

public class Main {
    public static void main(String[] args) {

        int [] newArr = {2,17,13,6,22,31,45,66,100,-18};

        SomeArray arr = new SomeArray(newArr);

        System.out.println("loop while");
        arr.printWhile();
        System.out.println("");
        System.out.println("------------------------------");

        System.out.println("loop for");
        arr.printFor();
        System.out.println("");
        System.out.println("------------------------------");

        System.out.println("print odd index of array loop by while");
        arr.whileOddIndex();
        System.out.println("");
        System.out.println("------------------------------");

        System.out.println("print odd index of array loop by for");
        arr.forOddIndex();
        System.out.println("");
        System.out.println("------------------------------");

        System.out.println("print odd only even number from array loop by while");
        arr.evenNumberWhile();
        System.out.println("");
        System.out.println("------------------------------");

        System.out.println("print odd only even number from array loop by for");
        arr.evenNumberFor();
        System.out.println("");
        System.out.println("------------------------------");

        System.out.println("print array inverse loop by for");
        arr.inverseArrFor();
        System.out.println("");
        System.out.println("------------------------------");

        System.out.println("print array inverse loop by while");
        arr.inverseArrWhile();
        System.out.println("");
        System.out.println("------------------------------");

        System.out.println("print array inverse only odd index loop by while");
        arr.inverseArrOddIndexWhile();
        System.out.println("");
        System.out.println("------------------------------");

        System.out.println("print array inverse only odd index loop by for");
        arr.inverseArrOddIndexFor();
        System.out.println("");
        System.out.println("------------------------------");

        System.out.println("print array inverse only even number loop by while");
        arr.inverseArrEvenNumberWhile();
        System.out.println("");
        System.out.println("------------------------------");

        System.out.println("print array inverse only even number loop by for");
        arr.inverseArrEveNumberFor();
        System.out.println("");
        System.out.println("------------------------------");





    }

}
