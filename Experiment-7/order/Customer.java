package work_seven.order;

import work_seven.order.Behavior.PayBehavior;

/**
 * @author Zhang Jinming
 * @date 12/18/2022 11:12 PM
 */
public abstract class Customer {
    private PayBehavior liveBehavior;

    public Customer(PayBehavior liveBehavior) {
        this.liveBehavior = liveBehavior;
    }
    public void pay(){
        this.liveBehavior.pay();
    }
}
