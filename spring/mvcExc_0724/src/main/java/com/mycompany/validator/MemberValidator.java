package com.mycompany.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.mycompany.command.MemberCommand;

public class MemberValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(MemberCommand.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
			MemberCommand cmd =(MemberCommand)target;
			
			if(cmd.getEmail()==null || cmd.getEmail().trim().equals("")) {
				errors.rejectValue("email", "emailRequired","이메일 입력요망");
			}
			
			if(cmd.getPass()==null || cmd.getPass().trim().equals("")) {
				errors.rejectValue("pass", "passRequired","비밀번호 입력요망");
			}
			if(cmd.getPassConfirm()==null || cmd.getPassConfirm().trim().equals("")) {
				errors.rejectValue("passConfirm","passConfirmRequired","비밀번호확인 입력요망" );
				
			}
			if(cmd.getNick()==null || cmd.getNick().trim().equals("")) {
				errors.rejectValue("nick", "nickRequired","이름 입력요망");
			}
	}

}
