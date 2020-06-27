package cn.xbmchina.semaphoredemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.Semaphore;

@SpringBootApplication
public class SemaphoreDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SemaphoreDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Semaphore semaphore = new Semaphore(2);

        for (int i = 0;i<1000;i++) {
            final int index = i;
            semaphore.acquire();
            new Thread(() ->{
                System.out.println("i="+index);
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000*5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                semaphore.release();
            }).start();
        }
        semaphore.acquire(1);
    }
}
