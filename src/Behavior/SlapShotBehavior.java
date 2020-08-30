package Behavior;

import strategydesignpattern.OffenceBehavior;

public class SlapShotBehavior implements OffenceBehavior {
    public String play(){
        return "shoots the puck from the blue line";
    }
}

