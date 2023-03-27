package work_seven.bridge.behavior.swim;


import work_seven.bridge.behavior.SwimBehavior;

/**
 * @author Elm Forest
 */
public class UnableSwim implements SwimBehavior {
    public UnableSwim() {
    }

    @Override
    public void swim() {
        System.out.println("扑腾几下就淹死了");
    }
}
