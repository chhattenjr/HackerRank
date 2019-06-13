'''
    @author chhattenjr
    @date 06/13/2019
    @description Given Gary's sequence of up and down steps during his last hike,
    find and print the number of valleys he walked through.
'''

def countingValleys(n, s):
    hikingPath = s
    numberOfSteps = 8
    aboveOrBelowSeaLevel = 0
    numberOfValleys = 0

    limit = 10**6

    print "Hiking Path: " + hikingPath
    print "\n"

    if(numberOfSteps >= 2 or numberOfSteps <= limit):
        for i in hikingPath:
            print "Step Direction: " + i

            if(str(i) == "U"):
                if(aboveOrBelowSeaLevel == (-1)):
                    print "Coming out of a Valley!!"
                    numberOfValleys +=1

                print "Going Uphill!"
                aboveOrBelowSeaLevel += 1
            elif(str(i) == "D"):
                print "Going Downhill!"
                aboveOrBelowSeaLevel -= 1

                if(aboveOrBelowSeaLevel == 0):
                    print "Going into a Valley!!"
            else:
                print "Invalid Path!!"
                SystemExit

            print "Distance from Sea Level: " + str(aboveOrBelowSeaLevel) + " unit(s)."

            print "\n"

        print "Number of Valleys: " + str(numberOfValleys)

if __name__ == '__main__':
    hikingPath = 'UDDDUDUU'

    countingValleys(8, hikingPath)