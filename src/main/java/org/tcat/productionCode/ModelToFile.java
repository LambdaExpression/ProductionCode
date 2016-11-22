package org.tcat.productionCode;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.tcat.tools.BeansConverter;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 把数据和模板结合，生成文件
 * Created by Lin on 2016/8/24.
 */
public class ModelToFile {

    /**
     * 把数据和模板结合，生成文件
     *
     * @param data  数据
     * @param model 模板路径(默认选择models文件夹下的模板)
     * @param out   输出文件路径
     * @throws IOException
     * @throws TemplateException
     */
    public static void modelToFile(Object data, String model, OutputStreamWriter out) throws IOException, TemplateException {
        File modelFile=new File(model);
        if(!isAbsolutePath(model)){
            modelFile=new File("src\\main\\java\\org\\tcat\\productionCode\\models",model);
        }
        Configuration cfg = new Configuration();
        cfg.setDirectoryForTemplateLoading(modelFile.getParentFile());
        Template template = cfg.getTemplate(modelFile.getName());
        template.process(BeansConverter.beanToMap(data), out);
        out.flush();
    }

    /**
     * 传入路径，返回是否是绝对路径，是绝对路径返回true，反之
     *
     * @param path
     * @return
     */
    private static boolean isAbsolutePath(String path) {
        if (path.startsWith("/") || path.indexOf(":") > 0) {
            return true;
        }
        return false;
    }

}
