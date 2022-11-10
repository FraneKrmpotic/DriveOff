package hr.algebra.DriveOff.model;

import java.util.Date;

public class Reservation {
    private Boolean id;
    private final User user;
    private final Car car;
    private Date startDate;
    private Date expiryDate;

    private Boolean confirmed;

    public Reservation(Boolean id, User user, Car car, Date startDate, Date expiryDate, Boolean confirmed) {
        this.id = id;
        this.user = user;
        this.car = car;
        this.startDate = startDate;
        this.expiryDate = expiryDate;
        this.confirmed = confirmed;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public User getUser() {
        return user;
    }

    public Car getCar() {
        return car;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}
