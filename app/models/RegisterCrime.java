package models;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class RegisterCrime {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Integer Id;

    @Basic
    @JsonProperty("crimetype")
    private String Crimetype;

    @Basic
    @JsonProperty("gender")
    private String Gender;

    @Basic
    @JsonProperty("age")
    private Integer Age;

    @Basic
    @JsonProperty("city")
    private String City;

    @Basic
    @JsonProperty("people")
    private Integer People;

    @Basic
    @JsonProperty("description")
    private String Description;

    @Basic
    @JsonProperty("suspect")
    private  String Suspect;

    @Basic
    @JsonProperty("urls")
    private String[] urls;




    public RegisterCrime(Integer id,String crimetype,String gender,Integer age,String city,Integer people,String description,String suspect,String[] urls){


        Id=id;
        Crimetype=crimetype;
        Gender=gender;
        Age=age;
        City=city;
        People=people;
        Description=description;
        Suspect=suspect;
        this.urls = urls;
    }

    public RegisterCrime(){

    }


    public String getCrimetype() {
        return Crimetype;
    }

    public void setCrimetype(String crimetype) {
        this.Crimetype = crimetype;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        this.Age = age;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public Integer getPeople() {
        return People;
    }

    public void setPeople(Integer people) {
        this.People = people;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getSuspect() {
        return Suspect;
    }

    public void setSuspect(String suspect) {
        this.Suspect = suspect;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String[] getUrls() {return urls;}

    public void setUrls(String[] urls) { this.urls = urls; }

}


