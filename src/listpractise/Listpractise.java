import java.util.*;

public class Listpractise {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Moe");
        stringList.add("Larry");
        stringList.add("Curly");

        stringList.set(0, "john");
        stringList.remove(1);
        System.out.println("");
//       
//        for (int i = 0; i < stringList.size(); i++) {
//            System.out.println(stringList.get(i));
//        }
//        
//        for (String name : stringList) {
//            System.out.println(name);
//        }
//    //I used iterator to print
        for (Iterator<String> b = stringList.iterator(); b.hasNext();) {
            String name = b.next();
            System.out.println(name);
        }
        //I used tostring to print
        System.out.println("");
        System.out.println(stringList.toString());
     
   
  
    }

}
