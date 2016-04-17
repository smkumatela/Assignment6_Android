package za.ac.cput.tpassignment.factories;

import java.util.Map;

import za.ac.cput.tpassignment.domain.Team;

/**
 * Created by Songezo on 2016-04-14.
 */
public class Team_Factory {

    private Long id;
    private String teamName;
    private String teamNickName;
    private String teamLocation;

    Team team;

    private static Team_Factory teams = null;

    public Team_Factory() {
    }

    public static Team_Factory getTeamsInstance(){

        if (teams == null){
            teams = new Team_Factory();
        }
        return teams;
    }

    public static Team createTeam(Map<String, String> values, Long id){
        Team team1 = new Team.Builder(values.get("teanName")).teamNickName(values.get("Amakhosi"))
                .teamLocation(values.get("Naturena")).id((long) 155555)
                .build();
        return team1;
    }
}
