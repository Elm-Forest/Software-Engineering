package work_seven.order.Behavior.Pay;

import work_seven.order.Behavior.PayBehavior;

/**
 * @author Zhang Jinming
 * @date 12/18/2022 11:18 PM
 */
public class SuperVipPay implements PayBehavior {
    @Override
    public void pay() {
        System.out.println("支付80元");
    }
}
