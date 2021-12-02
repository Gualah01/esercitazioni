import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IntSet {
    private List<Integer> elements;

    public IntSet(){
        elements = new ArrayList<Integer>();
    }
    
    public void add(int value){
        elements.add(value);
    }

    public void remove(int value){
        elements.remove(value);
    }

    public int choose(){
        if(elements.isEmpty())
            throw new EmptyException("List is empty!");

        Random rand = new Random();
        return elements.get(rand.nextInt(elements.size()));
    }

    public int size(){
        return elements.size();
    }

    public boolean contains(int x){
        return elements.contains(x);
    }

    @Override
    public String toString(){
        String s = "";
        for (int elem:elements) {
            s += "{" + elem + "},";
        }
        return s.substring(0, s.length() - 1);
    }
}
