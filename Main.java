public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(2);
        list.add(11);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(4);

        list.print();

        list.reverse();
        list.print();
    }
}