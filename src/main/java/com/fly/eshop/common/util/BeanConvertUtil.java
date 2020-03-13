package com.fly.eshop.common.util;

import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * bean转换工具类
 *
 * @author zhaohuayu
 * @Date 2020/3/13 12:37
 * @since 1.0
 */
public class BeanConvertUtil {

    public static <T> T convertBeanToOtherBean(Object obj, Class<T> otherBeanClass){
        T target = null;
        try {
            target = otherBeanClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        BeanUtils.copyProperties(obj, target);
        return target;
    }

    public static <T> List<T> convertListToOtherList(Object obj, Class<T> otherBeanClass){
        List list = (List)obj;
        if (CollectionUtils.isEmpty(list)) {
            return new ArrayList<>();
        }
        return (List<T>)list.stream().map(o -> BeanConvertUtil.convertBeanToOtherBean(o, otherBeanClass)).collect(Collectors.toList());
    }


}
