package co.com.choucair.certification.proyectob.util;

import com.github.javafaker.Faker;

public class Const {
    public static final String SIZE = "L";
    Faker faker = new Faker();
    public static final String EMAIL= new Faker().internet().emailAddress();
}
