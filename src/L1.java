public class L1 {
    public static void main(String[] args) {

    }
    public static int Counter(Node<Point> hehe, int h) {
        int length = 0;
        int lengthChecker = 0;
        Node<Point> backup = hehe;
        while (hehe != null) {
            if (hehe.getValue().GetY() == h) {
                lengthChecker++;
            } else if (lengthChecker != 0 && hehe.getValue().GetY() != h) {
                if (lengthChecker > length) {
                    length = lengthChecker;
                    lengthChecker = 0;
                }
                hehe = hehe.getNext();
            }

        }
        return length;
    }
}