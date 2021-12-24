
package university;
import  java.util.Arrays;
public class Books {
private String name;
private  Publisher publisher;
private int year;
private String autors[];
    private String autor;

        public Books  (String name, int year, Publisher publisher){
            setName(name);
            setYear(year);
            setPublisher(publisher);
        }
        public Books  (String name, String autor, int year,  Publisher publisher){
            this (name, year, publisher);
            setAutor(autor);
        }
        public Books  (String name, String[] autors, int year, Publisher publisher){
            this (name, year, publisher);
            setAutors(autors);

        }
        public String getName() {

            return name;
        }
        public Publisher getPublisher(){

            return publisher;
        }
        public int getYear(){

            return year;
        }
        public String[] getAutors(){

            return autors;
    }
    public String getAutor(){

            return autor;
    }
    public void setName(String name){
            if(name.isEmpty()){
                throw new IllegalArgumentException("Не может быть пустой ссылкой");
            } else
                this.name = name;
    }
            public void setYear (int year){
            if(year <= 0){
                throw new IllegalArgumentException("Год издания должен быть больше нуля");
            }else
                this.year = year;
            }
            public void setPublisher (Publisher publisher){
            if (publisher == null){
                throw new IllegalArgumentException("Поле издательства не должно быть пустым");
            }else
                this.publisher = publisher;
            }
            public void setAutor (String autor){
            if (autor.isEmpty()){
                throw new IllegalArgumentException("Поле автора не должно быть пустым");
            } else
                this.autor=autor;
            }
            public void setAutors (String[] autors){
            if (autors == null){
                throw new IllegalArgumentException("Поле автора не должно быть пустым");
            }else
                this.autors=autors;
            }
    public void print() {
        if (getAutor() != null && !getAutor().equals("")) {
            System.out.println("Название книги: " + getName() + "; Автор: " + getAutor() + " ; Издательство: " + getPublisher().getPublisherName() + "," + getPublisher().getCity() + "; Год издания: " + getYear());
        } else if (getAutors() != null && getAutors().length > 0) {
            System.out.println("Название книги: " + getName() + "; Авторы: " + Arrays.toString(getAutors()) + " ; Издательство: " + getPublisher().getPublisherName() + "," + getPublisher().getCity() + "; Год издания: " + getYear());
        } else {
            System.out.println("Название книги: " + getName() + ";  Издательство: " + getPublisher().getPublisherName() + "," + getPublisher().getCity() + "; Год издания: " + getYear());
        }
    }public static void printAll (Books[]books){
            for (Books book : books)
                book.print();
        }
    }