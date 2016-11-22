package org.tcat.productionCode;

import freemarker.template.TemplateException;
import org.tcat.productionCode.vo.TableVo;

import javax.swing.filechooser.FileSystemView;
import java.io.*;

/**
 * Created by Lin on 2016/9/9.
 */
public class ModelType {


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
                .getHomeDirectory().getAbsolutePath()).append(File.separator).append("db").append(File.separator).append("ddeng_biz").append(File.separator).append("model");
        StringBuilder daoPath = new StringBuilder(FileSystemView.getFileSystemView()
                .getHomeDirectory().getAbsolutePath()).append(File.separator).append("db").append(File.separator).append("ddeng_biz").append(File.separator).append("dao");
        StringBuilder servicePath = new StringBuilder(FileSystemView.getFileSystemView()
                .getHomeDirectory().getAbsolutePath()).append(File.separator).append("db").append(File.separator).append("ddeng_biz").append(File.separator).append("service");
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
            ModelToFile.modelToFile(tableVo, "ddeng_biz\\Model.model", new OutputStreamWriter(new FileOutputStream(new File(modelPath.toString(), new StringBuilder(tableVo.getTblNameUppercase()).append(".java").toString())), "UTF-8"));
            ModelToFile.modelToFile(tableVo, "ddeng_biz\\Dao.model", new OutputStreamWriter(new FileOutputStream(new File(daoPath.toString(), new StringBuilder(tableVo.getTblNameUppercase()).append("Dao.java").toString())), "UTF-8"));
            ModelToFile.modelToFile(tableVo, "ddeng_biz\\DaoImpl.model", new OutputStreamWriter(new FileOutputStream(new File(daoPath.toString(), new StringBuilder(tableVo.getTblNameUppercase()).append("DaoImpl.java").toString())), "UTF-8"));
            ModelToFile.modelToFile(tableVo, "ddeng_biz\\Service.model", new OutputStreamWriter(new FileOutputStream(new File(servicePath.toString(), new StringBuilder(tableVo.getTblNameUppercase()).append("Service.java").toString())), "UTF-8"));
            ModelToFile.modelToFile(tableVo, "ddeng_biz\\ServiceImpl.model", new OutputStreamWriter(new FileOutputStream(new File(servicePath.toString(), new StringBuilder(tableVo.getTblNameUppercase()).append("ServiceImpl.java").toString())), "UTF-8"));
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
                .getHomeDirectory().getAbsolutePath()).append(File.separator).append("db").append(File.separator).append("mr_world").append(File.separator).append("dao");
        File file = new File(dtoPath.toString());
        if (!file.isDirectory()) {
            file.mkdirs();
        }

        try {
            ModelToFile.modelToFile(tableVo, "mr_world\\DTO.model", new OutputStreamWriter(new FileOutputStream(new File(dtoPath.toString(), new StringBuilder(tableVo.getTblNameUppercase()).append("DTO.java").toString())), "UTF-8"));
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
