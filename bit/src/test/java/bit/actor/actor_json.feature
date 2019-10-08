Feature: Calling another feature file

  Background: 
    * call read('classpath:bit/utils/utils.feature')
    * def actorJson = read('classpath:bit/utils/actor.json')

  Scenario: Create an actor
    Given url baseUrl + 'actor'
    Then request actorJson
    And method post
    And status 201
    Then method get
    * def allActors = "" + response
    And status 200
    And match allActors contains actorJson.first_name
    And match allActors contains actorJson.last_name
    * print response

  Scenario: Modify Actor
    Given url baseUrl + 'actor?first_name=eq.Test'
    Then method get
    And status 200
    * def actorId = response[0].actor_id
    * set actorJson.actor_id = actorId
    * set actorJson.first_name = 'Test25'
    * set actorJson.last_name = 'Tester25'
    * set actorJson.last_update = '2019-05-30T19:46:30.395928'
    * print actorJson
    Then url baseUrl + 'actor?actor_id=eq.' + actorId
    Then request actorJson
    And method put
    And status 204
    Then method get
    And status 200
    And match response[0].first_name contains actorJson.first_name
    And match response[0].last_name contains actorJson.last_name

  Scenario: Delete actor
    Given url baseUrl + 'actor?first_name=eq.Test25'
    Then method get
    * def actorId = response[0].actor_id
    Then url baseUrl + 'actor?actor_id=eq.' + actorId
    And method delete
    And status 204
