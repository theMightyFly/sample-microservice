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

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

public class WaterQuality {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@CreatedDate
	private Date measureTime;
	
	/**  NO3 mg/l (=ppm) */
	private int nitrate;
	/** NO2 mg/l (=ppm) */
	private int nitrite;
	/** Gesaamthärte dGH*/
	private int totalHardness;
	/** Karbonathärte dKH*/
	private int carbonateHardness;
	/** PH */
	private double ph;
	/** CL2 mg/l (=ppm) */
	private double chlorine;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNitrate() {
		return nitrate;
	}
	public void setNitrate(int nitrate) {
		this.nitrate = nitrate;
	}
	public int getNitrite() {
		return nitrite;
	}
	public void setNitrite(int nitrite) {
		this.nitrite = nitrite;
	}
	public int getTotalHardness() {
		return totalHardness;
	}
	public void setTotalHardness(int totalHardness) {
		this.totalHardness = totalHardness;
	}
	public int getCarbonateHardness() {
		return carbonateHardness;
	}
	public void setCarbonateHardness(int carbonateHardness) {
		this.carbonateHardness = carbonateHardness;
	}
	public double getPh() {
		return ph;
	}
	public void setPh(double ph) {
		this.ph = ph;
	}
	public double getChlorine() {
		return chlorine;
	}
	public void setChlorine(double chlorine) {
		this.chlorine = chlorine;
	}
	public Date getMeasureTime() {
		return measureTime;
	}
	public void setMeasureTime(Date measureTime) {
		this.measureTime = measureTime;
	}
}
