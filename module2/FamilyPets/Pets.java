public class Pets {
    public static void main(String[] args) {

        // 1. Write code to create and initialize a new variable for Gooffy
        Pet gooffy = new Pet();

        // 2. Initialize all the fields for Gooffy to their respective values, 
        //    as defined in the table above
        gooffy.name = "Gooffy";
        gooffy.height = 13F;
        gooffy.weight = 18F;
        gooffy.favoriteToy = "Cozie Baily";
        gooffy.favoriteSnack = "Lick \'N Crunch";
        gooffy.colors = "White and Brown";
        gooffy.skills = 4;
        gooffy.isPureBreed = false;
        gooffy.isFull = true;

        // 3. Call the getProfile method on the new Gooffy variable to print out her
        //    profile to the screen
        String profile = gooffy.getProfile();
        System.out.println(profile);
    }
}
