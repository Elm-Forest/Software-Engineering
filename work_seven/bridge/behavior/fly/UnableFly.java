package work_seven.bridge.behavior.fly;


import work_seven.bridge.behavior.FlyBehavior;

/**
 * @author Elm Forest
 */
public class UnableFly implements FlyBehavior {
    public UnableFly() {
    }

    @Override
    public void fly() {
        System.out.println("扑腾几下飞不起来");
    }
}
