package org.user.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.user.app.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
