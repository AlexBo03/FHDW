public class Aufgabe6 {
public static void main(String[] args) {
     int [] zahlen1 = {1,2,3,4,5,6,7,8,9,10,11,12,13};
     int [] zahlen2 = {3,4,5,6,7,8,11,13};



     int i =0;
     int j =0;

     while(i<zahlen1.length && j<zahlen2.length){
        if(zahlen1[i]==zahlen2[j]){
            System.out.println("gemeinsame Zahl=="+ zahlen1[i]);
            i++;
            j++;
        }else{
            if(zahlen1[i]>zahlen2[j]){
                j++;
            }else{
                i++;
            }

        }
        
     }
}
}
