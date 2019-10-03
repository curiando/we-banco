package projeto.webanco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.webanco.entities.Cliente;

public interface WebJpaRepository extends JpaRepository<Cliente, String> {
}
