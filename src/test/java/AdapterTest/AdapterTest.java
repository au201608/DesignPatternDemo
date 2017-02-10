package AdapterTest;

import Adapter.*;
import org.junit.Test;

/**
 Allows for two incompatible classes to work together by wrapping an interface around one of the existing classes.
 A set of patterns whose objective is to identify how to realize relationships between classes and objects in a simple way.
 This pattern is typically used when an incompatible module needs to be integrated with an existing module without making
 any source code modifications.
 */
public class AdapterTest {
    @Test
    public void textFormatText() throws Exception {
        String testString = " Formatting line 1. Formatting line 2. Formatting line 3.";
        TextFormattable newLineFormatter = new NewLineFormatter();
        String resultString = newLineFormatter.formatText(testString);
        System.out.println(resultString);

        CsvFormattable csvFormatter = new CsvFormatter();
        TextFormattable csvAdapter = new CsvAdapterImpl(csvFormatter);
        String resultCsvString = csvAdapter.formatText(testString);
        System.out.println(resultCsvString);
    }
}
