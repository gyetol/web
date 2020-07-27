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
				errors.rejectValue("email", "emailRequired","�̸��� �Է¿��");
			}
			
			if(cmd.getPass()==null || cmd.getPass().trim().equals("")) {
				errors.rejectValue("pass", "passRequired","��й�ȣ �Է¿��");
			}
			if(cmd.getPassConfirm()==null || cmd.getPassConfirm().trim().equals("")) {
				errors.rejectValue("passConfirm","passConfirmRequired","��й�ȣȮ�� �Է¿��" );
				
			}
			if(cmd.getNick()==null || cmd.getNick().trim().equals("")) {
				errors.rejectValue("nick", "nickRequired","�̸� �Է¿��");
			}
	}

}
