import java.util.*;

public class BSTree {
	private Node root;
	private int size;

	public BSTree() {
		root = null;
		size = 0;
	}

	public Node root() {return root;}

	public boolean isEmpty() {return root == null;}

	public int size() {return size;}

	public void insert(String s) {
		if (isEmpty()) {
			root = new Node(s, null, null, null);
			size = 1;
		} else insert(s, root);
	}

	private void insert(String s, Node node) {
		if (s.compareTo(node.getElement()) < 0 && node.hasLeft()) insert(s, node.getLeft());
		if (s.compareTo(node.getElement()) < 0 && !node.hasLeft()) {
			Node newNode = new Node(s, null, null, node);
			node.setLeft(newNode);
			size++;
		}
		if (s.compareTo(node.getElement()) > 0 && node.hasRight()) insert(s, node.getRight());
		if (s.compareTo(node.getElement()) > 0 && !node.hasRight()) {
			Node newNode = new Node(s, null, null, node);
			node.setRight(newNode);
			size++;
		}

	}

	public boolean isPresent(String s) {return find(s, root) != null;}

	//
	// s is present if we can find a node that contains s
	//

	private Node find(String s, Node node) {
		if (node == null) return null;
		if (s.compareTo(node.getElement()) < 0)	return find(s, node.getLeft());
		if (s.compareTo(node.getElement()) > 0)	return find(s, node.getRight());
		return node;
	}

	//
	// given a node and a string s, deliver a Node with element equal to s or
	// deliver null
	// (0) if the node is null return null
	// (1) if s is less than the element in the node
	// then search for s is in the tree rooted at the left child ... otherwise
	// (2) if s is greater than the element in the node
	// then search for s is in the tree rooted at the right child ... otherwise
	// (3) it's not greater, it's not less, so it must be equal ... return the
	// node!
	//

	public int height() {return height(root);}

	private int height(Node node) {
		if (node == null) return -1;
		return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
	}

	public void preorder() {preorder(root);}

	private void preorder(Node node) {
		if (node != null) {
			System.out.println(node.getElement());
			preorder(node.getLeft());
			preorder(node.getRight());
		}
	}

	public void inorder() {inorder(root);}

	private void inorder(Node node) {
		if (node != null) {
			inorder(node.getLeft());
			System.out.println(node.getElement());
			inorder(node.getRight());
		}
	}

	public void postorder() {postorder(root);}

	private void postorder(Node node) {
		if (node != null) {
			postorder(node.getLeft());
			postorder(node.getRight());
			System.out.println(node.getElement());
		}
	}

	public void bfs() {	bfs(root);}

	private void bfs(Node node) {
		LinkedList<Node> Q = new LinkedList<Node>();
		Q.add(node);
		while (!Q.isEmpty()) {
			Node first = Q.removeFirst();
			System.out.println(first.getElement());
			if (first.getLeft() != null) Q.add(first.getLeft());
			if (first.getRight() != null) Q.add(first.getRight());
		}
	}

	public void dfs() {dfs(root);}

	private void dfs(Node node) {
		Stack<Node> S = new Stack<Node>();
		S.push(node);
		while (!S.isEmpty()) {
			Node top = S.pop();
			System.out.println(top.getElement());
			if (top.getRight() != null) S.push(top.getRight());
			if (top.getLeft() != null) S.push(top.getLeft());
		}
	}

	public void delete(String s) {
		Node node = find(s, root);
		if (node == null) return;
		if (node.isRoot() && node.isLeaf()) root = null;
		else if (node.isRoot() && !node.hasLeft() && node.hasRight()) {
			root = node.getRight();
			root.setParent(null);
		} else if (node.isRoot() && node.hasLeft() && !node.hasRight()) {
			root = node.getLeft();
			root.setParent(null);
		} else
			delete(node);
		size--;
	}

	private void delete(Node node) {
		if (node.isInternal()) {
			Node minNode = getMin(node.getRight());
			node.setElement(minNode.getElement());
			deleteNotInternal(minNode);
		} else
			deleteNotInternal(node);
	}

	private Node getMin(Node node) {
		if (node.hasLeft())
			return getMin(node.getLeft());
		else
			return node;
	}

	private void deleteNotInternal(Node node) {
		Node v = node.getParent();
		if (node.isRightChild() && !node.hasLeft())
			v.setRight(node.getRight());
		else if (node.isRightChild() && !node.hasRight())
			v.setRight(node.getRight());
		else if (node.isLeftChild() && !node.hasLeft())
			v.setLeft(node.getRight());
		else if (node.isLeftChild() && !node.hasRight())
			v.setLeft(node.getLeft());
	}

	public String toString() {
		return traverse(root);
	}

	private String traverse(Node node) {
		if (node == null)
			return "-";
		else {
			String s = "(";
			s = s + traverse(node.getLeft()) + ",";
			s = s + node.getElement();
			s = s + "," + traverse(node.getRight());
			s = s + ")";
			return s;
		}
	}

}
