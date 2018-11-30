import java.io.*;


class escribirTxt {
	
	
	static File f;
	static FileWriter fw;
	
	static PrintWriter pw;
	
	public static void main (String arg[]) throws IOException{
	
	f = new File ("c:\\archivo.txt");
	fw = new FileWriter (f);
	pw = new PrintWriter (fw);
	
	pw.println("-- \n\nPolitécnico Jaime Isaza Cadavid --");
	pw.println("-- Registro de libros --");
	pw.println("1. Matemáticas");
	pw.println("2. Ciencias");
	pw.println("3. Ingenierías");
	
	
	
	pw.flush();
	
		
		
	}
	
	
	
	
}




