package com.javaCDG.CDGp.repository;


import com.javaCDG.CDGp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VulRepo extends JpaRepository<User, Long> {

}
