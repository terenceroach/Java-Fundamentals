package bites.examples;

public class ReadingList {
    public String[] unread = new String[10];
    public int counter = 0;
    public void add(String bookTitle){
        unread[counter] = bookTitle;
        counter++;
    }

    public static void main(String[] args) {
        ReadingList readingList = new ReadingList();

        readingList.add("First Book");
        readingList.add("second book");
        readingList.add("Third Book");
        for(int i = 0; i < readingList.unread.length; i++){
            System.out.println(readingList.unread[i]);
        }

    }
}
