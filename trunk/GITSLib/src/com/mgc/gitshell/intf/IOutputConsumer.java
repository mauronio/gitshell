/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mgc.gitshell.intf;

/**
 *
 * @author Administrador
 */
public interface IOutputConsumer  {

    public void append(String resultLine) throws Exception;
    public void clear() throws Exception;
    public void show() throws Exception;
    public void setAutoShow(boolean doAutoShow) throws Exception;

}
