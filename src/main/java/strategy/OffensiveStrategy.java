package strategy;

public class OffensiveStrategy extends TeamStrategy {
    
    public OffensiveStrategy() {
        this.strategyName = "Ofensiva";
    }

    @Override
    public void useStrategy() {
        this.goalkeeper = 1;
        this.defenders = 4;
        this.midfielders = 3;
        this.strikers = 3;
        this.strategyName = "Ofensiva";
    }

}
