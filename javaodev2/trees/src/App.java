public class App {
    public static void main(String[] args) {

        BST tree = new BST();

        int[] values = {15, 10, 20, 8, 12, 16, 25};

        for (int value : values) {
            tree.root = tree.insert(tree.root, value);
        }

        if (tree.search(tree.root, 12)) {
            System.out.println("12 bulundu.");
        } 
        else {
            System.out.println("12 bulunamadı.");
        }

        if (tree.search(tree.root, 18)) {
            System.out.println("18 bulundu.");
        } 
        else {
            System.out.println("18 bulunamadı.");
        }

        int minValue = tree.findMin(tree.root);
        
        System.out.println("Minimum değer: " + minValue);
    }
}
