package org.tcat.productionCode;


import org.tcat.productionCode.vo.TableVo;

/**
 * Created by Lin on 2016/8/24.
 */
public class Main {

    public static void main(String[] args) throws Exception {
//        TableVo tableVo = TabelData.getData("supplier$shop", "supplier$");
//        ModelType.modelForWarehouse(tableVo);
//        ModelType.modelForDdengBiz(tableVo);
//        ModelType.modelForAssembleSQL(tableVo);
        TableVo tableVo = TabelData.getData("product$draft", null);
        ModelType.modelForMrWorld(tableVo);
    }

}
