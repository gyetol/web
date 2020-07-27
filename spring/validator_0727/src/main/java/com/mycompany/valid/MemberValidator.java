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
	public void validate(Object target, Errors errors) { //target에 command객체 , errors에 error객체가 들어온다
		MemberCommand cmd = (MemberCommand)target;
		
		if(cmd.getName()==null || cmd.getName().trim().equals("")) {
			errors.rejectValue("name","name.required","회원이름이 입력되지 않았습니다.");
		}
		
		if(cmd.getAge() ==0 ) {
			errors.rejectValue("age", "age.required","연령이 입력되지 않았습니다.");
		}
	}

}
