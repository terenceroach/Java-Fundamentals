package bites.examples;

import java.util.ArrayList;

public class InfiniteDiary implements GenericDiary {

    ArrayList<String> entries = new ArrayList<String>();
    @Override
    public void addEntry(String diaryEntry) {
        this.entries.add(diaryEntry);
    }

    @Override
    public void removeEntry(int entryIndex) {
        this.entries.remove(entryIndex);
    }

    @Override
    public String readEntry(int entryIndex) {
        return this.entries.get(entryIndex);
    }

    public static void main(String[] args) {
        InfiniteDiary diary = new InfiniteDiary();
        diary.addEntry("Today it has been raining");
        diary.addEntry("I have been learning Java");
        System.out.println(diary.readEntry(0));
        diary.removeEntry(0);
        System.out.println(diary.readEntry(0));
    }
}
