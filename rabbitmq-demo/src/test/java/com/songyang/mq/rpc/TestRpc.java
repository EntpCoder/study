package com.songyang.mq.rpc;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/**
 * @author Yang Song
 * @date 2022/10/9 13:52
 */
public class TestRpc {
    public static void main(String[] args) {
        try (RPCClient fibonacciRpc = new RPCClient()) {
            for (int i = 0; i < 32; i++) {
                String i_str = Integer.toString(i);
                System.out.println(" [x] 请求 远程函数计算 fib(" + i_str + ")");
                String response = fibonacciRpc.call(i_str);
                System.out.println(" [.] 响应 '" + response + "'");
            }
        } catch (IOException | TimeoutException | InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
