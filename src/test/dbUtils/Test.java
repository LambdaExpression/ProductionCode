package dbUtils;

import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Lin on 2016/9/9.
 */
public class Test {

    /**
     * 生成 客户 的sql语句（因为部分字段是一个sql的关键字，所以 客户 的语句只能自己手动拼接）
     *
     * @param client
     * @param type
     *            sql类型 1：插入语句 ；2：更新语句
     * @return
     */
    private static String getClientSQL(Client client, Integer type) {
        if (client == null || type == null) {
            return null;
        }
        StringBuilder sql = new StringBuilder();
        List<String> key = new ArrayList<String>();
        List<String> value = new ArrayList<String>();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (client.getId() != null) {
            key.add("`id`");
            value.add(String.valueOf(client.getId()));
        }
        if (client.getGroupId() != null) {
            key.add("`groupId`");
            value.add(String.valueOf(client.getGroupId()));
        }
        if (client.getClientName() != null
                && !"".equals(client.getClientName().trim())) {
            key.add("`clientName`");
            value.add(new StringBuffer().append("\"")
                    .append(client.getClientName()).append("\"").toString());
        }
        if (client.getProvinceId() != null) {
            key.add("`provinceId`");
            value.add(String.valueOf(client.getProvinceId()));
        }
        if (client.getCityId() != null) {
            key.add("`cityId`");
            value.add(String.valueOf(client.getCityId()));
        }
        if (client.getAreaId() != null) {
            key.add("`areaId`");
            value.add(String.valueOf(client.getAreaId()));
        }
        if (client.getProvince() != null
                && !"".equals(client.getProvince().trim())) {
            key.add("`province`");
            value.add(new StringBuffer().append("\"")
                    .append(client.getProvince()).append("\"").toString());
        }
        if (client.getCity() != null
                && !"".equals(client.getCity().trim())) {
            key.add("`city`");
            value.add(new StringBuffer().append("\"")
                    .append(client.getCity()).append("\"").toString());
        }
        if (client.getArea() != null
                && !"".equals(client.getArea().trim())) {
            key.add("`area`");
            value.add(new StringBuffer().append("\"")
                    .append(client.getArea()).append("\"").toString());
        }
        if (client.getStreet() != null
                && !"".equals(client.getStreet().trim())) {
            key.add("`street`");
            value.add(new StringBuffer().append("\"")
                    .append(client.getStreet()).append("\"").toString());
        }
        if (client.getName() != null
                && !"".equals(client.getName().trim())) {
            key.add("`name`");
            value.add(new StringBuffer().append("\"")
                    .append(client.getName()).append("\"").toString());
        }
        if (client.getPhone() != null
                && !"".equals(client.getPhone().trim())) {
            key.add("`phone`");
            value.add(new StringBuffer().append("\"")
                    .append(client.getPhone()).append("\"").toString());
        }
        if (client.getQq() != null
                && !"".equals(client.getQq().trim())) {
            key.add("`qq`");
            value.add(new StringBuffer().append("\"")
                    .append(client.getQq()).append("\"").toString());
        }
        if (client.getEmail() != null
                && !"".equals(client.getEmail().trim())) {
            key.add("`email`");
            value.add(new StringBuffer().append("\"")
                    .append(client.getEmail()).append("\"").toString());
        }
        if (client.getTelephone() != null
                && !"".equals(client.getTelephone().trim())) {
            key.add("`telephone`");
            value.add(new StringBuffer().append("\"")
                    .append(client.getTelephone()).append("\"").toString());
        }
        if (client.getCreateTime() != null) {
            key.add("`createTime`");
            value.add(new StringBuffer().append("'")
                    .append(df.format(client.getCreateTime()))
                    .append("'").toString());
        }
        if (client.getUpdateTime() != null) {
            key.add("`updateTime`");
            value.add(new StringBuffer().append("'")
                    .append(df.format(client.getUpdateTime()))
                    .append("'").toString());
        }
        if (key.size() == 0) {
            return null;
        }
        if (new Integer(1).equals(type)) {
            sql.append("INSERT INTO tbl_client (")
                    .append(StringUtils.join(key, ",")).append(") values(")
                    .append(StringUtils.join(value, ",")).append(")");
        } else if (new Integer(2).equals(type)) {
            List<String> set = new ArrayList<String>();
            for (int i = 0; i < key.size(); i++) {
                set.add(new StringBuilder().append(" ").append(key.get(i))
                        .append(" = ").append(value.get(i)).append(" ")
                        .toString());
            }
            //TODO 更新语句需要自己根据实际情况追加条件
            sql.append("UPDATE tbl_client SET")
                    .append(StringUtils.join(set, ","))
                    .append(" WHERE 1=1 ");
        }

        return sql.toString();
    }

    public static void main(String[] args) {
        Client client=new Client();
        client.setCity("123456");
        client.setCreateTime(new Date());
        client.setAreaId(12);
        System.out.println(getClientSQL(client,1));
        System.out.println(getClientSQL(client,2));
    }

}
