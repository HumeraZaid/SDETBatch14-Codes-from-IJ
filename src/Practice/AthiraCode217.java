package Practice;

import java.util.ArrayList;
import java.util.List;

public class AthiraCode217 {
    public static void main(String[] args ){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(5);
        int n = countDuplicates(list);
        System.out.println(n);
    }

    static int countDuplicates(List<Integer> numbers) {
        int c = 0;
        List<Integer> count = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                {
                    if(count.size()>0) {
                        if (!count.contains(numbers.get(i))) {
                            if (i != j) {
                                if (numbers.get(i) == numbers.get(j)) {
                                    count.add(numbers.get(i));
                                }
                            }
                        }
                    }
                    else if(count.size()==0)
                    {
                        if (i != j) {
                            if (numbers.get(i) == numbers.get(j)) {
                                count.add(numbers.get(i));
                            }
                        }
                    }
                }
            }
        }

        c = count.size();
        return c;
    }
}
