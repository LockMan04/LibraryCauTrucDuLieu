
public class BST {
    private BSTNode root;
    // private int size;

    public BST() {
        root = null;
    }

    public BST(BSTNode root) {
        this.root = root;
    }

    // Kiểm tra cây rỗng
    public boolean isEmpty() {
        return root == null;
    }

    // Tìm một key
    public boolean search(int val) {
        return search(root, val);
    }

    private boolean search(BSTNode r, int val) {
        boolean found = false;
        while ((r != null) && !found) {
            int rval = r.getData();
            if (val < rval)
                r = r.getLeft();
            else if (val > rval)
                r = r.getRight();
            else {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    }

    // Thêm một node
    public void insert(int data) {
        root = insert(root, data);
    }

    private BSTNode insert(BSTNode node, int data) {
        if (node == null) {
            return node = new BSTNode(data);
        } else {
            if (data == node.getData()) {
                System.out.println("Giá trị " + data + " đã tồn tại trong cây.");
                return node;
            }
            if (data < node.getData())
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }

    // Xoá một node
    public void delete(int k) {
        if (root == null)
            System.out.println("BST rỗng ");
        else if (search(k) == false)
            System.out.println("Key " + k + " không có trong BST!");
        else {
            root = delete(root, k);
            System.out.println(k + " đã xóa khỏi cây BST.");
        }
    }

    private BSTNode delete(BSTNode root, int k) {
        BSTNode p, p2, n;
        if (root.getData() == k) {
            BSTNode lt, rt;
            lt = root.getLeft();
            rt = root.getRight();
            if (lt == null && rt == null)
                return null;
            else if (lt == null) {
                p = rt;
                return p;
            } else if (rt == null) {
                p = lt;
                return p;
            } else {
                p2 = rt;
                p = rt;
                while (p.getLeft() != null)
                    p = p.getLeft();
                p.setLeft(lt);
                return p2;
            }
        }
        if (k < root.getData()) {
            n = delete(root.getLeft(), k);
            root.setLeft(n);
        } else {
            n = delete(root.getRight(), k);
            root.setRight(n);
        }
        return root;
    }

    // Đếm số node
    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(BSTNode r) {
        if (r == null)
            return 0;
        else {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }

    // Duyệt Posorder
    public void inorder() {
        inorder(root);
    }

    private void inorder(BSTNode r) {
        if (r != null) {
            inorder(r.getLeft());
            System.out.print(r.getData() + " ");
            inorder(r.getRight());
        }
    }

    // Duyệt Preorder
    public void preorder() {
        preorder(root);
    }

    private void preorder(BSTNode r) {
        if (r != null) {
            System.out.print(r.getData() + " ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }

    // Duyệt Posorder
    public void posorder() {
        posorder(root);
    }

    private void posorder(BSTNode r) {
        if (r != null) {
            posorder(r.getLeft());
            posorder(r.getRight());
            System.out.print(r.getData() + " ");
        }
    }

    // Tính chiều cao
    public int heghtNode() {
        return heghtNode(root);
    }

    public int heghtNode(BSTNode root) {
        if (root == null) {
            return 0;
        } else {
            int helghtLeft = heghtNode(root.getLeft());
            int helghtRight = heghtNode(root.getRight());
            return Math.max(helghtLeft, helghtRight) + 1;
        }
    }

    // Tìm node nhỏ nhất
    public int minValue() {
        return minValue(root);
    }

    private int minValue(BSTNode root) {
        if (root == null) {
            return -1;
        }
        while (root.getLeft() != null) {
            root = root.getLeft();
        }

        return root.getData();
    }

    // Tìm node lớn nhất
    public int maxValue() {
        return maxValue(root);
    }

    private int maxValue(BSTNode root) {
        if (root == null) {
            return -1;
        }
        while (root.getRight() != null) {
            root = root.getRight();
        }

        return root.getData();
    }

    // Đếm số node lá
    public int countLeaf() {
        return countLeaf(root);
    }

    private int countLeaf(BSTNode root) {
        if (root == null) {
            return 0;
        }
        if (root.getLeft() == null && root.getRight() == null) {
            return 1;
        }
        return countLeaf(root.getLeft()) + countLeaf(root.getRight());
    }

    // Đếm số node có 1 con
    public int count1Leaf() {
        return count1Leaf(root);
    }

    private int count1Leaf(BSTNode root) {
        if (root == null) {
            return 0;
        }
        if ((root.getLeft() != null && root.getRight() == null) ||
                root.getLeft() == null && root.getRight() != null) {
            return 1;
        }
        return count1Leaf(root.getLeft()) + count1Leaf(root.getRight());
    }

    // Đếm số node có 1 con bên trái
    public int count1LeafLeft() {
        return count1LeafLeft(root);
    }

    private int count1LeafLeft(BSTNode root) {
        int leftCount, rightCount, count = 0;
        if (root == null)
            return 0;
        if (root.getLeft() != null && root.getRight() == null)
            count++;

        leftCount = count1LeafLeft(root.getLeft());
        rightCount = count1LeafLeft(root.getRight());
        count = count + leftCount + rightCount;
        return count;
    }

    // Đếm số node có 1 con bên phải
    public int count1LeafRight() {
        return count1LeafRight(root);
    }

    private int count1LeafRight(BSTNode root) {
      int leftCount, rightCount, count = 0;
        if (root == null)
            return 0;
        if (root.getLeft() == null && root.getRight() != null)
            count++;

        leftCount = count1LeafLeft(root.getLeft());
        rightCount = count1LeafLeft(root.getRight());
        count = count + leftCount + rightCount;
        return count;
    }

    // Đếm số node có 2 con
    public int count2Leaf() {
        return count2Leaf(root);
    }

    private int count2Leaf(BSTNode root) {
        if (root == null) {
            return 0;
        }
    
        int count = 0;
        if (root.getLeft() != null && root.getRight() != null) {
            count = 1;
        }
    
        int leftCount = count2Leaf(root.getLeft());
        int rightCount = count2Leaf(root.getRight());
    
        return count + leftCount + rightCount;
    }

    // Duyệt cây theo chiều ngang
    public void printLevelOrder() {
        int h = heghtNode();
        int i;
        for (i = 1; i <= h; i++) {
            printLevelOrder(root, i);
        }
    }

    public void printLevelOrder(BSTNode root, int level) {
        if (root == null)
            return;
        if (level == 1) {
            System.out.print(root.getData() + " ");
        } else if (level > 1) {
            printLevelOrder(root.getLeft(), level - 1);
            printLevelOrder(root.getRight(), level - 1);
        }
    }

    // Đếm số node có data >= x
    public int largerThanX(int x) {
        return largerThanX(root, x);
    }

    public int largerThanX(BSTNode root, int x) {
        if (root == null)
            return 0;
        int c = 0;
        if (root.getData() >= x)
            c++;
        c += largerThanX(root.getLeft(), x);
        c += largerThanX(root.getRight(), x);
        return c;
    }

    /*
     * Kiểm tra cây nhị phân có đầu đủ hay không? (cây có đủ 2 node con hoặc không
     * có con)
     */
    public boolean isFullTree() {
        return isFullTree(root);
    }

    public boolean isFullTree(BSTNode root) {
        if (root == null)
            return true; // Cây rỗng trả về true/false tuỳ đề bài
        if (root.getLeft() != null && root.getRight() != null) {
            return true;
        }
        if (root.getLeft() != null && root.getRight() != null) {
            return (isFullTree(root.getLeft()) && isFullTree(root.getRight()));
        }

        return false;
    }
}