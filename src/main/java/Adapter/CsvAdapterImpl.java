package Adapter;

/**
 * Created by thuang on 2/7/17.
 */
public class CsvAdapterImpl implements TextFormattable {
    CsvFormattable csvFormattable;

    public CsvAdapterImpl(CsvFormattable csvFormattable) {
        this.csvFormattable = csvFormattable;
    }

    @Override
    public String formatText(String text) {
        String formattedText = csvFormattable.formatCsvText(text);
        return formattedText;
    }
}
