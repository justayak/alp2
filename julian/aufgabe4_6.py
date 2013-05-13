#Aufgabe 5	

def miniSubsetSumAlt(list):
	list = sorted(list)  #Timsort:  				O(n*log(n))
	median = sum(list) // len(list)  #				O(n)
	#
	print (median)
	i =  0 if median >= 0 else len(list)-1
	acc = 1 if median >= 0 else -1
	end =  len(list)-1 if median >= 0 else len(list)-1
	result = []		
	while i < end if median >= 0 else i > end:
		print (i)
		j = i + acc
		while j < end if median >= 0 else j > end:			
			current = list[i] + list[j]		
			if current == median:
				result.append((list[i], list[j]))
				break			
			if current >  median:
				break
			j = j + acc
		i = i + acc
	return result
	
def miniSubsetSum(list):
	list = sorted(list)  #Timsort:  				O(n*log(n))
	median = sum(list) // len(list)  #				O(n)
	#
	print (median)
	i =  0 
	acc = 1 
	end =  len(list)-1 
	result = []		
	while i < end:
		j = i + acc
		while j < end:			
			current = list[i] + list[j]		
			if current == median:
				result.append((list[i], list[j]))
				break			
			if current >  median:
				break
			j = j + acc
		i = i + acc
	return result


def run3():
	#v = [-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11,-12]
	v = [4,3,-1,-34,12, 4,5,6,3,11,12,13,1,2,3,4,5,6,7,-6,-1,-5,-12,0]
	#v = [-1,2,-3,4,-5,6,-7,8,-9,10,12]
	#v = [1,2,3,4,5,6,7,8,9,10,11,12,13]
	result = miniSubsetSum(v)
	print (result)
	
run3()