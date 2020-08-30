package strategydesignpattern;

public abstract class Player {
    protected String name;
    private boolean offence = true;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;

/*
Allows name to become accessible, along with calling setDefenceBehavior and setOffenceBehavior
 */

    public Player(String name){
        this.name = name;
        setDefenceBehavior();
        setOffenceBehavior();
    }

    protected abstract void setDefenceBehavior();
    protected abstract void setOffenceBehavior();

     /*
    Alternating between offence and defence via the boolean value offence
     */
    public String play() {
        if (offence) {
            return this.defenceBehavior.play();
        }
        else {
            return this.offenceBehavior.play();
        }
    }

    public void turnover(){
        this.offence = !offence;
    }

}
