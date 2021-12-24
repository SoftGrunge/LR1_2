package university;
// Efimov DA
public class Main {

    public static void main(String[] args) {
        Publisher publisher1 = new Publisher("Проспект", "Москва");
        Publisher publisher2 = new Publisher("Питер", "Санкт-Петербург");
        Publisher publisher3 = new Publisher("БХВ", "Санкт-Петебург");
        Publisher publisher4 = new Publisher("Диалектика", "Киев");
        Books[] books = {
                new Books("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", new String[] {"Седжвик Роберт", "Уэйн Кевин"}, 2018, publisher2),
                new Books("Разработка требований к программному обеспечению. 3-е издание, дополненное", "Вигерс Карл", 2019, publisher3),
                new Books("Java. Полное руководство, 10-е издание", "Шилдт Герберт", 2018, publisher4),
                new Books("C/C++. Процедурное программирование", "Полубенцева М.И.", 2017, publisher3),
                new Books("Конституция РФ", 2020, publisher1)
        };


        for (Books book : books) {
            if (book.getPublisher().getPublisherName().equals("БХВ")) {
                book.getPublisher().setCity("Санкт-Петербург");
            }
        }

        Books.printAll(books);
    }

    }

