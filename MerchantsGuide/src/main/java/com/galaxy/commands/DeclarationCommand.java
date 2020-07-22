package com.galaxy.commands;

import com.galaxy.Merchant;

/**
 * @author Yuvaraj Kumar
 *
 */
public class DeclarationCommand implements ICommand {


	public void executeCommand(Merchant merchant, String commandString) {
		merchant.addToItemValue(commandString);
		
	}

}
