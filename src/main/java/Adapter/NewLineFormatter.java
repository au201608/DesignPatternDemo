package Adapter;

/**
 * Created by thuang on 2/7/17.
 */
public class NewLineFormatter implements TextFormattable {
    @Override
    public String formatText(String text) {
        String formattedText = text.replace(".","\n");
        return formattedText;
    }
}
