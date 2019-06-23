import random
'''
    @author chhattenjr
    @date 06/15/2019
    @description Determine the minimum number of jumps 
    it will take Emma to jump from her starting position to the last cloud.
'''

def jumpingOnClouds(c):
    functionCloudArray = c
    cloudIndex = []
    cloudPathway = []
    index = 0
    prevIndex = 0

    isSafe = True

    enumerateFunctionCloudArray = [(i, j) for i, j in enumerate(functionCloudArray)]

    print str(list(enumerateFunctionCloudArray))

    if(functionCloudArray == []):
        raise SystemExit

    print "Cloud Array: " + str(list(functionCloudArray))

    print "Total Number of Clouds: " + str(list.__len__(functionCloudArray))

    size = list.__len__(functionCloudArray)

    '''
    if(size < 2 or size > 100):
        print "Invalid amount of clouds!"
        raise SystemExit
    '''

    while (index < size):
        print "\nConditional Values: "
        print "\tFirst Index Value: " + str(enumerateFunctionCloudArray[0][1])
        print "\tLast Index Value: " + str(enumerateFunctionCloudArray[size-1][1])

        if(enumerateFunctionCloudArray[0][1] == 0 or enumerateFunctionCloudArray[size-1][1] == 0):
            print "\n\tCurrent Index: " + str(index)
            print "\tValue using Index: " + str(enumerateFunctionCloudArray[index][1])

            if(enumerateFunctionCloudArray[index][1] == 0 or enumerateFunctionCloudArray[index][1] == 1):
                print "\n\tIs Index is equal to 0?: " + str((index == 0))
                print "\tIs Index is greater than 0: " + str((index > 0))

                if(index == 0):
                    print "\n\tIs the first Index equal to 0?: " + str((enumerateFunctionCloudArray[index][1] == 0))

                    if(enumerateFunctionCloudArray[index][1] == 0):
                        print "Cloud is safe to land on..."
                        cloudPathway.append(index)
                        index += 1

                if(index > 0 and index < size):
                    sizeOfCloudPathway = (list.__len__(cloudPathway))
                    prevIndex = cloudPathway.index(sizeOfCloudPathway - 1)

                    print "Previous Index: " + str(prevIndex)

                    '''
                        The Logic that plays apart within this function is...
                    '''

                    print "\n\tIs Index plus 2 less than size?: " + str((prevIndex+2) < size)
                    print "\tIs the cloud safe to land on?: " + str((isSafe == True))
                    print "\tIs Index plus 1 less than size?: " + str((prevIndex+1) < size)
                    if((prevIndex+2) < size and isSafe == True):
                        print "\n\tIs Index plus 2 equal to zero?: " + str((enumerateFunctionCloudArray[prevIndex+2][1] == 0))
                        if(enumerateFunctionCloudArray[prevIndex+2][1] == 0):
                            print "Cloud is safe to land on..."
                            cloudPathway.append(index+1)
                            index = prevIndex + 2
                            isSafe = True
                        else:
                            print "Cloud must be a thundercloud! AVOID!"
                            isSafe = False
                            index = prevIndex + 1
                    elif((prevIndex+1) < size):
                        print "\nIs Index value equal to 0?: " + str((enumerateFunctionCloudArray[prevIndex+1][1] == 0))
                        if(enumerateFunctionCloudArray[prevIndex+1][1] == 0):
                            print "Cloud is safe to land on..."
                            cloudPathway.append(index)
                            index = prevIndex + 1
                            isSafe = True
                        else:
                            print "Cloud must be a thundercloud! AVOID!"
                            index = prevIndex + 1
            print "\n"

        else:
            print "Invalid Cloud Array!"
            break

        print "Next Index: " + str(index)
        print "Cloud Pathway: " + str(list(cloudPathway))

    print enumerateFunctionCloudArray

if __name__ == '__main__':

    clouds = [0, 0, 1, 0, 0, 1, 0]
    clouds2 = [0, 0, 0, 0, 1, 0]
    clouds3 = [1, 0, 0, 0, 0, 0]
    clouds4 = [0, 0, 0, 0, 0, 1]
    clouds5 = []

    for x in range(102):
        clouds5.append(random.randint(0, 1))

    #jumpingOnClouds(clouds)
    jumpingOnClouds(clouds2)
    #jumpingOnClouds(clouds3)
    #jumpingOnClouds(clouds4)
    #jumpingOnClouds(clouds5)

    print clouds[:4]