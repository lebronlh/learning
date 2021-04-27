package com.lh.bootdemo;

import com.lh.bootdemo.service.GoodsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootTest
class GoodsServiceTest {

    @Autowired
    GoodsService goodsService;

    @Test
    void seckill() throws InterruptedException {

        // 库存初始化为10，这里通过CountDownLatch和线程池模拟100个并发
        int threadTotal = 100;

        ExecutorService executorService = Executors.newCachedThreadPool();

        final CountDownLatch countDownLatch = new CountDownLatch(threadTotal);
        for (int i = 0; i < threadTotal ; i++) {
            int uid = i;
            executorService.execute(() -> {
                try {
                    goodsService.sellGoods(1, uid);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
            });
        }

        countDownLatch.await();
        executorService.shutdown();

    }
}

