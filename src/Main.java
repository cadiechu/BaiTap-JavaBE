import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Math.E;

public class Main { 
    //Xây dựng giải thuật tìm kiếm tuyến tính và nhị phân trên 1 Array kiểu dữ liệu Generic
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1,5,3,97,5,5,7,5,88,5,5,5,6,877,874,646,46,4,787);
    }
    public static <T, E> int linearSearch(E value, T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }


}

