# CS353 
Group Project

The aim of this project is to create a recipe application for android. Users can create an account where they can enter details about themselves (e.g. allergies, foods they don't like). The app will then generate approx. 6 recipes each day for the user to choose from, they can view the ingredients of the recipe as well as cooking instructions and choose to either like or dislike it, if they like a recipe it is saved into their recipe book, if they dislike a recipe it will never be shown to them again. A share feature may also be implemented to allow users to share a recipe with their friends/social media. There will also be an option to display nearby restaurants (could show the location on google maps) that make the meals for when users don't feel like cooking themselves.

In our project, we used a variety of technologies. Some that we were very familiar with such as programming in Java and using GitHub for managing our code, and some that we had never used before such as Firebase. We chose to use Firebase because as a group we decided that we really wanted to challenge ourselves rather than using a traditional database such as MYSQL which we were all quite familiar with. We also thought the idea of a NoSQL database was very interesting. 

Originally, we were going to develop our app using React Native as again we wanted to challenge ourselves with learning newer technologies, however we decided that as we were on a short timescale we would be better of just sticking with java, as we also had to learn how to use Firebase and Android Development.  

The User Interface of our app was developed using XML, we were using android studio which makes it very easy to design layouts in XML, it has a live preview so you can see how the app will look on a device and you can also view a wireframe of the layout, this really 
saved us a lot of time as we didn’t have to keep running the app on the emulator to see the changes we made to the layout. 

Firebase uses JSON for the database structure so we had to create a JSON file to store all our recipes and user details. We had to do a lot of research into structuring data in JSON as we were all very familiar with using SQL and not JSON.  

The IDE we used for our project was Android Studio, this had a lot of useful features which made it an obvious choice for developing our app. Firstly, it has an emulator built in which was really useful for previewing and testing our app before installing it on our actual devices, it also allowed us to view the app on a variety of devices. Android Studio can also be connected to GitHub which allowed us to push and pull our code to and from GitHub directly from the IDE, saving us a lot of time.  

We used AWS Deice Farm for testing our app, this allowed us to automatically run the app on a variety of devices and make sure everything works across the board, or if there were any bugs/errors on certain devices. We also did some unit and integration testing in Android Studio itself.
