package strategy;

public class Team {

    private String name;

    private TeamStrategy teamStrategy;

    public Team(String name, TeamStrategy teamStrategy) {
        assert name != null;
        assert teamStrategy != null;
        this.name = name;
        setStrategy(teamStrategy);
    }

    public void setStrategy(TeamStrategy teamStrategy) {
        assert teamStrategy != null;
        this.teamStrategy = teamStrategy;
        teamStrategy.useStrategy();
    }

    public String getUsedStrategyName() {
        return this.teamStrategy.getStrategyName();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer(String.format("Equipo: %s ", name))
                .append(String.format(" ; Estrategia: %s", teamStrategy.getStrategyName()))
                .append(String.format(" ; Portero [%d]", teamStrategy.getGoalkeeper()))
                .append(String.format(" ; Defensas [%d]", teamStrategy.getDefenders()))
                .append(String.format(" ; Centrocampistas [%d]", teamStrategy.getMidfielders()))
                .append(String.format(" ; Delanteros [%d]", teamStrategy.getStrikers())).append("\n");

        return sb.toString();
    }

}
