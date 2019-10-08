Feature: Actor
  
	Scenario: Getting actors
    Given url 'http://localhost:3000/actor'
    Then method get
    * print response[18].first_name
    And match response[0].actor_id == 2
    And match response[18].first_name contains 'Lucille'
    
    
    #Scenario: Post actor
    #Given url 'http://localhost:3000/actor'
    #Then request
    #"""
    #{	
    #"first_name":"Makharashvili",
    #"last_name":"Godez"
    #}
    #"""
    #And method post
    #And status 201
    #
    #Then method get
    #* print response
    
    #Scenario: Update actor
    #Given url 'http://localhost:3000/actor?actor_id=eq.225'
    #Then request
    #"""
    #{	
     #"actor_id": 225,
    #"first_name":"Mitkhun",
    #"last_name":"Chakraboti",
    #"last_update": "2019-05-23T21:42:26.229171"
    #}
    #"""
    #And method put
    #And status 204
    #
    #Then method get
    #* print response
    
    
