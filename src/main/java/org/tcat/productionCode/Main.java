package org.tcat.productionCode;


import org.tcat.productionCode.vo.TableVo;

/**
 * Created by Lin on 2016/8/24.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        TableVo tableVo = TabelData.getData("iw$activities_trade", "iw$");
        ModelType.modelForMrWorld(tableVo);
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

}
