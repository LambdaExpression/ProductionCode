package org.tcat.productionCode;

import freemarker.template.TemplateException;
import org.apache.commons.io.FileUtils;
import org.tcat.productionCode.vo.TableVo;

import javax.swing.filechooser.FileSystemView;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;

/**
 * Created by Lin on 2016/9/9.
 */
public class ModelType {

    public static void model(TableVo tableVo, List<String> modelList) {
        if (Objects.isNull(tableVo) || Objects.isNull(modelList) || modelList.isEmpty()) {
            return;
        }
        String out = System.getProperty("user.dir") + File.separator + ".out";
        for (String model : modelList) {
            String name = "name";
            File file = new File(out);
            if (!file.isDirectory()) {
                file.mkdirs();
            }
            try {
                ModelToFile.modelToFile(tableVo, model, new OutputStreamWriter(new FileOutputStream(new File(out, name)), StandardCharsets.UTF_8));
                List<String> strList = FileUtils.readLines(new File(out, name));
                FileUtils.writeLines(new File(out, strList.get(0).split(":")[1]), strList.subList(1, strList.size()));
                FileUtils.forceDelete(new File(out, name));
            } catch (IOException | TemplateException e) {
                e.printStackTrace();
            }
        }
    }

    public static void modelForWarehouse(TableVo tableVo) {

        StringBuilder beanPath = new StringBuilder(FileSystemView.getFileSystemView()
                .getHomeDirectory().getAbsolutePath()).append(File.separator).append("db").append(File.separator).append("warehouse").append(File.separator).append("bean");
        StringBuilder daoPath = new StringBuilder(FileSystemView.getFileSystemView()
                .getHomeDirectory().getAbsolutePath()).append(File.separator).append("db").append(File.separator).append("warehouse").append(File.separator).append("dao");
        StringBuilder servicePath = new StringBuilder(FileSystemView.getFileSystemView()
                .getHomeDirectory().getAbsolutePath()).append(File.separator).append("db").append(File.separator).append("warehouse").append(File.separator).append("service");
        File file = new File(beanPath.toString());
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        file = new File(daoPath.toString());
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        file = new File(servicePath.toString());
        if (!file.isDirectory()) {
            file.mkdirs();
        }

        try {
            ModelToFile.modelToFile(tableVo, "warehouse\\Bean.model", new OutputStreamWriter(new FileOutputStream(new File(beanPath.toString(), new StringBuilder(tableVo.getTblNameUppercase()).append(".java").toString())), "UTF-8"));
            ModelToFile.modelToFile(tableVo, "warehouse\\Dao.model", new OutputStreamWriter(new FileOutputStream(new File(daoPath.toString(), new StringBuilder(tableVo.getTblNameUppercase()).append("Dao.java").toString())), "UTF-8"));
            ModelToFile.modelToFile(tableVo, "warehouse\\DaoImpl.model", new OutputStreamWriter(new FileOutputStream(new File(daoPath.toString(), new StringBuilder(tableVo.getTblNameUppercase()).append("DaoImpl.java").toString())), "UTF-8"));
            ModelToFile.modelToFile(tableVo, "warehouse\\Service.model", new OutputStreamWriter(new FileOutputStream(new File(servicePath.toString(), new StringBuilder(tableVo.getTblNameUppercase()).append("Service.java").toString())), "UTF-8"));
            ModelToFile.modelToFile(tableVo, "warehouse\\ServiceImpl.model", new OutputStreamWriter(new FileOutputStream(new File(servicePath.toString(), new StringBuilder(tableVo.getTblNameUppercase()).append("ServiceImpl.java").toString())), "UTF-8"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("文件找不到", e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("编码异常", e);
        } catch (IOException e) {
            throw new RuntimeException("IO异常", e);
        } catch (TemplateException e) {
            throw new RuntimeException("模板异常", e);
        }

    }

    public static void modelForDdengBiz(TableVo tableVo) {

        StringBuilder modelPath = new StringBuilder(FileSystemView.getFileSystemView()
                .getHomeDirectory().getAbsolutePath()).append(File.separator).append("db").append(File.separator).append("dd").append(File.separator).append("model");
        StringBuilder daoPath = new StringBuilder(FileSystemView.getFileSystemView()
                .getHomeDirectory().getAbsolutePath()).append(File.separator).append("db").append(File.separator).append("dd").append(File.separator).append("dao");
        StringBuilder servicePath = new StringBuilder(FileSystemView.getFileSystemView()
                .getHomeDirectory().getAbsolutePath()).append(File.separator).append("db").append(File.separator).append("dd").append(File.separator).append("service");
        File file = new File(modelPath.toString());
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        file = new File(daoPath.toString());
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        file = new File(servicePath.toString());
        if (!file.isDirectory()) {
            file.mkdirs();
        }

        try {
            ModelToFile.modelToFile(tableVo, "dd\\Model.model", new OutputStreamWriter(new FileOutputStream(new File(modelPath.toString(), new StringBuilder(tableVo.getTblNameUppercase()).append(".java").toString())), "UTF-8"));
            ModelToFile.modelToFile(tableVo, "dd\\Dao.model", new OutputStreamWriter(new FileOutputStream(new File(daoPath.toString(), new StringBuilder(tableVo.getTblNameUppercase()).append("Dao.java").toString())), "UTF-8"));
            ModelToFile.modelToFile(tableVo, "dd\\DaoImpl.model", new OutputStreamWriter(new FileOutputStream(new File(daoPath.toString(), new StringBuilder(tableVo.getTblNameUppercase()).append("DaoImpl.java").toString())), "UTF-8"));
            ModelToFile.modelToFile(tableVo, "dd\\Service.model", new OutputStreamWriter(new FileOutputStream(new File(servicePath.toString(), new StringBuilder(tableVo.getTblNameUppercase()).append("Service.java").toString())), "UTF-8"));
            ModelToFile.modelToFile(tableVo, "dd\\ServiceImpl.model", new OutputStreamWriter(new FileOutputStream(new File(servicePath.toString(), new StringBuilder(tableVo.getTblNameUppercase()).append("ServiceImpl.java").toString())), "UTF-8"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("文件找不到", e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("编码异常", e);
        } catch (IOException e) {
            throw new RuntimeException("IO异常", e);
        } catch (TemplateException e) {
            throw new RuntimeException("模板异常", e);
        }

    }

    public static void modelForAssembleSQL(TableVo tableVo) {

        StringBuilder path = new StringBuilder(FileSystemView.getFileSystemView()
                .getHomeDirectory().getAbsolutePath()).append(File.separator).append("db").append(File.separator).append("assembleSQL");
        File file = new File(path.toString());
        if (!file.isDirectory()) {
            file.mkdirs();
        }

        try {
            ModelToFile.modelToFile(tableVo, "assembleSQL\\AssembleSQL.model", new OutputStreamWriter(new FileOutputStream(new File(path.toString(), new StringBuilder(tableVo.getTblNameUppercase()).append(".java").toString())), "UTF-8"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("文件找不到", e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("编码异常", e);
        } catch (IOException e) {
            throw new RuntimeException("IO异常", e);
        } catch (TemplateException e) {
            throw new RuntimeException("模板异常", e);
        }

    }

    public static void modelForMrWorld(TableVo tableVo) {

        StringBuilder dtoPath = new StringBuilder(FileSystemView.getFileSystemView()
                .getHomeDirectory().getAbsolutePath()).append(File.separator).append("db").append(File.separator).append("mrw").append(File.separator).append("dao");
        File file = new File(dtoPath.toString());
        if (!file.isDirectory()) {
            file.mkdirs();
        }

        try {
            ModelToFile.modelToFile(tableVo, "mrw\\DTO.model", new OutputStreamWriter(new FileOutputStream(new File(dtoPath.toString(), new StringBuilder(tableVo.getTblNameUppercase()).append("DTO.java").toString())), "UTF-8"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("文件找不到", e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("编码异常", e);
        } catch (IOException e) {
            throw new RuntimeException("IO异常", e);
        } catch (TemplateException e) {
            throw new RuntimeException("模板异常", e);
        }

    }

    public static void modelForPo(TableVo tableVo) {

        StringBuilder dtoPath = new StringBuilder(FileSystemView.getFileSystemView()
                .getHomeDirectory().getAbsolutePath()).append(File.separator).append("db").append(File.separator).append("po");
        File file = new File(dtoPath.toString());
        if (!file.isDirectory()) {
            file.mkdirs();
        }

        try {
            ModelToFile.modelToFile(tableVo, "po\\po.model", new OutputStreamWriter(new FileOutputStream(new File(dtoPath.toString(), new StringBuilder(tableVo.getTblNameUppercase()).append("Po.java").toString())), "UTF-8"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("文件找不到", e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("编码异常", e);
        } catch (IOException e) {
            throw new RuntimeException("IO异常", e);
        } catch (TemplateException e) {
            throw new RuntimeException("模板异常", e);
        }

    }


    public static void modelForEntity(TableVo tableVo) {

        StringBuilder dtoPath = new StringBuilder(FileSystemView.getFileSystemView()
                .getHomeDirectory().getAbsolutePath()).append(File.separator).append("db").append(File.separator).append("entity");
        File file = new File(dtoPath.toString());
        if (!file.isDirectory()) {
            file.mkdirs();
        }

        try {
            ModelToFile.modelToFile(tableVo, "entity\\Entity.model", new OutputStreamWriter(new FileOutputStream(new File(dtoPath.toString(), new StringBuilder(tableVo.getTblNameUppercase()).append("Entity.java").toString())), "UTF-8"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("文件找不到", e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("编码异常", e);
        } catch (IOException e) {
            throw new RuntimeException("IO异常", e);
        } catch (TemplateException e) {
            throw new RuntimeException("模板异常", e);
        }

    }

}
