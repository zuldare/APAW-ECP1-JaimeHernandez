package strategy;

public abstract class TeamStrategy {
    protected String strategyName;

    protected int goalkeeper;

    protected int defenders;

    protected int midfielders;

    protected int strikers;

    public abstract void useStrategy();

    protected int getDefenders() {
        return defenders;
    }

    protected int getMidfielders() {
        return midfielders;
    }

    protected int getStrikers() {
        return strikers;
    }

    public int getGoalkeeper() {
        return goalkeeper;
    }

    public String getStrategyName() {
        return strategyName;
    }

    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }
}
