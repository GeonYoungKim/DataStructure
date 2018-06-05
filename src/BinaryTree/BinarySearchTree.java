package BinaryTree;

public class BinarySearchTree {
	private TreeNode root = new TreeNode();

	public TreeNode insertKey(TreeNode root, char x) {
		TreeNode p = root;
		TreeNode newNode = new TreeNode(x);

		if (p == null) {
			return newNode;
		} else if (p.data < x) {
			p.rightNode = insertKey(p.rightNode, x);
		} else if (p.data > x) {
			p.leftNode = insertKey(p.leftNode, x);
		}

		return p;
	}

	public void insertBST(char x) {
		root = insertKey(root, x);
	}
	
	public TreeNode searchBST(char x) {
		TreeNode root=this.root;
				
		while(root!=null) {
			if(root.data<x) {
				root=root.rightNode;
			}else if(root.data>x) {
				root=root.leftNode;
			}else {
				return root;
			}
		}
		return root;
	}
	
	public void inorder(TreeNode root) {
		if(root!=null) {
			inorder(root.leftNode);
			System.out.println(root.data);
			inorder(root.rightNode);
		}
	}
	public void printBST() {
		inorder(root);
		System.out.println();
	}
}
