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
        TableVo tableVo = TabelData.getData("supplier$shop", "supplier$");
        ModelType.modelForMrWorld(tableVo);
        tableVo = TabelData.getData("supplier$shop_banner", "supplier$");
        ModelType.modelForMrWorld(tableVo);
        tableVo = TabelData.getData("supplier$shop_introduce", "supplier$");
        ModelType.modelForMrWorld(tableVo);
        tableVo = TabelData.getData("supplier$shop_section", "supplier$");
        ModelType.modelForMrWorld(tableVo);
    }

}
