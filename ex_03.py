import itertools

def cross(A, B):
    return {a + b for a in A for b in B}

urn = cross('M', '1234') | cross('P', '123') | cross('C', '12') | cross('L', '1')

U1 = list(itertools.permutations(urn, 10))
print(len(U1))