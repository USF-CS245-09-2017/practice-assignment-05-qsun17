public class BSTree{

	private BSTNode root;

	public BSTree(){
		root = null;
	}

	public boolean find(Comparable value){
		return find(value, root);
	}

	public boolean find(Comparable value, BSTNode node){
		if(node == null){
			return false;
		}
		if(node.data.compareTO(value) == 0){
			return true;
		}
		else if(node.data.compareTO(value) < 0){
			return find(value, node.left);
		}
		else{
			return find(value, node.right);
		}
	}

	public void print(BSTNode node){
		if(node == null){
			return;
		}
		print(node.left);
		System.out.print(node.data);
		print(node.right);
	}

	public BSTNode insert(Comparable value, BSTNode node){
		if(node == null){
			return new BSTNode(value);
		}
		if(node.data.compareTO(value) < 0){
			node.left = insert(value, node.left);
			return node;
		}
		else{
			node.right = insert(value, node.right);
			return node;
		}
	}

	public Comparable removeSmallest(BSTNode node){
		if(node.left.left == null){
			Comparable smallest = node.left.data;
			node.left = node.left.right;
			return smallest;
		}else{
			return removeSmallest(node.left);
		}
	}

	public BSTNode delete(BSTNode node, Comparable value){
		if(node == null){
			return null;
		}
		if(node.data.compareTO(value) == 0){
			if(node.left == null){
				return node.right;
			}
			else if(node.right == null){
				return node.left;
			}
			else{
				if(node.right.left == null){
					node.data = node.right.data;
					node.right = node.right.right;
					return node;
				}else{
					node.data = removeSmallest(node.right);
					return node;
				}
			}
		}else if(value.compareTO(node.data) < 0){
			node.left = delete(node.left, value);
		}
	}
	public String toStringInOrder()
	{
		return toStringInOrder(root);
	}

	private String toStringInOrder(BSTNode r)
	{
		String inorder = null;
		if (r != null)
		{
			toStringInOrder(r.getLeft());
			inorder = (r.getData() +" ");
			toStringInOrder(r.getRight());
		}
		return inorder;
	}

	public String toStringPreOrder()
	{
		return toStringPreOrder(root);
	}

	private String toStringPreOrder(BSTNode r)
	{
		String preorder = null;
		if (r != null)
		{
			preorder += (r.getData() +" ");
			toStringPreOrder(r.getLeft());
			toStringPreOrder(r.getRight());
		}
		return preorder;
	}
}