Feature: Get All Actors
	
	
  Scenario: Getting actors
    Given url 'http://localhost:3000/actor?first_name=eq.Lucille'
    Then method get
    * print response
    And match response[*].first_name == ["Lucille","Lucille"]
    Given url 'http://localhost:3000/actor?actor_id=eq.20'
    Then request
      """
      {
      "actor_id": 20,
      "first_name": "Jenny",
      "last_name": "Tracy",
      "last_update": "2013-05-26T14:47:57.62"
      }
      """
    When method put
    And status 204
    #And match response.first_name == 'Jenny'
    * print response
    Given url 'http://localhost:3000/actor?actor_id=eq.138'
    Then request
      """
      {
        "actor_id": 138,
        "first_name": "Jenny",
        "last_name": "Dee",
        "last_update": "2013-05-26T14:47:57.62"
        }
      """
    When method put
    * print response
    ###################################################################
    Given url 'http://localhost:3000/actor?actor_id=eq.20'
    Then request
      """
      {
      "actor_id": 20,
      "first_name": "Lucille",
      "last_name": "Tracy",
      "last_update": "2013-05-26T14:47:57.62"
      }
      """
    When method put
    And status 204
    #And match response.first_name == 'Lucille'
    * print response
    Given url 'http://localhost:3000/actor?actor_id=eq.138'
    Then request
      """
      {
        "actor_id": 138,
        "first_name": "Lucille",
        "last_name": "Dee",
        "last_update": "2013-05-26T14:47:57.62"
        }
      """
    When method put
    #And match response.first_name == 'Lucille'
    * print response
    Given url 'http://localhost:3000/actor?first_name=eq.Lucille'
    Then method get
    * print response
    And match response[*].first_name == ["Lucille","Lucille"]
