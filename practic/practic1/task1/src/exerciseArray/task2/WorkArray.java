package exerciseArray.task2;

public class WorkArray {

    int[] arr;

    public WorkArray(){

    }

    public WorkArray(int[] arr) {
        this.arr = arr;
    }

//     methods_______________________________________________________________________________________________

    public void arrEvenNumber() {
        int num = (int) (Math.random() * 100);
        for (int i = 0; i < 50; i++) {
            while (num % 2 != 0) {
                num = (int) (Math.random() * 100);
            }
            arr[i] = num;
            num = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
    }

    public void arrOddNumber(){
        int num = (int)(Math.random() * 100);
        for (int i = 0; i < 50; i++) {
            while (num %2 == 0){
                num = (int) (Math.random() * 100);
            }
            arr[i] = num;
            num = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
    }

    public int[] randomArr(int min, int max, int size){
        int [] randArr = new int[size];
        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = (int) (Math.random() * (max - min)) + min;
        }
        return randArr;
    }

    public void everyThirdElem(){
        for (int i = 2; i < arr.length; i+=3) {
            System.out.print(arr[i] + " ");
        }
    }

    public void everyThirdEvenElem(){
        for (int i = 2; i < arr.length; i+=3) {
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }

    public int[] arrEveryThirdEvenElem(){
        int size = 0;
        for(int i = 2; i < arr.length; i+=3){
            if(arr[i] % 2 == 0){
                size++;
            }
        }

        System.out.println("size = " + size);

        int[] arrEvenThird = new int[size];
        int j = 0;
        for(int i = 2; i < arr.length; i+=3){
            if(arr[i] % 2 == 0){
                arrEvenThird[j] = arr[i];
                j++;
            }
        }
        return arrEvenThird;
    }
}
