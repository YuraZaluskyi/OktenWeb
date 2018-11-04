package exerciseArray.task1;

public class SomeArray {

    int[] arr;

    public SomeArray(int[] arr) {
        this.arr = arr;
    }


//    methods________________________________________________________________________________________________________

    public void printWhile() {
        int index = 0;
        while (index < arr.length) {
            System.out.print(arr[index] + " ");
            index++;
        }
    }

    public void printFor() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void whileOddIndex() {
        int index = 0;
        while (index < arr.length) {
            if (index % 2 != 0) {
                System.out.print(arr[index] + " ");
            }
            index++;
        }
    }

    public void forOddIndex() {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }

        }
    }

    public void evenNumberWhile() {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] % 2 == 0) {
                System.out.print(arr[index] + " ");
            }
            index++;
        }
    }

    public void evenNumberFor() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }

        }
    }

    public void inverseArrFor() {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");

        }
    }

    public void inverseArrWhile() {
        int index = arr.length - 1;
        while (index >= 0) {
            System.out.print(arr[index] + " ");
            index--;

        }
    }

    public void inverseArrOddIndexWhile() {
        int index = arr.length - 1;
        while (index >= 0) {
            if (index % 2 != 0) {
                System.out.print(arr[index] + " ");
            }
            index--;
        }
    }

    public void inverseArrOddIndexFor(){
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }

        }

    }

    public void inverseArrEvenNumberWhile(){
        int index = arr.length - 1;
        while(index >= 0){
            if(arr[index] % 2 == 0){
                System.out.print(arr[index] + " ");
            }

            index--;
        }

    }

    public void inverseArrEveNumberFor(){
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }

        }
    }
}
