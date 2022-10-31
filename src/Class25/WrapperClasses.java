package Class25;

import java.util.ArrayList;

public class WrapperClasses {

    public static void main(String[] args) {

        int num = 10;
       // Integer wrappedNum = Integer.valueOf(num);  // Boxing or manual conversion from primitive to wrapper type
       // System.out.println(wrappedNum);

        Integer wrappedNum = 10; // AutoBoxing or automatic conversion of a primitive to a wrapper type
        System.out.println(wrappedNum);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);

        // int num2= wrappedNum.intValue();  // Unboxing or converting a wrapper type to a corresponding primitive type
        // System.out.println(num2);

        int num2 = wrappedNum; // Auto unboxing or automatic conversion of a wrapper type to a primitive type
        System.out.println(num2);
    }
}
