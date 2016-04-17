package za.ac.cput.tpassignment.factories;

import java.util.Map;

import za.ac.cput.tpassignment.domain.DevelopmentPlayer;
import za.ac.cput.tpassignment.domain.Player;
import za.ac.cput.tpassignment.domain.ProfessionalPlayer;

/**
 * Created by Songezo on 2016-04-14.
 */
public class Player_Factory {

    private Long id;
    private String playerStandard;
    private String developmentPlayer;
    private String proffesionalPlayer;

    public static Player_Factory player = null;

    public Player_Factory() {
    }

    public static Player_Factory getPlayerInstance(){
        if (player == null){
            player = new Player_Factory();
        }
        return player;
    }

    public Player getPlayerStandard(String playerStandard){
        if ("Advanced Player".equalsIgnoreCase(playerStandard)){
            return new ProfessionalPlayer();
        }
        else
            return new DevelopmentPlayer();
    }

    public static class Builder{
        private Long id;
        private String playerStandard;
        private String developmentPlayer;
        private String proffesionalPlayer;

        public Builder(String playerStandard){
            this.playerStandard = playerStandard;
        }

        public Builder developmentPlayer(String value){
            this.developmentPlayer = value;
            return this;
        }

        public Builder proffssionalPlayer(String value){
            this.proffesionalPlayer = value;
            return this;
        }

        public Builder id(Long value){
            this.id = value;
            return this;
        }

        public Builder copy(Player_Factory value){
            this.id = value.id;
            this.proffesionalPlayer = value.proffesionalPlayer;
            this.developmentPlayer = value.developmentPlayer;
            this.playerStandard = value.playerStandard;
            return this;
        }

        public Player_Factory build(){
            return new Player_Factory(this);
        }
    }

    public Player_Factory(Builder builder){
        playerStandard = builder.playerStandard;
        developmentPlayer = builder.developmentPlayer;
        proffesionalPlayer = builder.proffesionalPlayer;
        id = builder.id;
    }

    public static Player_Factory createPlayer(Map<String, String> values){
        Player_Factory  player = new Builder(values.get("Player Standard"))
                .developmentPlayer(values.get("Armature Player")).proffssionalPlayer(values.get("Advanced Player"))
                .build();
        return player;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player_Factory that = (Player_Factory) o;

        return !(id != null ? !id.equals(that.id) : that.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
