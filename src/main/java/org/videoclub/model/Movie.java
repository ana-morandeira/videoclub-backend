package org.videoclub.model;

public class Movie {
    private int id;
    private String titulo;
    private String director;
    private String genero;
    private String argumento;
    private String imagen;
    private String imageCartel;
    private String trailer;

    public Movie() {
    }

    public Movie(int id, String titulo, String director, String genero, String argumento, String imagen, String imageCartel, String trailer) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.argumento = argumento;
        this.imagen = imagen;
        this.imageCartel = imageCartel;
        this.trailer = trailer;
    }

    // Getters y Setters (necesarios para acceder a los datos)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getArgumento() { return argumento; }
    public void setArgumento(String argumento) { this.argumento = argumento; }

    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }

    public String getImageCartel() { return imageCartel; }
    public void setImageCartel(String imageCartel) { this.imageCartel = imageCartel; }

    public String getTrailer() { return trailer; }
    public void setTrailer(String trailer) { this.trailer = trailer; }
}
