'''
    @author chhattenjr
    @date 06/10/2019
    @description Given the value of 'd' for 'm' apples and 'n' oranges, 
    determine how many apples and oranges will fall on Sam's house (i.e., in the inclusive range [s, t])?
'''
#!/bin/python

import math
import os
import random
import re
import sys

# Complete the countApplesAndOranges function below.
def countApplesAndOranges(s, t, a, b, apples, oranges):
    houseStartLocation = s
    houseEndLocation = t
    appleTree = a
    orangeTree = b
    applesArray = apples
    orangesArray = oranges

    appleLD = 0
    orangeLD = 0
    applesLandedOnHouse = 0
    orangesLandedOnHouse = 0
    appleLandingDistances = []
    orangeLandingDistances = []
    fruitsOnHouse = []

    for i in applesArray:
        print "Apples: " + str(i)

        appleLD = appleTree + i
        print "\tLanding Distance: " + str(appleLD)
        appleLandingDistances.append(appleLD)

    print "\n"

    for i in orangesArray:
        print "Oranges: " + str(i)

        orangeLD = orangeTree + i
        print "\tLanding Distance: " + str(orangeLD)
        orangeLandingDistances.append(orangeLD)

    print "\n"
    
    print "Apples: "
    for i in appleLandingDistances:
        print "\tLanding Distance: " + str(i)

        if(i >= houseStartLocation and i <= houseEndLocation):
            print "\t\tApple Landed on House!!"
            applesLandedOnHouse += 1

    print "\n"

    print "Oranges: "
    for i in orangeLandingDistances:
        print "\tLanding Distance: " + str(i)

        if(i >= houseStartLocation and i <= houseEndLocation):
            print "\t\tOrange Landed on House!!"
            orangesLandedOnHouse += 1
    
    print "Number of Apples that Landed on the House: " + str(applesLandedOnHouse)
    fruitsOnHouse.append(applesLandedOnHouse)
    print "Number of Oranges that Landed on the House: " + str(orangesLandedOnHouse)
    fruitsOnHouse.append(orangesLandedOnHouse)

    return fruitsOnHouse

if __name__ == '__main__':
    apples = [2, 3, -4]
    oranges = [3, -2, -4]
    s = 7
    t = 10
    a = 4
    b = 12

    print str(countApplesAndOranges(s, t, a, b, apples, oranges))
