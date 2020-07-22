package com.galaxy.commands;

import com.galaxy.Merchant;

public class UnknownCommand implements ICommand {

	public void executeCommand(Merchant merchant, String commandString) {
		merchant.informUnknownCommand();
	}

}
