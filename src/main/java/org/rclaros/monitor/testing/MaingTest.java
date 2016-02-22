/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rclaros.monitor.testing;

import org.rclaros.monitor.bean.ServerInfo;
import org.rclaros.monitor.exception.STException;
import org.rclaros.monitor.util.STSigarInfo;

/**
 *
 * @author Reynaldo Claros
 */
public class MaingTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws STException {
        ServerInfo info= STSigarInfo.info();
        System.out.println(info.getCpu_core());
    }
    
}
