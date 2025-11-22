public class SimpleTree {
    Node first;

    public void add(int n){
        if(first == null){
            first = new Node(n);
        }else{
            Node currentNode = first;
            while(currentNode.next!=null){
                currentNode=currentNode.next;
                currentNode.next = new Node(n);
            }
        }

    }
    public void print(){
        Node cn = first;
        while(cn != null){
            cn.toString();
            cn = cn.next;
        }
    }
    public void deleteLast(){
      Node  currentNode = first;
        while(currentNode.next.next!=null){
           currentNode= currentNode.next;
        }
        currentNode.next=null;
    }

    public boolean delete(int k){
        Node currentNode = first;

        if(k==1){
            first=currentNode.next;
            currentNode.next=null;
            return true;
        }
        for(int i=2;i<k;i++){
            if(currentNode.next==null){
                return false;
            }
            currentNode=currentNode.next;
        }
        currentNode.next =currentNode.next.next;
        return true;
    }
    
}
