package com.microsoft.bingads.v10.api.test.entities.ads.expandedText.write;

import com.microsoft.bingads.v10.api.test.entities.ads.expandedText.BulkExpandedTextAdTest;
import com.microsoft.bingads.v10.bulk.entities.BulkExpandedTextAd;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkExpandedTextAdWriteToRowValuesPath2Test extends BulkExpandedTextAdTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"path2", "path2"},
            {"", ""},
            {null, null},});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Path 2", this.datum, this.propertyValue, new BiConsumer<BulkExpandedTextAd, String>() {
            @Override
            public void accept(BulkExpandedTextAd c, String v) {
                c.getExpandedTextAd().setPath2(v);
            }
        });
    }
}
