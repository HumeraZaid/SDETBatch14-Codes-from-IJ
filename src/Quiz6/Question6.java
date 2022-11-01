package Quiz6;

public class Question6 {

   public static void main(String[] args) {
        interface HasTail {
            int getTailLength();

        }
        abstract class Puma implements HasTail {

        }
        class Cougar extends Puma {


            protected int getTailLength() {

                return 4;
            }

   public int getTailLength(int length) {

                return 2;
            }
        }
    }
}
