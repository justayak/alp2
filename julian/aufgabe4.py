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


#Aufgabe 3
#a
def quick(list, low, height):
	if len(list) < 2:
		return list
		
	pivot = sorted([list[random.randint(0,len(list)-1)],list[random.randint(0,len(list)-1)],list[random.randint(0,len(list)-1)]])[1]
	print median
	
def quickSort(list, low, high):
	if low < high:
		m = partition(list, low, high)
		quickSort(list, low, m-1)
		quickSort(list, m+1, high)

def partition(list, low, high):
	#pivot = list[low]
	pivot = sorted([list[random.randint(0,len(list)-1)],list[random.randint(0,len(list)-1)],list[random.randint(0,len(list)-1)]])[1]
	i = low
	for j in range(low+1,high+1):
		if (list[j]<pivot):
			i=i+1
			list[i],list[j]=list[j],list[i]
	list[i],list[low]=list[low],list[i]
	return i
	
	
def mergeSort(list, result=None ):
	if result is None:
		result = ([0]*len(list))
	if len(list)<2:
		return list
	m = len(list)//2
	merge(mergeSort(list[:m]), mergeSort(list[m:]),result)
	
def merge(low,high,result):
	#result = []
	i,j=0,0
	while i<len(low) and j<len(high):
		if low[i]<=high[j]:
			result.append(low[i])
			i=i+1
		else:
			result.append(high[j])
			j=j+1
	result = result + low[i:]
	result = result + high[j:]
	#return result
	

def run2():
	
	list = [99, 88, 1,11,21,31,22,23,43]
	#quickSort(list, 0, len(list)-1)
	res = mergeSort(list, [1,2,3])
	print list
	print res
	
#run2()

#Aufgabe 5
def approxMedianPos(list, median):
	for i,number in enumerate(list):
		if number == median:
			return i
		if number > median:
			return i-1
	raise Exception("lol hier haett ich nie hingedurft!")		

def miniSubsetSum(list):
	list = sorted(list)  #Timsort:  			O(n*log(n))
	median = sum(list) // len(list)  #			O(n)
	print median
	i = 0
	j = approxMedianPos(list, median) #			O(n-1)
	result = []	
	while i < j:							#	O(n-2)		
		current = list[i] + list[j]
		
		if current == median:
			result += (list[i], list[j])
			
		if current >= median:
			j = j-1
			i = i+1
		else:
			i = i+1
	return result


def run3():
	result = miniSubsetSum([-3,1,2,3,4,5,6,7,8,9,10,100,66,77,12,55,55,12, 50, 50,43,23])
	print result
	
run3()