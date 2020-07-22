package com.galaxy.commands;

import com.galaxy.Merchant;

public class QuestionCommand implements ICommand{

	public void executeCommand(Merchant merchant, String commandString) {
		merchant.delegateQuestion(commandString);
	}

}
