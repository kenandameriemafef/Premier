/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.unibechar.mad.model;

/**
 *
 * @author USER
 */
public class Employee {
    private String empName;
    private String empId;  
    public String getEmpName(){ return this.empName;}
    public String getEmpId(){ return this.empId;}
    Employee(String empName,String empId){
        this.empName=empName;
        this.empId=empId;
    }
    public String toString(){ return null;}
    public boolean equals(Object o){ return false;}
}
