public class inicio {
    
    public static void main(String[] ar) throws InterruptedException{
        sembrador s1 = new sembrador("123", "cebolla");
        sembrador s2 = new sembrador("124", "papa");
        
        hiloSembrador h1 = new hiloSembrador("h1", s1);
        hiloSembrador h2 = new hiloSembrador("h2", s2);
    
        h1.start();
        h2.start();
    
    }//main
    
}
