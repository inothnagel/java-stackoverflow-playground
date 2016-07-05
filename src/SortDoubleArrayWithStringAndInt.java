import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by inothnagel on 2016/07/04.
 */
public class SortDoubleArrayWithStringAndInt {
    String[][] data;

    public static void main(String[] args) {
        String[][] data = {
                {"first", "1"},
                {"fourth", "4"},
                {"third", "3"},
                {"second", "2"},
        };

//        Lambda syntax
        Arrays.sort(data, (o1, o2) -> Integer.valueOf(o1[1]) - Integer.valueOf(o2[1]));

//        Old syntax
        Arrays.sort(data, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
//                return Integer.valueOf(o1[1]) - Integer.valueOf(o2[1]);
                return Integer.valueOf(o2[1]).compareTo(Integer.valueOf(o1[1]));

            }
        });

//        Print for main loop
        for (String[] a : data) {
            System.out.println(a[0] + " " + a[1]);
        }
    }

    public SortDoubleArrayWithStringAndInt(String[][] data) {
        this.data = data;
    }

    public void sort() {
        Arrays.sort(this.data, (o1, o2) -> Integer.valueOf(o2[1]).compareTo(Integer.valueOf(o1[1])));
    }
}
