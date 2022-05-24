package com.example.demo.Dtos;

public class UserDto {


    private Long id;
    private String usarName;
    private String password;

    private String email;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public UserDto() {
    }

    public UserDto(String usarName, String password, String email) {
        this.usarName = usarName;
        this.password = password;
        this.email = email;
    }

    public String getUsarDtoName() {
        return usarName;
    }

    public void setUsarDtoName(String usarName) {
        this.usarName = usarName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "usarName='" + usarName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
