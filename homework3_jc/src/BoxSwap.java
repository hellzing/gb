
import java.util.Arrays;


    public class BoxSwap {
        private Object object;

        public BoxSwap(Object object) {
            this.object = object;
        }

        public Object getObject() {
            return object;
        }

        public void setObject(Object object) {
            this.object = object;
        }

        @Override
        public String toString() {
            return "Box{" +
                    "object=" + object +
                    '}';
        }
        public static BoxSwap[] swapBox(BoxSwap[] boxArray, int x, int y) {
            BoxSwap[] boxArray1 = new BoxSwap[boxArray.length];
            boxArray1[x]= boxArray[x];
            boxArray1[y] = boxArray[y];
            boxArray[x] = boxArray1[y];
            boxArray[y] = boxArray1[x];
            return boxArray;
        }


        public static void main(String[] args) {
            BoxSwap box1 = new BoxSwap(5);
            BoxSwap box2 = new BoxSwap(10);
            BoxSwap box3 = new BoxSwap("Test");

            BoxSwap[] boxArray = {box1, box2, box3};
            System.out.println(Arrays.toString(boxArray));
            swapBox(boxArray, 0, 2);
            System.out.println(Arrays.toString(boxArray));

        }
    }
