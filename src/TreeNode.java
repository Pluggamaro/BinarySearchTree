public class TreeNode<T extends Comparable<T>> {
    T data;
    //left and right extension of node
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

}