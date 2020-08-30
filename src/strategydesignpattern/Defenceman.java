package strategydesignpattern;

import Behavior.BlockBehavior;
import Behavior.ChasePuckBehavior;
import Behavior.PassBehavior;
import Behavior.SlapShotBehavior;

import java.util.Random;
/*
Class for Player: Defenceman
 */
public class Defenceman extends Player  {
    public Defenceman(String name) {
        super(name);
    }

    /*
    setDefenceBehavior will randomly choose between setting the behavior to a ChasePuckBehavior and BlockBehavior
     */
    protected void setDefenceBehavior() {
        Random random = new Random();
        int x = random.nextInt(2);
        if (x == 0){
            this.defenceBehavior = new ChasePuckBehavior();
        }
        else {
            this.defenceBehavior = new BlockBehavior();
        }

    }
    /*
    setOffenceBehavior will randomly choose between setting the behavior to a PassBehavior and a SlapShotBehavior.
        It will chose PassBehavior 9 out of 10 times.
     */
    protected void setOffenceBehavior() {
        Random random = new Random();
        int x = random.nextInt(3);
        if (x == 1 || x == 2){
            this.offenceBehavior = new PassBehavior();
        }
        else{
            this.offenceBehavior = new SlapShotBehavior();
        }

    }
    /*
    Returns the Players
     */

    public String toString(){
        return name + "plays the position: Defenceman";
    }
}
