package work_seven.bridge.behavior.swim;


import work_seven.bridge.behavior.SwimBehavior;

/**
 * @author Elm Forest
 */
public class AbleSwim implements SwimBehavior {
    public AbleSwim() {
    }

    @Override
    public void swim() {
        System.out.println("鱼翔浅底");
    }
}
