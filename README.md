Making sure Web App is ready for Chrome v80 new Cookie settings - Secure; SameSite=None
=============

@author kazurayam
@date 29 Dec 2019

This is a Katalon Studio project for demonstration purpose hoping it is useful.
You can download the zip from the [releases] page, unzip it, open it with your Katalon Studio to run it.

# Problem to solve

Oct 2019, an article [Developers: Get Ready for New SameSite=None; Secure Cookie Settings](https://blog.chromium.org/2019/10/developers-get-ready-for-new.html) was published. 

>With Chrome 80 in February, Chrome will treat cookies that have no declared SameSite value as `SameSite=Lax` cookies. Only cookies with the `SameSite=None; Secure` setting will be available for external access, provided they are being accessed from secure connections. 

The organization I work for has a lot of web applications using Cookies and in some cases they uses Cross-Site cookies. I have to test and make sure these web apps are ready for the aformentioned change. I want to do the following steps.

1. Make sure I have Chrome v79. I will add a Chrome Profile named `Katalon`. I will use this Profile for testing the apps.
2. I will manually open up web apps, login, do any operation in the site so that cookies are created and stored in the `Katalon` Profile's local directory. For example, I will open https://www.katalon.com/sign-in/ , enter Email and Passowrd, and do login.
3. I want to make backup of the client-side storage of the `Katalon` Profile somewhere for future reuse.
4. I will follow the instruction given in the artcile:
>go to chrome://flags in Chrome 76+ and enable the “SameSite by default cookies” and “Cookies without SameSite must be secure” experiments.
5. With my Chrome v79 enabled these experiments ON, I will restore the `Katalon` Profile using the prepared backup data.
6. Then I will run a set of tests in Katalon Studio with Chrome browser opened with the `katalon` Profile. The tests will check if the cookies are successfully taken over. For example I will re-open https://www.katalon.com/sign-in/ and check if the Email and Password are preset with texts which are retrieved from Cookie.


 

