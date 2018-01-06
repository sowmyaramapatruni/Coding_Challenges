public class Tree {
    public Node root;
    /**
     * Perform Inorder on BST to get Ascending order of elements
     */
    public void inOrderTraversal(Node node) {
       if (node != null){
           inOrderTraversal(node.left);
	   visit(node);
           inOrderTraversal(node.right);
       }
    }

    public void preOrderTraversal(Node node) {
        if (node != null){
	    visit(node);
	    preOrderTraversal(node.left);
	    preOrderTraversal(node.right);
	}
    }

    public void postOrderTraversal(Node node){
        if(node != null){
	    postOrderTraversal(node.left);
	    postOrderTraversal(node.right);
	    visit(node);
	}
    }
    public void visit(Node node){
        System.out.println(node.name);
    }
}
