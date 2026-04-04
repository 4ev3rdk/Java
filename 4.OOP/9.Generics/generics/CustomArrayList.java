
//this is basic class object eg of arraylist how arraylist internally work
package generics;

import java.util.Arrays;

public class CustomArrayList {


        private int[] data;    //array instance intialization
        private static int DEFAULTSIZE=10;
        private int size=0;

        public CustomArrayList(){
            this.data=new int[DEFAULTSIZE];   //replaces above array here we did nothing but just added size if there were values then the values would have been replaced
        }
    public void add(int num){
        if(isFull()) {
            resize();
        }
        data[size++]=num;
    }

    public boolean isFull(){
     return size== data.length;

    }
    public void resize(){
        int [] temp=new int[data.length *2];
        //copy the current array in new array
        for(int i=0; i<data.length;i++){
            temp[i]=data[i];
        }
        //data still point to old array[size=10] so we have to make it new
        data=temp;
    }
public void remove(){
    int removed=data[--size];
    System.out.println(removed);
}

public void get(int index){
    System.out.println(  data[index]);
}
public void size(){

    System.out.println(size);
}

public void set(int index, int value){
    data[index]=value;
}
    public void display(){
    for(int i=0; i<data.length;i++){
        System.out.println(data[i]);
    }
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(2);
        list.add(4);
        list.remove();
        list.get(0);
        list.size();
        list.set(0,10);
        list.get(0);

        System.out.println(list);

//     list.display();
    }
}
