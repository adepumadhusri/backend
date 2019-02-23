
package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;

@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Integer Id;

    @Basic
    @JsonProperty("name")
    private String Name;

    @Basic
    @JsonProperty("location")
    private String Location;

   @Basic
    @JsonProperty("info")
    private String Info;



    public Card(Integer id, String name, String location, String info) {
        Id = id;
        Name = name;
        Location = location;
        Info = info;


    }

    public Card() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }


    public String getInfo() {
        return Info;
    }

    public void setInfo(String info) {
        Info = info;
    }









}
