package strategy;

public class DefensiveStrategy extends TeamStrategy {

    public DefensiveStrategy() {
        this.strategyName = "Defensiva";
    }

    @Override
    public void useStrategy() {
        this.goalkeeper = 1;
        this.defenders = 4;
        this.midfielders = 5;
        this.strikers = 1;
        this.strategyName = "Defensiva";
    }

}
