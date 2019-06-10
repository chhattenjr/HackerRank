'''
    @author chhattenjr
    @date 06/09/2019
    @description Given the initial value of grade for each of Sam's 'n' students, write code to automate the rounding grade.
'''

#!/bin/python

from __future__ import print_function

import os
import sys
import math

#
# Complete the gradingStudents function below.
#
def gradingStudents(grades):
    roundedGrades = []
    modNumber = 0
    gradePlusModNumber = 0
    gradePMNModNumber = 0
    roundedGrade = 0

    for i in grades:
        print ("Grade: " + str(i))
        if(i > 37):
            modNumber = i % 5
            if(modNumber != 0 and modNumber > 2):
                print ("Module Number: " + str(modNumber))

                if((i+modNumber) > i):
                    gradePlusModNumber = i + modNumber
                    print ("Module Number plus Grade: " + str(gradePlusModNumber))
                    if(modNumber > 2):
                        print ("Module Number plus Grade, when Module Number is less than 3: " + str(gradePlusModNumber))

                        gradePMNModNumber = (gradePlusModNumber) % 5
                        print ("Rounded Grade: " + str(gradePlusModNumber - (gradePMNModNumber)))
                        roundedGrade = (gradePlusModNumber - (gradePMNModNumber))

                        roundedGrades.append(roundedGrade)
                    else:
                        roundedGrades.append(i)
            else:
                roundedGrades.append(i)
        else:
            roundedGrades.append(i)

    #for i in roundedGrades:
        #print (i)

    return roundedGrades
            

if __name__ == '__main__':
    grades = [80, 96, 18, 73, 78, 60, 60, 15, 45, 15, 10, 5, 46, 87, 33, 60, 14, 71, 65, 2, 5, 97, 0]
    roundedGrades = []

    roundedGrades = gradingStudents(grades)

    for i in roundedGrades:
        print (i)