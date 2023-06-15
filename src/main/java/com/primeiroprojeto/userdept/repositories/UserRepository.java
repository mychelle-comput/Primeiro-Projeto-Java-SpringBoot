package com.primeiroprojeto.userdept.repositories;

import com.primeiroprojeto.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {


}
