package com.gb.health.utils;

import com.gb.health.init.Constant;
import com.gb.health.init.EnumMessage;
import com.gb.health.init.EnumMessage2;
import com.gb.health.init.HealthEnum;
import com.gb.health.init.HealthEnum.Education;
import com.gb.health.init.HealthEnum.LiveFood_bean;
import com.gb.health.init.HealthEnum.Sex;
import com.gb.health.init.HealthEnum.Smoke_endAge;
import com.gb.health.init.HealthEnum.Wine_white;
import org.apache.poi.ss.formula.functions.T;

/**
 * 枚举测试类
 * @author lx
 *
 */
public class EnumUtil {


	/**
	 * 获取value返回枚举对象
	 * @param value
	 * @param clazz
	 * */

	public static <T extends EnumMessage>  T getEnumObject(Object value, Class<T> clazz) {

		if(clazz.isEnum()){
			T[] t =	clazz.getEnumConstants();
			for (T t1 : t) {
				if (value instanceof String){
					if (value.equals(t1.getValue())){
						return t1;
					}
				}else if (value instanceof Integer){
					if (value.equals(t1.getValueCode())){
						return t1;
					}
				}

			}

		}




		return null;



	}

/*	public static void main(String[] args) {
		//	   System.out.println(EnumUtil.getEnumObject("M", SexEnum.class));//MAN
		//	   System.out.println(EnumUtil.getEnumObject("男", SexEnum.class));//MAN
		// wine_red obj=  EnumUtil.getEnumObject("小于等于250毫升", wine_red.class);
		Wine_red obj=  EnumUtil.getEnumObject(2, Wine_red.class);
		//  System.out.println(EnumUtil.getEnumObject("小于等于250毫升", wine_red.class));
		System.out.println(obj.getScore());
		//   System.out.println(obj.getScore());
	}*/

	
	/*   public static <T extends EnumMessage>  T getEnumObject(Object value, Class<T> clazz){
        return (T) Constant.ENUM_MAP.get(clazz).get(value);
    }*/
	public static void main(String[] args) {
		try {
			// System.out.println(EnumUtil.getEnumObject("M", L.class));//MAN
			 int a =  (int)EnumUtil.getEnumObject("1", HealthEnum.LiveFood_egg.class).getValueCode();

			// Smoke_beginAge obj=  EnumUtil.getEnumObject("30岁之后", Smoke_beginAge.class);
			//  System.out.println(EnumUtil.getEnumObject("小于等于250毫升", wine_red.class));
			// System.out.println("a "+a );
		} catch (Exception e) {
			e.printStackTrace();

			System.out.println("---------------");
			System.out.println("  a+"+e.getMessage());
			System.out.println("  ab+"+ e.fillInStackTrace());

		}

	}
}