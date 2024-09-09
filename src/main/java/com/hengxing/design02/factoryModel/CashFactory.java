package com.hengxing.design02.factoryModel;

import com.hengxing.design02.factoryModel.impl.CashNormal;
import com.hengxing.design02.factoryModel.impl.CashRebate;
import com.hengxing.design02.factoryModel.impl.CashRefund;

/**
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 9/9/2024 23:28:53
 */
public class CashFactory {
    public CashSuper createCashAccept(String cashType) {
        switch (cashType) {
            case "正常":
                return new CashNormal();
            case "打9折":
                return new CashRebate(0.9);
            case "满100返20":
                return new CashRefund(100.0, 20.0);
        }
        return null;
    }
}
