package org.tcat.productionCode;


import org.tcat.productionCode.vo.TableVo;

import java.util.Arrays;

/**
 * Created by Lin on 2016/8/24.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        model(TabelData.getData("com.github.lambdaexpression.dal.user", "user$resource", "user$"));
        model(TabelData.getData("com.github.lambdaexpression.dal.user", "user$role", "user$"));
        model(TabelData.getData("com.github.lambdaexpression.dal.user", "user$role_resource_rel", "user$"));
        model(TabelData.getData("com.github.lambdaexpression.dal.user", "user$user_role_rel", "user$"));


//        tableVo = TabelData.getData("bo$buying_request_read", "bo$");
//        ModelType.modelForMrWorld(tableVo);
//        tableVo = TabelData.getData("dd$district", "dd$");
//        ModelType.modelForPo(tableVo);
//        tableVo = TabelData.getData("product$industry", "product$");
//        ModelType.modelForPo(tableVo);
//        tableVo = TabelData.getData("product$category", "product$");
//        ModelType.modelForPo(tableVo);
//        tableVo = TabelData.getData("dd$trade_area", "dd$");
//        ModelType.modelForPo(tableVo);
//        tableVo = TabelData.getData("app$other", "app$");
//        ModelType.modelForMrWorld(tableVo);

    }

    private static void model(TableVo tableVo){
        ModelType.model(tableVo
                , Arrays.asList(
                        "mybatisPlug/Entity.ftl"
                        , "mybatisPlug/Query.ftl"
                        , "mybatisPlug/Mapper.ftl"
                        , "mybatisPlug/MapperXml.ftl"
                        , "mybatisPlug/Service.ftl"
                        , "mybatisPlug/ServiceImpl.ftl"
                )
        );
    }

}
