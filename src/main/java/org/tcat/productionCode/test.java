package org.tcat.productionCode;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Lin on 2016/11/23.
 */
public class test {

    public static void main(String[] args) throws IOException, TemplateException {
        Map<String, Object> map = new HashMap<>();
        map.put("constant", "constant");
        List<Object> list = new ArrayList();
        list.add("list1");
        list.add("list2");
        map.put("list", list);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("map1", "map1");
        map2.put("map2", "map2");
        map.put("map", map2);
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(new File("E:\\out\\text.txt")), "UTF-8");
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
        BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\test.model"));
        Template template = new Template("template", bufferedReader, cfg);
        template.process(map, out);
        out.flush();
    }
}
