package Problem2;

import java.io.*;
import java.util.Vector;

public class Textbook implements Serializable{
    private String author;
    private String isbn;
    private String title;

    public Textbook(String title, String author, String isbn) {
        this.author = author;
        this.isbn = isbn;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", title, author);
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this) return true;
        if(obj instanceof Textbook) {
            Textbook t = (Textbook) obj;
            return (this.author.equals(t.author) &&
                    this.isbn.equals(t.isbn) &&
                    this.title.equals(t.title));
        }
        return false;
    }

    public static void save(Vector<Textbook> textbooks) throws IOException{
        ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream("Textbooks.out"));
        oos.writeObject(textbooks);
        oos.close();
    }

    public static Vector<Textbook> get() throws IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Textbooks.out"));
        Vector<Textbook> textbooks = (Vector<Textbook>) ois.readObject();
        ois.close();
        return textbooks;
    }
}
