import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.TreeMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashMap<Student, Integer> hashMap = new HashMap<>();
        Student s1 = new Student("Hùng"); // thêm mới và chỉnh sửa
        hashMap.put(new Student("Nam"), 5); // thêm mới và chin sửa
        TreeMap<Student, Integer> treeMap = new TreeMap<>();
        treeMap.put(null, 12);
    }
}
