package io.seata.sample.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "order-service", url = "order-service:8082")
public interface OrderFeignClient {

    /**
     *
     * @param userId
     * @param commodityCode
     * @param count
     */
    @GetMapping("/create")
    void create(@RequestParam("userId") String userId,
            @RequestParam("commodityCode") String commodityCode,
            @RequestParam("count") Integer count);

}
