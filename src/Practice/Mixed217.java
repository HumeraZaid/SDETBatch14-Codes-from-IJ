package Practice;

import java.util.ArrayList;
import java.util.List;

public class Mixed217 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(3);
        numbers.add(3);
        numbers.add(5);
        int count = countDuplicates(numbers);
        System.out.println(count);
    }

    static int countDuplicates(List<Integer> numbers){
        List<Integer> a = new ArrayList<Integer>();
        int count = 0;
        int numCount;
        for(int i=0; i<numbers.size(); i++){
            numCount = 0;
            if(a.contains(numbers.get(i))){
                continue;
            }
            else{
                for(int j=0; j<numbers.size(); j++){
                    if(numbers.get(i) == numbers.get(j)){
                        numCount+=1;

                        a.add(numbers.get(i));
                    }
                }
                if(numCount > 1){
                    count++;
                }
            }

        }
        return count;
    }
}
