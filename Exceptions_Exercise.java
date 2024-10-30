import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions_Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// FORMAT -> Ctrl Alt L
        try {
            //1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
            //two numbers , takes two numbers as input
            System.out.println("Please Enter two numbers to find the result of their operations ");
            System.out.println("Enter the first number: ");
            int number1 = input.nextInt();
            System.out.println("Enter the second number: ");
            int number2 = input.nextInt();
            operationsOfNumbers(number1, number2);
        } catch (InputMismatchException e) {
            System.out.println("Exception: Incorrect Input");
            input.next();
        }


        System.out.print("\n******************************\n");

        //2. Write a Java program that takes a number as input and prints its multiplication table up to 10.
        try {
            System.out.println("Please Enter a number: ");
            int multipleNumber = input.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(multipleNumber + " x " + i + " = " + (multipleNumber * i));
            }
        } catch (InputMismatchException e) {
            System.out.println("Exception: Incorrect Input");
            input.next();
        }


        System.out.print("\n******************************\n");

        //3. Write a Java program to print the area and perimeter of a circle.
        try {
            System.out.println("Please Enter the radius: ");
            double radius = input.nextDouble();
            double area = Math.PI * Math.pow(radius, 2);
            double perimeter = 2 * Math.PI * radius;
            System.out.println("Perimeter = " + perimeter + "\n Area = " + area);
        } catch (InputMismatchException e) {
            System.out.println("Exception: Incorrect Input");
            input.next();
        }

        System.out.print("\n******************************\n");


        //4. Java program to find out the average of a set of integers
        try {
            System.out.println("Enter the count of numbers: ");
            int numbersCount = input.nextInt();
            int counter = 0;
            double sum = 0;
            do {
                System.out.println("Enter an integer : ");
                int number = input.nextInt();
                sum += number;
                counter++;
            } while (numbersCount != counter);
            System.out.println("The average is: " + (sum / numbersCount));
        } catch (InputMismatchException e) {
            System.out.println("Exception: Incorrect Input");
            input.next();
        }


        System.out.print("\n******************************\n");

        //5. Write a Java program that accepts three integers as input, adds the first two integers
        //together, and then determines whether the sum is equal to the third integer.
        try {
            System.out.println("Enter the first number: ");
            int firstNumber = input.nextInt();
            System.out.println("Enter the second number: ");
            int secondNumber = input.nextInt();
            System.out.println("Enter the third number: ");
            int thirdNumber = input.nextInt();
            boolean result = false;
            if (!((firstNumber + secondNumber) == thirdNumber)) {
                throw new Exception("Exception: Incorrect Result");
            }
            if ((firstNumber + secondNumber) == thirdNumber) {
                result = true;
            }
            System.out.println("The result is " + result);
        } catch (InputMismatchException e) {
            System.out.println("Exception: Incorrect Input");
            input.next();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.print("\n******************************\n");

        //6. Write a Java program to reverse a word.
        System.out.println("Enter a word: ");
        String reverseWord = input.next();
        reverseWord(reverseWord);

        System.out.print("\n******************************\n");

        //7. Java program to check whether the given number is even or odd
        try {
            System.out.println("Enter a number to check if its even or odd: ");
            int checkNumber = input.nextInt();
            if (checkNumber % 2 == 0)
                System.out.println("The number is Even");
            else System.out.println("The number is Odd");
        } catch (InputMismatchException e) {
            System.out.println("Exception: Incorrect Input");
            input.next();
        }

        System.out.print("\n******************************\n");

        //8 - Java program to convert the temperature in Centigrade to Fahrenheit
        try {
            System.out.println("Enter the temperature in Centigrade: ");
            double tempinCent = input.nextDouble();
            double tempinFehren = (tempinCent * ((double) 9 / 5)) + 32;
            System.out.println("Temperature in Fahrenheit is: " + tempinFehren);
        } catch (InputMismatchException e) {
            System.out.println("Exception: Incorrect Input");
            input.next();
        }

        System.out.print("\n******************************\n");
        input.nextLine();

        //9.Write a Java program that takes a string and a number from the user,then prints the
        //character in the given index.
        try {
            System.out.println("Enter a string: ");
            String inputString = input.nextLine();
            System.out.println("Enter a number: ");
            int indexNumber = input.nextInt();
            System.out.println(inputString.charAt(indexNumber));
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch(InputMismatchException e) {
            System.out.println("Exception: Incorrect Input");
            input.next();
        }


        System.out.print("\n******************************\n");

        //10. Write a Java program to print the area and perimeter of a rectangle.
        try {
            System.out.println("Enter the width of a rectangle: ");
            double width = input.nextDouble();
            System.out.println("Enter the height of a rectangle: ");
            double height = input.nextDouble();
            double recArea = width * height;
            double recPerimeter = 2 * (width + height);
            System.out.println("Area is " + width + " * " + height + " = " + recArea);
            System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + recPerimeter);
        } catch (InputMismatchException e) {
            System.out.println("Exception: Incorrect Input");
            input.next();
        }

        System.out.print("\n******************************\n");
//
        //11. Write a Java program to compare two numbers.
        try {
            System.out.println("Input first integer: ");
            int int1 = input.nextInt();
            System.out.println("Input the second integer: ");
            int int2 = input.nextInt();
            compareTwoNumbers(int1, int2);
        } catch (InputMismatchException e) {
            System.out.println("Exception: Incorrect Input");
            input.next();
        }

        System.out.print("\n******************************\n");

        //12. Write a Java program to convert seconds to hours, minutes and seconds.
        try {
            System.out.println("Enter number of seconds: ");
            int seconds = input.nextInt();
            int hours = seconds / 3600;
            int remainingSeconds = seconds % 3600;
            int minutes = remainingSeconds / 60;
            int finalSeconds = remainingSeconds % 60;
            System.out.println(hours + ":" + minutes + ":" + finalSeconds);
        } catch (InputMismatchException e) {
            System.out.println("Exception: Incorrect Input");
            input.next();
        }

        System.out.print("\n******************************\n");

        //13. Write a Java program that accepts four integers from the user and prints equal if all
        //four are equal, and not equal otherwise. 25-37-45-23
        try {
            System.out.println("Enter four integer numbers: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();
            int num4 = input.nextInt();
            fourEqualNumbers(num1, num2, num3, num4);
        } catch (InputMismatchException e) {
            System.out.println("Exception: Incorrect Input");
            input.next();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.print("\n******************************\n");

        //14. Write a Java program that reads an integer and check whether it is negative, zero, or positive.
        try {
            System.out.println("Enter a number to check if its positive or negative or zero: ");
            int checkNumber = input.nextInt();
            checkNumber(checkNumber);
        } catch (InputMismatchException e) {
            System.out.println("Exception: Incorrect Input");
            input.next();
        }

        System.out.print("\n******************************\n");

        //15.Write a program to enter the numbers till the user wants and at the end it
        //should display the count of positive, negative and zeros entered (End loop use -1 ,
        //Don’t count -1).
        try {
            int randomNumbers;
            int positiveCount = 0, negativeCount = 0, zeroCount = -1;
            do {
                System.out.println("Enter any numbers you want (and -1 to quit)");
                randomNumbers = input.nextInt();
                if (randomNumbers == -1) {
                    throw new Exception("Exception: Input -1 Quit The Loop");
                }
                if (randomNumbers > 0)
                    positiveCount++;
                else if (randomNumbers < 0 && randomNumbers != -1)
                    negativeCount++;
                else
                    zeroCount++;
            } while (randomNumbers != -1);
            System.out.println(positiveCount + " positives " + zeroCount + " zero " + negativeCount + " negatives");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.print("\n******************************\n");

        //16 - Write a program that prompts the user to input an integer and then outputs the
        //number with the digits reversed.
        //For example, if the input is 12345, the output should be 54321.
        try {
            System.out.println("Enter an integer to get it reversed: ");
            int inputNumber = input.nextInt();
            String stringNumber = String.valueOf(inputNumber);
            Character storeReverse;
            for (int i = stringNumber.length() - 1; i >= 0; i--) {
                storeReverse = stringNumber.charAt(i);
                System.out.print(storeReverse);
            }
        } catch (InputMismatchException e) {
            System.out.println("Exception: Incorrect Input");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: Index Out Of Bounds");
        }

        System.out.print("\n******************************\n");

        //17 - Write a program to enter the numbers till the user wants and at the end the
        //program should display the largest and smallest numbers entered.
        try {
            int manyNumbers;
            int max = 0, min = 0;
            do {

                System.out.println("Enter many numbers to get the largest and smallest value of them (and 0  to quit): ");
                manyNumbers = input.nextInt();
                if (manyNumbers > max) {
                    max = manyNumbers;
                }
                if (manyNumbers < min) {
                    min = manyNumbers;
                }

            } while (manyNumbers != 0);
            System.out.println("The large number = " + max + "\n The small number = " + min);
        } catch (InputMismatchException e) {
            System.out.println("Exception: Incorrect Input");
        }

        System.out.print("\n******************************\n");
        input.nextLine();

        //18 - Determine and print the number of times the character ‘a’ appears in the input
        try {
            System.out.println("Enter a string to count how many 'a' in it: ");
            String aCountString = input.nextLine();
            int aCounter = 0;
            // intentionally made wrong comparison to show the exception -> correct condition i<aCountString.length()
            for (int i = 0; i <= aCountString.length(); i++) {
                if (aCountString.charAt(i) == 'a') {
                    aCounter++;
                }
            }
            System.out.println("Number of a's: " + aCounter);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void operationsOfNumbers(int number1, int number2) {
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " x " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        System.out.println(number1 + " mod " + number2 + " = " + (number1 % number2));
    }

    public static void reverseWord(String word) {
        try {
            Character letter = ' ';
            // the correct value is i = word.length()-1;
            for (int i = word.length(); i >= 0; i--) {
                letter = word.charAt(i);
                System.out.print(letter);
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void compareTwoNumbers(int int1, int int2) {
        boolean checkCondition = false;
        do {
            if (int1 != int2) {
                checkCondition = true;
                System.out.println(int1 + " != " + int2);
            }
            if (int1 < int2) {
                checkCondition = true;
                System.out.println(int1 + " < " + int2);
            }
            if (int1 <= int2) {
                checkCondition = true;
                System.out.println(int1 + " <= " + int2);
            }
            if (int1 > int2) {
                checkCondition = true;
                System.out.println(int1 + " > " + int2);
            }
            if (int1 >= int2) {
                checkCondition = true;
                System.out.println(int1 + " >= " + int2);
            }

        } while (!checkCondition);

    }

    public static void fourEqualNumbers(int num1, int num2, int num3, int num4) throws Exception {
        if (!((num1 == num2) && (num2 == num3) && (num3 == num4))) {
            throw new Exception("Exception: Numbers Not Equals");
        }
        if ((num1 == num2) && (num2 == num3) && (num3 == num4)) {
            System.out.println("Equals");
        } else System.out.println("Not equals!");
    }

    public static void checkNumber(int number) {
        if (number > 0)
            System.out.println("Number is positive");
        else if (number < 0)
            System.out.println("Number is negative");
        else
            System.out.println("Number is zero");
    }
}
