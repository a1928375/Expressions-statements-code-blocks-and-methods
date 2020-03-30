# Expressions-statements-code-blocks-and-methods

1. IfKeywordAndCodeBlock: if-else statement

2. Methods & MethodsTests: 

      (1) Create a method called displayHighScorePosition, and it should a players name as a parameter, and a 2nd parameter as a position         in the high score table. You should display the players name along with a message like " managed to get into position " and the
      position they got and a further message " on the high score table". 

      (2) Create a 2nd method called calculateHighScorePosition, and it should be sent one argument only, the player score. It should             return an int. The return data should be
            
            1 if the score is >=1000
            2 if the score is >=500 and < 1000
            3 if the score is >=100 and < 500
            4 in all other cases
            
      call both methods and display the results of the following a score of 1500, 900, 400 and 50.

3. SpeedConverter:

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

4. MegaBytesConverters:

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

5. BarkingDog:

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


6. LeapYearCalculator

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

7. DecomalComparator:

      (1) Write a method areEqualByThreeDecimalPlaces with two parameters of type double. The method should return boolean and it needs         to return true if two double numbers are the same up to three decimal places. Otherwise, return false.


      (2) EXAMPLES OF INPUT/OUTPUT:

            * areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
            * areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
            * areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
            * areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.


      (3) TIP: Use casting.

8. EqualSumChecker:

      (1) Write a method hasEqualSum with 3 parameters of type int. The method should return boolean and it needs to return true if the         sum of the first and second parameter is equal to the third parameter. Otherwise, return false.


      (2) EXAMPLES OF INPUT/OUTPUT:

            * hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1
            * hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2
            * hasEqualSum(1, -1, 0);  should return true since 1 + (-1) is 1 - 1 and is equal to 0

9. TeenNumberChecker:

      (1) We'll say that a number is "teen" if it is in the range 13 -19 (inclusive). Write a method named hasTeen with 3 parameters of         type int. The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19            (inclusive). Otherwise return false.

      (2) EXAMPLES OF INPUT/OUTPUT:

            * hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
            * hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
            * hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19


      (3) Write another method named isTeen with 1 parameter of type int. The method should return boolean and it needs to return true if       the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

      (4) EXAMPLES OF INPUT/OUTPUT:

            * isTeen(9);  should return false since 9 is in not range 13 - 19
            * isTeen(13);  should return true since 13 is in range 13 - 19

10. Overloading:

      (1) Create a method called calcFeetAndInchesToCentimeters. It needs to have two parameters. Feet is the first parameter, inches is       the 2nd parameter
      
      (2) You should validate that the first parameter feet is >= 0. You should validate that the 2nd parameter inches is >=0 and <=12,         and return -1 from the method if either of the above is not true. If the parameters are valid, then calculate how many centimetres
      comprise the feet and inches passed to this method and return that value.

      (3) Create a 2nd method of the same name but with only one parameter inches is the parameter, validate that its >=0, and return -1       if it is not true. But if its valid, then calculate how many feet are in the inches. And then here is the tricky part: call the           other overloaded method passing the correct feet and inches calculated so that it can calculate correctly.
      
      (4) 
      
            Hint: Use double for your number datatypes is probably a good idea
            Hint: 1 inch = 2.54cm  and one foot = 12 inches
            Hint: Calling another overloaded method just requires you to use the right number of parameters.

11. SecondsAndMinutes:

      (1) Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds. You should           validate that the first parameter minutes is >= 0. You should validate that the 2nd parameter seconds is >= 0 and <= 59. The method       should return "Invalid value" in the method if either of the above are not true. If the parameters are valid then calculate how           many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as string in format "XXh         YYm ZZs" where XX represents a number of hours, YY the minutes and ZZ the seconds.

      (2) Create a 2nd method of the same name but with only one parameter seconds. Validate that it is >= 0, and return Invalid value        if it is not true. If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded            method passing the correct minutes and seconds calculated so that it can calculate correctly. Call both methods to print values to        the console.
      
      (3) 
      
            Tip: Use int or long for your number data types is probably a good idea.
	      Tip: For the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s 
            Tip: use if-else

12. AreaCalculator:

      (1) Write a method named area with one double parameter named radius. The method needs to return a double value that represents the 	area of a circle. If the parameter radius is negative then return -1.0 to represent an invalid value.

      (2) Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle. The 	method needs to return an area of a rectangle. If either or both parameters is/are a negative return -1.0 to indicate an invalid 	value.

      (3) Examples of input/output:

		* area(5.0); should return 78.53975
		* area(-1);  should return -1 since the parameter is negative
		* area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
		* area(-1.0, 4.0);  should return -1 since first the parameter is negative


      (4) 
      		
		TIP: The formula for calculating the area of a rectangle is x * y.
		TIP: The formula for calculating a circle area is radius * radius * PI.
		TIP: For PI use a constant from Math class e.g. Math.PI

13. MinutesToYearsAndDaysCalculator:

      (1) Write a method printYearsAndDays with parameter of type long named minutes. The method should not return anything (void) and it 	needs to calculate the years and days from the minutes parameter. If the parameter is less than 0, print text "Invalid Value". 	         Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

		XX represents the original value minutes.
		YY represents the calculated years.
		ZZ represents the calculated days.


      (2) EXAMPLES OF INPUT/OUTPUT:

	* printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
	* printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
	* printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"


	(3) TIP: Use the remainder operator

14. EqualityPrinter:

	(1) Write a method printEqual with 3 parameters of type int. The method should not return anything (void). If one of the 		parameters is less than 0, print text "Invalid Value". If all numbers are equal print text "All numbers are equal". If all 		numbers are different print text "All numbers are different". Otherwise, print "Neither all are equal or different".


	(2) EXAMPLES OF INPUT/OUTPUT:

		* printEqual(1, 1, 1); should print text All numbers are equal
		* printEqual(1, 1, 2); should print text Neither all are equal or different
		* printEqual(-1, -1, -1); should print text Invalid Value
		* printEqual(1, 2, 3); should print text All numbers are different

15. PlayingCat:

	(1) The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive). Unless 	 it is summer, then the upper limit is 45 (inclusive) instead of 35. Write a method isCatPlaying that has 2 parameters. Method 		needs to return true if the cat is playing, otherwise return false.

		1st parameter should be of type boolean and be named summer it represents if it is summer.
		2nd parameter represents the temperature and is of type int with the name temperature.


	(2) EXAMPLES OF INPUT/OUTPUT:

		* isCatPlaying(true, 10); should return false since temperature is not in range 25 - 45 	
		* isCatPlaying(false, 36); should return false since temperature is not in range 25 - 35 (summer parameter is false)
		* isCatPlaying(false, 35); should return true since temperature is in range 25 - 35
