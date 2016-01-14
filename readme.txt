----------------------------------------------------------------------------------

                 SMART SHOPPY
----------------------------------------------------------------------------------
  ReadMe.txt

  Thank you for using this website.

  This ReadMe contains minute to minute information and troubleshooting tips.
  U need to instal tomcat server for local server acess.
----------------------------------------------------------------------------------
 CONTENTS
----------------------------------------------------------------------------------

	1) SYSTEM REQUIREMENTS
	2) DEVELOPING AND TESTING TOOLS REQUIREMENTS
	3) IMPLEMENTATION AND SEARCHING PROCEDURE
	4)FUCTIONALITY AND PERFORMANCE
	5) OBJECTIVES
	6) SCOPE
	7) APPLICATIONS
	8) TECHNOLOGY OVERVIEW
	9) CONTACT INFORMATION

----------------------------------------------------------------------------------
 1) SYSTEM REQUIREMENTS
----------------------------------------------------------------------------------

The scripting languages used are HTML, JAVA for both front-end and back-end.

Supported Operating Systems are:
	Windows 2000 Professional (Workstation) plus Service Pack 3
	Windows XP (Home and Professional) plus Service Pack 1
	Windows 7
	Windows 7 ultimate
	Windows 8
	windows 8.1
	windows 10

The following operating systems are NOT supported:
	Windows 98
	Windows 98 Second Edition and before. 
	
Minimum Hardware Requirements
	Processor   : 1.5GHz or more
	Hard Disk   : requires 2GB free Space 
	RAM         : 500MB(min) 
	
	Keyboard(if)
	Mouse(if)




 ----------------------------------------------------------------------------------------------------------------------------------------------------------------

 2) DEVELOPING AND TESTING TOOLS REQUIREMENTS
----------------------------------------------------------------------------------------------------------------------------------------------------------------
	we use java,html and tomcat server for developing this website.
	JAVA v 7.0 REQUIREMENTS
Java 7 System Requirements

Detailed information on Java 7 system requirements are available at Java 7 Supported System Configurations.

Windows
Windows 10 (7u85 and above)
Windows 8.x (Desktop)
Windows 7 SP1
Windows Vista SP2
Windows Server 2008 SP2 and 2008 R2 SP1 (64-bit)
Windows Server 2012 (64-bit) and 2012 R2 (64-bit)
RAM: 128 MB; 64 MB for Windows XP (32-bit)
Disk space: 124 MB
Browsers: Internet Explorer 7.0 and above, Firefox 3.6 and above
Note: As of April 8, 2014 Microsoft stopped supporting Windows XP and therefore it is no longer an officially supported platform. Users may still continue to use Java 7 updates on Windows XP at their own risk, but support will only be provided against Microsoft Windows releases Windows Vista or later. See Third Party Vendor-Specific Support Terms on Oracle Software Technical Support Policies (pdf) for details.

Mac OS X
Intel-based Mac running Mac OS X 10.7.3 (Lion) or later.
Administrator privileges for installation
64-bit browser
A 64-bit browser (Safari, Firefox for example) is required to run Oracle Java on Mac OS X. 


Linux
Oracle Linux 5.5+
Oracle Linux 6.x (32-bit), 6.x (64-bit)3
Oracle Linux 7.x (64-bit)3 (7u67 and above)
Red Hat Enterprise Linux 5.5+, 6.x (32-bit), 6.x (64-bit)3
Red Hat Enterprise Linux 7.x (64-bit)3 (7u67 and above)
Suse Linux Enterprise Server 10 SP2, 11.x
Suse Linux Enterprise Server 12.x (7u75 and above)
Ubuntu Linux 10.04 and above
Browsers: Firefox 3.6 and above
Solaris System Requirements
See supported Java 7 System Configurations for information about supported platforms, operating systems, desktop managers, and browsers.

TOMCAT REQUIREMENTS
------------------------------------------------------------------------------------
Tomcat 6.0 requires JRE 5.0 or higher. 

Objectives

Install Tomcat
Test your install
Install your first web app
View Tomcat's docs.
Version Notes:

Tomcat 3.x - implements the Servlet 2.2 and JSP 1.1 specifications, requires Java 1.1 (or higher).
Tomcat 4.x - implements the Servlet 2.3 and JSP 1.2 specifications, requires Java 1.3 (or higher).
Tomcat 5.x - implements the Servlet 2.4 and JSP 2.0 specifications, requires Java 1.4 (or higher).
Tomcat 6.x - implements the Servlet 2.5 and JSP 2.1 specifications, requires Java 1.5 (or higher).
Version 6.0.32 (check on 03/20/2011)
Tomcat 7.x - implements the Servlet 3.0 and JSP 2.2 specifications, requires Java 1.6 (or higher).
Version 7.0.10, Mar 5 2011
Installation Notes for Win XP

apache-tomcat-6.0.32.exe - download this file from the Tomcat home page:
http://tomcat.apache.org/
On the left side of the screen under "Download" click "Tomcat 6.x"
Sometimes the beta versions are listed first.  Find the first version that doesn't have "-beta" at the end.
Find the section "Binary Distributions" section
Download notes: 
I suggest saving them to your local and then later installing (RUN).  
To download the file, right click on the link and choose "Save as Target" to save to your local (do not click "Run" after the download. Click "Close").
Download the following files. 
Find the sub-section "Core" links.
Determine what file to download.  Here are some helpful notes:
Option: 32-bit/64-bit Windows Service Installer - This is the one we will use for this tutorial.
Option: Zip file download - if you prefer just the zip files this will help you choose between 32bit & 64bit.  Then if you want a Windows Service you will have to create one by hand.
Windows XP Pro - 32 bit OS.
Windows 7 - 64 bit OS
"32-bit/64-bit Windows Service Installer" (~6.8 meg) - this version is designed to be started as a windows service.
(ex file: apache-tomcat-6.0.29.exe)

Upgrade WARNING:  If an older version of Tomcat is installed then uninstall the current Tomcat version first.
(Note: I have not tried running more than one Tomcat Web App Server on one computer.)
Uninstall Tomcat so you can update the version.
I suggest that you Stop the Tomcat service first.
(Ex: Start, Settings, Control Panel, Administrative Tools, Services. Right click on "Apache Tomcat" then click "Stop".)
Make a backup copy of the current Tomcat x.x directory.
(IE: C:\Program Files\Apache Software Foundation\Tomcat 5.5 or C:\Tomcat\Tomcat6.0 )
Uninstall Tomcat – Programs, "Apache Tomcat x.x.x", "Uninstall Apache Tomcat x.x.x"
(Other option:  Control Panel, Add or Remove Programs, then find "Apache Tomcat x.x.x").
Next you will be prompted with: 
Remove all files in your Tomcat 5.5 directory? (If you have anything you created that you want to keep, click No)
Click "No" - so that you keep all of your work files.  Warning: "Yes" will delete all of them!
You should see "Completed".  Click "Close".
Install Tomcat Core
Run the .exe file you downloaded.  (Note: You can run it from any location.)
On the Welcome screen click "Next"
On the License Agreement screen click "I Agree"
Choose Components Screen
If not checked, check "Start Menu Items", "Documentation" & "Manager".
Optional Items I would also check:
Check - Host Manager - tomcat host manager administrative web application.
Check - Examples - install the Servlet and JSP examples web application.
You can always delete them later.
C:\Tomcat\Tomcat6.0\webapps\examples
C:\Tomcat\Tomcat6.0\webapps\host-manager 
C:\Tomcat\Tomcat6.0\webapps\docs
Keep these:
C:\Tomcat\Tomcat6.0\webapps\manager 
C:\Tomcat\Tomcat6.0\webapps\ROOT
Click Next.
Configuration
HTTP1.1 Connector Port: 8080  (use the default)
Note: To change after install: C:\Tomcat\Tomcat6.0\conf\server.xml
<Connector port="8080" protocol="HTTP/1.1" 
connectionTimeout="20000" 
redirectPort="8443" />
Tomcat Administrator Login (option) - WARNING - make sure you enter a user & password or you will not be able to do admin functions unless you modify the XML file: C:\Tomcat\Tomcat6.0\conf\tomcat-users.xml.
User Name & Password: admin/admin
User Name: admin (commonly used)
Password: admin (commonly used for local development only)
Roles: admin-gui,manager-gui (default)
To change later: (tomcat-users.xml)
C:\Tomcat\Tomcat6.0\conf\tomcat-users.xml
Example:
<tomcat-users>
    <user name="admin" password="admin" roles="admin-gui,manager-gui" />
</tomcat-users>
Java Virtual Machine - install should find the directory.
My Default Ex: C:\Program Files\Java\jre6 (Warning: Could use but don't use!)
(Note: If you have a 64bit OS you need to specify a 64bit JRE or 64bit JDK.)
Use the JDK.  Point to the location where your JDK is installed.
My Ex: C:\java\jdk1.6.0_21
Notes: How to change later!
Win 7: 
Control Panel, (click "View by:" in upper right corner and select "Small Icons"), System, Advanced System Settings, Environment Variables, System Variables:  ex: JAVA_HOME, C:\java\jdk1.6.0_21
Win XP: (need to add....)
Choose Install Location Screen
Change to: C:\Tomcat\Tomcat6.0 (Notice - no spaces!)
The default is: C:\Program Files\Apache Software Foundation\Tomcat 6.0 
Note: Because of the spaces in the directory names I suggest using a install location.  It may save you headaches down the road.
To change later see the section at the bottom about "Windows Registry"
Click "Install"
"Completing the Apache Tomcat Setup Wizard" - leave the defaults checked
Checked - Run Apache Tomcat
Checked - Show Readme
Click "Finish"
Notes:
Release notes are located at:
C:\Tomcat\Tomcat6.0\webapps\ROOT\RELEASE-NOTES.txt
-------------------------------------------------------------------
Test your Install
----------------------------------------------------------------------
Open up a Browser
Test the "Tomcat" installation
Go to:  http://localhost:8080 - If this page doesn't come up you need to revisit the install.  If you still have problems I've seen some Firewalls cause issues.
Other URL alternatives that may work:
http://<your computer name>:8080
http://127.0.0.1:8080
Test your admin account & Password
On the left side, under the section called "Administration", click on "Status".
User name: admin
Password: <enter your password>
(If you get the "Server Status" page then you entered the correct user/password.)
Test the "Tomcat Manager" link
Click on "Tomcat Manager"
Since you have already authenticated as an "admin" you shouldn't be prompted for a password unless you close your browser.
You should see a list of Web Apps.
Test the webapps that were installed in the installation:
http://localhost:8080/docs - Tomcat documentation.
Optional Admin Web Apps:
http://localhost:8080/manager/html - admin authentication - Tomcat Manager
http://localhost:8080/manager/status - admin authentication - Server Status
http://localhost:8080/host-manager/html - admin authentication - Tomcat Virtual Host Manager
Example Applications  (if you installed them)
http://localhost:8080/examples - JSP & Servlet examples
Server's Web Root
Physical file: $CATALINA_HOME/webapps/ROOT/index.html
URL: http://localhost:8080/index.html
Install a Hello World Web Application

Hello World Web Application - mytomcat-helloworld.zip
Install "mytomcat-helloworld.war"
Download this file:  mytomcat-helloworld-war.zip
(Note: If you downloaded this tutorial to your local you have this file already!)
Unzip the file.  There is one file in it called:
mytomcat-helloworld.war
Copy the mytomcat-helloworld.war file to your Tomcat Webapps directory.
(ex: C:\Tomcat\Tomcat6.0\webapps )
Tomcat monitors the "webapps" directory and will extract the .war file's files and start the web application.  If you desire you can go to "Tomcat Manager" and see the new application.  
You can also look at the new directory and files using Win Explorer at:
C:\Tomcat\Tomcat6.0\webapps\mytomcat-helloworld
Note: If for some reason Tomcat doesn't auto install the .war file then Stop/Start Tomcat.
If you are updating a WAR file you need to remove the WAR file and remove the directory.  If the directory is not there and Tomcat sees a .war file in the webapps directory it will deploy the WAR file.
Test the new Web Application:
Go to: http://localhost:8080/mytomcat-helloworld
Install Tomcat's Sample Web Application

Go to: http://localhost:8080/docs/
Click the link: "3. First web application"
Click "Example App" under contents on the left side of the screen.
Click on the link "here" to download their "Sample Application". (Download link: http://localhost:8080/docs/appdev/sample/sample.war )
Save to this location: C:\Tomcat\Tomcat6.0\webapps
Give the Tomcat container a minute and it will automatically extract the WAR file and create a Web Application called "Sample".
Test your install: http://localhost:8080/sample 
Click on the JSP test link.
Click on the Servlet test link.
View the "Tomcat Documentation"

http://localhost:8080 , click "Tomcat Documentation" under Documentation.
Click "3) First webapp" - "Application Developers Guide"
Note:  When you have time, go through all of the items in the "Table Of Contents" expecially the "Example Application".
Finished

You are finished.
Windows Registry (cmd: regedit.exe)
Tomcat 6
HKEY_LOCAL_MACHINE\SOFTWARE\Apache Software Foundation\Tomcat\6.0
Install Path - windows service uses this value!
Tomcat 5
HKEY_LOCAL_MACHINE\SOFTWARE\Apache Software Foundation\Procrun 2.0\Tomcat5
Installation Issue

Tomcat 5.5.26

Startup.bat error:
The JAVA_HOME environment variable is not defined correctly
This environment variable is needed to run this program
NB: JAVA_HOME should point to a JDK not a JRE
Step 1: You must install a Java JDK and not just the JRE.
Step 2: Edit the file: <tomcat directory>\bin\setclasspath.bat
I suggest that you remove the first line. At a minimum it needs to point to a JDK and not a JRE.
ex remove the line: set JAVA_HOME="E:\Java\jdk1.6.0_20"
Step 3: System Environment Variable
(Ex: Windows Server 2003 R2)
Start, Control Panel, System, Advanced, Environment Variables and create/edit a variable called "JAVA_HOME"
Variable name: JAVA_HOME
Variable value: "C:\Java\jdk1.6.0_20"  (Note: Go ahead and use the quotes anyway!)
(Warning: DO NOT use "Program Files" because there has been issues with the "if" command in the batch files with spaces.)
------------------------------
Windows Service error:
--------------------------
Tomcat Resource:
http://tomcat.apache.org/tomcat-5.5-doc/windows-service-howto.html
Tomcat 5 service will not start up (saw with: Tomcat 5.5.26 & Windows Server 2003 R2)
Tomcat Logs: (<tomcat dir>\logs) - Several files are created in the Tomcat log directory when the "Apache Tomcat: service is started.

admin.2010-04-27.log
host-manager.2010-04-27.log
jakarta_service_20100427.log
manager.2010-04-27.log
stderr_20100427.log
stdout_20100427.log
catalina.2010-04-27.log
localhost.2010-04-27.log
Error that displays:
Window Title: Services
Error: Windows could not start the Apache Tomcat on Local Computer. For more information, review the System Event log.  If this is a non-Microsoft service, contact the service vendor, and refer to service-specific error code 0
Error in System Event log - The Apache Tomcat service terminated with service-specific error 0 (0x0).
For more information, see Help and Support Center at http://go.microsoft.com/fwlink/events.asp.
Tomcat Logs
<tomcat dir>/logs/jakarta_service_<YYYYMMDD>.log
[2010-04-26 15:34:36] [986 prunsrv.c] [error] Failed creating java "E:\Java\jdk1.6.0_20"\jre\bin\server\jvm.dll
[2010-04-26 15:34:36] [1260 prunsrv.c] [error] ServiceStart returned 1
[2010-04-26 15:34:36] [info] Run service finished.
[2010-04-26 15:34:36] [info] Procrun finished.
Solution: Remove any quotes in the Registry entry.
HKEY_LOCAL_MACHINE\SOFTWARE\Apache Software Foundation\Procrun 2.0\Tomcat5\Parameters\Java\Jvm
Caused Error: "E:\Java\jdk1.6.0_20"\jre\bin\server\jvm.dll
Fixed Error: E:\Java\jdk1.6.0_20\jre\bin\server\jvm.dll
Note: It has been my experience to NOT install Java into the default directory of "C:\Program Files\..." because the quotes needed to access the files may cause issues.  Above is an example of that!  So don't use quotes ("") in the JAVA_HOME system variable etc...

System Variable: JAVA_HOME - don't use quotes (" ")
Variable name: JAVA_HOME
Variable value: E:\Java\jdk1.6.0_20
-----------------------------------------------------------------
Other info
-------------------------------------------------------------------
The following didn't work for me and this file doesn't need to be in the <tomcat>\bin directory for my Tomcat5 service to startup.  I'm including this information because it was so prevalent at forums.
Copy msvcr711.dll from  <java>\bin directory to <tomcat>\bin directory
Debugging "startup.bat"
To debug run the "startup.bat" and make sure it starts Tomcat without any errors.
A DOS window will stay open with the following words at the end:
- Server startup in 641 ms
If the above doesn't happen then use the "echo" and "pause" to debug and figure out what is happening.
Start tomcat5.exe in debug mode (see errors at the console).
Copy "tomcat5.exe" to another name like "tomcat5_debug.exe".  You can run this from a DOS prompt and see any errors.
Ex: C:\tomcat-5.5.26\bin\tomcat5_debug.exe //TS//Tomcat5
(Note: //TS - option to run from a console.)
If startup is complete you will see as the last 2 lines something like:
Apr 27, 2010 11:32:37 AM org.apache.catalina.startup.Catalina start
INFO: Server startup in 937 ms

WE USE 
 HTML tag containing information about a Web page that is added by the person creating the Web page and is used primarily by search sites.
----------------------------------------------------------------------------------
 3) IMPLEMENTATION AND SEARCHING PROCEDURE 
	
----------------------------------------------------------------------------------
Implementation literally means to put into effect or to carry out. In the system implementation phase, the software deals with translation of the design specifications into source code. The ultimate goal of the implementation is to write the source code and the internal documentation so that it can be verified easily.

MODULES:

HOME PAGE:
 	This module helps user to select the stream in which he/she wants to compare the price of the product.


ONLINE PAGE:
 	This module helps the user to enter product name and once the user submits product name then a table is displayed which consists of name of the online store, price and link of the product in that particular store.

SEARCH ENGINE:
	This module helps user to search with auto completion feature like google. The user can search for the desired product details like technical specifications and etc.
If you're a business owner living in today's technological age, your eye is surely on expansion through e-commerce. Whether you are the owner in question who is tech-savvy enough to build your own site, or a third-party Web page developer, there are 5 rough steps to keep in mind to ensure the success of your e-commerce endeavors.

The first of these steps is to just figure out what your website hopes to accomplish. You can either pick one model (such as B2B, or Business to Business) or combine a few of them depending on your ambition and the needs of your business. Within this model, 
you also need to be making decisions such as whether your site will be taking a Storefront approach (basically being an online version of a physical store) a Subscription approach (where customers pay for premium content that is web-only), or even Affiliate Marketing (where your business would sell the products of another business for a commission). 
As you browse the Web and study the models of your competitors you'll get a good idea about what is and isn't the goal of the e-commerce site you're creating.A business to consumer model is just selling straight to the consumer.
 E-bay is a good example of a consumer to consumer business model. Consumer to consumer is really convenient since it always the buyer to pay the owner on the spot, not tax, no driving, etc. It is also nice for collector items that are hard to find. Anyone can go on this website to be able to sell and buy items. It is just an online auction and is also worldwide. E-bay is not free though, 
a user has to pay an invoice fee if they sold or listed anything.The last business model is to have business to government. These businesses usually already have a previously drawn contract with the government because they have something that the government needs. An example of a business to government is actually being able to pay fees online. 
If a business has a fee to pay they can just go online and pay it off. It is also more convenient to have fees available to pay online because the use of mail is declining. Before the use of these government websites a person would have to send in the mail of have to go somewhere to pay it off.

The next important step is deciding on the applications of your e-commerce page. If you're a business owner creating a Web page, it's a given that one part of your site will be online selling, but there are ways you can establish the name of your company that go above and beyond so your customers will remember you in a positive light and keep coming back, hopefully with their friends and family in tow. 
These extra features are called e-commerce applications and they can range from merely providing in-depth product information to providing technical support, or even letting them track online purchases through the mail. For the adventurous and creative developers, you can program games, surveys, and even music, all for the sake of providing a more intriguing online shopping experience.

After selecting the appropriate business model and type of Web site along with the desired e-commerce application, another valuable procedure to consider is the procedures for handling electronic financial transactions. The kind of payment type an e-commerce Web site uses depends on the type of site it is and the types of customers involved. The available payment options will usually be displayed on the checkout page of the Web site. 
Nowadays, credit card processing is the most used payment option. A business needs to open an e-commerce merchant account (a.k.a. an Internet merchant account) in order to accept credit cards.
A bank is hired by the merchant to monitor the transactions with credit and debit cards and usually charges a monthly fee, a transaction fee, and a commission for this service. Customers are also able to use single-use virtual credit card numbers, which they request by logging onto their credit or debit card account. A virtual credit card number can be used to purchase an item online so that hackers cannot intercept the actual account number during the transition. 
Smart cards are also becoming increasing popular. A smart card is a credit or debit card that is embedded with a computer chip. The chip usually contains identifying data for authentication purposes. Other customers online may use PayPal, digital gift certificates, gift cards, and digital wallets.
---------------------------------------------------------------------------------------------------
4)Functionality and performance
-----------------------------------------------------------------------------------------------------
In our Comparison shopping website we implement coding for shopping search comparison. Shopping search comparison (SSC) is composed of two different technologies: page-wise search and site-wise search.
In page-wise search a phrase, such as a product name, is searched over an index of pages. When the phrase is found, the URLs of the pages in which the phrase was found are returned to the user in the user’s browser along with pictures of the products found.
In site-wise search, several product names are searched not over an index of pages, but over an index of sites. To perform a site-wise search the SSC engine must search all pages in every site in its index and return the sites that have pages where one of the several product names occur. 
Site-wise search is more computer-intensive because multiple products are searched over multiple pages on multiple sites. The result, although costly in terms of computing power,
 is that a list of products may be searched and found at a single website – for example at an online merchant.

Empirical projects that assessed the functionality and performance of page-wise SSC engines (AKA bots) exist. These studies demonstrate that no best or parsimonious shopping bot exists with respect to price advantage

Our website sort the key with other stores, with help of proper API token provided by the stores.
these token provides acess the store server to search the key in their server
Application Programming Interfaces

An application programming interface (API) allows one web-based application to interact with another application.

Online merchants can use APIs from vendors or free services to improve their store’s features, add site content, or communicate more readily with customers and partners.

APIs allow all sorts of web-based applications to interact. This interaction can allow a merchant to add features to a site or improve business automation.
 But in most cases, connecting via an API will require a professional web developer. For merchants, the key is knowing where an API exists so a connection can be made.
Think of an API as set of instructions that explains how a web developer can operate a particular application.

For example, imagine that an online merchant wants to encourage customers to sign up for a weekly newsletter, but the merchant wants to keep track of recipients in an email marketing tool like Constant Contact, MailChimp, or Bronto.

Each of these email marketing services offers an API, so that the merchant’s web developer can access features from the email marketing service—like adding a recipient to a list (in a database)—from the merchant’s own web server. In this way, customers register for the newsletter on the merchant’s site, but the information is passed from the merchant’s server to the server running the email marketing application.

More specifically, the API would tell the developer what formats could be submitted (XML, for example); how to connect to the application’s servers; what sort of passwords, usernames, or keys would be required; and what kinds of information are available.

key searching code in java 

public String searchProducts() {
		if (StringUtils.isBlank(searchKey)) {
			// throw an error message
			showMessage();
		}
		SearchServiceImpl searchImpl = new SearchServiceImpl();

		// Get Flipkart Results
		ArrayList<Product> flipkartProducts = searchImpl.queryMerchantWebsites(
				searchKey, "flipkart");

		// Get Amazon Results
		ArrayList<Product> amazonProducts = searchImpl.queryMerchantWebsites(
				searchKey, "amazon");

		if (CollectionUtils.isEmpty(flipkartProducts)
				&& CollectionUtils.isEmpty(amazonProducts)) {
			// throw an error message
			showMessage();
		}

		for (Product prod : flipkartProducts) {
			prod.setPrice(prod.getPrice().replace("Rs.", ""));
		}

		for (Product prod : amazonProducts) {
			prod.setPrice(prod.getPrice().replace(".00", ""));
		}

		tableResults = new ArrayList<Product>();
		tableResults.addAll(flipkartProducts);
		tableResults.addAll(amazonProducts);

		for (Product prod : tableResults) {
			prod.setRate(new Long((prod.getPrice().replace(",", "")).trim()));
			prod.setRedirectURL("<a href=\"" + prod.getUrl() +  "\" target=\"_blank\"> Goto Store </a>");
			if(StringUtils.isNotBlank(prod.getTitle())) {
				prod.setToolTip(prod.getTitle());
				if(prod.getTitle().length() > 50) {
					prod.setTitle(prod.getTitle().substring(0, 50) + "....");
				} 
			}
		}
		
		Collections.sort(tableResults, new CollectionComparator("rate",
				CollectionComparator.ASC));
		return "";
	}

	public void showMessage() {

		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info",
						"Your search '" + searchKey
								+ "' did not match any products."));
	}

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public List<Product> getTableResults() {
		return tableResults;
	}

	public void setTableResults(List<Product> tableResults) {
		this.tableResults = tableResults;
	}
}

After the geting information form the respected stores or marchents the results are stored in a lowpice in first with respetive store and alose our website adirect link to store.  
----------------------------------------------------------------------------------
 5) OBJECTIVES
----------------------------------------------------------------------------------

	The main objective of this web application is to save money and time of the customer and make him/her satisfied with the product shopping by providing best price of the product.

	At the same time to reduce browsing time, before shopping customer may waste his/her time in searching price of product in various online stores and offline stores in various cities. Using this application browsing time can be reduced as prices of product are provided at one place in various online stores and offline store in that corresponding city.  


----------------------------------------------------------------------------------

 6) SCOPE
----------------------------------------------------------------------------------

	Compare the prices. The main deliverable from this application is comparison of price of the particular product online store.

	Navigate to the site and shop. In case of online stores price comparison user is provided with link where he/she can navigate to that particular site and shop over there. 

	Can easily spot the location of the concerned stores. I

--------------------------------------------------------------------------------------	
 7) APPLICATIONS
------------------------------------------------------------------------------------
	Can also be used for shopping goods like clothing, furniture and etc.

	Can be used for advertising purpose. This application can be used to promote new stores, inventions and trending goods in market.

	Can be used for booking online tickets. By modifying this application we can compare price of the ticket in various travels and flights.


 **LIMITATIONS:

	It just gives price of the regarding product. This application does not provide technical specifications of the product, how it is different from rest of the models and user rating .

	The application is limited to acess some stores.

	

----------------------------------------------------------------------------------------
 8) TECHNOLOGY OVERVIEW
---------------------------------------------------------------------------------------
	Elastic Path® ecommerce technology is built on industry-leading Java, the foundation for open source Java ecommerce application development because of its flexibility and scalability. Elastic Path and open source ecommerce Java technology together allow you to deploy scalable, 
secure, and robust Java e-commerce across all of your touchpoints to support the next generation of digital experiences.
 By using Java open source ecommerce foundations, Elastic Path offers the most flexible e-commerce technology available


----------------------------------------------------------------------------------------
 
 9) CONTACT INFORMATION
________________________

For news, hints, and the SERVER, check out 
	 
	www.w3schools.com
	www.stackoverflow.com
	www.mysmartprice.com
	WWW.TOMCAT.COM
	
For Technical Support:-
	     
              J. PUSHPA BINDU
	      pushpabindujonna@gmail.com
	      
	      SHOBHA VARMA
              K. MANIKANTA
	      mkanta90@gmail.com

If necessary, you may be asked by Technical Support to obtain an analysis of you machine to help troubleshoot problems. Forward this file to Technical Support only when
 perform an analysis:-
 	Using Explorer, locate the "WWW" main directory, and right
click on ".EXE FILE", then select the option "Launch Analysis". 

__________________________________________________________________________________
This software and documentation 
Copyright (c) 2016 smart shoopy.
_____________________________________________________________________________________