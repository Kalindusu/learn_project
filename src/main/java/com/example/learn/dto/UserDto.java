package com.example.learn.dto;
//@NoArgsConstructor//create a  constructor without any arguments
//@AllArgsConstructor//create a  constructor with a  arguments
public class UserDto {
    private int id;
    private  String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDto() {
    }

    public UserDto(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
