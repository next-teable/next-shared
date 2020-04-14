package studio.clouthin.next.shared.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author vanish
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FQuery {

    String propName() default "";

    Type type() default Type.EQUAL;


    String joinName() default "";


    Join join() default Join.LEFT;


    String blurry() default "";

    enum Type {
        EQUAL, GREATER_THAN, LESS_THAN, INNER_LIKE, LEFT_LIKE, RIGHT_LIKE, LESS_THAN_NQ, IN, NOT_EQUAL, BETWEEN, NOT_NULL
    }

    /**
     * 适用于简单连接查询，复杂的请自定义该注解，或者使用sql查询
     */
    enum Join {
        LEFT, RIGHT
    }

}
