import java.util.Arrays;

class OwnArrayList {
    private int[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    // Constructor
    public OwnArrayList() {
        data = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    // Add element at the end
    public void add(int value) {
        if (size == data.length) {
            resize();
        }
        data[size++] = value;
    }

    // Get element at index
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
        }
        return data[index];
    }

    // Remove element at index
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    // Current size
    public int size() {
        return size;
    }

    // Resize array when full
    private void resize() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    // Print elements
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        OwnArrayList list = new OwnArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.print(); // Output: 10 20 30

        System.out.println("Element at index 1: " + list.get(1)); // 20

        list.remove(1);
        list.print(); // Output: 10 30

        System.out.println("Size: " + list.size()); // 2
    }
}
