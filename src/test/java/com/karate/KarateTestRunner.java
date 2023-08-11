package com.karate;


/*
import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.Test;

class KarateTestRunner {

    @Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }
}
EmployeeAPITesting.feature

Feature: Employee API Testing

  Background:
    * url 'http://localhost:8080'  # Replace with your actual application URL

  Scenario: Create an Employee
    Given path '/employees'
    And request
  """
  {
    "email": "john.doe@example.com",
    "fullName": "John Doe",
    "birthday": "1990-01-01",
    "hobbies": ["soccer", "music"]
  }
  """
    When method post
    Then status 201
    And match response.uuid != null
    And match response.email == 'john.doe@example.com'
    And match response.fullName == 'John Doe'
    And match response.birthday == '1990-01-01'
    And match response.hobbies == ["soccer", "music"]


*/
