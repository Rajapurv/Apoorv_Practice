package apoorv.practice;

public class Movie {
    private String title,director,duration;
    public void movie(String title, String director, String duration){
        this.title = title;
        this.director = director;
        this.duration = duration;
    }
    public void getMovieDetails(){
        System.out.println("Film Title - "+ title + " \nFilm Director - "+director+" \nDuration - "+duration);
    }
}
