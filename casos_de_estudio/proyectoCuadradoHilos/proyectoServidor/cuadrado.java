public class cuadrado {
    
    static String calcular(String n) throws InterruptedException{
        Thread.sleep(4000);
        int num = Integer.parseInt(n);
        int cuadrado = num*num;
        return String.valueOf(cuadrado);
    }//calcular
    
}//class
