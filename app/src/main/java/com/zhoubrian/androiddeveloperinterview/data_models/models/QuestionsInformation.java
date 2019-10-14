package com.zhoubrian.androiddeveloperinterview.data_models.models;

import com.zhoubrian.androiddeveloperinterview.models.interviewQuestion;

import java.util.ArrayList;
import java.util.List;

public class QuestionsInformation {

    public QuestionsInformation(){}

    public List<interviewQuestion> getTough_Questions(){
        List<interviewQuestion> temp_ToughList=new ArrayList<>();

        interviewQuestion t1=new interviewQuestion("As a programmer how do you approach the problem of an app acting sluggishly due to network latency?","Multithreading");
        t1.suggestions.add("Starting over");
        t1.suggestions.add("Switching API levels");
        t1.suggestions.add("Refactoring code");
        t1.suggestions.add("Multithreading");

        interviewQuestion t2=new interviewQuestion("If the UI begins to behave sluggishly or crash while making network calls, this is likely due to...","Network latency");
        t2.suggestions.add("Network latency");
        t2.suggestions.add("Hardware malfunctions");
        t2.suggestions.add("Virus on the Server");
        t2.suggestions.add("Activity manager contains too much");

        interviewQuestion t3=new interviewQuestion("Android understandable form of code is called","DEX");
        t3.suggestions.add("DEX");
        t3.suggestions.add("JDK");
        t3.suggestions.add("DVM");
        t3.suggestions.add("API");

        interviewQuestion t4=new interviewQuestion("One of application component, that manages application's background services is called","Services");
        t4.suggestions.add("Activities");
        t4.suggestions.add("Broadcast Receivers");
        t4.suggestions.add("Services");
        t4.suggestions.add("Content Providers");

        interviewQuestion t5=new interviewQuestion("In android studio, callback that is called when activity interaction with user is started is","onResume");
        t5.suggestions.add("onStart");
        t5.suggestions.add("onStop");
        t5.suggestions.add("onResume");
        t5.suggestions.add("onDestroy");

        interviewQuestion t6=new interviewQuestion("To ensure that hardware components such as CPU, GPU, GPS receivers etc. can run on underlying Linux OS, developers create","drivers");
        t6.suggestions.add("classes");
        t6.suggestions.add("stubs");
        t6.suggestions.add("drivers");
        t6.suggestions.add("objects");

        interviewQuestion t7=new interviewQuestion("In which year was Android 7: Nougat released","2016");
        t7.suggestions.add("2014");
        t7.suggestions.add("2011");
        t7.suggestions.add("2016");
        t7.suggestions.add("2017");
        t7.setExplanation("Android \"Nougat\" (codenamed Android N during development) is the seventh major version and 14th original version of the Android operating system. First released as an alpha test version on March 9, 2016, it was officially released on August 22, 2016, with Nexus devices being the first to receive the update");

        interviewQuestion t8=new interviewQuestion("In android studio, a service that is started and cannot be stopped even calling activity is destroyed is","bindService()");
        t8.suggestions.add("onStop()");
        t8.suggestions.add("onDestroy()");
        t8.suggestions.add("bindService()");
        t8.suggestions.add("startService()");

        interviewQuestion t9=new interviewQuestion("To create a unit of code within a method signature that can be extend or shrink is enclosed by","{}");
        t9.suggestions.add("||");
        t9.suggestions.add("()");
        t9.suggestions.add("[]");
        t9.suggestions.add("{}");

        interviewQuestion t10=new interviewQuestion("In android, right way to declare a package is","package com.newpak");
        t10.suggestions.add("package com-newspeak");
        t10.suggestions.add("package com+newpak");
        t10.suggestions.add("package com/newpak");
        t10.suggestions.add("package com.newpak");

        /*

        interviewQuestion t11=new interviewQuestion("Multiple inheritance is not allowed in Java therefore in an android activity there cannot be more then one","super class");
        t11.suggestions.add("super class");
        t11.suggestions.add("child class");
        t11.suggestions.add("sub class");
        t11.suggestions.add("public class");

        interviewQuestion t12=new interviewQuestion("Android component that shows part of an activity on screen is called","fragment");
        t12.suggestions.add("fragment");
        t12.suggestions.add("intent");
        t12.suggestions.add("view");
        t12.suggestions.add("manifest");

        interviewQuestion t13=new interviewQuestion("Multiple inheritance concept is indirectly used by using","sub class");
        t13.suggestions.add("public class");
        t13.suggestions.add("sub class");
        t13.suggestions.add("child class");
        t13.suggestions.add("super class");

        interviewQuestion t14=new interviewQuestion("One of application component, that manages interaction between operating system and android os is called","Broadcast Receivers");
        t14.suggestions.add("Content Providers");
        t14.suggestions.add("Activities");
        t14.suggestions.add("Services");
        t14.suggestions.add("Broadcast Receivers");

        interviewQuestion t15=new interviewQuestion("One of option that is not part of palette elements is","default");
        t15.suggestions.add("layouts");
        t15.suggestions.add("containers");
        t15.suggestions.add("date and time");
        t15.suggestions.add("default");
        */

        temp_ToughList.add(t1);
        temp_ToughList.add(t2);
        temp_ToughList.add(t3);
        temp_ToughList.add(t4);
        temp_ToughList.add(t5);
        temp_ToughList.add(t6);
        temp_ToughList.add(t7);
        temp_ToughList.add(t8);
        temp_ToughList.add(t9);
        temp_ToughList.add(t10);

        return temp_ToughList;
    }

    public List<interviewQuestion> getSimple_Questions() {
        List<interviewQuestion> temp_simpleList=new ArrayList<>();
        interviewQuestion q1=new interviewQuestion("How to pass the data between activities in Android?","Intent");
        q1.suggestions.add("Intent");
        q1.suggestions.add("Content Provider");
        q1.suggestions.add("Broadcast receiver");
        q1.suggestions.add("Fragments");
        q1.setExplanation("An Intent is used to connect one activity to another activity and having a message passing mechanism between activities.");

        interviewQuestion q2=new interviewQuestion("What is splash screen in android?","Initial screen of an application");
        q2.suggestions.add("Initial activity of an application");
        q2.suggestions.add("Initial service of an application");
        q2.suggestions.add("Initial method of an application");
        q2.suggestions.add("Initial screen of an application");
        q2.setExplanation("Splash is an activity. Generally it appears as initial screen of an application and works based on thread concept.");

        interviewQuestion q3=new interviewQuestion("What is broadcast receiver in android?","It will react on broadcast announcements");
        q3.suggestions.add("It will react on broadcast announcements");
        q3.suggestions.add("It will do background functionalities as services");
        q3.suggestions.add("It will pass the data between activities");
        q3.suggestions.add("endService()");
        q3.setExplanation("It is a main component of android. It reacts on the system broadcast announcements, and it acts as a gateway between outside application environment with your application");

        interviewQuestion q4=new interviewQuestion("What is transient data in android?","Logical data");
        q4.suggestions.add("Permanent data");
        q4.suggestions.add("Secure data");
        q4.suggestions.add("Temporary data");
        q4.suggestions.add("Logical data");
        q4.setExplanation("Transient data is logical data and we can store application logic in it.");

        interviewQuestion q5=new interviewQuestion("In android studio, tab in which error is shown is called","logcat");
        q5.suggestions.add("logcat");
        q5.suggestions.add("memory");
        q5.suggestions.add("console");
        q5.suggestions.add("CPU");
        q5.setExplanation("Logcat is a command-line tool that dumps a log of system messages, including stack traces when the device throws an error and messages that you have written from your app with the Log class.It is also reffered to as the console");

        interviewQuestion q6=new interviewQuestion("Which of the following codes used by android is open source","Video Driver");
        q6.suggestions.add("Video Driver");
        q6.suggestions.add("WiFi Driver");
        q6.suggestions.add("Device Driver");
        q6.suggestions.add("Bluetooth Driver");

        interviewQuestion q7=new interviewQuestion("In which year was Android 7: Nougat released","2016");
        q7.suggestions.add("2014");
        q7.suggestions.add("2011");
        q7.suggestions.add("2016");
        q7.suggestions.add("2017");
        q7.setExplanation("Android (codenamed Android N during development) is the seventh major version and 14th original version of the Android operating system. First released as an alpha test version on March 9, 2016, it was officially released on August 22, 2016, with Nexus devices being the first to receive the update");


        interviewQuestion q8=new interviewQuestion("What is breakpoint in android?","Breaks the execution");
        q8.suggestions.add("Breaks the application");
        q8.suggestions.add("Breaks the development code");
        q8.suggestions.add("Breaks the execution");
        q8.suggestions.add("None of the above");
        q8.setExplanation("Breaks the execution to find the debug value, It is one of the debugging techniques");

        interviewQuestion q9=new interviewQuestion("What is JSON in android?","Java Script Object Notation");
        q9.suggestions.add("Java Script Object Native");
        q9.suggestions.add("Java Script Oriented Notation");
        q9.suggestions.add("Java Script Object Notation");
        q9.suggestions.add("None of the Above");
        q9.setExplanation("JavaScript Object Notation (JSON) is an open-standard file format that uses human-readable text to transmit data objects consisting of attribute–value pairs and array data types ");


        interviewQuestion q10=new interviewQuestion("What is the application class in android?","Base class for all classes");
        q10.suggestions.add("A class that can create only an object");
        q10.suggestions.add("Anonymous class");
        q10.suggestions.add("Java class");
        q10.suggestions.add("Base class for all classes");
        q10.setExplanation("Application class is the base class for any android application");
        /*
        interviewQuestion q11=new interviewQuestion("If the UI begins to behave sluggishly or crash while making network calls, this is likely due to...","Network latency");
        q11.suggestions.add("Network latency");
        q11.suggestions.add("Hardware malfunctions");
        q11.suggestions.add("Virus on the Server");
        q11.suggestions.add("Activity manager contains too much");

        interviewQuestion q12=new interviewQuestion("In android studio, a service that is started and cannot be stopped even calling activity is destroyed is","bindService()");
        q12.suggestions.add("onStop()");
        q12.suggestions.add("onDestroy()");
        q12.suggestions.add("bindService()");
        q12.suggestions.add("startService()");


        interviewQuestion q13=new interviewQuestion("Android component that shows part of an activity on screen is called","fragment");
        q13.suggestions.add("fragment");
        q13.suggestions.add("intent");
        q13.suggestions.add("view");
        q13.suggestions.add("manifest");

        interviewQuestion q14=new interviewQuestion("Multiple inheritance concept is indirectly used by using","sub class");
        q14.suggestions.add("public class");
        q14.suggestions.add("sub class");
        q14.suggestions.add("child class");
        q14.suggestions.add("super class");

        interviewQuestion q15=new interviewQuestion("A type of service provided by android that helps in creating user interfaces is","View System");
        q15.suggestions.add("Notifications Manager");
        q15.suggestions.add("Content Providers");
        q15.suggestions.add("Activity Manager");
        q15.suggestions.add("View System");
        */

        temp_simpleList.add(q1);
        temp_simpleList.add(q2);
        temp_simpleList.add(q3);
        temp_simpleList.add(q4);
        temp_simpleList.add(q5);
        temp_simpleList.add(q6);
        temp_simpleList.add(q7);
        temp_simpleList.add(q8);
        temp_simpleList.add(q9);
        temp_simpleList.add(q10);

        return temp_simpleList;
    }//end of Initialize_Questions



}//end of Smq....
