package hr.algebra.DriveOff.model;

import java.util.ArrayList;
import java.util.List;

public class Client extends User implements Reviewable {

    public void sendReservation(Car car){

    }
    private List<Review> reviews = new ArrayList<>();
    @Override
    public void addReview(Review comment) {
        reviews.add(comment);
    }
}
