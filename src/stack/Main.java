package stack;

public class Main {
    public static void main(String[] args) {
        MyArrayStack ms = new MyArrayStack();
        ms.push(7);
        ms.push(11);
        ms.push(12);
        ms.push(12);
        ms.push(12);
        ms.push(12);
        ms.push(12);
        ms.push(12);
        ms.push(14);

        ms.showStack();
        System.out.println("ultimu elem este: " + ms.peek());
        ms.push(16);
        ms.push(11);
        ms.showStack();
        System.out.println("ultimu elem este: " + ms.peek());
        System.out.println("elementul sters este: " + ms.pop());
        ms.showStack();
        ms.push(14);
        ms.showStack();

        MyLinkedListStack ml = new MyLinkedListStack();
        ml.push(9);
        ml.push(8);
        ml.push(6);
        ml.push(4);

        ml.show();
        System.out.println("elementul sters este: " + ml.pop());
        ml.show();
        System.out.println("elementul sters este: " + ml.pop());
        ml.show();


    }
}
