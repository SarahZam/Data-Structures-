package Trees;

public class Tree {
	
	public TreeNode root;
	
	//not allow duplicate value
	
	public void insert(int value) {
		if(root == null) {
			root=new TreeNode(value);
		}
		
		else {
			root.insert(value);
		}
	}
	
	public TreeNode get(int value) {
		if(root != null) {
			return root.get(value);
		}
		return null;
	}
	
	public void delete(int value) {
		root = delete(root,value);
	}
	
	private TreeNode delete(TreeNode subtree, int value) {
		if(subtree==null) {
			return subtree;
		}
		
		if(value<subtree.getData()) {
			subtree.setLeftChild(delete(subtree.getLeftChild(),value));
		}
		
		else if(value>subtree.getData()) {
			subtree.setRightChild(delete(subtree.getRightChild(),value));
		}
		
		else {
			if(subtree.getLeftChild()==null) {
				return subtree.getRightChild();
			}
			else if(subtree.getRightChild()==null) {
				return subtree.getLeftChild();
			}
			
			subtree.setData(subtree.getRightChild().min());
			
			subtree.setRightChild(delete(subtree.getRightChild(),subtree.getData()));
		}
		
		return subtree;
	}
	
	public int min() {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		else {
			return root.min();
		}
	}
	
	public int max() {
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		else {
			return root.max();
		}
	}
	
	public void traverseInOrder() {
		if(root != null) {
			root.traverseInOrder();
		}
	}
	
	public void traversePreOrder() {
		if(root != null) {
			root.traversePreOrder();
		}
	}
	

	public void traversePostOrder() {
		if(root != null) {
			root.traversePostOrder();
		}
	}
	

}
