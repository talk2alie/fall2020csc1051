package app;

public class StringLecture {
    public static void main(String[] args) {
        String name = "Drew";
        String capitalName = name.toUpperCase();    
        String last3Characters = name.substring(1);
        System.out.println(last3Characters);
    }
}