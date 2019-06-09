'''
    @author chhattenjr
    @date 06/09/2019
    @description Given a sentence, determine whether it is a pangram. Ignore Case.
'''

#!/bin/python

import string
import array

# Complete the pangrams function below.
def pangrams(s):
    maybePangrams = s.split()
    alphabet = []
    maybePangramsString = []
    isInAlphabet = False

    for i in maybePangrams:
        for c in i:
            maybePangramsString.append(c)

    for i in string.ascii_lowercase:
        alphabet.append(i)

    for c in maybePangramsString:
        isInAlphabet = alphabet.__contains__(c.lower())

        if isInAlphabet:
            alphabet.remove(c.lower())
    
    if alphabet:
        result = "not pangram"
    
    if not alphabet:
        result = "pangram"
    
    return result

if __name__ == '__main__':
    #fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = "We promptly judged antique ivory buckles for the next prize"

    print pangrams(s)

    #result = pangrams(s)

    #fptr.write(result + '\n')

    #fptr.close()