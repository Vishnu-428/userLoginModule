package com.cg.loginmodule.repostry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.cg.loginmodule.entities.LoginData;

@Repository
public interface LoginRepostry extends JpaRepository<LoginData, String>{
@Query("select t from LoginData t where t.userId=:userId")
LoginData findByID(@Param("userId") String userId);


}
