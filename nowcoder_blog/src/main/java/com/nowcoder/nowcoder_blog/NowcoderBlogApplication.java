package com.nowcoder.nowcoder_blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class NowcoderBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(NowcoderBlogApplication.class, args);
	}

}
