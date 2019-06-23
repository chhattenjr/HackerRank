'''
    @author chhattenjr
    @date 06/22/2019
    @description Given Maria's scores for a season, 
        find and print the number of times she breaks her records for most and least points scored during the season.
'''

def breakingTheRecords(scores):
    arr = list(scores)
    length = len(scores)
    records = []

    highestPoints = arr[0]
    lowestPoints = arr[0]

    breaksHighest = 0
    breaksLowest = 0

    if length < 1 or length > 1000:
        raise SystemExit

    for i in arr:
        print str(i)

        if i > highestPoints:
            highestPoints = i
            breaksHighest += 1

        if i < lowestPoints:
            lowestPoints = i
            breaksLowest += 1

    print "Number of Times Maria Breaks Highest Points: "
    print str(breaksHighest)

    print "Number of Times Maria Breaks Lowest Points: "
    print str(breaksLowest)

    records.append(breaksHighest)
    records.append(breaksLowest)

    return records
    


if __name__ == '__main__':
    scoresOne = [10, 5, 20, 20, 4, 5, 2, 25, 1]
    scoresTwo = [3, 4, 21, 36, 10, 28, 35, 5, 24, 42]

    print str(breakingTheRecords(scoresOne))
    print "\n"
    print str(breakingTheRecords(scoresTwo))