package com.lingdonge.db.db;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.lingdonge.core.bean.common.ModelDBItem;
import com.lingdonge.core.bean.base.ModelPair;
import com.lingdonge.db.jdbc.DBUtils;
import org.junit.Test;

import java.util.List;

public class DBUtilsTest {
    @Test
    public void testParseSQL() throws Exception {


        List<ModelDBItem> listItems = Lists.newArrayList();
        listItems.add(new ModelDBItem("mobile", "mob"));
        listItems.add(new ModelDBItem("crated", "crated"));
        listItems.add(new ModelDBItem("test", null));

        ModelPair<Object[]> pair = DBUtils.parseSQL("1688", listItems);

        System.out.println(pair.getKey());
        System.out.println(Joiner.on("===").join(pair.getValue()));

    }

    @Test
    public void testParseSQL2() {

        List<String> listColumns = Lists.newArrayList();
        listColumns.add("id");
        listColumns.add("mobile");
        listColumns.add("source");

        String sqlText = DBUtils.parseSQLText("1688", listColumns, true);

        System.out.println("SQL：");
        System.out.println(sqlText);

    }
}
