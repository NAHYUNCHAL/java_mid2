package collection.map.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleHistoryTest {
    static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.push("youtube.com");
        deque.push("google.com");
        deque.push("facebook.com");
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());

    }



}
