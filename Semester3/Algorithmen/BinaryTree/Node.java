public class Node {
int key;
Node next;


public Node(int n){
    key =  n;
}


@Override
public String toString() {
    return "Node [key=" + key + ", next=" + next + "]";
}

}
