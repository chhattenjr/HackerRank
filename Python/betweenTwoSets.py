'''
    @author chhattenjr
    @date 06/19/2019
    @description Given two arrays of integers and asked to determine all integers that satisfy the following two conditions:
        1) The elements of the first array are all factors of the integer being considered.
        2) The integer being considered is a factor of all elements of the second array.
'''

def getTotalX(a, b):
    arr = a
    brr = b

    smallestIntInArrayB = brr[0]

    for i in brr:
        if smallestIntInArrayB > i:
            smallestIntInArrayB = i

#    print arr
#    print brr

#    print "Smallest Integer: "
#    print str(smallestIntInArrayB)

    factors = []
    factorsBeingConsidered = []
    integersBetweenSets = []

    for i in range(1, smallestIntInArrayB+1):
        if smallestIntInArrayB % i == 0:
            factors.append(i)

#    print "Factors being considered: "
#    print factors

    for i in factors:
        for j in arr:
            #print "i: " + str(i)
            #print "j: " + str(j)
#            print "Is " + str(i) + " % " + str(j) + " = 0: " + str((i%j) == 0)
            if i % j != 0: 
                if factorsBeingConsidered.__contains__(i):
                    factorsBeingConsidered.remove(i)
                break
            else:
                if not factorsBeingConsidered.__contains__(i):
                    factorsBeingConsidered.append(i)

#    print "Integers being considered that meet Condition #1: "
#    print factorsBeingConsidered

    crr = list(factorsBeingConsidered)

    for i in brr:
        for j in factorsBeingConsidered:
#           print crr
#           print factorsBeingConsidered
#            print "Is " + str(i) + " % " + str(j) + " = 0: " + str((i%j) == 0)
            if i % j != 0:
                if integersBetweenSets.__contains__(j):
                    integersBetweenSets.remove(j)

                if crr.__contains__(j):
                    crr.remove(j)

    integersBetweenSets = list(crr)
    
    print "Integers Between Sets: "
    print integersBetweenSets


    return len(integersBetweenSets)



if __name__ == '__main__':
    arr = [2, 4]
    brr = [16, 32, 96]

    crr = [2]
    drr = [20, 30, 12]

    err = [1]
    frr = [72, 48]

    print str(getTotalX(arr, brr))

    print str(getTotalX(crr, drr))

    print str(getTotalX(err, frr))