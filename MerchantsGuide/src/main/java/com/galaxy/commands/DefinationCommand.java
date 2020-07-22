package com.galaxy.commands;

import com.galaxy.Merchant;

/**
 * 
 * @author Yuvaraj Kumar
 *
 */
public class DefinationCommand implements ICommand {

	public void executeCommand(Merchant merchant, String commandString) {
		merchant.addToDictionary(commandString);
	}

}
