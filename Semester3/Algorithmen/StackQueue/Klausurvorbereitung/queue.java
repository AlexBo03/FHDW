package Semester3.Algorithmen.StackQueue.Klausurvorbereitung;

import java.util.Arrays;

public class queue {
    private int head;
    private int tail;
    private String [] queue;
    private int size;

    public queue(int length){
    this.queue= new String[length];
    this.size =0;
    }

    public void addItem(String item){
        for(int i =0;i<0;i++){
            if(queue[i]==null){
                queue[i]=item;
            }
        }
    }

    @Override
    public String toString() {
        return "queue [queue=" + Arrays.toString(queue) + "]";
    }

    
}
