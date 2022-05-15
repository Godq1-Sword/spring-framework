package org.gdq.debug;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

/**
 * @author gdq
 * @since 2022/2/3
 */
@Configuration
public class ExampleConfiguration {
	@Bean
	public Object getBean() {
		return new Random().nextInt();
	}
}
