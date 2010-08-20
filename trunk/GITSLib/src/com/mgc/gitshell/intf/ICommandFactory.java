/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mgc.gitshell.intf;

/**
 *
 * @author mgomez
 */
public interface ICommandFactory {

    public ICommand getCommandFromTextLine(String textLine) throws Exception;

}
