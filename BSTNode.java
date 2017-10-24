public class BSTNode {
	public Comparable data;
	public BSTNode left;
	public BSTNode right;
	public BSTNode root;

	public BSTNode(Comparable value){
		data = value;
		left = null;
		right = null;
	}

	public void setLeft(BSTNode n)
	{
	  left = n;
	}

	public void setRight(BSTNode n)
	{
	  right = n;
	}

	public BSTNode getLeft()
	{
	  return left;
	}

	public BSTNode getRight()
	{
	  return right;
	}

	public void setData(int d)
	{
	  data = d;
	}

	public Comparable getData()
	{
	  return data;
	}
}