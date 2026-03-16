package org.videoclub;

import org.videoclub.model.Movie;
import org.videoclub.repository.MovieRepositoryImpl;

public class Main {
    public static void main(String[] args) {
        MovieRepositoryImpl movieRepository = new MovieRepositoryImpl();

        // --- ARGENTINA ---
        movieRepository.createMovie(new Movie(0, "El secreto de sus ojos", "Juan José Campanella", "Thriller", "Un oficial busca resolver un crimen del pasado.", "src/assets/images/argentina/elSecretoDeSusOjos.jpg", "src/assets/images/argentina/elSecretoDeSusOjosCartel.jpg", "https://youtu.be/hKa8U-8vsfU"));
        movieRepository.createMovie(new Movie(0, "Nueve reinas", "Fabián Bielinsky", "Crimen, Suspenso", "Dos estafadores planean un gran golpe.", "src/assets/images/argentina/nueveReinas.jpg", "src/assets/images/argentina/nueveReinasCartel.jpg", "https://youtu.be/Awu9WonTVB0"));
        movieRepository.createMovie(new Movie(0, "El hijo de la novia", "Juan José Campanella", "Drama", "Un hombre en crisis redescubre su vida.", "src/assets/images/argentina/elHijoDeLaNovia.jpg", "src/assets/images/argentina/elHijoDeLaNoviaCartel.jpg", "https://youtu.be/AoAU_eeSq4o"));
        movieRepository.createMovie(new Movie(0, "La odisea de los giles", "Sebastián Borensztein", "Aventura", "Vecinos buscan recuperar su dinero.", "src/assets/images/argentina/laOdiseaDeLosGiles.jpg", "src/assets/images/argentina/laOdiseaDeLosGilesCartel.jpg", "https://youtu.be/ZP_o6GQaFW8"));
        movieRepository.createMovie(new Movie(0, "Truman", "Cesc Gay", "Drama", "Dos amigos comparten momentos inolvidables.", "src/assets/images/argentina/truman.jpg", "src/assets/images/argentina/trumanCartel.jpg", "https://youtu.be/czaA6yRbass"));

        // --- MÉXICO ---
        movieRepository.createMovie(new Movie(0, "Biutiful", "Alejandro G. Iñárritu", "Drama", "Un hombre lucha por el futuro de sus hijos.", "src/assets/images/mexico/biutiful.jpg", "src/assets/images/mexico/biutifulCartel.jpg", "https://youtu.be/3WzJcwGA6YM"));
        movieRepository.createMovie(new Movie(0, "El espinazo del diablo", "Guillermo del Toro", "Terror", "Fantasmas y secretos en un orfanato.", "src/assets/images/mexico/elEspinazoDelDiablo.jpg", "src/assets/images/mexico/elEspinazoDelDiabloCartel.jpg", "https://youtu.be/c3gRqYu5olY"));
        movieRepository.createMovie(new Movie(0, "Amores perros", "Alejandro G. Iñárritu", "Drama", "Tres vidas se cruzan trágicamente.", "src/assets/images/mexico/amoresPerros.jpg", "src/assets/images/mexico/amoresPerrosCartel.jpg", "https://youtu.be/ebvWj98Yui0"));
        movieRepository.createMovie(new Movie(0, "Cronos", "Guillermo del Toro", "Terror", "Un artefacto antiguo otorga vida eterna.", "src/assets/images/mexico/cronos.jpg", "src/assets/images/mexico/cronosCartel.jpg", "https://youtu.be/GBLIFd1rfgw"));
        movieRepository.createMovie(new Movie(0, "La zona", "Rodrigo Plá", "Thriller", "Tensión social en una urbanización privada.", "src/assets/images/mexico/laZona.jpg", "src/assets/images/mexico/laZonaCartel.jpg", "https://youtu.be/kmyMNBdQKiY"));
        movieRepository.createMovie(new Movie(0, "Bardo", "Alejandro G. Iñárritu", "Comedia dramática", "Un periodista vive una crisis surrealista.", "src/assets/images/mexico/bardo.jpg", "src/assets/images/mexico/bardoCartel.jpg", "https://youtu.be/mcN_edLQHY4"));

        // --- FRANCIA ---
        movieRepository.createMovie(new Movie(0, "Volver", "Pedro Almodóvar", "Comedia dramática", "Mujeres enfrentan secretos familiares.", "src/assets/images/francia/volver.jpg", "src/assets/images/francia/volverCartel.jpg", "https://youtu.be/hp4u67AV8VI"));
        movieRepository.createMovie(new Movie(0, "Lo imposible", "J.A. Bayona", "Drama", "Una familia lucha por sobrevivir al tsunami.", "src/assets/images/francia/loImposible.jpg", "src/assets/images/francia/loImposibleCartel.jpg", "https://youtu.be/qAcNyfqIQkw"));
        movieRepository.createMovie(new Movie(0, "As Bestas", "Rodrigo Sorogoyen", "Thriller", "Hostilidad en un pueblo rural.", "src/assets/images/francia/asBestas.jpg", "src/assets/images/francia/asBestasCartel.jpg", "https://youtu.be/8FfTwEbN9YA"));
        movieRepository.createMovie(new Movie(0, "Todo sobre mi madre", "Pedro Almodóvar", "Drama", "Una madre busca al padre de su hijo.", "src/assets/images/francia/todoSobreMiMadre.jpg", "src/assets/images/francia/todoSobreMiMadreCartel.jpg", "https://youtu.be/hcVEvcP1iAc"));
        movieRepository.createMovie(new Movie(0, "El reino", "Rodrigo Sorogoyen", "Thriller político", "Político corrupto lucha por su carrera.", "src/assets/images/francia/elReino.jpg", "src/assets/images/francia/elReinoCartel.jpg", "https://youtu.be/8TtE6P2M9ZM"));
        movieRepository.createMovie(new Movie(0, "Un día perfecto", "Fernando León de Aranoa", "Drama bélico", "Trabajadores humanitarios en guerra.", "src/assets/images/francia/unDiaPerfecto.jpg", "src/assets/images/francia/unDiaPerfectoCartel.jpg", "https://youtu.be/ZCjRHoYFAN8"));
        movieRepository.createMovie(new Movie(0, "París, Texas", "Wim Wenders", "Drama", "Un hombre busca reconectar con su familia.", "src/assets/images/francia/parisTexas.jpg", "src/assets/images/francia/parisTexasCartel.jpg", "https://youtu.be/HaoKIfDfDxc"));

        // --- ITALIA ---
        movieRepository.createMovie(new Movie(0, "Dolor y gloria", "Pedro Almodóvar", "Drama", "Un director reflexiona sobre su vida.", "src/assets/images/italia/dolorYGloria.jpg", "src/assets/images/italia/dolorYGloriaCartel.jpg", "https://youtu.be/3c1w2_6mMro"));
        movieRepository.createMovie(new Movie(0, "El día de la bestia", "Álex de la Iglesia", "Comedia negra", "Un sacerdote intenta evitar el apocalipsis.", "src/assets/images/italia/elDiaDeLaBestia.jpg", "src/assets/images/italia/elDiaDeLaBestiaCartel.jpg", "https://youtu.be/3egY2bX0k1o"));
        movieRepository.createMovie(new Movie(0, "El método", "Marcelo Piñeyro", "Thriller", "Candidatos compiten por un puesto.", "src/assets/images/italia/elMetodo.jpg", "src/assets/images/italia/elMetodoCartel.jpg", "https://youtu.be/1gKX1j3YV1o"));
        movieRepository.createMovie(new Movie(0, "La Isla Mínima", "Alberto Rodríguez", "Thriller", "Investigación en las marismas.", "src/assets/images/italia/laIslaMinima.jpg", "src/assets/images/italia/laIslaMinimaCartel.jpg", "https://youtu.be/2gKX2j4YV2o"));
        movieRepository.createMovie(new Movie(0, "La mala educación", "Pedro Almodóvar", "Drama", "Amigos revelan secretos del pasado.", "src/assets/images/italia/laMalaEducacion.jpg", "src/assets/images/italia/laMalaEducacionCartel.jpg", "https://youtu.be/4gKX3j5YV3o"));
        movieRepository.createMovie(new Movie(0, "Los otros", "Alejandro Amenábar", "Terror", "Una casa embrujada en la 2ª Guerra Mundial.", "src/assets/images/italia/losOtros.jpg", "src/assets/images/italia/losOtrosCartel.jpg", "https://youtu.be/5gKX4j6YV4o"));
        movieRepository.createMovie(new Movie(0, "Vicky Cristina Barcelona", "Woody Allen", "Comedia romántica", "Amigas se enamoran de un pintor.", "src/assets/images/italia/vickyCristinaBarcelona.jpg", "src/assets/images/italia/vickyCristinaBarcelonaCartel.jpg", "https://youtu.be/6gKX5j7YV5o"));

        // --- CHILE ---
        movieRepository.createMovie(new Movie(0, "El club", "Pablo Larraín", "Drama", "Sacerdotes enfrentan secretos oscuros.", "src/assets/images/chile/elClub.jpg", "src/assets/images/chile/elClubCartel.jpg", "https://youtu.be/7gKX0j2YV0o"));
        movieRepository.createMovie(new Movie(0, "Gloria", "Sebastián Lelio", "Drama", "Una mujer busca la felicidad en Santiago.", "src/assets/images/chile/gloria.jpg", "src/assets/images/chile/gloriaCartel.jpg", "https://youtu.be/8gKX1j3YV1o"));
        movieRepository.createMovie(new Movie(0, "La contadora de películas", "Sebastián Lelio", "Drama", "Consuelo en el cine durante la dictadura.", "src/assets/images/chile/laContadoraDePeliculas.jpg", "src/assets/images/chile/laContadoraDePeliculasCartel.jpg", "https://youtu.be/9gKX2j4YV2o"));
        movieRepository.createMovie(new Movie(0, "Machuca", "Andrés Wood", "Drama", "Amistad entre clases sociales en 1973.", "src/assets/images/chile/machuca.jpg", "src/assets/images/chile/machucaCartel.jpg", "https://youtu.be/0gKX3j5YV3o"));
        movieRepository.createMovie(new Movie(0, "Neruda", "Pablo Larraín", "Drama", "La vida del poeta en el exilio.", "src/assets/images/chile/neruda.jpg", "src/assets/images/chile/nerudaCartel.jpg", "https://youtu.be/1gKX4j6YV4o"));
        movieRepository.createMovie(new Movie(0, "No", "Pablo Larraín", "Drama histórico", "Campaña para derrotar a Pinochet.", "src/assets/images/chile/no.jpg", "src/assets/images/chile/noCartel.jpg", "https://youtu.be/2gKX5j7YV5o"));
        movieRepository.createMovie(new Movie(0, "Una mujer fantástica", "Sebastián Lelio", "Drama", "Una mujer trans enfrenta a la sociedad.", "src/assets/images/chile/unaMujerFantastica.jpg", "src/assets/images/chile/unaMujerFantásticaCartel.jpg", "https://youtu.be/3gKX6j8YV6o"));

        // --- UK ---
        movieRepository.createMovie(new Movie(0, "Agora", "Alejandro Amenábar", "Drama histórico", "La vida de Hipatia en Alejandría.", "src/assets/images/uk/agora.jpg", "src/assets/images/uk/agoraCartel.jpg", "https://youtu.be/4gKX7j9YV7o"));
        movieRepository.createMovie(new Movie(0, "El maquinista", "Brad Anderson", "Thriller psicológico", "Un hombre sufre insomnio severo.", "src/assets/images/uk/elMaquinista.jpg", "src/assets/images/uk/elMaquinistaCartel.jpg", "https://youtu.be/5gKX8j0YV8o"));
        movieRepository.createMovie(new Movie(0, "Exodus: Dioses y reyes", "Ridley Scott", "Épico bíblico", "Moisés lidera a los israelitas.", "src/assets/images/uk/exodusDiosesYReyes.jpg", "src/assets/images/uk/exodusDiosesYReyesCartel.jpg", "https://youtu.be/6gKX9j1YV9o"));
        movieRepository.createMovie(new Movie(0, "Klaus", "Sergio Pablos", "Animación", "Un cartero y un fabricante de juguetes.", "src/assets/images/uk/klaus.jpg", "src/assets/images/uk/klausCartel.jpg", "https://youtu.be/7gKX0j2YV0o"));

        System.out.println("--- ¡CATÁLOGO COMPLETO IMPORTADO CON ÉXITO! ---");
    }
}