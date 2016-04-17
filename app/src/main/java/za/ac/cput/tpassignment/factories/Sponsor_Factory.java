package za.ac.cput.tpassignment.factories;

import java.util.Map;

import za.ac.cput.tpassignment.domain.Sponsor;

/**
 * Created by Songezo on 2016-04-14.
 */
public class Sponsor_Factory {

    private Long id;
    private String name;
    private String sponsors;

    public static Sponsor_Factory sponsor = null;

    public Sponsor_Factory() {
    }

    public static Sponsor_Factory getSponsorInstance(){
        if (sponsor == null){
            sponsor = new Sponsor_Factory();
        }
        return sponsor;
    }

    public static Sponsor createSponsor(Map<String, String> value, Long id){
        Sponsor sponsor = new Sponsor.Builder(value.get("Nike")).sponsors(value.get("Ronaldo"))
                .build();

        return sponsor;
    }
}
