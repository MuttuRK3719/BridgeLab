package OOPSDay2;

public class DynamcArray {
    public static void main(String[] args) {
        DynamcArray d = new DynamcArray();
        d.add(10);
        d.add(20);
        d.add(30);
        d.add(40);
        d.add(50);
        System.out.println(d.get(4));
        System.out.println(d.size());

    }

    int[] arr = new int[1];
    int index = 0;

    public void add(int element) {
        if (index < arr.length)
            arr[index++] = element;
        else {
            int[] temp = resize();
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
            arr[index++] = element;
        }
    }

    public int get(int index) {
        return arr[index];
    }

    public int size() {
        return index;
    }

    public int[] resize() {
        return new int[2 * arr.length];
    }
}
