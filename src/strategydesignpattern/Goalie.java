package strategydesignpattern;

import Behavior.BlockBehavior;
import Behavior.BlockGoalBehavior;
/*
Class for Player: Goalie
 */
public class Goalie extends Player {
    public Goalie(String name) {
        super(name);
    }

    /*
    setDefenceBehavior will set the defenceBehavior to BlockBehavior thus call the according class that will return
     the action being played.
     */
    protected void setDefenceBehavior() {
        this.defenceBehavior = new BlockBehavior();
    }

    /*
     setOffenceBehavior will set the offenceBehavior to BlockBehavior thus call the according class that will return
     the action being played.
     */
    protected void setOffenceBehavior() {
        this.offenceBehavior = new BlockGoalBehavior();

    }

    /*
    Returns the player's name and Position being played
     */
    public String toString(){
        return name + " Plays Position: Goalie";
    }

}
