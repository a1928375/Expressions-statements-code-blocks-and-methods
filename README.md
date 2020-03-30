# Expressions-statements-code-blocks-and-methods

1. Methods & MethodsTests: 

      (1) Create a method called displayHighScorePosition, and it should a players name as a parameter, and a 2nd parameter as a position         in the high score table. You should display the players name along with a message like " managed to get into position " and the
      position they got and a further message " on the high score table". 

      (2) Create a 2nd method called calculateHighScorePosition, and it should be sent one argument only, the player score. It should             return an int. The return data should be
            
            1 if the score is >=1000
            2 if the score is >=500 and < 1000
            3 if the score is >=100 and < 500
            4 in all other cases
            
      call both methods and display the results of the following a score of 1500, 900, 400 and 50.

2. SpeedConverter:

      (1) Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour. This method needs to        return the rounded value of the calculation of type long. If the parameter kilometersPerHour is less than 0, the method                  toMilesPerHour needs to return -1 to indicate an invalid value. Otherwise, if it is positive, calculate the value of miles per          hour, round it and return it. For conversion and rounding, check the notes in the text below.

       Examples of input/output:
       
            * toMilesPerHour(1.5); → should return value 1
            * toMilesPerHour(10.25); → should return value 6
            * toMilesPerHour(-5.6); → should return value -1
            * toMilesPerHour(25.42); → should return value 16
            * toMilesPerHour(75.114); → should return value 47


      (2) Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour. This method             should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter. Then it needs to         print a message in the format "XX km/h = YY mi/h".

            XX represents the original value kilometersPerHour.
            YY represents the rounded milesPerHour from the kilometersPerHour parameter.

      If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".


      Examples of input/output:
      
            * printConversion(1.5); → should print the following text (into the console - System.out): 1.5 km/h = 1 mi/h
            * printConversion(10.25); → should print the following text (into the console - System.out): 10.25 km/h = 6 mi/h
            * printConversion(-5.6); → should print the following text (into the console - System.out): Invalid Value
            * printConversion(25.42); → should print the following text (into the console - System.out): 25.42 km/h = 16 mi/h
            * printConversion(75.114); → should print the following text (into the console - System.out): 75.114 km/h = 47 mi/h


      (3) Use method Math.round to round the number of calculated miles per hour(double). The method round returns long. How to use the         method round and how it works?

           The Math.round() is a built-in math method which returns the closest long to the argument. The result is rounded to an integer             by adding 1/2, taking the floor of the result after adding 1/2, and typecasting the result to type long. The method returns               the value of the argument rounded to the nearest int value.

      (4) USAGE EXAMPLE:

            double number = 1.5;
            long rounded = Math.round(number);
            System.out.println("rounded= " + rounded);
            System.out.println("with 3.9= " + Math.round(3.9));
            System.out.println("with 4.5= " + Math.round(4.5));
            int sum = 45;
            int count = 10;
            
            // typecasting so result is double e.g. double / int -> double
            double average = (double) sum / count;
            long roundedAverage = Math.round(average);
            System.out.println("average= " + average);
            System.out.println("roundedAverage= " + roundedAverage);


            OUTPUT:

            rounded= 2
            with 3.9= 4
            with 4.5= 5
            average= 4.5
            roundedAverage= 5

      (5)
      
            TIP: In the method printConversion, call the method toMilesPerHour instead of duplicating the code.
            NOTE: 1 mile per hour is 1.609 kilometers per hour

3. MegaBytesConverters:

      (1) Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes. The method should          not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter. Then it          needs to print a message in the format "XX KB = YY MB and ZZ KB".

            XX represents the original value kiloBytes.
            YY represents the calculated megabytes.
            ZZ represents the calculated remaining kilobytes.

      For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"
      If the parameter kiloBytes is less than 0 then print the text "Invalid Value".


      (2) EXAMPLE INPUT/OUTPUT

            * printMegaBytesAndKiloBytes(2500); → should print the following text: "2500 KB = 2 MB and 452 KB"
            * printMegaBytesAndKiloBytes(-1024); → should print the following text: "Invalid Value" because parameter is less than 0.
            * printMegaBytesAndKiloBytes(5000); → should print the following text: "5000 KB = 4 MB and 904 KB"


      (3)
      
            TIP: Use the remainder operator
            TIP: 1 MB = 1024 KB

            NOTE: Do not set kilobytes parameter value inside your method. 

4. BarkingDog:

      (1) We have a dog that likes to bark.  We need to wake up if the dog is barking at night! Write a method shouldWakeUp that has 2          parameters.

            1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
            2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.

      We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true. In all other cases return false.         If the hourOfDay parameter is less than 0 or greater than 23 return false.

      (2) Examples of input/output:

            * shouldWakeUp (true, 1); → should return true
            * shouldWakeUp (false, 2); → should return false since the dog is not barking.
            * shouldWakeUp (true, 8); → should return false, since it's not before 8.
            * shouldWakeUp (true, -1); → should return false since the hourOfDay parameter needs to be in a range 0-23.

      (3) TIP: Use the if else statement with multiple conditions.


5. LeapYearCalculator

      (1) Write a method isLeapYear with a parameter of type int named year. The parameter needs to be greater than or equal to 1 and           less than or equal to 9999. If the parameter is not in that range return false. Otherwise, if it is in the valid range, calculate         if the year is a leap year and return true if it is a leap year, otherwise return false.
      
      (2) To determine whether a year is a leap year, follow these steps:

            1. If the year is evenly divisible by 4, go to step
            2. Otherwise, go to step 5.2. If the year is evenly divisible by 100, go to step
            3. Otherwise, go to step 4.3. If the year is evenly divisible by 400, go to step
            4. Otherwise, go to step 5.4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
            5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.

            The following years are not leap years: 1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
            This is because they are evenly divisible by 100 but not by 400.

            The following years are leap years: 1600, 2000, 2400
            This is because they are evenly divisible by both 100 and 400.

      (3) Examples of input/output:

            * isLeapYear(-1600); → should return false since the parameter is not in range (1-9999)
            * isLeapYear(1600); → should return true since 1600 is a leap year
            * isLeapYear(2017); → should return false since 2017 is not a leap year
            * isLeapYear(2000);  → should return true because 2000 is a leap year 

6. DecomalComparator:

      (1) Write a method areEqualByThreeDecimalPlaces with two parameters of type double. The method should return boolean and it needs         to return true if two double numbers are the same up to three decimal places. Otherwise, return false.


      (2) EXAMPLES OF INPUT/OUTPUT:

            * areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
            * areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
            * areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
            * areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.


      (3) TIP: Use casting.
