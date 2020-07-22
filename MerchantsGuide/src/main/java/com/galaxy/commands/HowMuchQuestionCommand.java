package com.galaxy.commands;

import com.galaxy.Merchant;


public class HowMuchQuestionCommand implements ICommand {

	public void executeCommand(Merchant merchant, String questionString) {
		merchant.answerHowMuchQuestion(questionString);
	}

}
