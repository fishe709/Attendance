package cn.itkt.core.validate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import cn.itkt.core.validate.impl.FixLengthImpl;

@Target( { ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = FixLengthImpl.class)
//指定用那个验证器进行验证
public @interface FixLength {

	int length();

	String message() default "{validation.length}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
