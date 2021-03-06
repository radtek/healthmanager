/**
 * FileName:     AsnyFactory.java
 * @Description: TODO
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       ZTE-ITS WuXi LTD.
 * @author:    
 * @version    V1.0 
 * Createdate:         2017年3月27日 下午4:50:14
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2017年3月27日       wu.zh          1.0             1.0
 * Why & What is modified: <修改原因描述>
 */

package com.gb.health.algorithm;


/**
 *     AsnyFactory.java
 * 
 * 
 * @author         Administrator
 * @version        V1.0  
 * @param <R>
 *           2017年3月27日 下午4:50:14 

 */
public interface AsnyFactory<K,R> {
	
	void createAsyn(FetureInter<K> fetureInter);
	
	 R getResult();

	 Object suggest();



	


}
