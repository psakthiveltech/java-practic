package Streams.primitiveStream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Intstreams {
    public static void main(String[] args){
        int[]arr = {10,48,566,75,12,34,89,456,12,101,1,2,25};
        IntStream val = Arrays.stream(arr);
        System.out.println(val.max());
    }
}