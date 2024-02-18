package production.sumanth.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private static final Logger log = LoggerFactory.getLogger(MovieService.class);

    @Autowired
    private MovieRepository repository;

    public List<Movie> findAllMovies() {
        log.info("list" + repository.findAll());
        return repository.findAll();
    }
    public Optional<Movie> findMovieByImdbId(String imdbId) {
        log.info("imdbId" + imdbId);
        return repository.findByImdbId(imdbId);
    }
}
