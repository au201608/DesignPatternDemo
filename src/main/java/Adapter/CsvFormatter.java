package Adapter;

/**
 * Created by thuang on 2/7/17.
 */
public class CsvFormatter implements CsvFormattable {
    @Override
    public String formatCsvText(String text) {
        String formattedText = text.replace(".",",");
        return formattedText;
    }
}
