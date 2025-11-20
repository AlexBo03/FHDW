package FHDW;

import java.util.Arrays;
import java.util.Iterator;

public class Queue<T> implements Iterable<T> {
private T[]queue;
private int head;
private int tail;
private int countElements;
public Queue(int size) {
    this.head = 0;
    this.tail = 0;
    this.countElements = 0;
    this.queue= (T[])new Object[size];
}


public void enque(T element){
    if(queue.length==countElements){
        resize();
    }
        queue[tail]=element;
        countElements++;
        tail=(tail+1)%queue.length;
    
    
}

public T deque(){

    T delete=queue[head];

    queue[head]=null;
    head=(head+1)%queue.length;
    countElements-=1;
    return delete;
}

public void resize(){
    T [] queue2=(T[])new Object[queue.length*2];

    for(int i=0;i<countElements;i++){
        queue2[i]=queue[head];
        head = (head+1)%queue.length;

    }

    head=0;
    tail=countElements;
    queue=queue2;
}


@Override
public String toString() {
    return "Queue [queue=" + Arrays.toString(queue) + "]";
}

 private class QueueIterator implements Iterator<T>{
        private int currentindex=head;
        private int visited =0;
        public boolean hasNext(){return visited<countElements;}
        public T next(){
            T value = queue[currentindex];
            currentindex=(currentindex+1)%queue.length;
            visited++;
            return value;  }
        public void remove(){}

    }
    public Iterator<T> iterator(){
        return new QueueIterator();
    }


}
