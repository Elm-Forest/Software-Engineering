package work_seven.order;


import work_seven.order.Behavior.Pay.NormalPay;
import work_seven.order.Behavior.Pay.SuperVipPay;
import work_seven.order.Behavior.Pay.VipPay;
import work_seven.order.Entity.Normal;
import work_seven.order.Entity.SuperVip;
import work_seven.order.Entity.Vip;

/**
 * @author Elm Forest
 */
public class Client {

    public static void main(String[] args) {
        Customer normal = new Normal(new NormalPay());
        normal.pay();
        Customer vip = new Vip(new VipPay());
        vip.pay();
        Customer superVip = new SuperVip(new SuperVipPay());
        superVip.pay();
    }
}
