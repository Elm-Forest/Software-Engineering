package work_seven.bridge;

import work_seven.bridge.Entity.Eagle;
import work_seven.bridge.Entity.Penguin;
import work_seven.bridge.behavior.fly.FreeFly;
import work_seven.bridge.behavior.fly.UnableFly;
import work_seven.bridge.behavior.swim.AbleSwim;
import work_seven.bridge.behavior.swim.UnableSwim;

/**
 * @author Elm Forest
 */
public class Client {

    public static void main(String[] args) {
        Bird penguin = new Penguin(new UnableFly(), new AbleSwim());
        penguin.display();
        Bird eagle = new Eagle(new FreeFly(), new UnableSwim());
        eagle.display();
    }
}
