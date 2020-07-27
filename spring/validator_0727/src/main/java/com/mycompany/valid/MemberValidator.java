package com.mycompany.valid;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.mycompany.command.MemberCommand;

public class MemberValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		//return MemberCommand.class.isAssignableFrom(clazz);
		return clazz.isAssignableFrom(MemberCommand.class);
	}

	@Override
	public void validate(Object target, Errors errors) { //target�� command��ü , errors�� error��ü�� ���´�
		MemberCommand cmd = (MemberCommand)target;
		
		if(cmd.getName()==null || cmd.getName().trim().equals("")) {
			errors.rejectValue("name","name.required","ȸ���̸��� �Էµ��� �ʾҽ��ϴ�.");
		}
		
		if(cmd.getAge() ==0 ) {
			errors.rejectValue("age", "age.required","������ �Էµ��� �ʾҽ��ϴ�.");
		}
	}

}
