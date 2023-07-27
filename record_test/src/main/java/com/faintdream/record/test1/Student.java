package com.faintdream.record.test1;

import java.util.Optional;

/**
 * @author sazanka
 * @version 1.0
 * @see java.lang.Record
 * */
public record Student(Integer id,String name,String email,Integer age) {

    //Instance method
    public String concat(){
        return String.format("Name:%s\nEmail:%s",this.name,this.age);
    }

    //Static method(email to upper case)
    public static String emailToUpperCase(String email){
        return Optional.ofNullable(email).orElse("no email").toUpperCase();
    }
}
