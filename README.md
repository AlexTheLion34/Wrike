# Test task #
* Author name : Aleksey Petrenko
### Environment ###
* Linux operating system (ex. Ubuntu 16.04 LTS)
* Google Chrome browser version: 73.0.3683.86
+ Note:
    * To make program work in different OS [download specific ChromeDriver](http://chromedriver.chromium.org/downloads)
    * Put it in a project folder
### Test case scenario ###
* Open url: [wrike.com](wrike.com);
* Click "Get started for free" button near "Login" button;
* Fill in the email field with random generated value of email with mask “<random_text>+wpt@wriketask.qaa” (e.g. “abcdef+wpt@wriketask.qaa”);
* Click on "Create my Wrike account" button + check with assertion that you are moved to the next page;
* Fill in the Q&A section at the left part of page (like random generated answers) + check with assertion that your answers are submitted;
* Click on "Resend email" + check it with assertion;
* Check that section "Follow us" at the site footer contains the "Twitter" button that leads to the correct url and has the correct icon;
* Create results report using allure plugin (by maven).  
### Running ###
* In terminal navigate to project folder
* Run: `mvn clean test allure:serve`
### Results ###
* After the tests are finished you will see Allure page in your browser <br/>
