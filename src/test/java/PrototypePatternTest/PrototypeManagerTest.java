package PrototypePatternTest;

import PrototypePattern.DocumentPrototypeManager;
import PrototypePattern.PrototypeCapableDocument;
import org.junit.Test;

/**
 * Created by thuang on 2/7/17.
 */
public class PrototypeManagerTest {
    @Test
    public void testGetClonedDocument() throws Exception {
        PrototypeCapableDocument clonedTAndC = DocumentPrototypeManager.getconedDocument("tandc");
        clonedTAndC.setVendorName("Mary Parker");
        System.out.println(clonedTAndC);
        PrototypeCapableDocument clonedNDA = DocumentPrototypeManager.getconedDocument("nda");
        clonedNDA.setVendorName("Patrick Smith");
        System.out.println(clonedNDA);

        PrototypeCapableDocument clonedTAndC1 = DocumentPrototypeManager.getconedDocument("tandc");
        clonedTAndC1.setVendorName("T1 TT");
        System.out.println(clonedTAndC1);
        PrototypeCapableDocument clonedNDA1 = DocumentPrototypeManager.getconedDocument("nda");
        clonedNDA1.setVendorName("Tony Huang");
        System.out.println(clonedNDA1);
    }
}
