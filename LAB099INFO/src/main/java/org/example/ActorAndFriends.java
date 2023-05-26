package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ActorAndFriends {
    private String name;
    private String address;
    private boolean crime;
    private int prisonTerm;

    public ActorAndFriends() {
    }

    public ActorAndFriends(String name, String address, boolean crime, int prisonTerm) {
        this.name = name;
        this.address = address;
        this.crime = crime;
        this.prisonTerm = prisonTerm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isCrime() {
        return crime;
    }

    public void setCrime(boolean crime) {
        this.crime = crime;
    }

    public int getPrisonTerm() {
        return prisonTerm;
    }

    public void setPrisonTerm(int prisonTerm) {
        this.prisonTerm = prisonTerm;
    }

    @Override
    public String toString() {
        return "ActorAndFriends{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", crime=" + crime +
                ", prisonTerm=" + prisonTerm +
                '}';
    }
}
