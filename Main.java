
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        //Source = Mustafa Murat COŞKUN / UDEMY referans alınarak geliştirilmiştir..
        /*
        Wrapper Class 
        
        boolean ------> Boolean
        char ---------> Character
        byte ---------> Byte
        short --------> Short
        int ----------> Integer
        long ---------> Long
        float --------> Float
        double -------> Double
        */
        ArrayList<String> arrayList = new ArrayList<>();
        
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        //int bir veri tipi fakat ilkel veri tipi biz iste buraya intin türediği REFERANSI GÖNDERDİK.
        //double ve boolean hatta char vb.. için durum aynıdır.
        int a = 5 ;//ilkel bir tanımlama
        Integer b = 5;//bir sınıf cinsinden tanımlamış olduk
        for(int i = 0;i<10;i++){
            arrayList1.add(Integer.valueOf(i*4));
            //autoboxing
            //ilkel bir veri tipi olan i değerini alıyoruz bir kutuya alıyoruz ve Wrapper Class cinsinde bir kutuya atıyoruz diyerek açıklayabiliriz.
        }
        System.out.println("**************************************************");
        for(int i = 10 ;i<arrayList1.size();i++){
            System.out.println(arrayList1.get(i).intValue());
            //Unboxing
            //integer referansı aldık ve içerisindeki intvalue yu almak istiyorum dedik 
    }
        /*
        birinde ilkel i yi alıyor ve bir kutuya koyuyoruz autoboxing deniyor
        bir diğerinde ise kutudaki dğeri çıkarıyoruz buna unboxing deniyor
        Javada bu işlemi yapmak uzun ve bazılarına göre saçma fakat java bunu programcıdan beklemiyor kendisi yapabiliyor.
        aynı işlemi alt satırlardaki şekliylede yapabilirsiniz sonuç değişmez
        */
        System.out.println("**************************************************");
        for (int i = 0; i < 10;i++) {
            arrayList1.add(Integer.valueOf(i*4)); // Autoboxing
    }
        System.out.println("**************************************************");
        for (int i = 0; i< arrayList1.size() ; i++) {
            System.out.println(arrayList1.get(i)); // Unboxing

    }
    }
    
}
