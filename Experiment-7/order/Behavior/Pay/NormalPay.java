package work_seven.order.Behavior.Pay;

import work_seven.order.Behavior.PayBehavior;

/**
 * @author Zhang Jinming
 * @date 12/18/2022 11:19 PM
 */
public class NormalPay implements PayBehavior {
    @Override
    public void pay() {
        System.out.println("支付100元");
    }
}
