package work_seven.bridge.Entity;


import work_seven.bridge.Bird;
import work_seven.bridge.behavior.FlyBehavior;
import work_seven.bridge.behavior.SwimBehavior;

/**
 * @author Elm Forest
 */
public class Eagle extends Bird {

    public Eagle(FlyBehavior behavior, SwimBehavior swimBehavior) {
        super(behavior, swimBehavior);
    }

    @Override
    public void display() {
        System.out.println("老鹰");
        super.display();
    }
}
