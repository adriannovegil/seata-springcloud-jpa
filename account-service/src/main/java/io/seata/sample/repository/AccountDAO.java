package io.seata.sample.repository;

import io.seata.sample.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDAO extends JpaRepository<Account, Long> {

    /**
     * 
     * @param userId
     * @return 
     */
    Account findByUserId(String userId);

}
