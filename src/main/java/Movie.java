public class Movie {
    private String name;
    private Double rank;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRank() {
        return rank;
    }

    public void setRank(Double rank) {
        this.rank = rank;
    }

    public Movie(String name, Double rank) {
        this.name = name;
        this.rank = rank;
    }
}
