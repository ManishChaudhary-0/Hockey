package Behavior;

import strategydesignpattern.OffenceBehavior;

/*
returns Shoot at the Goal

 */
public class ShootBehavior implements OffenceBehavior {
    public String play(){
        return "shoot at the Goal";
    }
}
