package com.galaxy.commands;

import com.galaxy.Merchant;

public class HowManyQuestionCommand implements ICommand {

	public void executeCommand(Merchant merchant, String questionString) {
		merchant.answerHowManyQuestion(questionString);
	}

}
