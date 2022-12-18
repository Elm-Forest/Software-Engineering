package work_seven.order.Entity;

import work_seven.order.Behavior.PayBehavior;
import work_seven.order.Customer;

/**
 * @author Zhang Jinming
 * @date 12/18/2022 11:02 PM
 */
public class SuperVip extends Customer {
    public SuperVip(PayBehavior liveBehavior) {
        super(liveBehavior);
    }
    @Override
    public void pay() {
        System.out.println("超级vip用户");
        super.pay();
    }
}
