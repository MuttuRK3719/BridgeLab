package LogicalDay2;

import java.util.stream.IntStream;

public class PrintNum {
    public static void main(String[] args) {
        printNum(1,100);
    }
    static void printNum(int start,int end){
        IntStream
                .rangeClosed(start,end)
                .forEach(System.out::println);
    }
}
