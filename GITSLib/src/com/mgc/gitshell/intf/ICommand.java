/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mgc.gitshell.intf;

/**
 *
 * @author mgomez
 */
public interface ICommand {

    public void execute(ISession session) throws Exception;
    public String[] getSuggestions(String textLine, int caretPosition) throws Exception;

}
