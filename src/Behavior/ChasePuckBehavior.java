package Behavior;

import strategydesignpattern.DefenceBehavior;

/*
return "Chase's the puck" for the Defensive Behavior
 */
public class ChasePuckBehavior implements DefenceBehavior {
    public String play(){
        return "chases the puck";
    }
}
