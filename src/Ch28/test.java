package Ch28;

import java.util.ArrayList;

public class test {

    public static void main(String[] args) {

        ArrayList arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        System.out.println(arr.toString());

        ArrayList<String>  marvel = new ArrayList<>();
        marvel.add("Iron man");
        marvel.add("Hulk");
        marvel.add("Captain america");
        System.out.println("marvel: " + marvel.toString());
        System.out.println("-----------------------------");
        ArrayList<String>  movies = new ArrayList<>();
        System.out.println("movies: " + movies.toString());
        System.out.println("-----------------------------");
        movies.addAll(marvel);
        System.out.println("movies: " + movies.toString());
        System.out.println("-----------------------------");
        movies.remove(0);
        System.out.println("movies : " + movies.toString());
        System.out.println("-----------------------------");
        movies.add("Iron man");
        System.out.println("movies : " + movies.toString());
        System.out.println("-----------------------------");
        movies.remove("Iron man");
        movies.add(0, "Iron man");
        System.out.println("movies : " + movies.toString());

    }

}
