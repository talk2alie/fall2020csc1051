public class Pet {
    String name;
    float height;
    float weight;
    String favoriteToy;
    String favoriteSnack;
    String colors;
    byte skills;
    boolean isPureBreed;
    boolean isFull;

    public void train() {
        skills += 1;
        System.out.println("You just earned a new skill.");
        System.out.println("Your new skills count is " + skills);
    }

    public String getProfile() {
        String profile = "Name:\t";
        profile += name;
        profile += "\n";
        profile += "Height:\t";
        profile += height;
        profile += "\n";
        profile += "Weight:\t";
        profile += weight;
        profile += "\n";
        profile += "Skills:\t";
        profile += skills;

        return profile;
    }
}

