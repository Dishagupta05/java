import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class stringcomperator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}

class stringcomperator1 implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.length()-o1.length();
    }
}

public class comperator {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(87);
        l1.add(23);
        l1.add(65);
        l1.add(3);

        l1.sort(new stringcomperator());
        System.out.println(l1);

        List<String> l2 = Arrays.asList("Apple","Banana","Mango");
        l2.sort((a,b)->b.length()-a.length());
        System.out.println(l2);

    }
}
