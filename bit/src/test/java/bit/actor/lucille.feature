Feature: Update Lucille's name

  Background: 
    * call read('classpath:bit/utils/utils.feature')
    * def actorJson = read('classpath:bit/utils/actor.json')

  Scenario: Modify Lucille
  Given url baseUrl + 'actor?first_name=eq.Lucille'
    Then method get
    And status 200
    * def actorId = response[0].actor_idn
    * set actorJson.actor_id = actorId
    * set actorJson.first_name = 'Test007'
    * set actorJson.last_name = 'Tester007'
    * set actorJson.last_update = '2019-05-30T19:46:30.395928'
    Then url baseUrl + 'actor?actor_id=eq.' + actorId
    Then request actorJson
    And method put
    And status 204
    Then method get
    And status 200
