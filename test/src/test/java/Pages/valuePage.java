private baseUtil base;


public ValuesStep(baseUtil base){
PageFactory.initElements(base.driver, this);
this.base = base;
wait = new WebDriverwait(base.Driver ,30);

}


@FindBy(how=How.id, using ="IbI_val")

public WebElement txtValuesTab;

@FindBy(how=How.id, using ="txt_val")

public WebElement txtValuesAmount;


@FindBy(how=How.id, using ="IBI_ttl_val")

public WebElement txttotalBalance

@FindBy(how=How.id, using ="txt_ttl_val")

public WebElement txttotalBalanceAmount


public void lauchUrl(){
base.Driver.get("https://www.excercise1.com/values");
}
