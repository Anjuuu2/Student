/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 *
 * @author piodo
 */
class Student {
    String name;
    String section;
    String motto;
    
    Student(String name, String section, String motto) {
        this.name = name;
        this.section = section;
        this.motto = motto;
    }

    String getName() {
        return name;
    }
    String getSection() {
        return section;
    }
    String getMotto() {
        return motto;
    }
}
