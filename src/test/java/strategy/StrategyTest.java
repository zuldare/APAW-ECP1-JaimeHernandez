package strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StrategyTest {
    private Team team;

    @Test
    public void testCreateStrategy() {
        team = new Team("Test1 Footbal Club", new DefaultStrategy());
        assertEquals("Por defecto", team.getUsedStrategyName());
    }

    @Test
    public void testOKTeamAlignment() {
        team = new Team("Team Madrid", new OffensiveStrategy());
        String resultOk = "Equipo: Team Madrid  ; Estrategia: Ofensiva ; Portero [1] ; Defensas [4] ; Centrocampistas [3] ; Delanteros [3]\n";
        assertEquals(resultOk, team.toString());
    }

    public void changeToStrategy(TeamStrategy teamStrategy) {
        testCreateStrategy();
        team.setStrategy(teamStrategy);
        assertEquals(teamStrategy.getStrategyName(), team.getUsedStrategyName());
    }

    @Test
    public void changeToOffensiveStrategyTest() {
        changeToStrategy(new OffensiveStrategy());
    }

    @Test
    public void changeToUltraOffensiveStrategyTest() {
        changeToStrategy(new UltraOffensiveStrategy());
    }

    @Test
    public void changeToDefensiveStrategyTest() {
        changeToStrategy(new DefensiveStrategy());
    }

    @Test
    public void changeToUltraDefensiveStrategyTest() {
        changeToStrategy(new UltraDefensiveStrategy());
    }

    @Test
    public void changeToDefaultStrategyTest() {
        changeToStrategy(new DefaultStrategy());
    }
}
