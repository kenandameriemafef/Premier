/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.unibechar.mad.model;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public interface Model {
    public ArrayList<Employee> getEnrolledEmployeeDetailsFromModel();
    public  void addEmployeeToModel(Employee Em);
    public  void removeEmployeeFromModel(String x);
    
}
