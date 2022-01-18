package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	//User Name Text Field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	//Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	//Login Button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLoginButton()
	{
		return oLogin;
	}
	//FlyoutWindow Minimize
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	//Logout Link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutLink()
	{
		return oLogout;
	}

	//create user

	@FindBy(xpath ="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")
	private WebElement createUserButton;
	public WebElement getCreateUserButton()
	{
		return createUserButton;
	}

	@FindBy(xpath ="//*[@id=\'createUserDiv\']/div/div[2]")
	private WebElement createUserAddButton;
	public WebElement getCreateUserAddButton()
	{
		return createUserAddButton;
	}

	private WebElement firstName;
	public WebElement getAddUserFirstName()
	{
		return firstName;
	}

	private WebElement lastName;
	public WebElement getAddUserLastName()
	{
		return lastName;
	}

	private WebElement email;
	public WebElement getAddUserEmail()
	{
		return email;
	}

	private WebElement userDataLightBox_usernameField;
	public WebElement getAddUserName()
	{
		return userDataLightBox_usernameField;
	}

	private WebElement password;
	public WebElement getAddUserPassword()
	{
		return password;
	}


	private WebElement passwordCopy;
	public WebElement getAddUserRetypePassword()
	{
		return passwordCopy;
	}

	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']")
	private WebElement createUserCreateButton;
	public WebElement getCreateUserCreateButton()
	{
		return createUserCreateButton;
	}

	//delete User-click on user
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement clickOnUser;
	public WebElement getClickOnUser()
	{
		return clickOnUser;
	}
	//delete User-Delete button
	@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
	private WebElement deleteUserDeleteButton;
	public WebElement getDeleteUserDeleteButton()
	{
		return deleteUserDeleteButton;
	}

	@FindBy(xpath="//span[text()='Start exploring actiTIME']")
	private WebElement XploreActimeIcon;
	public WebElement getXploreActimeIcon()
	{
		return XploreActimeIcon;
	}

	//Click on User1
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement clickOnUser1;
	public WebElement getClickOnUser1()
	{
		return clickOnUser1;
	}

	//Click on User2
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement clickOnUser2;
	public WebElement getClickOnUser2()
	{
		return clickOnUser2;
	}

	//Click on User3

	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement clickOnUser3;
	public WebElement getClickOnUser3()
	{
		return clickOnUser3;
	}

	//create customer-task link
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[3]/a")
	private WebElement clickOnTask;
	public WebElement getClickOnTask()
	{
		return clickOnTask;
	}

	//create customer-Add new button
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement addNewDropdownInTask;
	public WebElement getAddNewDropdownInTask()
	{
		return addNewDropdownInTask;
	}

	//create customer-Add new button
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement newCustomerOption;
	public WebElement getNewCustomerOption()
	{
		return newCustomerOption;
	}

	//create customer-customer name field
	@FindBy(xpath="//*[@id='customerLightBox_nameField']")
	private WebElement customerNameField;
	public WebElement getCustomerNameField()
	{
		return customerNameField;
	}

	//create customer-customer description field
	@FindBy(xpath="//*[@id=\'customerLightBox_descriptionField\']")
	private WebElement customerDescriptionField;
	public WebElement getCustomerDescriptionField()
	{
		return customerDescriptionField;
	}

	//create customer-customer Save button
	@FindBy(xpath="//*[@id='customerLightBox_commitBtn']")
	private WebElement saveCustomerButton;
	public WebElement getSaveCustomerButton()
	{
		return saveCustomerButton;
	}

	//setting icon
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement customerSettingIcon;
	public WebElement getCustomerSettingIcon()
	{
		return customerSettingIcon;
	}

	//active archived drop down
	@FindBy(xpath="//*[@id=\taskListBlock\']/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement customerActiveArchievedDropDown;
	public WebElement getCustomerActiveArchievedDropDown()
	{
		return customerActiveArchievedDropDown;
	}

	//active archived selection
	@FindBy(xpath="//div[text()='Archived']")
	private WebElement customerArchievedSelection;
	public WebElement getArchivedSelection()
	{
		return customerArchievedSelection;
	}

	//active archived selection
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement customerActiveDropDown;
	public WebElement getCustomerActiveDropDown()
	{
		return customerActiveDropDown;
	}

	//ClickSettingCustomertoModifyorDelete
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement clickSettingCustomertoModifyorDelete;
	public WebElement getclickSettingCustomertoModifyorDelete()
	{
		return clickSettingCustomertoModifyorDelete;
	}
	//clickActionButtontoDeleteCustomer
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")
	private WebElement oclickActionButtontoDeleteCustomer;
	public WebElement getclickActionButtontoDeleteCustomer()
	{
		return oclickActionButtontoDeleteCustomer;
	}
	//clickDeleteCutomer
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]")
	private WebElement oclickDeleteCutomer;
	public WebElement getclickDeleteCutomer()
	{
		return oclickDeleteCutomer;
	}
	//ClickDeleteCustomerConfirm
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getClickDeleteCustomerConfirm()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	//clickSettingCustomertDelete
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement oclickSettingCustomertDelete;
	public WebElement getclickSettingCustomertDelete()
	{
		return oclickSettingCustomertDelete;
	}

	//modifyCustomerclickoncustomernamefield
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")  
	private WebElement omodifyCustomerclickoncustomernamefield;
	public WebElement getmodifyCustomerclickoncustomernamefield()
	{
		return omodifyCustomerclickoncustomernamefield;
	}
	
	//modifyCustomerclickoncustomernamefieldtoClear
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[2]/input")
	private WebElement omodifyCustomerclickoncustomernamefieldtoClear;
	public WebElement getmodifyCustomerclickoncustomernamefieldtoclear()
	{
		return omodifyCustomerclickoncustomernamefieldtoClear;
	}
	//modifyCustomername
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[2]/input")
	private WebElement omodifyCustomername;
	public WebElement getmodifyCustomername()
	{
		return omodifyCustomername;
	}
	//AfterModifyCloseCustomerWindow
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")
	private WebElement oAfterModifyCloseCustomerWindow;
	public WebElement getAfterModifyCloseCustomerWindow()
	{
		return oAfterModifyCloseCustomerWindow;
	}
	//clickAddNew
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")  
	private WebElement oclickAddNew;
	public WebElement getclickAddNew()
	{
		return oclickAddNew;
	}
	//clickNewprojectunderADDNew
	@FindBy(xpath="/html/body/div[14]/div[2]")  
	private WebElement oclickNewprojectunderADDNew;
	public WebElement getclickNewprojectunderADDNew()
	{
		return oclickNewprojectunderADDNew;
	}
	//GiveProjectnameonnameField
	private WebElement projectPopup_projectNameField ;
	public WebElement getGiveProjectnameonnameField()
	{
		return projectPopup_projectNameField;
	}
	//confirmCreateproject
	private WebElement projectPopup_commitBtn ;
	public WebElement getconfirmCreateproject()
	{
		return projectPopup_commitBtn;
	}
	//clicksettingsatProject
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")  
	private WebElement oclicksettingsatproject;
	public WebElement getclicksettingsatproject()
	{
		return oclicksettingsatproject;
	}
	//clickActionsinProject
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")  
	private WebElement oclickActionsinProject;
	public WebElement getclickActionsinProject()
	{
		return oclickActionsinProject;
	}
	//ClickDeleteonProject
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")  
	private WebElement oclickDeleteonProject;
	public WebElement getclickDeleteonProject()
	{
		return oclickDeleteonProject;
	}
	//confirmDeleteProject
	@FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitBtn\']/div")  
	private WebElement oconfirmDeleteProject;
	public WebElement getconfirmDeleteProject()
	{
		return oconfirmDeleteProject;
	}
	//clickSettingstoModifyproject
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")  
	private WebElement oclickSettingstoModifyproject;
	public WebElement getclickSettingstoModifyproject()
	{
		return oclickSettingstoModifyproject;
	}
	//giveDescriptioninproject
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")  
	private WebElement ogiveDescriptioninproject;
	public WebElement getgiveDescriptioninproject()
	{
		return ogiveDescriptioninproject;
	}
	//selectNewtask
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[1]")  
	private WebElement oselectNewtask;
	public WebElement getselectNewtask()
	{
		return oselectNewtask;
	}
	//selectCreatnewTask
	@FindBy(xpath="/html/body/div[13]/div[1]")  
	private WebElement oselectCreatnewTask;
	public WebElement getselectCreatnewTask()
	{
		return oselectCreatnewTask;
	}
	//selectCreatnewTask1underTask
	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")  
	private WebElement oselectCreatnewTask1underTask;
	public WebElement getselectCreatnewTask1underTask()
	{
		return oselectCreatnewTask1underTask;
	}
	//confirmtask1
	@FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']")  
	private WebElement oconfirmtask1;
	public WebElement getconfirmtask1()
	{
		return oconfirmtask1;
	}
	//selectAlltasktodelete
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/table/tbody/tr/td[1]")  
	private WebElement oselectAlltasktodelete;
	public WebElement getselectAlltasktodelete()
	{
		return oselectAlltasktodelete;
	}
	//deleteTasktoselect
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[3]/div/div/div[4]")  
	private WebElement odeleteTasktoselect;
	public WebElement getdeleteTasktoselect()
	{
		return odeleteTasktoselect;
	}
	//confirmDeleteTask  
	private WebElement deleteTaskPopup_deleteConfirm_submitTitle;
	public WebElement getconfirmDeleteTask()
	{
		return deleteTaskPopup_deleteConfirm_submitTitle;
	}

}

