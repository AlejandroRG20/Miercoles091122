package ClasePractica;

public class Libro {
	//Atributos
	
	private String ISBN;
	private String titulo;
	private String autor;
	private int Npaginas;
	
	public String MostrarISBN() {
		return ISBN;
	}
	public void PonerISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String MostrarTitulo() {
		return titulo;
	}
	public void PonerTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String MostrarAutor() {
		return autor;
	}
	public void PonerAutor(String autor) {
		this.autor = autor;
	}
	public int MostrarNpaginas() {
		return Npaginas;
	}
	public void PonerNpaginas(int npaginas) {
		Npaginas = npaginas;
	}
	
	public void MostrarDatos() {
		System.out.println("El Libro "+MostrarTitulo()+" con ISBN "+MostrarISBN()+" creado por el autor "+MostrarAutor()+" tiene "+MostrarNpaginas()+" Paginas.");
	}
	
	
}
