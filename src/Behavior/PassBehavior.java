package Behavior;

import strategydesignpattern.OffenceBehavior;

/*
returns Passes to a Forward
 */
public class PassBehavior implements OffenceBehavior {
    public String play(){
        return "passes to a Forward ";
    }
}
