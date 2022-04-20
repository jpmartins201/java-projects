package joao.io.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import joao.io.projeto1.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
