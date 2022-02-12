package cn.lab212.mall.common.annotation;

import java.lang.annotation.*;

/**
 * @author yinck
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}
