public class Visit{

    public static int add(int x, int y){
if(y==0){
    return x;
}
else{
    return add(x,y-1)+1;
}
}
public static void main(String[] args) {
SimpleTree at = new SimpleTree();

// int [] t1 ={6,5,3};
// for(int i:t1){
//     at.add(7);
// }

// System.out.println(add(3,3));
BinaryTree tree = new BinaryTree();

    int [] t1={3,5,7,4,6,8};

    for(int i : t1)
        tree.add(i);

System.out.println("LevelOrder");
tree.levelOrderTraversal(tree.root);

System.out.println("Inorder");
tree.inOrderTraversal(tree.root);
}

}

