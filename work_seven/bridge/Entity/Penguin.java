package work_seven.bridge.Entity;


import work_seven.bridge.Bird;
import work_seven.bridge.behavior.FlyBehavior;
import work_seven.bridge.behavior.SwimBehavior;

/**
 * @author Elm Forest
 */
public class Penguin extends Bird {

    public Penguin(FlyBehavior behavior, SwimBehavior swimBehavior) {
        super(behavior, swimBehavior);
    }

    @Override
    public void display() {
        System.out.println("企鹅");
        super.display();
    }
}
