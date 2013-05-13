#Aufgabe 5
def approxMedianPos(list, median):
	for i,number in enumerate(list):
		if number == median:
			return i
		if abs(number) > abs(median):
			return i-1
	raise Exception("lol hier haett ich nie hingedurft!")		

def miniSubsetSum(list):
	list = sorted(list)  #Timsort:  				O(n*log(n))
	median = sum(list) // len(list)  #				O(n)
	#
	print (median)
	approxMedianPosition = approxMedianPos(list, median)  #			O(n-1)
	i =  0 if median >= 0 else approxMedianPosition
	end =  approxMedianPosition if median >= 0 else len(list)-1
	result = []		
	while i < end:
		j = i + 1
		while j < end:			
			current = list[i] + list[j]		
			if current == median:
				result.append((list[i], list[j]))
				break			
			if current >  median:
				break
			j = j + 1
		i = i + 1
	return result


def run3():
	v = [-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11,-12]
	v = [4,3,-1,-34,12, 4,5,6,3,11,12,13,1,2,3,4,5,6,7,-6,-1,-5,-12,0]
	v = [-1,2,-3,4,-5,6,-7,8,-9,10,12]
	#v = [1,2,3,4,5,6,7,8,9,10,11,12,13]
	result = miniSubsetSum(v)
	print (result)
	
run3()