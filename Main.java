public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie();
        movie1.title = "The Lion King";
        movie1.genre = "Animation";
        movie1.duration = 88;

        Movie movie2 = new Movie();
        movie2.title = "Titanic";
        movie2.genre = "Romance";
        movie2.duration = 195;

        Movie movie3 = new Movie();
        movie3.title = "Avengers";
        movie3.genre = "Action";
        movie3.duration = 143;

        movie1.displayInfo();
        movie2.displayInfo();
        movie3.displayInfo();
    }
}