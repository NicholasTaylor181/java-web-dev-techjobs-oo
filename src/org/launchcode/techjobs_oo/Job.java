package org.launchcode.techjobs_oo;

import java.util.Objects;

import static java.util.Objects.isNull;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        name = aName;
        employer = aEmployer;
        location = aLocation;
        positionType = aPositionType;
        coreCompetency = aCoreCompetency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String iD = "\nID: " + this.getId();
        String name;
        String employer;
        String location;
        String positionType;
        String coreCompetency;

        if(isNull(this.getName()) || this.getName().isBlank()) {
            name = "\nName: Data not available";
        }else {
            name = "\nName: " + this.getName();
        }

        if(isNull(this.getEmployer()) || this.getEmployer().getValue().isBlank()) {
            employer = "\nEmployer: Data not available";
        }else {
            employer = "\nEmployer: " + this.getEmployer();
        }

        if(isNull(this.getLocation()) || this.getLocation().getValue().isBlank()) {
            location = "\nLocation: Data not available";
        }else {
            location = "\nLocation: " + this.getLocation();
        }

        if(isNull(this.getPositionType()) || this.getPositionType().getValue().isBlank()) {
            positionType = "\nPosition Type: Data not available";
        }else {
            positionType = "\nPosition Type: " + this.getPositionType();
        }

        if(isNull(this.getCoreCompetency()) || this.getCoreCompetency().getValue().isBlank()) {
            coreCompetency = "\nCore Competency: Data not available";
        }else {
            coreCompetency = "\nCore Competency: " + this.getCoreCompetency();
        }


        return iD + name + employer + location + positionType + coreCompetency + "\n";
    }

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
