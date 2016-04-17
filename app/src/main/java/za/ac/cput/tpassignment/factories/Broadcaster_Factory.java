package za.ac.cput.tpassignment.factories;

import java.util.Map;

import za.ac.cput.tpassignment.domain.Broadcaster;
import za.ac.cput.tpassignment.domain.Cup_Game;
import za.ac.cput.tpassignment.domain.League_Game;

/**
 * Created by Songezo on 2016-04-14.
 */
public class Broadcaster_Factory {

    private Long id;
    private String typeOfMatch;
    private String cupGame;
    private String leagueGame;

    private static Broadcaster_Factory broadcaster = null;

    public Broadcaster_Factory(){

    }

    public static Broadcaster_Factory getBroadcasterInstance(){
        if (broadcaster == null){
            broadcaster = new Broadcaster_Factory();
        }
        return broadcaster;
    }

    public Broadcaster getTypeOfMatchBroadcasted(String typeOfMatch){
        if ("Nedbank Cup Match".equalsIgnoreCase(typeOfMatch)){
            return new Cup_Game();
        }
        else
            return new League_Game();
    }

    public static class Builder{
        private Long id;
        private String typeOfMatch;
        private String cupGame;
        private String leagueGame;

        public Builder(String typeOfMatch){
            this.typeOfMatch = typeOfMatch;
        }

        public Builder cupGame(String value){
            this.cupGame = value;
            return this;
        }

        public Builder leagueGame(String value){
            this.leagueGame = value;
            return this;
        }

        public Builder id(Long value){
            this.id = value;
            return this;
        }

        public Builder copy(Broadcaster_Factory value){
            this.typeOfMatch = value.typeOfMatch;
            this.leagueGame = value.leagueGame;
            this.cupGame = value.cupGame;
            this.id = value.id;
            return this;
        }

        public Broadcaster_Factory build(){
            return new Broadcaster_Factory(this);
        }

    }

    public Broadcaster_Factory(Builder builder){
        typeOfMatch = builder.typeOfMatch;
        cupGame = builder.cupGame;
        leagueGame = builder.leagueGame;
        id = builder.id;
    }

    public static Broadcaster_Factory createBoadcaster(Map<String, String> values){
        Broadcaster_Factory broadcaster = new Builder(values.get("Type of Match"))
                .leagueGame(values.get("First Leg Match")).cupGame(values.get("Nedbank Cup Match")).build();
        return broadcaster;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Broadcaster_Factory that = (Broadcaster_Factory) o;

        return !(id != null ? !id.equals(that.id) : that.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
