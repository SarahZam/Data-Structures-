package Trees;

public class BST {

	public static void main(String[] args) {
		
		Tree intTree = new Tree();
		
		intTree.insert(25);
		intTree.insert(20);
		intTree.insert(15);
		intTree.insert(27);
		intTree.insert(30);
		intTree.insert(29);
		intTree.insert(26);
		intTree.insert(22);
		intTree.insert(32);
		
		/*----------25---------
		 * --------/---\-------
		 * ------20-----27------
		 *------/--\----/--\-----
		 *-----15--22--26---30
		 *------------------/-\-
		 *-----------------29-32
		 */
		
		System.out.println("Inorder Traversal: ");
		intTree.traverseInOrder();
		//15,20,22,25,26,27,29,30,32
		
		//preorder=25,20,15,22,27,26,30,29,32
		System.out.println();
		System.out.println("Preorder Traversal: ");
		intTree.traversePreOrder();
		
		//post-order 15,22,20,26,29,32,30,27,25
		System.out.println();
		System.out.println("Postorder Traversal: ");
		intTree.traversePostOrder();
		
		
		//get
		System.out.println();
		System.out.println(intTree.get(27));
		System.out.println(intTree.get(17));
		System.out.println(intTree.get(29));
		System.out.println(intTree.get(99));
		
		//min&max
		System.out.println(intTree.min());
		System.out.println(intTree.max());
		
		//delete
		//intTree.insert(17);
		//intTree.delete(32);
		//intTree.delete(17);
		intTree.delete(20);
		intTree.traverseInOrder();
		
		
	}
}
