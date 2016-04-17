package za.ac.cput.tpassignment;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import za.ac.cput.tpassignment.tests_factory.BroadcasterTest;
import za.ac.cput.tpassignment.tests_factory.Log_StandingsTest;
import za.ac.cput.tpassignment.tests_factory.PlayerTest;
import za.ac.cput.tpassignment.tests_factory.PremierSoccerLeagueTest;
import za.ac.cput.tpassignment.tests_factory.StadiumTest;
import za.ac.cput.tpassignment.tests_factory.TournamentTest;

/**
 * Created by Songezo on 2016-04-17.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ BroadcasterTest.class,
        Log_StandingsTest.class,
        PlayerTest.class,
        PremierSoccerLeagueTest.class,
        StadiumTest.class,
        TournamentTest.class

})

public class TestSuite {
}
