package com.galaxy.questions;

import com.galaxy.Merchant;

public class UnidentifiedQuestion implements IQuestion{

	public void answerQuestion(Merchant merchant, String questionString) {
		merchant.answerUnIdentifiedQuestion(questionString);
	}

}
