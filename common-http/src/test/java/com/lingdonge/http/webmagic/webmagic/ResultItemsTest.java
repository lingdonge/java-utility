package com.lingdonge.http.webmagic.webmagic;


import com.lingdonge.http.webmagic.ResultItems;
import org.junit.Test;

/**
 * @author code4crafter@gmail.com
 */
public class ResultItemsTest {

    @Test
    public void testOrderOfEntries() throws Exception {
        ResultItems resultItems = new ResultItems();
        resultItems.put("a", "a");
        resultItems.put("b", "b");
        resultItems.put("c", "c");
//        assertThat(resultItems.getAll().keySet()).containsExactly("a","b","c");

    }
}
