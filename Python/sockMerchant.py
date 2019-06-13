'''
    @author chhattenjr
    @date 06/12/2019
    @description Given an array of integers representing the color of each sock,
    determine how many pair of socks with matching colors there are.
'''
#!/bin/python

import math
import os 
import random 
import re 
import sys 

def sockMerchant(n, ar):
    numberOfIndividualSocks = n
    uniqueColorsNumbers = set(ar)
    numberOfIndividualSocksInArray = ar
    numberOfIndividualSocksByColor = []

    integer = 0

    print "Number of Socks: " + str(numberOfIndividualSocks)

    if(numberOfIndividualSocks >= 1 or numberOfIndividualSocks <= 100):
        print "Colors: " + str(uniqueColorsNumbers)
        for i in uniqueColorsNumbers:
            count = 0

            print "Socks in Array: " + str(numberOfIndividualSocksInArray)

            integer = i
            print "Integer: " + str(integer)
            for j in numberOfIndividualSocksInArray:
                if(integer == j):
                    count += 1

            print "Count: " + str(count)
            numberOfIndividualSocksByColor.append([integer, count])

        
    else:
        SystemExit

    print numberOfIndividualSocksByColor

    j = 0
    numberOfSocks = 0
    potentialPairs = []

    for i in numberOfIndividualSocksByColor:
        numberOfPairs = 0

        print "Number of Socks: " + str(i[1])
        numberOfSocks = i[1]

        if(numberOfSocks > 1):
            potentialPairs.append(numberOfSocks)

    print "Potential Pairs: " + str(potentialPairs)

    totalNumberOfPairs = 0

    for i in potentialPairs:
        pair = i / 2
        print "Pair(s): " + str(pair)

        totalNumberOfPairs += pair

    print "Total Number of Pairs: " + str(totalNumberOfPairs)
    
    return totalNumberOfPairs

if __name__ == '__main__':
    sockNumbers = [6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5]
    sockNumbers2 = [1, 1, 3, 1, 2, 1, 3, 3, 3, 3]

    sockMerchant(9, sockNumbers)
    #sockMerchant(10, sockNumbers2)