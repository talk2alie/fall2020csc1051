package app;

public class PersonDemo {
    public static void main(String[] args) {
        var kadija = new Person("Kadija", "Pussah", "12/14/2011");
        var nyisha = new Person("Nyisha", "Jones", "09/02/2011");
        System.out.println(kadija.getBirthDayOfTheWeek());
    }
}