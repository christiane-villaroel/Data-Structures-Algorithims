import java.util.Arrays;
import java.util.stream.IntStream;

public class Array {
    private int size;
    private int [] array;

    Array(){
        size =1;
    }
    Array(int length){
        this.size=length;
        array = new int[size];
    }
    public void insert (int item){

        if (isFull(this.array,this.size)){
            this.size = size +1;
            int [] newArr = new int[size];
            for (int i = 0; i < size-1; i++) {
                newArr[i]=this.array[i];
            }
            newArr[size-1]=item;
            this.array = new int[size];
            for (int i = 0; i < size; i++) {
                this.array[i] = newArr[i];
            }
        }else {
            int i = 0;
            while (i<size){
                if (array[i] <= 0){
                    array[i] = item;
                    break;
                }
                i++;
            }
        }
    }
    public void removeAt(int index){
        if(index>=size)
            System.out.println("Array index does not exist");
        else if (array[index]>0) {
            int [] updateArray = new int[this.size];
            int insertNext = this.array[index+1];//stores value next value after element being removed

            updateArray[index]=insertNext;
            if(this.array[index+2]>0)
                updateArray[index+1]=this.array[index+2];
            for (int i = 0; i < size; i++) {
                if(i==index||i==index+1)
                    continue;
                updateArray[i]=this.array[i];
            }
            this.size = size-1;
            this.array = new int[this.size];
            for (int i =0; i < size; i++){
                this.array[i]=updateArray[i];
            }
        }
    }
    public int indexOf(int index){

        if(!(index>=size)){
            int number = this.array[index];
            Arrays.sort(this.array);
            if(number<array[size/2]){

            }

        }
        return -1;
    }
    public void print(){
        for(int number:this.array)
            System.out.println(number);
    }
    static boolean isFull (int[] arr, int size ){
        int count =0;
        for(int i=0; i < size; i++){
            if (!(arr[i]<=0))
                count++;
        }
        return count == size;
    }
}
