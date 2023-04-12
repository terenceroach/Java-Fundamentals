package bites.examples;

import java.lang.reflect.Array;

public class TenDayDiary implements GenericDiary{

    String[] entries = new String[10];
    @Override
    public void addEntry(String diaryEntry) {
        for (int index = 0; index < this.entries.length; index++){
            if (this.entries[index] == null){
                this.entries[index] = diaryEntry;
                break;
            }
        }
    }

    @Override
    public void removeEntry(int entryIndex) {
        this.entries[entryIndex] = null;
    }

    @Override
    public String readEntry(int entryIndex) {
        return this.entries[entryIndex];
    }

    public static void main(String[] args) {
        TenDayDiary diary = new TenDayDiary();

        diary.addEntry("Hello, this is my diary");
        diary.addEntry("This is the second diary entry");
        System.out.println(diary.readEntry(0));
        System.out.println(diary.readEntry(1));
        diary.removeEntry(0);
        System.out.println(diary.readEntry(0));
        System.out.println(diary.readEntry(1));
        diary.addEntry("The third entry should be in position 1, index 0");
        System.out.println(diary.readEntry(0));
        System.out.println(diary.readEntry(1));
    }
}
