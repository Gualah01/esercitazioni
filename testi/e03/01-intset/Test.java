import java.util.List;

public class Test {
    public static void main(String[] args) {
        IntSet list = new IntSet();

        //list.choose();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(8);
        System.out.println(list.toString());

        list.remove(3);
        list.remove(2);
        System.out.println(list.toString());
        System.out.printf("Size: %d\n", list.size());
        int x = 4, y = 8;
        System.out.printf("Contains '%d': %B\n", x, list.contains(x));
        System.out.printf("Contains '%d': %B\n", y, list.contains(y));
    }    
}
