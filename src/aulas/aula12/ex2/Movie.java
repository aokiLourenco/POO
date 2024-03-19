package aulas.aula12.ex2;

public class Movie{
    private String name, rating, genre;
    private double score;
    private int running_time;


    public Movie(String name, String rating, String genre, Double score, int running_time){
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.score = score;
        this.running_time = running_time;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getRating(){
        return rating;
    }

    public void setRating(String rating){
        this.rating = rating;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public double getScore(){
        return score;
    }

    public void setScore(double score){
        this.score = score;
    }

    public int getRunningTime(){
        return running_time;
    }

    public void setRunningTime(int running_time){
        this.running_time = running_time;
    }

    @Override
    public String toString(){
        return "Filme{" + "name=" + name + ", rating=" + rating + ", genre=" + genre + ", score=" + score + ", running_time=" + running_time + '}';
    }
}