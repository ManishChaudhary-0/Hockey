package Behavior;
import strategydesignpattern.DefenceBehavior;

import java.util.Random;
/*
randomly picks one of the following options to return:

blocks player from passing
blocks player from shooting
checks player with puck
 */
public class BlockBehavior implements DefenceBehavior {
    public String play(){
        Random random = new Random();
        int x = random.nextInt(3);
        if (x == 0) {
            return " blocks player from passing";
        }
        else if (x == 1){
            return "blocks player from shooting";
        }
        else{
            return "checks player with puck";
        }

    }
}