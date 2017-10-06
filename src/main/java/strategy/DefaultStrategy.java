package strategy;

public class DefaultStrategy extends TeamStrategy {

    public DefaultStrategy() {
        this.strategyName = "Por defecto";
    }

    @Override
    public void useStrategy() {
        this.goalkeeper = 1;
        this.defenders = 4;
        this.midfielders = 4;
        this.strikers = 2;
        this.strategyName = "Por defecto";
    }

}
