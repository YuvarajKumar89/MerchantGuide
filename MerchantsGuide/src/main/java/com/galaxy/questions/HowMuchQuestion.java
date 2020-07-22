package com.galaxy.questions;

import com.galaxy.Merchant;


public class HowMuchQuestion implements IQuestion {

	public void answerQuestion(Merchant merchant, String questionString) {
		merchant.answerHowMuchQuestion(questionString);
	}

}
