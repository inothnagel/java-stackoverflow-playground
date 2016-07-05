import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by inothnagel on 2016/07/04.
 */
public class SortDoubleArrayWithStringAndIntTest {

    @Test
    public void test() {
        String[][] data = {
                {"first", "1"},
                {"fourth", "4"},
                {"third", "3"},
                {"second", "2"},
        };

        String[][] expectedData = {
                {"fourth", "4"},
                {"third", "3"},
                {"second", "2"},
                {"first", "1"},
        };

        SortDoubleArrayWithStringAndInt sorter = new SortDoubleArrayWithStringAndInt(data);
        sorter.sort();
        assertThat(data, is(expectedData));
    }
}