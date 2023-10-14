package br.com.aluiziocatao.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IUserRepository extends JpaRepository<UserModel, UUID> {
    
    UserModel findByUsername(String username);
}
