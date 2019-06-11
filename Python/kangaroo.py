'''
    @author chhattenjr
    @date 06/11/2019
    @description Given two kangaroos on a number line,
    figure out a way to get both kangaroos at the same location at the same time.
    If possible,, return 'Yes', otherwise return 'No'.
'''
#!/bin/python

import math
import os
import random
import re 
import sys 

def kangaroo(x1, v1, x2, v2):
    firstKangaroo = x1
    secondKangaroo = x2
    firstKangarooJumpingDistance = v1
    secondKangarooJumpingDistance = v2

    sameLocation = ""

    if(firstKangaroo < secondKangaroo and firstKangarooJumpingDistance < secondKangarooJumpingDistance): 
        sameLocation = "NO"
    elif(firstKangaroo < secondKangaroo and firstKangarooJumpingDistance == secondKangarooJumpingDistance):
        sameLocation = "NO"
    else:
        result = (secondKangaroo-firstKangaroo) % (firstKangarooJumpingDistance - secondKangarooJumpingDistance)

        if(result == 0):
            sameLocation = "YES"

    return sameLocation

    
if __name__ == '__main__':
    print kangaroo(43, 2, 70, 2)
    print kangaroo(0, 3, 4, 2)
    print kangaroo(5, 3, 0, 2)
    print kangaroo(4, 2, 0, 3)
