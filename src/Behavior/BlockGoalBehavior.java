package Behavior;
import strategydesignpattern.DefenceBehavior;
import strategydesignpattern.OffenceBehavior;

import java.util.Random;
/*
randomly picks one of the following actions to return for the DefenceBehavior and OffenceBehavior plays:
 */
public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior {

    public String play(){
        Random random = new Random();
        int x = random.nextInt(4);
        if (x == 1){
            return "hand blocks the puck";
        }
        else if (x == 2){
            return "catches the puck";
        }
        else if (x == 3) {
            return "blocks puck with knee pads";
        }
        else {
            return "blocks puck with stick";
        }
    }

}