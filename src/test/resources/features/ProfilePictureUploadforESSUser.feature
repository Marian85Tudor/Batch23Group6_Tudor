Feature:  Profile Picture Upload for ESS Users

  @Yarslove
  Scenario: Adding photo to profile as ESS user
    Given user is logged in with ESS user credentials
    When user click on MyInfo option
    And user click on profile photo area
    And user select new photo
    And user click on upload button
    Then photo has been added user able to see delete button