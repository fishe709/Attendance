package cn.itkt.core.validate.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import cn.itkt.core.validate.FixLength;

public class FixLengthImpl implements ConstraintValidator<FixLength, String> {
	private int length;

	@Override
	public void initialize(FixLength length) {
		this.length = length.length();
	}

	@Override
	public boolean isValid(String validStr, ConstraintValidatorContext constrainContext) {
		if (validStr.length() <= length) {
			return true;
		} else {
			return false;
		}
	}
}
