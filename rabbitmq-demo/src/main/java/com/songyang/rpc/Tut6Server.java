package com.songyang.rpc;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author Yang Song
 * @date 2022/10/11 11:47
 */
@Profile({"tut6"})
@Component
public class Tut6Server {
    @RabbitListener(queues = "rpc.request")
    public int fibonacci(int n) {
        System.out.println("服务端==================");
        System.out.println(" [x] 收到请求 " + n);
        int result = fib(n);
        System.out.println(" [.] 返回 " + result);
        return result;
    }
    public int fib(int n) {
        return n == 0 ? 0 : n == 1 ? 1 : (fib(n - 1) + fib(n - 2));
    }
}
