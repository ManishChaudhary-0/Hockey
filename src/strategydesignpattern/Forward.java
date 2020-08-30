package strategydesignpattern;

import Behavior.BlockBehavior;
import Behavior.ChasePuckBehavior;
import Behavior.PassBehavior;
import Behavior.ShootBehavior;

import java.util.Random;
/*
Class for Player: Forward
 */
public class Forward extends Player {
    public Forward(String name) {
        super(name);
    }

    /*
    setDefenceBehavior will randomly choose between setting the behavior to a ChasePuckBehavior and a BlockBehavior
    which will then call the according class that will return the action being played.
     */
    protected void setDefenceBehavior() {
        Random random = new Random();
        int randomInt = random.nextInt(2);
        if (randomInt == 0) {
            this.defenceBehavior = new ChasePuckBehavior();
        } else {
            this.defenceBehavior = new BlockBehavior();
        }
    }

    /*
    setOffenceBehavior will randomly choose between setting the behavior to a PassBehavior and a ShootBehavior
    which will then call the according class that will return the action being played.
     */
    protected void setOffenceBehavior() {
        Random random = new Random();
        int randomInt = random.nextInt(2);
        if (randomInt == 0) {
            this.offenceBehavior = new PassBehavior();
        } else {
            this.offenceBehavior = new ShootBehavior();
        }
    }
    public String toString(){
        return name + " plays the position: Forward ";
    }
}
