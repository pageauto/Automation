Feature :Verify the values displayed on the screen



Scenario outline: To verify the UI of values displaying on the screen

Given User is in Exercise Home screen
Then Verify numberofValues appears on screen
Then Verify amount displays on screen should be greater than 0
Then Verify the format of values

Example:|numberofValues|
         |5|

Scenario :Verify the sum of values displaying on the screen

Given User is in Exercise Home screen
Then Verify totalBalance should be sum of values displaying on screen

Example:|toalBalance|
        |$100000|
        
  
