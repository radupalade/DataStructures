package queue;

public class Main {

    public static void main(String[] args) {
        MyLinkedListQueue mq = new MyLinkedListQueue();
        mq.push(3);
        mq.push(6);
        mq.push(4);
        mq.push(8);
        mq.show();
        mq.push(11);
        mq.show();
        System.out.println("prima valoare introdusa: " + mq.peek());
        System.out.println("prima valoare eliminata: " + mq.pop());
        mq.push(9);
        mq.show();
        System.out.println("prima valoare introdusa: " + mq.peek());
        System.out.println("prima valoare eliminata: " + mq.pop());

        MyArrayQueue ma = new MyArrayQueue();
        ma.push(3);
        ma.push(2);
        ma.push(4);
        ma.push(5);
        ma.showStack();
        System.out.println("ultimul element: " + ma.peek());
        System.out.println("elementul sters: " + ma.pop());


    }
}
