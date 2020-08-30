package strategydesignpattern;

public abstract class Player {
    protected String name;
    private boolean offence = true;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;


    public Player(String name){
        this.name = name;
        setDefenceBehavior();
        setOffenceBehavior();
    }

    protected abstract void setDefenceBehavior();
    protected abstract void setOffenceBehavior();

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
