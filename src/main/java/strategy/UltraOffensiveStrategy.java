package strategy;

public class UltraOffensiveStrategy extends TeamStrategy {

    public UltraOffensiveStrategy() {
        this.strategyName = "Ultra ofensiva";
    }

    @Override
    public void useStrategy() {
        this.goalkeeper = 1;
        this.defenders = 3;
        this.midfielders = 4;
        this.strikers = 4;
        this.strategyName = "Ultra ofensiva";
    }

}
