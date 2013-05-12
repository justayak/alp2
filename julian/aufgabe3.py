import sys
import random

def run1():
	def root(n):
		r = 0
		k = 1
		while (r + r + k) < n:
			r = r + k
			k = k + 1
		return k
		
	#print root(8)

	oldRecD = sys.getrecursionlimit()
	print(oldRecD)

	maxDepth = 1500

	sys.setrecursionlimit(maxDepth)


	def rec(x, maxDepth):
		#print x
		if x == (maxDepth -5 ): #Weil wir nicht Rekursions- sondern Stacktiefe setzen ("setrecursionlimit" ist scheisse benannt!) 
			return 1
		else :
			return rec(x+1, maxDepth)

	rec(0, maxDepth)
			
	print rec(0, maxDepth)

# Assert-Helper
def isSorted(list):
	return all(list[i] <= list[i+1] for i in xrange(len(list)-1))

# Sort
def insertsort(seq):
		j = 0
		while j < (len(seq) - 1):
			j += 1
			assert j < len(seq)
			key = seq[j]
			k = j - 1
			while k>=0 and seq[k]>key:
				seq[k+1] = seq[k]
				k = k - 1
			seq[k+1] = key
		assert isSorted(seq)

# Testfunction
def generateTests():
	for i in range(10000):
		list = random.sample(range(100),50)
		insertsort(list)
	print "Erfolgreich"


	
def run2():
	
	generateTests()
	
run2()