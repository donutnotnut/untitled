public class T1 {
    public static void main(String[] args) {
        BinNode<Integer> test = new BinNode<>(new BinNode<>(2), 1, new BinNode<>(3));
        test.printTreeByLevel(test);
        aight(test);
        test.printTreeByLevel(test);
    }

    public static void aight(BinNode<Integer> goofy) {
        BinNode<Integer> second = new BinNode<>(new BinNode<>(0),0,new BinNode<>(0));
        BinNode<Integer> backup= second;
        BinNode<Integer> backup1= goofy;
        flipper(goofy, second);
        second=backup;
        goofy=backup1;
        goofy=second;
    }
    public static void flipper(BinNode<Integer> tree, BinNode<Integer> out){
        if (tree != null) {
            out.setLeft(tree.getRight());
            out.setRight(tree.getLeft());

            flipper(tree.getLeft(), out.getRight());
            flipper(tree.getRight(), out.getLeft());
        }
    }
    public static boolean checker(BinNode<Integer> one, BinNode<Integer> two){
        aight(one);
        return identicalTrees(one,two);
    }
    public static  boolean identicalTrees(BinNode<Integer> a, BinNode<Integer> b)
    {
        if (a == null && b == null)
            return true;

        if (a != null && b != null)
            return (a.getValue() == b.getValue()
                    && identicalTrees(a.getLeft(), b.getLeft())
                    && identicalTrees(a.getRight(), b.getRight()));

        return false;
    }
}
