package com.learning.ecommerceweb.ecommbackend.Models;

import java.util.ArrayList;

class User {
  String name;
  String phone;
  String email;
  ArrayList<Address> address;
  String profileImage; // make it optional
  String description; // make it optional
  ArrayList<Order> orders; // make it optional
}
