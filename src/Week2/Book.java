import java.util.ArrayList;
class Book{
    private String title;
    private String author;
    private int publicationYear;
    private boolean isBorrowed;
    private double rating;
    private ArrayList<String> reviews = new ArrayList<String>();


    public Book(String title, String author, int publicationYear) {
        this.author = author;
        this.publicationYear = publicationYear;
        this.isBorrowed = false;
        this.title = title;
        this.rating = 0.0;
        this.reviews = new ArrayList<String>();
        
    }
   public boolean isBorrowed(){
       return isBorrowed;
    }
    public void setBorrowed(boolean isBorrowed){
        this.isBorrowed = isBorrowed;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPublicationYear(){
        return publicationYear;
    }
    public double getRating(){
        return rating;
    }
    public ArrayList<String> getReviews(){
        return reviews;
    }
    public void setRating(double rating){
        if (rating >= 0.0 && rating <= 5.0){
            this.rating = rating;
        }
        else{
            System.out.println("Rating must be between 0.0 and 5.0");
        }
    }
    public void addReview(String review){
        this.reviews.add(review);
    }


}
