import itertools

def cross(A, B):
    return {a + b for a in A for b in B}

urn = cross('B', '12') | cross('R', '123') | cross('W', '12345')

U3 = list(itertools.combinations(urn, 3))

#a
def urn1(n): 
    success_count = 0
    for S in U3:
        if(S[0][0] == S[1][0]) and (S[0][0] == S[2][0]) and (S[1][0] == S[2][0]):
            success_count += 1
            return success_count / n

print(urn1(10000))

#b
def urn2(n): 
    success_count = 0
    for S in U3:
        if(S[0][0] != S[1][0]) and (S[0][0] != S[2][0]) and (S[1][0] != S[2][0]):
            success_count += 1
            return success_count / n

#c
def urn3(n): 
    success_count = 0
    for S in U3:
        if(S[0][0] == S[1][0]) or (S[0][0] == S[2][0]) and (S[1][0] == S[2][0]):
            success_count += 1
            return success_count / n

#d
def urn4(n): 
    success_count = 0
    for S in U3:
        if (S[0][0] == 'W' and S[1][0] == 'R' and S[2][0] == 'R') or (S[0][0] == 'R' and S[1][0] == 'R' and S[2][0] == 'W') or (S[0][0] == 'R' and S[1][0] == 'W' and S[2][0] == 'R'):
            success_count += 1
            return success_count / n

#e
def urn4(n): 
    success_count = 0
    for S in U3:
        if S[0][0] == 'W' and S[1][0] == 'W' and S[2][0] == 'W':
            success_count += 1
            return success_count / n

