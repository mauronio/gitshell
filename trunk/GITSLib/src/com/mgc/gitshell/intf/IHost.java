/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mgc.gitshell.intf;

/**
 *
 * @author mgomez
 */
public interface IHost {

    public ISession openSession() throws Exception;
    public ISession openSession(String sessionDefId) throws Exception;
    public void writeInfo(IOutputConsumer output) throws Exception;
}
