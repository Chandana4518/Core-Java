package com.xworkz.model.app.dto;

import java.io.Serializable;

public class TheaterDTO implements Serializable
{
private String theaterName;
private String movieName;
private String owner;
private boolean snackesAllowed;
private String location;
public TheaterDTO()
{
	System.out.println("Running no-args const in TheaterDTO");
}
public TheaterDTO(String theaterName, String movieName, String owner, boolean snackesAllowed,String location) {
	super();
	this.theaterName = theaterName;
	this.movieName = movieName;
	this.owner = owner;
	this.snackesAllowed = snackesAllowed;
	this.location=location;
}

@Override
public String toString() {
	return "TheaterDTO [theaterName=" + theaterName + ", movieName=" + movieName + ", owner=" + owner + ", snackesAllowed="
			+ snackesAllowed + ", location=" + location + "]";
}
public String getTheaterName() {
	return theaterName;
}
public void setTheaterName(String theaterName) {
	this.theaterName = theaterName;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public boolean isSnackesAllowed() {
	return snackesAllowed;
}
public void setSnackesAllowed(boolean snackes) {
	this.snackesAllowed = snackesAllowed;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

}
