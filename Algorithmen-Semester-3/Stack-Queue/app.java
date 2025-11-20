package FHDW;

import FHDW.Queue;
import FHDW.Stack;

public class app {
public static void main(String[] args) {
    Queue q = new Queue<String>(30);
    Stack stapel = new Stack<Integer>(5);

    stapel.push(12);
    System.out.println(stapel);

}
}
