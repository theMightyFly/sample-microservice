/*******************************************************************************
 *  Copyright 2016 by Ralf Schäftlein
 *  
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *  
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *  
 *  
 *******************************************************************************/
package de.schaeftlein.aqua.domain;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication implements CommandLineRunner{

	@Autowired
	private WaterQualityRepository repo; 
	
	@Override
	public void run(String... args) throws Exception {
	    WaterQuality waterQuality = new WaterQuality();
	    waterQuality.setId(UUID.randomUUID().toString());
	    waterQuality.setMeasureTime(new Date());
	    waterQuality.setCarbonateHardness(10);
	    waterQuality.setTotalHardness(7);
	    waterQuality.setNitrate(50);
	    waterQuality.setNitrite(0);
	    waterQuality.setPh(6.8d);
	    waterQuality.setChlorine(0);
		repo.save(waterQuality);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
}
