public class hasiltwogen {
  public static void main(String args[]) {     
    TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(100, "Umum");     
    tgObj.showTypes();     
    int v = tgObj.getob1();
    System.out.println("value: " + v);
    String str = tgObj.getob2();
    System.out.println("value: " + str);   
  }  
}
