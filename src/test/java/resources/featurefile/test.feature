Feature: Search Test
  As a user i can add all data and search for the job
  @smoke
  Scenario Outline: user can use for different data in search fields
    Given i am on homepage
    When i accept cookies
    And i enter jobTitle "<jobTitle>"
    And i enter jobLocation "<location>"
    And i select  distance "<distance>"
    And i click on more search option link
    And i enter minimum salary "<salaryMin>"
    And i enter maximum salary "<salaryMax>"
    And i select salary type "<salaryType>"
    And i select job type "<jobType>"
    And i click on job find button
    Then i verify the job result "<result>"


    Examples:
      | jobTitle      | location    | distance       | salaryMin | salaryMax | salaryType | jobType   | result                                      |
      | Tester        | Harrow      | up to 1 miles | 30000     | 500000    | Per annum  | Permanent | Permanent Tester jobs in Harrow on the Hill |
#      | Tester        | Harrow      | up to 2 miles  | 35000     | 45000     | Per annum  | Permanent | Permanent Tester jobs in East London        |
#      | Test Engineer | London      | up to 5 miles  | 30000     | 65000     | Per annum  | Permanent | Permanent Test Engineer jobs in London      |
#      | Administrator | London      | up to 7 miles  | 40000     | 70000     | Per annum  | Contract  | Contract Administrator jobs in West London  |
#      | DataAnalyst   | Manchester  | up to 15 miles | 10000     | 50000     | Per day    | Permanent | Permanent Electrician jobs in Wembley       |
#      | QA Engineer   | London      | up to 10 miles | 10        | 20        | Per hour   | Temporary | Temporary Accountant jobs in Oxfordshire    |