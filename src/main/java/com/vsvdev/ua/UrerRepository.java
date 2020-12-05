package com.vsvdev.ua;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UrerRepository extends JpaRepository<User, Integer>{

}
