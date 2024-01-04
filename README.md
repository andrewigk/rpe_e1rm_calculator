This application is built for powerlifting athletes to use as a tool to help gauge and make training decisions about what weights to load.
It uses the famous chart created by Mike Tuscherer from RTS as a reference to perform calculations on a lifter's estimated 1 rep max based
on the weight/load specified, the number of repetitions, and the RPE (Rating of Perceived Exertion) of the lift. 
The application can also provide loading recommendations for a specified rep range according to various increments of RPE.

Example: Lifter squats 210KG for a set of 3 @ RPE 6. The application will perform the calculation and return the E1RM: 260KG
         Lifter wants to know what to load for their next set of 5 reps: The application will output a table like this:
         Displaying load recommendations for 5 reps: 
          -------------------
          | RPE:  | Load:   |
          -------------------
          | 10    | 225.0   |
          -------------------
          | 9.5   | 220.0   |
          -------------------
          | 9     | 217.5   |
          -------------------
          | 8.5   | 215.0   |
          -------------------
          | 8     | 210.0   |
          -------------------
          | 7.5   | 207.5   |
          -------------------
          | 7     | 205.0   |
          -------------------
          | 6.5   | 200.0   |
          -------------------
          | 6     | 197.5   |
          -------------------

The future plans for this application are to develop a GUI to be used as a standalone application, as well as plans 
to be adapted for a Web application version.
