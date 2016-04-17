package za.ac.cput.tpassignment.factories;

import java.util.Map;

import za.ac.cput.tpassignment.domain.Stadium;

/**
 * Created by Songezo on 2016-04-14.
 */
public class Stadium_Factory {

    private Long id;
    private String name;
    private String location;

    private static Stadium_Factory stadium = null;

    public Stadium_Factory() {
    }

    public static Stadium_Factory getStadiumInstance(){
        if (stadium == null){
            stadium = new Stadium_Factory();
        }
        return stadium;
    }

    public static Stadium createStadium(Map<String, String> values, Long id){
        Stadium stadium = new Stadium.Builder(values.get("name")).location(values.get("England"))
                .id("stdm123").build();
        return stadium;
    }
}
