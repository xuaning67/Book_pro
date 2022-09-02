package com.fenglei.repository;

import com.fenglei.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Intellij IDEA.
 * User:  Administrator
 * Date:  2022/8/22
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
