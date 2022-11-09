package ClasePractica;
import java.util.*;
public class LibroApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String titulo,autor;
		String ISBN;
		int paginas, seguir;
		
		Scanner n=new Scanner(System.in);
		do {
		Libro libro1 = new Libro();
		
		System.out.println("Digite datos de libro 1: ");
		System.out.println("Cual es su titulo?"); 
		titulo=n.next();
		libro1.PonerTitulo(titulo);
		
		System.out.println("Cual es su ISBN?"); 
		ISBN=n.next();
		libro1.PonerISBN(ISBN);
		
		System.out.println("Cual es su Autor?"); 
		autor=n.next();
		libro1.PonerAutor(autor);
		
		do {
		System.out.println("Cuantas paginas tiene?"); 
		paginas=n.nextInt();
		if(paginas<0) {System.out.println("Error");}
		}while(paginas<0);
		libro1.PonerNpaginas(paginas);
		
		
		
		Libro libro2 = new Libro();
		
		System.out.println("Digite datos de libro 2: ");
		System.out.println("Cual es su titulo?"); 
		titulo=n.next();
		libro2.PonerTitulo(titulo);
		
		System.out.println("Cual es su ISBN?"); 
		ISBN=n.next();
		libro2.PonerISBN(ISBN);
		
		System.out.println("Cual es su Autor?"); 
		autor=n.next();
		libro2.PonerAutor(autor);
		
		do {
		System.out.println("Cuantas paginas tiene?"); 
		paginas=n.nextInt();
		if(paginas<0) {System.out.println("Error");}
		}while(paginas<0);
		libro2.PonerNpaginas(paginas);
		
		libro1.MostrarDatos();
		libro2.MostrarDatos();
		
		if(libro1.MostrarNpaginas()<libro2.MostrarNpaginas()) {
			System.out.println("EL LIBRO 2 TIENE MAS PAGINAS QUE EL LIBRO 1");
		}else if(libro1.MostrarNpaginas()>libro2.MostrarNpaginas()){System.out.println("El libro 1 tiene mas paginas que el libro 2");}
		else {
			System.out.println("Tienen el mismo numero de paginas");
		}
		
		do {
			System.out.println("Desea seguir en el programa? 1.Si 2.No");
			seguir=n.nextInt();
			if(seguir<=0 || seguir>2) {System.out.println("Error, digite un dato valido");}
		}while(seguir<=0 || seguir>2);
		}while(seguir==1);
		
	
	System.out.println("Fin del programa, fer te amo<3");
	
	n.close();

	}
}
