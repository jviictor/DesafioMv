package MV.desafioMv.Colaborador.modelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "colaborador", path ="colaborador")
public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {

}
