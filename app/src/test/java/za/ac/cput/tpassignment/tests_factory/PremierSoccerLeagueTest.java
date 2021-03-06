package za.ac.cput.tpassignment.tests_factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import za.ac.cput.tpassignment.domain.PremierSoccerLeague;
import za.ac.cput.tpassignment.factories.PremierSoccerLeague_Factory;

/**
 * Created by Songezo on 2016-04-03.
 */
public class PremierSoccerLeagueTest {

    Map<String, String> values;

    @Before
    public void setUp() throws Exception {
        values = new HashMap<String, String>();

        values.put("abbreviation", "PSL");
        values.put("LeagueName", "Absa Premiership Soccer League");
        values.put("stadium", "Moses Mabida");

    }

    @Test
    public void testCreatePremierSoccerLeague() throws Exception {
        PremierSoccerLeague premierSoccerLeague = PremierSoccerLeague_Factory.createPremierSoccerLeague(values);

        Assert.assertEquals("Absa Premiership Soccer League", premierSoccerLeague.getLeagueName());
    }

    @Test
    public void testUpdatePremierSoccerLegue() throws Exception {
        PremierSoccerLeague premierSoccerLeague = PremierSoccerLeague_Factory.createPremierSoccerLeague(values);
        PremierSoccerLeague newPremierSoccerLeague = new PremierSoccerLeague.Builder(premierSoccerLeague.getLeagueName())
                .abbreviation(premierSoccerLeague.getAbbreviation())
                .copy(premierSoccerLeague).stadium("Soccer City").build();

        Assert.assertEquals("Absa Premiership Soccer League", newPremierSoccerLeague.getLeagueName());
        Assert.assertEquals("Moses Mabida", premierSoccerLeague.getStadiums());
        Assert.assertEquals("Soccer City", newPremierSoccerLeague.getStadiums());
    }
}
