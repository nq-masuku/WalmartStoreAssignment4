package com.example.walmartstore.data

class User {
    var firstname: String
    var lastname: String
    var username: String
    var password: String

    constructor(name: String, lastname: String, username: String,password: String) {
        this.firstname = name
        this.lastname = lastname
        this.username = username
        this.password = password
    }
}