/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mgc.gitshell.intf;

/**
 *
 * @author mgomez
 */
public interface ISession {

    public String[] getSuggestions(String textLine, int caretPosition) throws Exception;
    public void execute(String textLine, IOutputConsumer consumer) throws Exception;
}
