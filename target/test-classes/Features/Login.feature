Feature: Validating Place API's

Scenario Outline: Verify place is added successfully using AddPlace API
   Given Add Place Payload with "<name>" "<language>" "<address>"
   When User calls "AddPlaceAPI" with "Post" Http request
   Then the API call got success with status code 200
   And "status" in response body is "OK"
   And "scope" in response body is "APP"
   And verify place_id created maps to "<name>" using "getPlaceAPI"
   
Examples:
         |name   |language|address  |
         |AAHouse|English|WorldTradeCenter|
        # |BBHouse|Kannada|USA|
        

Scenario: verify if deleteAPI functionality is working
    Given DeletePlace payload
       When User calls "deletePlaceAPI" with "Post" Http request
       Then the API call got success with status code 200
        And "status" in respons body is "OK"
       
       