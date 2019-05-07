package queue;

public class MyArrayQueue {
    public static final int SEGMENT = 8;
    int[] a;
    int size = 0;

    MyArrayQueue() {
        a = new int[SEGMENT];
        size = 0;
    }

    public void push(int value) {
        if (a.length == size) {
            increaseCapacity();
        }
        a[size] = value;
        size++;
    }

    public void showStack() {
        System.out.println("the size is: " + size + "/" + a.length + " ");
        int[] b = new int[a.length + SEGMENT];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        a = b;
    }

    public void increaseCapacity() {
        int[] b = new int[a.length + SEGMENT];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        a = b;
    }

    public int peek() {
        return a[size - 1];
    }

    public int pop() {
        if (size == 0) {
            return 0;
        }
        int value = a[0];
        for (int i = 0; i < size; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = 0;
        size--;
        return value;
    }
}
