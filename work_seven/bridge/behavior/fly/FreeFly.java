package work_seven.bridge.behavior.fly;


import work_seven.bridge.behavior.FlyBehavior;

/**
 * @author Elm Forest
 */
public class FreeFly implements FlyBehavior {
    public FreeFly() {
    }

    @Override
    public void fly() {
        System.out.println("自由的飞翔");
    }
}
