package Stack_Queue;

import java.util.Arrays;
import java.util.Iterator;

public class Stack<T> implements Iterable<T> {
    private int countElements;
    private T [] stack;

    public Stack(int stackSize){
        this.stack=(T[]) new Object[stackSize];
        this.countElements=0;
    }

    public void push(T element){
        if(countElements==stack.length){
            resize();
        }
            stack[countElements]=element;
            countElements++;
    }
    public T pop(){
        if(countElements==0){
            return null;
        }else{

            countElements--;
            T k =stack[countElements];
            stack[countElements]=null;
            return k;
        }
            
      
    }

    public Stack<T> copy(){
        Stack copy = new Stack(stack.length);
        for(int i =0;i<countElements;i++){
            copy.stack[i]=stack[i];
            copy.countElements++;
        }
        return copy;
    }

    public int getSize(){return countElements;}

    public T peek(){return stack[countElements-1];}

    public boolean isEmpty(){return countElements==0;}
    public void resize(){
        T[] newStack=(T[]) new Object[stack.length*2];

        for(int i=0;i<countElements;i++){
            newStack[i]=stack[i];
        }

        stack=newStack;
    }

    @Override
    public String toString() {
        return "Stack [stack=" + Arrays.toString(stack) + "]";
    }

    private class StackIterator implements Iterator<T>{
        private int i=countElements;
        public boolean hasNext(){return i>0;}
        public T next(){i--;return stack[i]; }
        public void remove(){}

    }
    public Iterator<T> iterator(){
        return new StackIterator();
    }
}


