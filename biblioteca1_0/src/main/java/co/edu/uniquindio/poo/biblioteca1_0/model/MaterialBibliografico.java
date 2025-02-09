package co.edu.uniquindio.poo.biblioteca1_0.model;

public class MaterialBibliografico {

    private String titulo;
    private String autor;
    private String añoPublicacion;
    private String isbn;
    private TipoMaterial tipo;
    private boolean esPrestable;

    public MaterialBibliografico(String titulo, String autor, String añoPublicacion, String isbn, TipoMaterial tipo, boolean esPrestable) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
        this.tipo = tipo;
        this.esPrestable = esPrestable;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAñoPublicacion() {
        return añoPublicacion;
    }
    public void setAñoPublicacion(String añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public TipoMaterial getTipo() {
        return tipo;
    }
    public void setTipo(TipoMaterial tipo) {
        this.tipo = tipo;
    }

    public boolean getEsPrestable() {
        return esPrestable;
    }
    public void setEsPrestable(boolean esPrestable) {
        this.esPrestable = esPrestable;
    }




}
