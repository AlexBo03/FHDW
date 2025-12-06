package Semester3.Algorithmen.Hashing;

public class App {
    private Entry[] liste= new Entry[5];

    public void insertEntry(char c){
        int index = 11*(c-'A'+1)%5;

        if(liste[index]!=null){
            while(liste[index].next==null){
                liste[index].next=new Entry(c);
            }
        }else{
            liste[index]=new Entry(c);
        }
    }
public static void main(String[] args) {
    App app = new APP();
app.insertEntry('E');
}
}
