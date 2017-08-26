package com.example.demo.config;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Component;

@Component
public class LocalCachesEvict {

	
	
	@CacheEvict(allEntries=true,cacheNames="person")
	public void clearPersonCaches(){
		
	}
}
