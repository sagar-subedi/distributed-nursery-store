package np.com.sagar88.nurserystoreorderservice.feign.feign;

import np.com.sagar88.nurserystoreorderservice.feign.web.GetUserInfoResponse;
import np.com.sagar88.nurserystoreorderservice.feign.web.GetUserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: Sagar Subedi,
 * Date : 2023-07-02
 */
@FeignClient("bookstore-billing-service")
public interface AccountFeignClient {

    @GetMapping("/user")
    GetUserResponse getUserByUserName(@RequestParam("userName") String userName);

    @GetMapping("/user")
    GetUserResponse getUserById(@RequestParam("userId") String userId);

    @GetMapping("/userInfo")
    GetUserInfoResponse getUserInfo();

}
