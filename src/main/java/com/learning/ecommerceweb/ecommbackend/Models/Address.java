package com.learning.ecommerceweb.ecommbackend.Models;

class Address {
  String hno;
  String address;
  String district;
  String city;
  String pin;

  public Address(String hno, String address, String district, String city, String pin) {
    this.hno = hno;
    this.address = address;
    this.district = district;
    this.city = city;
    this.pin = pin;
  }
}
