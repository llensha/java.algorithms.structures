package lesson6.homework6;

import lesson6.Tree;
import lesson6.TreeImpl;

import java.util.Random;

public class CheckBalancedTree {
    private static final int MAX_LEVEL = 4;
    private static final int COUNT_TREE = 20;
    private static final int RANGE_RANDOM = 25;
    private static int countNotBalanced = 0;

    public static void main(String[] args) {
        createAndCheckTree();
        System.out.println((countNotBalanced * 100 / COUNT_TREE) + "% несбалансированных деревьев");
    }

    private static void createAndCheckTree() {
        for (int i = 0; i < COUNT_TREE; i++) {
            Tree<Integer> tree = new TreeImpl<>(MAX_LEVEL);
            Random random = new Random();
            for (int j = 0; j < Math.pow(2,MAX_LEVEL) - 1; j++) {
                tree.add(random.nextInt(RANGE_RANDOM * 2 + 1) - RANGE_RANDOM);
            }
            boolean isTreeBalanced = tree.isBalanced(tree.getRoot());
            if (!isTreeBalanced) {
                countNotBalanced++;
            }
        }

    }
}
