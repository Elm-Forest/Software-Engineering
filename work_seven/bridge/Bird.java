package work_seven.bridge;


import work_seven.bridge.behavior.FlyBehavior;
import work_seven.bridge.behavior.SwimBehavior;

/**
 * @author Elm Forest
 */
public abstract class Bird {
    protected FlyBehavior flyBehavior;
    protected SwimBehavior swimBehavior;
    public Bird (FlyBehavior behavior,SwimBehavior swimBehavior) {
        this.swimBehavior  = swimBehavior;
        this.flyBehavior = behavior;
    }

    public void display() {
        flyBehavior.fly();
        swimBehavior.swim();
    }
}
