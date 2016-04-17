package za.ac.cput.tpassignment.tests_factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import za.ac.cput.tpassignment.domain.Tournaments;
import za.ac.cput.tpassignment.factories.Tournament_Factory;

/**
 * Created by Songezo on 2016-04-03.
 */
public class TournamentTest {

    private String name;
    private int numOfTeams;
    private double prize;
//    Tournaments tournaments;
//    Tournament_Factory tournament_factory;

    @Before
    public void setUp() throws Exception {
//        tournaments = new Tournaments();
//        tournament_factory = new Tournament_Factory();
//
    }

    @Test
    public void testCreateTournament() throws Exception {
        Tournaments tournament_factory = Tournament_Factory.createTournament("Nedbank Cup", 16, 2000000.00, null);
        Assert.assertEquals("Cup Game", tournament_factory.gettName());
    }

    @Test
    public void testUpdateTournament() throws Exception {
        Tournaments tournaments = Tournament_Factory.createTournament("Nedbank Cup", 16, 200000.00, null);
        Tournaments newTournament = new Tournaments.Builder("MTN Top 8").numOfTeams(8).copy(tournaments)
                .prizeMoney(500000.00).build();
        Assert.assertEquals(500000.00, newTournament.getPrizeMoney(), 0.0);
        Assert.assertEquals(16, tournaments.getNumOfTeams());
    }
}
