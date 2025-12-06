package Semester3.Algorithmen.StackQueue;
import Semester3.Algorithmen.StackQueue.Klausurvorbereitung.queue;
public class app {
public static void main(String[] args) {
    Queue q = new Queue<String>(30);
    Stack stapel = new Stack<Integer>(5);
    queue schlange = new queue(20);
    schlange.addItem("Hi");
    stapel.push(12);
    System.out.println(schlange.toString());

}
}
