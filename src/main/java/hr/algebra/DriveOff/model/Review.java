package hr.algebra.DriveOff.model;

public record Review(String comment, ReviewRate reviewRate) {


    public  enum ReviewRate {
        BAD(1),AVERAGE(2),GOOD(3),VERY_GOOD(4), EXCELLENT(5);

        private int grade;
        ReviewRate(int grade) {
            this.grade = grade;
        }
        public int getGrade() {
            return grade;
        }
    }
}
