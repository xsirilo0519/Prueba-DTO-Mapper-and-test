package co.com.sofka.PruebaDTOMAPPER.Repositories;

import co.com.sofka.PruebaDTOMAPPER.Collections.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioEmpleado extends MongoRepository<Empleado, String> {
}