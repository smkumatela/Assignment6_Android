package za.ac.cput.tpassignment.factories;

import java.util.Map;

import za.ac.cput.tpassignment.domain.Log_Standings;

/**
 * Created by Songezo on 2016-04-14.
 */
public class Log_Standings_Factory {

    private Long id;
    private String teamName;
    private int gamesPlayed;
    private int gamesWon;
    private int gamesLost;
    private int gamesDrawn;
    private int points;

    public static Log_Standings_Factory log = null;

    public Log_Standings_Factory() {
    }

    public static Log_Standings_Factory getLogInstance(){
        if (log == null){
            log = new Log_Standings_Factory();
        }
        return log;
    }


    public static Log_Standings createLogStandings(String teamName, Map<String, Integer> values){
        Log_Standings log = new Log_Standings.Builder(teamName).gamesPlayed(values.get("Played"))
                .gamesWon(values.get("Won")).gamesDrawn(values.get("Drawn"))
                .gamesLost(values.get("Lost")).points(values.get("Points"))
                .build();
        return log;
    }
}


