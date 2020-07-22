package com.galaxy.questions;

import com.galaxy.Merchant;

public class HowManyQuestion implements IQuestion {

	
	public void answerQuestion(Merchant merchant, String questionString) {
		merchant.answerHowManyQuestion(questionString);
	}

}
