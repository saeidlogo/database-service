/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basketasia.database.service;

import javax.ejb.Local;

/**
 *
 * @author saeidlogo
 */
@Local
public interface DatabaseServiceLocal {

    public String getConfigurationValue(String key) throws Exception;
}
