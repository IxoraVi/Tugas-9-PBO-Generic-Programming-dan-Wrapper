public class wrapper { 
    public static void main(String[] args){
        
        /* Menginstansi Objek Dari Wrapper Class Dan
         * Menggunakan Argumen Dari Tipe Data Primitif
         */
        Character objChar = new Character('A');
        Byte objByte = new Byte("10");
        Short objShort = new Short("15");
        Integer objInt = new Integer(500);
        Long objLong = new Long(8000);
        Boolean objBoolean = new Boolean(true);
        Float objFloat = new Float(80.80f);
        Double objDouble = new Double(30.60);
        
        //Menampilkan Output dari Class Wrapper
        System.out.println("Character: "+objChar);
        System.out.println("Byte: "+objByte);
        System.out.println("Short: "+objShort);
        System.out.println("Integer: "+objInt);
        System.out.println("Long: "+objLong);
        System.out.println("Boolean: "+objBoolean);
        System.out.println("Float: "+objFloat);
        System.out.println("Double: "+objDouble);
    }
} 