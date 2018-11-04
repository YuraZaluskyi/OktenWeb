package exerciseArray.task2;
/*
*  Створити пустий масив та :
1. Заповнити його 50 парними числами.
2. Заповнити його 50 непарними числами.

 1. используя Math.random заполнить массив из ??? элементов.
 диапазон рандома ??? до ???.
 2. Вывести на консоль  каждый третий елемент
 3. Вывести на консоль  каждый третий елемент
 но при условии что он имеет парное значение.
 4. Вывести на консоль  каждый третий елемент
 но при условии что он имеет парное значение и
 записать их в другой массив.
* */

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int [] arr = new int[50];
        WorkArray workArray = new WorkArray(arr);



        System.out.println("Only even numbers");
        workArray.arrEvenNumber();
        System.out.println("");
        System.out.println("-------------------------------------------------------");

        System.out.println("Only odd numbers");
        workArray.arrOddNumber();
        System.out.println("");
        System.out.println("-------------------------------------------------------");

        System.out.println("array any size, from any min to any max filled random numbers");
        System.out.println(Arrays.toString(workArray.randomArr(10,100,5)));
        System.out.println("");
        System.out.println("-------------------------------------------------------");

        System.out.println("every third element");
        int[] arr1 = workArray.randomArr(10,50,31);
        System.out.println(Arrays.toString(arr1));
        WorkArray workArray1 = new WorkArray(arr1);
        workArray1.everyThirdElem();
        System.out.println("");
        System.out.println("-------------------------------------------------------");

        System.out.println("every third element if it is even");
        System.out.println(Arrays.toString(arr1));
        workArray1.everyThirdEvenElem();
        System.out.println("");
        System.out.println("-------------------------------------------------------");

        System.out.println("every third element if it is even to new array");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(workArray1.arrEveryThirdEvenElem()));
        System.out.println("");
        System.out.println("-------------------------------------------------------");







    }
}
