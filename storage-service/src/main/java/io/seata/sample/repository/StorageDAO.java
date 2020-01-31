package io.seata.sample.repository;

import io.seata.sample.entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageDAO extends JpaRepository<Storage, String> {

    /**
     * 
     * @param commodityCode
     * @return 
     */
    Storage findByCommodityCode(String commodityCode);

}
