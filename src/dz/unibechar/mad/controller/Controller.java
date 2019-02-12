/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.unibechar.mad.controller;

import dz.unibechar.mad.model.Employee;

/**
 *
 * @author USER
 */
public interface Controller {
    public void displayEnrolledEmployee();
    public void addEmployee(Employee e);
    public void removeEmployee(String c);
    
    
    
}

