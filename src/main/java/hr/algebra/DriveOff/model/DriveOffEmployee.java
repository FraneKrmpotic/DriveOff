package hr.algebra.DriveOff.model;

import java.util.ArrayList;
import java.util.List;

public class DriveOffEmployee extends User implements Reviewable{
    private List<Review> reviews = new ArrayList<>();
    private List<Car> cars;


    public void confirmReservation(Reservation reservation) {
            reservation.setConfirmed(true);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public void addReview(Review review) {
        reviews.add(review);
    }



}
