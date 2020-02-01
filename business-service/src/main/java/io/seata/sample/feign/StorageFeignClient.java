package io.seata.sample.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "storage-service", url = "storage-service:8081")
public interface StorageFeignClient {

    /**
     *
     * @param commodityCode
     * @param count
     */
    @GetMapping("/deduct")
    void deduct(@RequestParam("commodityCode") String commodityCode,
            @RequestParam("count") Integer count);

}
