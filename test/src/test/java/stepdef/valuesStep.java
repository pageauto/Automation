public class ValuesStep{



private baseUtil base;
ValuesPage objValuesPage;


public ValuesStep(baseUtil base){
this.base = base;
wait = new WebDriverwait(base.Driver ,30);
objValuesPage = new ValuesPage(base);
}

@Given("^User is in Excerise Home screen$")
public void UserisinExceriseHomescreen(){
try{
     objValuesPage.lauchUrl();
}
catch(Exception e){
  e.printstacktrace();
}
}


@Then("^Verify \"(.*)"\ appers on screen$")
public void Verifyappersonscreen(String strNumOfValues){
try{
    List<WebElement> txtValuesTab;
    int numberOfValues = objValuesPage.txtValuesTab.size();
    Assert.assertTrue("No of Value Tab",numberOfValues ,5);

}
catch(Exception e){
  e.printstacktrace();
}
}


@Then("^Verify amount and formate of currency displays on screen should be greater than 0$")
public void Verifyamountdisplayesonscreenshouldbegreaterthan0(){
try{
    List<WebElement> txtValuesAmount;
     txtValuesAmount = objValuesPage.txtValuesAmount;
    
    for(int i=0; i<objListWebElement.size() ;i++)
     {

          if(objListWebElement[i].contains("$"){
            double values = Double.parseDouble((objListWebElement.getText()).replace("$",""));
            if(values > 0.0){
             Assert.assertTrue("Values should be greater than 0",Values);
             }
            }
       
     } 

   

}
catch(Exception e){
  e.printstacktrace();
}
}


@Then("^Verify totalbalance should be sum of values displaying on screen$")
public void Verifyshouldbesumofvaluesdisplayingonscreen(){
try{
    List<WebElement> txtValuesAmount;
     txtValuesAmount = objValuesPage.txtValuesAmount;
    
    for(int i=0; i<objListWebElement.size() ;i++)
     {

          if(objListWebElement[i].contains("$"){
            double values = Double.parseDouble((objListWebElement.getText()).replace("$",""));
            if(values > 0.0){
             double totalAmount =+ values ;
             Assert.assertTrue("Total balance should be sum of all values amt",txttotalBalanceAmount);
             }
            }
       
     } 

   
}
catch(Exception e){
  e.printstacktrace();
}
}
