
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }
        
        if (!(compare instanceof Book)) {
            return false;
        }
        
        Book compareBook = (Book)compare;
        
        return (this.name.equalsIgnoreCase(compareBook.name) 
                && (this.publicationYear == compareBook.publicationYear));
    }
    
    @Override
    public String toString() {
        return "Titile : " + this.name + "\n" + "Year: " + this.publicationYear + "\n";
    } 
}
