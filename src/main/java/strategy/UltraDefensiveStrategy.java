package strategy;

public class UltraDefensiveStrategy extends TeamStrategy {

    public UltraDefensiveStrategy() {
        this.strategyName = "Ultra defensiva";
    }

    @Override
    public void useStrategy() {
        this.goalkeeper = 1;
        this.defenders = 5;
        this.midfielders = 4;
        this.strikers = 1;
        this.strategyName = "Ultra defensiva";
    }

}
