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
package de.schaeftlein.aqua.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.schaeftlein.aqua.domain.WaterQuality;
import de.schaeftlein.aqua.domain.WaterQualityRepository;

@RestController
public class RestServiceController {

	@Autowired
	private WaterQualityRepository waterQualityRepository;

	@RequestMapping(method = { RequestMethod.GET }, value = "/waterQuality")
	public List<WaterQuality> getAllMeasureValues() {
		return waterQualityRepository.findAll();
	}
}
