#Aufgabe 5		
def miniSubsetSum(list):
	# Stellt euch einfach vor, das ist der Sort-Alg
	# aus den Ausgaben vorher... 
	list = sorted(list)  #Timsort:  				O(n*log(n))
	median = sum(list) // len(list)  #				O(n)
	print (median)
	i =  0 
	acc = 1 
	end =  len(list)-1 
	result = []		
	while i < end:							#		O(n-1)
		j = i + acc
		while j < end:						#		O(n-2)
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