package fi.haagahelia.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PelitRepository extends CrudRepository<Pelit, Long> {
    List<Pelit> findByNimi(String nimi);
}
